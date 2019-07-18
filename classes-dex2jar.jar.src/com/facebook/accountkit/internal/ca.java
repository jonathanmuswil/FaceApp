package com.facebook.accountkit.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ca
{
  public static String a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, 0);
  }
  
  public static String a(Context paramContext, String paramString, int paramInt)
  {
    paramContext = b(paramContext, paramString);
    if (paramContext == null) {
      return null;
    }
    return Base64.encodeToString(paramContext, paramInt);
  }
  
  private static byte[] b(Context paramContext, String paramString)
  {
    paramContext = paramContext.getPackageManager();
    try
    {
      paramContext = paramContext.getPackageInfo(paramString, 64);
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-256");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append(" ");
      localStringBuilder.append(paramContext.signatures[0].toCharsString());
      localMessageDigest.update(localStringBuilder.toString().trim().getBytes(Charset.forName("US-ASCII")));
      return localMessageDigest.digest();
    }
    catch (PackageManager.NameNotFoundException|NoSuchAlgorithmException paramContext) {}
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */