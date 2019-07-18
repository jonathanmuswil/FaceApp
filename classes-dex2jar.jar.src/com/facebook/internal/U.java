package com.facebook.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;

public class u
{
  private static final HashSet<String> a = ;
  
  private static HashSet<String> a()
  {
    HashSet localHashSet = new HashSet();
    localHashSet.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
    localHashSet.add("cc2751449a350f668590264ed76692694a80308a");
    localHashSet.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
    localHashSet.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
    localHashSet.add("df6b721c8b4d3b6eb44c861d4415007e5a35fc95");
    localHashSet.add("9b8f518b086098de3d77736f9458a3d2f6f95a37");
    localHashSet.add("2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3");
    return localHashSet;
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    String str = Build.BRAND;
    int i = paramContext.getApplicationInfo().flags;
    if ((str.startsWith("generic")) && ((i & 0x2) != 0)) {
      return true;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 64);
      paramContext = paramContext.signatures;
      if ((paramContext != null) && (paramContext.length > 0))
      {
        int j = paramContext.length;
        for (i = 0; i < j; i++)
        {
          paramString = S.a(paramContext[i].toByteArray());
          if (!a.contains(paramString)) {
            return false;
          }
        }
        return true;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/internal/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */