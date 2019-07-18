package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.t;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class c
{
  private static final Lock a = new ReentrantLock();
  private static c b;
  private final Lock c = new ReentrantLock();
  private final SharedPreferences d;
  
  private c(Context paramContext)
  {
    this.d = paramContext.getSharedPreferences("com.google.android.gms.signin", 0);
  }
  
  private final GoogleSignInAccount a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    paramString = c(b("googleSignInAccount", paramString));
    if (paramString != null) {}
    try
    {
      paramString = GoogleSignInAccount.b(paramString);
      return paramString;
    }
    catch (JSONException paramString)
    {
      for (;;) {}
    }
    return null;
  }
  
  public static c a(Context paramContext)
  {
    t.a(paramContext);
    a.lock();
    try
    {
      if (b == null)
      {
        c localc = new com/google/android/gms/auth/api/signin/internal/c;
        localc.<init>(paramContext.getApplicationContext());
        b = localc;
      }
      paramContext = b;
      return paramContext;
    }
    finally
    {
      a.unlock();
    }
  }
  
  private final void a(String paramString1, String paramString2)
  {
    this.c.lock();
    try
    {
      this.d.edit().putString(paramString1, paramString2).apply();
      return;
    }
    finally
    {
      this.c.unlock();
    }
  }
  
  private final GoogleSignInOptions b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    paramString = c(b("googleSignInOptions", paramString));
    if (paramString != null) {}
    try
    {
      paramString = GoogleSignInOptions.b(paramString);
      return paramString;
    }
    catch (JSONException paramString)
    {
      for (;;) {}
    }
    return null;
  }
  
  private static String b(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 1 + String.valueOf(paramString2).length());
    localStringBuilder.append(paramString1);
    localStringBuilder.append(":");
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  private final String c(String paramString)
  {
    this.c.lock();
    try
    {
      paramString = this.d.getString(paramString, null);
      return paramString;
    }
    finally
    {
      this.c.unlock();
    }
  }
  
  private final void d(String paramString)
  {
    this.c.lock();
    try
    {
      this.d.edit().remove(paramString).apply();
      return;
    }
    finally
    {
      this.c.unlock();
    }
  }
  
  public void a()
  {
    this.c.lock();
    try
    {
      this.d.edit().clear().apply();
      return;
    }
    finally
    {
      this.c.unlock();
    }
  }
  
  public void a(GoogleSignInAccount paramGoogleSignInAccount, GoogleSignInOptions paramGoogleSignInOptions)
  {
    t.a(paramGoogleSignInAccount);
    t.a(paramGoogleSignInOptions);
    a("defaultGoogleSignInAccount", paramGoogleSignInAccount.I());
    t.a(paramGoogleSignInAccount);
    t.a(paramGoogleSignInOptions);
    String str = paramGoogleSignInAccount.I();
    a(b("googleSignInAccount", str), paramGoogleSignInAccount.J());
    a(b("googleSignInOptions", str), paramGoogleSignInOptions.F());
  }
  
  public GoogleSignInAccount b()
  {
    return a(c("defaultGoogleSignInAccount"));
  }
  
  public GoogleSignInOptions c()
  {
    return b(c("defaultGoogleSignInAccount"));
  }
  
  public String d()
  {
    return c("refreshToken");
  }
  
  public final void e()
  {
    String str = c("defaultGoogleSignInAccount");
    d("defaultGoogleSignInAccount");
    if (!TextUtils.isEmpty(str))
    {
      d(b("googleSignInAccount", str));
      d(b("googleSignInOptions", str));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */