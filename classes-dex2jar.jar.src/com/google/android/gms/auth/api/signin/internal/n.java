package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class n
{
  private static n a;
  private c b;
  private GoogleSignInAccount c;
  private GoogleSignInOptions d;
  
  private n(Context paramContext)
  {
    this.b = c.a(paramContext);
    this.c = this.b.b();
    this.d = this.b.c();
  }
  
  public static n a(Context paramContext)
  {
    try
    {
      paramContext = b(paramContext.getApplicationContext());
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  private static n b(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        n localn = new com/google/android/gms/auth/api/signin/internal/n;
        localn.<init>(paramContext);
        a = localn;
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public final void a()
  {
    try
    {
      this.b.a();
      this.c = null;
      this.d = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(GoogleSignInOptions paramGoogleSignInOptions, GoogleSignInAccount paramGoogleSignInAccount)
  {
    try
    {
      this.b.a(paramGoogleSignInAccount, paramGoogleSignInOptions);
      this.c = paramGoogleSignInAccount;
      this.d = paramGoogleSignInOptions;
      return;
    }
    finally
    {
      paramGoogleSignInOptions = finally;
      throw paramGoogleSignInOptions;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */