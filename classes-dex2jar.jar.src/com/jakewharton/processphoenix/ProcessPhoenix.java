package com.jakewharton.processphoenix;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class ProcessPhoenix
  extends Activity
{
  public static void a(Context paramContext, Intent... paramVarArgs)
  {
    Intent localIntent = new Intent(paramContext, ProcessPhoenix.class);
    localIntent.addFlags(268435456);
    localIntent.putParcelableArrayListExtra("phoenix_restart_intents", new ArrayList(Arrays.asList(paramVarArgs)));
    paramContext.startActivity(localIntent);
    if ((paramContext instanceof Activity)) {
      ((Activity)paramContext).finish();
    }
    Runtime.getRuntime().exit(0);
  }
  
  public static boolean a(Context paramContext)
  {
    int i = Process.myPid();
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (paramContext != null)
    {
      paramContext = paramContext.iterator();
      while (paramContext.hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
        if ((localRunningAppProcessInfo.pid == i) && (localRunningAppProcessInfo.processName.endsWith(":phoenix"))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static void b(Context paramContext)
  {
    a(paramContext, new Intent[] { c(paramContext) });
  }
  
  private static Intent c(Context paramContext)
  {
    Intent localIntent = new Intent("android.intent.action.MAIN", null);
    localIntent.addFlags(268468224);
    localIntent.addCategory("android.intent.category.DEFAULT");
    String str = paramContext.getPackageName();
    paramContext = paramContext.getPackageManager().queryIntentActivities(localIntent, 0).iterator();
    while (paramContext.hasNext())
    {
      ActivityInfo localActivityInfo = ((ResolveInfo)paramContext.next()).activityInfo;
      if (localActivityInfo.packageName.equals(str))
      {
        localIntent.setComponent(new ComponentName(str, localActivityInfo.name));
        return localIntent;
      }
    }
    paramContext = new StringBuilder();
    paramContext.append("Unable to determine default activity for ");
    paramContext.append(str);
    paramContext.append(". Does an activity specify the DEFAULT category in its intent filter?");
    throw new IllegalStateException(paramContext.toString());
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getParcelableArrayListExtra("phoenix_restart_intents");
    startActivities((Intent[])paramBundle.toArray(new Intent[paramBundle.size()]));
    finish();
    Runtime.getRuntime().exit(0);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/jakewharton/processphoenix/ProcessPhoenix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */