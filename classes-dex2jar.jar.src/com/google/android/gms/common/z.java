package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.j;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

class z
{
  private static final z a = new z(true, null, null);
  final boolean b;
  private final String c;
  private final Throwable d;
  
  z(boolean paramBoolean, String paramString, Throwable paramThrowable)
  {
    this.b = paramBoolean;
    this.c = paramString;
    this.d = paramThrowable;
  }
  
  static z a(String paramString)
  {
    return new z(false, paramString, null);
  }
  
  static z a(String paramString, Throwable paramThrowable)
  {
    return new z(false, paramString, paramThrowable);
  }
  
  static z a(Callable<String> paramCallable)
  {
    return new B(paramCallable, null);
  }
  
  static String a(String paramString, r paramr, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str;
    if (paramBoolean2) {
      str = "debug cert rejected";
    } else {
      str = "not whitelisted";
    }
    return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[] { str, paramString, j.a(a.a("SHA-1").digest(paramr.a())), Boolean.valueOf(paramBoolean1), "12451009.false" });
  }
  
  static z b()
  {
    return a;
  }
  
  String a()
  {
    return this.c;
  }
  
  final void c()
  {
    if ((!this.b) && (Log.isLoggable("GoogleCertificatesRslt", 3)))
    {
      if (this.d != null)
      {
        Log.d("GoogleCertificatesRslt", a(), this.d);
        return;
      }
      Log.d("GoogleCertificatesRslt", a());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */