package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.V;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.m;
import com.google.android.gms.common.util.r;
import com.google.android.gms.common.util.s;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class i
{
  static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
  static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
  public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
  @Deprecated
  public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
  @Deprecated
  public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
  public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
  static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
  private static boolean zzah = false;
  private static boolean zzai = false;
  private static boolean zzaj = false;
  private static boolean zzak = false;
  private static final AtomicBoolean zzal = new AtomicBoolean();
  
  @Deprecated
  public static void cancelAvailabilityErrorNotifications(Context paramContext)
  {
    if (sCanceledAvailabilityNotification.getAndSet(true)) {
      return;
    }
    try
    {
      paramContext = (NotificationManager)paramContext.getSystemService("notification");
      if (paramContext != null) {
        paramContext.cancel(10436);
      }
      return;
    }
    catch (SecurityException paramContext)
    {
      for (;;) {}
    }
  }
  
  public static void enableUsingApkIndependentContext()
  {
    zzal.set(true);
  }
  
  @Deprecated
  public static void ensurePlayServicesAvailable(Context paramContext, int paramInt)
    throws h, g
  {
    paramInt = f.a().a(paramContext, paramInt);
    if (paramInt != 0)
    {
      Intent localIntent = f.a().a(paramContext, paramInt, "e");
      paramContext = new StringBuilder(57);
      paramContext.append("GooglePlayServices not available due to error ");
      paramContext.append(paramInt);
      Log.e("GooglePlayServicesUtil", paramContext.toString());
      if (localIntent == null) {
        throw new g(paramInt);
      }
      throw new h(paramInt, "Google Play Services not available", localIntent);
    }
  }
  
  @Deprecated
  public static int getApkVersion(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo("com.google.android.gms", 0);
      return paramContext.versionCode;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
    }
    return 0;
  }
  
  @Deprecated
  public static int getClientVersion(Context paramContext)
  {
    t.b(true);
    return d.a(paramContext, paramContext.getPackageName());
  }
  
  @Deprecated
  public static PendingIntent getErrorPendingIntent(int paramInt1, Context paramContext, int paramInt2)
  {
    return f.a().a(paramContext, paramInt1, paramInt2);
  }
  
  @Deprecated
  public static String getErrorString(int paramInt)
  {
    return b.p(paramInt);
  }
  
  @Deprecated
  public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int paramInt)
  {
    return f.a().a(null, paramInt, null);
  }
  
  public static Context getRemoteContext(Context paramContext)
  {
    try
    {
      paramContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  public static Resources getRemoteResource(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  /* Error */
  public static boolean honorsDebugCertificates(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 191	com/google/android/gms/common/i:zzak	Z
    //   3: ifne +85 -> 88
    //   6: aload_0
    //   7: invokestatic 196	Gq:a	(Landroid/content/Context;)LFq;
    //   10: ldc 16
    //   12: bipush 64
    //   14: invokevirtual 200	Fq:b	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   17: astore_1
    //   18: aload_0
    //   19: invokestatic 205	com/google/android/gms/common/j:a	(Landroid/content/Context;)Lcom/google/android/gms/common/j;
    //   22: pop
    //   23: aload_1
    //   24: ifnull +26 -> 50
    //   27: aload_1
    //   28: iconst_0
    //   29: invokestatic 208	com/google/android/gms/common/j:a	(Landroid/content/pm/PackageInfo;Z)Z
    //   32: ifne +18 -> 50
    //   35: aload_1
    //   36: iconst_1
    //   37: invokestatic 208	com/google/android/gms/common/j:a	(Landroid/content/pm/PackageInfo;Z)Z
    //   40: ifeq +10 -> 50
    //   43: iconst_1
    //   44: putstatic 210	com/google/android/gms/common/i:zzaj	Z
    //   47: goto +7 -> 54
    //   50: iconst_0
    //   51: putstatic 210	com/google/android/gms/common/i:zzaj	Z
    //   54: iconst_1
    //   55: putstatic 191	com/google/android/gms/common/i:zzak	Z
    //   58: goto +30 -> 88
    //   61: astore_0
    //   62: goto +20 -> 82
    //   65: astore_0
    //   66: ldc 107
    //   68: ldc -44
    //   70: aload_0
    //   71: invokestatic 215	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   74: pop
    //   75: iconst_1
    //   76: putstatic 191	com/google/android/gms/common/i:zzak	Z
    //   79: goto +9 -> 88
    //   82: iconst_1
    //   83: putstatic 191	com/google/android/gms/common/i:zzak	Z
    //   86: aload_0
    //   87: athrow
    //   88: getstatic 210	com/google/android/gms/common/i:zzaj	Z
    //   91: ifne +14 -> 105
    //   94: invokestatic 220	com/google/android/gms/common/util/i:a	()Z
    //   97: ifne +6 -> 103
    //   100: goto +5 -> 105
    //   103: iconst_0
    //   104: ireturn
    //   105: iconst_1
    //   106: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	paramContext	Context
    //   17	19	1	localPackageInfo	PackageInfo
    // Exception table:
    //   from	to	target	type
    //   6	23	61	finally
    //   27	47	61	finally
    //   50	54	61	finally
    //   66	75	61	finally
    //   6	23	65	android/content/pm/PackageManager$NameNotFoundException
    //   27	47	65	android/content/pm/PackageManager$NameNotFoundException
    //   50	54	65	android/content/pm/PackageManager$NameNotFoundException
  }
  
  @Deprecated
  public static int isGooglePlayServicesAvailable(Context paramContext)
  {
    return isGooglePlayServicesAvailable(paramContext, GOOGLE_PLAY_SERVICES_VERSION_CODE);
  }
  
  @Deprecated
  public static int isGooglePlayServicesAvailable(Context paramContext, int paramInt)
  {
    try
    {
      paramContext.getResources().getString(k.common_google_play_services_unknown_issue);
    }
    catch (Throwable localThrowable)
    {
      Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
    }
    if ((!"com.google.android.gms".equals(paramContext.getPackageName())) && (!zzal.get()))
    {
      int i = V.b(paramContext);
      if (i != 0)
      {
        int j = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        if (i != j)
        {
          paramContext = new StringBuilder(320);
          paramContext.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
          paramContext.append(j);
          paramContext.append(" but found ");
          paramContext.append(i);
          paramContext.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
          throw new IllegalStateException(paramContext.toString());
        }
      }
      else
      {
        throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
      }
    }
    boolean bool;
    if ((!com.google.android.gms.common.util.i.d(paramContext)) && (!com.google.android.gms.common.util.i.e(paramContext))) {
      bool = true;
    } else {
      bool = false;
    }
    return zza(paramContext, bool, paramInt);
  }
  
  @Deprecated
  public static boolean isGooglePlayServicesUid(Context paramContext, int paramInt)
  {
    return r.a(paramContext, paramInt);
  }
  
  @Deprecated
  public static boolean isPlayServicesPossiblyUpdating(Context paramContext, int paramInt)
  {
    if (paramInt == 18) {
      return true;
    }
    if (paramInt == 1) {
      return isUninstalledAppPossiblyUpdating(paramContext, "com.google.android.gms");
    }
    return false;
  }
  
  @Deprecated
  public static boolean isPlayStorePossiblyUpdating(Context paramContext, int paramInt)
  {
    if (paramInt == 9) {
      return isUninstalledAppPossiblyUpdating(paramContext, "com.android.vending");
    }
    return false;
  }
  
  @TargetApi(18)
  public static boolean isRestrictedUserProfile(Context paramContext)
  {
    if (m.e())
    {
      paramContext = ((UserManager)paramContext.getSystemService("user")).getApplicationRestrictions(paramContext.getPackageName());
      if ((paramContext != null) && ("true".equals(paramContext.getString("restricted_profile")))) {
        return true;
      }
    }
    return false;
  }
  
  @Deprecated
  public static boolean isSidewinderDevice(Context paramContext)
  {
    return com.google.android.gms.common.util.i.b(paramContext);
  }
  
  @TargetApi(21)
  static boolean isUninstalledAppPossiblyUpdating(Context paramContext, String paramString)
  {
    boolean bool = paramString.equals("com.google.android.gms");
    if (m.h()) {
      try
      {
        localObject = paramContext.getPackageManager().getPackageInstaller().getAllSessions();
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          if (paramString.equals(((PackageInstaller.SessionInfo)((Iterator)localObject).next()).getAppPackageName())) {
            return true;
          }
        }
      }
      catch (Exception paramContext)
      {
        return false;
      }
    }
    Object localObject = paramContext.getPackageManager();
    try
    {
      paramString = ((PackageManager)localObject).getApplicationInfo(paramString, 8192);
      if (bool) {
        return paramString.enabled;
      }
      if (paramString.enabled)
      {
        bool = isRestrictedUserProfile(paramContext);
        if (!bool) {
          return true;
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return false;
  }
  
  @Deprecated
  public static boolean isUserRecoverableError(int paramInt)
  {
    return (paramInt == 1) || (paramInt == 2) || (paramInt == 3) || (paramInt == 9);
  }
  
  @Deprecated
  @TargetApi(19)
  public static boolean uidHasPackageName(Context paramContext, int paramInt, String paramString)
  {
    return r.a(paramContext, paramInt, paramString);
  }
  
  private static int zza(Context paramContext, boolean paramBoolean, int paramInt)
  {
    boolean bool;
    if (paramInt >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    t.a(bool);
    PackageManager localPackageManager = paramContext.getPackageManager();
    Object localObject = null;
    if (paramBoolean) {
      try
      {
        localObject = localPackageManager.getPackageInfo("com.android.vending", 8256);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
        return 9;
      }
    }
    try
    {
      PackageInfo localPackageInfo = localPackageManager.getPackageInfo("com.google.android.gms", 64);
      j.a(paramContext);
      if (!j.a(localPackageInfo, true))
      {
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
      }
      if ((paramBoolean) && ((!j.a((PackageInfo)localObject, true)) || (!localObject.signatures[0].equals(localPackageInfo.signatures[0]))))
      {
        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
        return 9;
      }
      if (s.a(localPackageInfo.versionCode) < s.a(paramInt))
      {
        int i = localPackageInfo.versionCode;
        paramContext = new StringBuilder(77);
        paramContext.append("Google Play services out of date.  Requires ");
        paramContext.append(paramInt);
        paramContext.append(" but found ");
        paramContext.append(i);
        Log.w("GooglePlayServicesUtil", paramContext.toString());
        return 2;
      }
      localObject = localPackageInfo.applicationInfo;
      paramContext = (Context)localObject;
      if (localObject == null) {
        try
        {
          paramContext = localPackageManager.getApplicationInfo("com.google.android.gms", 0);
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", paramContext);
          return 1;
        }
      }
      if (!paramContext.enabled) {
        return 3;
      }
      return 0;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
    }
    return 1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */