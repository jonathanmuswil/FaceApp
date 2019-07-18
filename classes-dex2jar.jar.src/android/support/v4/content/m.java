package android.support.v4.content;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import android.support.v4.app.c;

public final class m
{
  public static int a(Context paramContext, String paramString)
  {
    String str;
    if (Binder.getCallingPid() == Process.myPid()) {
      str = paramContext.getPackageName();
    } else {
      str = null;
    }
    return a(paramContext, paramString, Binder.getCallingPid(), Binder.getCallingUid(), str);
  }
  
  public static int a(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    if (paramContext.checkPermission(paramString1, paramInt1, paramInt2) == -1) {
      return -1;
    }
    String str = c.a(paramString1);
    if (str == null) {
      return 0;
    }
    paramString1 = paramString2;
    if (paramString2 == null)
    {
      paramString1 = paramContext.getPackageManager().getPackagesForUid(paramInt2);
      if ((paramString1 != null) && (paramString1.length > 0)) {
        paramString1 = paramString1[0];
      } else {
        return -1;
      }
    }
    if (c.a(paramContext, str, paramString1) != 0) {
      return -2;
    }
    return 0;
  }
  
  public static int b(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, Process.myPid(), Process.myUid(), paramContext.getPackageName());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/content/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */