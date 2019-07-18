package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.support.v4.app.l;
import com.google.android.gms.common.internal.f;

public final class GooglePlayServicesUtil
  extends i
{
  public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
  @Deprecated
  public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
  @Deprecated
  public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = i.GOOGLE_PLAY_SERVICES_VERSION_CODE;
  public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
  
  @Deprecated
  public static Dialog getErrorDialog(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return getErrorDialog(paramInt1, paramActivity, paramInt2, null);
  }
  
  @Deprecated
  public static Dialog getErrorDialog(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    int i = paramInt1;
    if (i.isPlayServicesPossiblyUpdating(paramActivity, paramInt1)) {
      i = 18;
    }
    return e.a().a(paramActivity, i, paramInt2, paramOnCancelListener);
  }
  
  @Deprecated
  public static PendingIntent getErrorPendingIntent(int paramInt1, Context paramContext, int paramInt2)
  {
    return i.getErrorPendingIntent(paramInt1, paramContext, paramInt2);
  }
  
  @Deprecated
  public static String getErrorString(int paramInt)
  {
    return i.getErrorString(paramInt);
  }
  
  public static Context getRemoteContext(Context paramContext)
  {
    return i.getRemoteContext(paramContext);
  }
  
  public static Resources getRemoteResource(Context paramContext)
  {
    return i.getRemoteResource(paramContext);
  }
  
  @Deprecated
  public static int isGooglePlayServicesAvailable(Context paramContext)
  {
    return i.isGooglePlayServicesAvailable(paramContext);
  }
  
  @Deprecated
  public static int isGooglePlayServicesAvailable(Context paramContext, int paramInt)
  {
    return i.isGooglePlayServicesAvailable(paramContext, paramInt);
  }
  
  @Deprecated
  public static boolean isUserRecoverableError(int paramInt)
  {
    return i.isUserRecoverableError(paramInt);
  }
  
  @Deprecated
  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return showErrorDialogFragment(paramInt1, paramActivity, paramInt2, null);
  }
  
  @Deprecated
  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return showErrorDialogFragment(paramInt1, paramActivity, null, paramInt2, paramOnCancelListener);
  }
  
  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, l paraml, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    int i = paramInt1;
    if (i.isPlayServicesPossiblyUpdating(paramActivity, paramInt1)) {
      i = 18;
    }
    e locale = e.a();
    if (paraml == null) {
      return locale.b(paramActivity, i, paramInt2, paramOnCancelListener);
    }
    paraml = e.a(paramActivity, i, f.a(paraml, e.a().a(paramActivity, i, "d"), paramInt2), paramOnCancelListener);
    if (paraml == null) {
      return false;
    }
    e.a(paramActivity, paraml, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  @Deprecated
  public static void showErrorNotification(int paramInt, Context paramContext)
  {
    e locale = e.a();
    if ((!i.isPlayServicesPossiblyUpdating(paramContext, paramInt)) && (!i.isPlayStorePossiblyUpdating(paramContext, paramInt)))
    {
      locale.c(paramContext, paramInt);
      return;
    }
    locale.d(paramContext);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/GooglePlayServicesUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */