package com.google.android.gms.common;

import Iq;
import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.google.android.gms.common.internal.S;
import com.google.android.gms.common.internal.T;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.a;

final class p
{
  private static volatile S a;
  private static final Object b = new Object();
  private static Context c;
  
  static z a(String paramString, r paramr, boolean paramBoolean1, boolean paramBoolean2)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskReads();
    try
    {
      paramString = b(paramString, paramr, paramBoolean1, paramBoolean2);
      return paramString;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
  }
  
  static void a(Context paramContext)
  {
    try
    {
      if (c == null)
      {
        if (paramContext != null) {
          c = paramContext.getApplicationContext();
        }
      }
      else {
        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
      }
      return;
    }
    finally {}
  }
  
  private static z b(String paramString, r paramr, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      if (a == null)
      {
        t.a(c);
        synchronized (b)
        {
          if (a == null) {
            a = T.a(DynamiteModule.a(c, DynamiteModule.k, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl"));
          }
        }
      }
      t.a(c);
      ??? = new x(paramString, paramr, paramBoolean1, paramBoolean2);
      try
      {
        paramBoolean2 = a.a((x)???, Iq.a(c.getPackageManager()));
        if (paramBoolean2) {
          return z.b();
        }
        return z.a(new q(paramBoolean1, paramString, paramr));
      }
      catch (RemoteException paramString)
      {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", paramString);
        return z.a("module call", paramString);
      }
      return z.a(paramString, paramr);
    }
    catch (DynamiteModule.a paramr)
    {
      Log.e("GoogleCertificates", "Failed to get Google certificates from remote", paramr);
      paramString = String.valueOf(paramr.getMessage());
      if (paramString.length() != 0) {
        paramString = "module init: ".concat(paramString);
      } else {
        paramString = new String("module init: ");
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */