package com.google.android.gms.common;

import Fq;
import Gq;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.M;

public class f
{
  public static final int a = i.GOOGLE_PLAY_SERVICES_VERSION_CODE;
  private static final f b = new f();
  
  public static f a()
  {
    return b;
  }
  
  private static String b(Context paramContext, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("gcore_");
    localStringBuilder.append(a);
    localStringBuilder.append("-");
    if (!TextUtils.isEmpty(paramString)) {
      localStringBuilder.append(paramString);
    }
    localStringBuilder.append("-");
    if (paramContext != null) {
      localStringBuilder.append(paramContext.getPackageName());
    }
    localStringBuilder.append("-");
    if (paramContext != null) {}
    try
    {
      localStringBuilder.append(Gq.a(paramContext).b(paramContext.getPackageName(), 0).versionCode);
      return localStringBuilder.toString();
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  public int a(Context paramContext, int paramInt)
  {
    int i = i.isGooglePlayServicesAvailable(paramContext, paramInt);
    paramInt = i;
    if (i.isPlayServicesPossiblyUpdating(paramContext, i)) {
      paramInt = 18;
    }
    return paramInt;
  }
  
  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2)
  {
    return a(paramContext, paramInt1, paramInt2, null);
  }
  
  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    paramString = a(paramContext, paramInt1, paramString);
    if (paramString == null) {
      return null;
    }
    return PendingIntent.getActivity(paramContext, paramInt2, paramString, 134217728);
  }
  
  @Deprecated
  public Intent a(int paramInt)
  {
    return a(null, paramInt, null);
  }
  
  public Intent a(Context paramContext, int paramInt, String paramString)
  {
    if ((paramInt != 1) && (paramInt != 2))
    {
      if (paramInt != 3) {
        return null;
      }
      return M.a("com.google.android.gms");
    }
    if ((paramContext != null) && (com.google.android.gms.common.util.i.d(paramContext))) {
      return M.a();
    }
    return M.a("com.google.android.gms", b(paramContext, paramString));
  }
  
  public void a(Context paramContext)
  {
    i.cancelAvailabilityErrorNotifications(paramContext);
  }
  
  public boolean a(Context paramContext, String paramString)
  {
    return i.isUninstalledAppPossiblyUpdating(paramContext, paramString);
  }
  
  public int b(Context paramContext)
  {
    return i.getApkVersion(paramContext);
  }
  
  public String b(int paramInt)
  {
    return i.getErrorString(paramInt);
  }
  
  public boolean b(Context paramContext, int paramInt)
  {
    return i.isPlayServicesPossiblyUpdating(paramContext, paramInt);
  }
  
  public int c(Context paramContext)
  {
    return a(paramContext, a);
  }
  
  public boolean c(int paramInt)
  {
    return i.isUserRecoverableError(paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */