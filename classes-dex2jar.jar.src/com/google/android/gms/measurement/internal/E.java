package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v4.content.c;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class e
  extends xa
{
  private long c;
  private String d;
  private Boolean e;
  private AccountManager f;
  private Boolean g;
  private long h;
  
  e(aa paramaa)
  {
    super(paramaa);
  }
  
  public final boolean a(Context paramContext)
  {
    if (this.e == null)
    {
      a();
      this.e = Boolean.valueOf(false);
    }
    try
    {
      paramContext = paramContext.getPackageManager();
      if (paramContext != null)
      {
        paramContext.getPackageInfo("com.google.android.gms", 128);
        this.e = Boolean.valueOf(true);
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return this.e.booleanValue();
  }
  
  protected final boolean q()
  {
    Object localObject1 = Calendar.getInstance();
    this.c = TimeUnit.MINUTES.convert(((Calendar)localObject1).get(15) + ((Calendar)localObject1).get(16), TimeUnit.MILLISECONDS);
    Object localObject2 = Locale.getDefault();
    localObject1 = ((Locale)localObject2).getLanguage().toLowerCase(Locale.ENGLISH);
    String str = ((Locale)localObject2).getCountry().toLowerCase(Locale.ENGLISH);
    localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 1 + String.valueOf(str).length());
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append("-");
    ((StringBuilder)localObject2).append(str);
    this.d = ((StringBuilder)localObject2).toString();
    return false;
  }
  
  public final long s()
  {
    m();
    return this.c;
  }
  
  public final String t()
  {
    m();
    return this.d;
  }
  
  final long u()
  {
    j();
    return this.h;
  }
  
  final void v()
  {
    j();
    this.g = null;
    this.h = 0L;
  }
  
  final boolean w()
  {
    j();
    long l = b().a();
    if (l - this.h > 86400000L) {
      this.g = null;
    }
    Object localObject = this.g;
    if (localObject != null) {
      return ((Boolean)localObject).booleanValue();
    }
    if (c.a(getContext(), "android.permission.GET_ACCOUNTS") != 0)
    {
      c().w().a("Permission error checking for dasher/unicorn accounts");
      this.h = l;
      this.g = Boolean.valueOf(false);
      return false;
    }
    if (this.f == null) {
      this.f = AccountManager.get(getContext());
    }
    try
    {
      localObject = (Account[])this.f.getAccountsByTypeAndFeatures("com.google", new String[] { "service_HOSTED" }, null, null).getResult();
      if ((localObject != null) && (localObject.length > 0))
      {
        this.g = Boolean.valueOf(true);
        this.h = l;
        return true;
      }
      localObject = (Account[])this.f.getAccountsByTypeAndFeatures("com.google", new String[] { "service_uca" }, null, null).getResult();
      if ((localObject == null) || (localObject.length <= 0)) {
        break label231;
      }
      this.g = Boolean.valueOf(true);
      this.h = l;
      return true;
    }
    catch (OperationCanceledException localOperationCanceledException) {}catch (IOException localIOException) {}catch (AuthenticatorException localAuthenticatorException) {}
    c().t().a("Exception checking account types", localAuthenticatorException);
    label231:
    this.h = l;
    this.g = Boolean.valueOf(false);
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */