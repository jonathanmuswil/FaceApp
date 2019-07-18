package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;

public final class c
{
  public static int a(Context paramContext, String paramString1, String paramString2)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return ((AppOpsManager)paramContext.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(paramString1, paramString2);
    }
    return 1;
  }
  
  public static String a(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return AppOpsManager.permissionToOp(paramString);
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */