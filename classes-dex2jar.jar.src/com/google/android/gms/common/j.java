package com.google.android.gms.common;

import Fq;
import Gq;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.t;

public class j
{
  private static j a;
  private final Context b;
  
  private j(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
  }
  
  public static j a(Context paramContext)
  {
    t.a(paramContext);
    try
    {
      if (a == null)
      {
        p.a(paramContext);
        j localj = new com/google/android/gms/common/j;
        localj.<init>(paramContext);
        a = localj;
      }
      return a;
    }
    finally {}
  }
  
  private static r a(PackageInfo paramPackageInfo, r... paramVarArgs)
  {
    paramPackageInfo = paramPackageInfo.signatures;
    if (paramPackageInfo == null) {
      return null;
    }
    if (paramPackageInfo.length != 1)
    {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      return null;
    }
    int i = 0;
    paramPackageInfo = new s(paramPackageInfo[0].toByteArray());
    while (i < paramVarArgs.length)
    {
      if (paramVarArgs[i].equals(paramPackageInfo)) {
        return paramVarArgs[i];
      }
      i++;
    }
    return null;
  }
  
  private final z a(String paramString, int paramInt)
  {
    try
    {
      PackageInfo localPackageInfo = Gq.a(this.b).a(paramString, 64, paramInt);
      boolean bool = i.honorsDebugCertificates(this.b);
      if (localPackageInfo == null) {
        return z.a("null pkg");
      }
      if (localPackageInfo.signatures.length != 1) {
        return z.a("single cert required");
      }
      Object localObject = new com/google/android/gms/common/s;
      ((s)localObject).<init>(localPackageInfo.signatures[0].toByteArray());
      String str = localPackageInfo.packageName;
      z localz = p.a(str, (r)localObject, bool, false);
      if ((localz.b) && (localPackageInfo.applicationInfo != null) && ((localPackageInfo.applicationInfo.flags & 0x2) != 0) && (p.a(str, (r)localObject, false, true).b))
      {
        localObject = z.a("debuggable release cert app rejected");
        return (z)localObject;
      }
      return localz;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "no pkg ".concat(paramString);
      } else {
        paramString = new String("no pkg ");
      }
    }
    return z.a(paramString);
  }
  
  public static boolean a(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    if ((paramPackageInfo != null) && (paramPackageInfo.signatures != null))
    {
      if (paramBoolean) {
        paramPackageInfo = a(paramPackageInfo, u.a);
      } else {
        paramPackageInfo = a(paramPackageInfo, new r[] { u.a[0] });
      }
      if (paramPackageInfo != null) {
        return true;
      }
    }
    return false;
  }
  
  public boolean a(int paramInt)
  {
    String[] arrayOfString = Gq.a(this.b).a(paramInt);
    Object localObject;
    int i;
    int j;
    if ((arrayOfString != null) && (arrayOfString.length != 0))
    {
      localObject = null;
      i = arrayOfString.length;
      j = 0;
    }
    while (j < i)
    {
      z localz = a(arrayOfString[j], paramInt);
      localObject = localz;
      if (!localz.b)
      {
        j++;
        localObject = localz;
        continue;
        localObject = z.a("no pkgs");
      }
    }
    ((z)localObject).c();
    return ((z)localObject).b;
  }
  
  public boolean a(PackageInfo paramPackageInfo)
  {
    if (paramPackageInfo == null) {
      return false;
    }
    if (a(paramPackageInfo, false)) {
      return true;
    }
    if (a(paramPackageInfo, true))
    {
      if (i.honorsDebugCertificates(this.b)) {
        return true;
      }
      Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */