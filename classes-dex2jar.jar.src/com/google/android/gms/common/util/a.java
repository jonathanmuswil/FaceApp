package com.google.android.gms.common.util;

import Fq;
import Gq;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a
{
  public static MessageDigest a(String paramString)
  {
    for (int i = 0; i < 2; i++) {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
        if (localMessageDigest != null) {
          return localMessageDigest;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        for (;;) {}
      }
    }
    return null;
  }
  
  public static byte[] a(Context paramContext, String paramString)
    throws PackageManager.NameNotFoundException
  {
    paramContext = Gq.a(paramContext).b(paramString, 64);
    paramString = paramContext.signatures;
    if ((paramString != null) && (paramString.length == 1))
    {
      paramString = a("SHA1");
      if (paramString != null) {
        return paramString.digest(paramContext.signatures[0].toByteArray());
      }
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/util/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */