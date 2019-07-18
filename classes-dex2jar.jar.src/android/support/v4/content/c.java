package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;

public class c
{
  private static final Object a = new Object();
  private static TypedValue b;
  
  public static int a(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return paramContext.getColor(paramInt);
    }
    return paramContext.getResources().getColor(paramInt);
  }
  
  public static int a(Context paramContext, String paramString)
  {
    if (paramString != null) {
      return paramContext.checkPermission(paramString, Process.myPid(), Process.myUid());
    }
    throw new IllegalArgumentException("permission is null");
  }
  
  private static File a(File paramFile)
  {
    try
    {
      if ((!paramFile.exists()) && (!paramFile.mkdirs()))
      {
        boolean bool = paramFile.exists();
        if (bool) {
          return paramFile;
        }
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Unable to create files subdir ");
        localStringBuilder.append(paramFile.getPath());
        Log.w("ContextCompat", localStringBuilder.toString());
        return null;
      }
      return paramFile;
    }
    finally {}
  }
  
  public static void a(Context paramContext, Intent paramIntent, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      paramContext.startActivity(paramIntent, paramBundle);
    } else {
      paramContext.startActivity(paramIntent);
    }
  }
  
  public static boolean a(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      paramContext.startActivities(paramArrayOfIntent, paramBundle);
    } else {
      paramContext.startActivities(paramArrayOfIntent);
    }
    return true;
  }
  
  public static File[] a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramContext.getExternalCacheDirs();
    }
    return new File[] { paramContext.getExternalCacheDir() };
  }
  
  public static ColorStateList b(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return paramContext.getColorStateList(paramInt);
    }
    return paramContext.getResources().getColorStateList(paramInt);
  }
  
  public static File b(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramContext.getNoBackupFilesDir();
    }
    return a(new File(paramContext.getApplicationInfo().dataDir, "no_backup"));
  }
  
  public static File[] b(Context paramContext, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramContext.getExternalFilesDirs(paramString);
    }
    return new File[] { paramContext.getExternalFilesDir(paramString) };
  }
  
  public static Drawable c(Context paramContext, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      return paramContext.getDrawable(paramInt);
    }
    if (i >= 16) {
      return paramContext.getResources().getDrawable(paramInt);
    }
    synchronized (a)
    {
      if (b == null)
      {
        TypedValue localTypedValue = new android/util/TypedValue;
        localTypedValue.<init>();
        b = localTypedValue;
      }
      paramContext.getResources().getValue(paramInt, b, true);
      paramInt = b.resourceId;
      return paramContext.getResources().getDrawable(paramInt);
    }
  }
  
  public static boolean c(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return paramContext.isDeviceProtectedStorage();
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/content/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */