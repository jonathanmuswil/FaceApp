package com.google.android.gms.common;

import Xp;
import Yp;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.ca.b;
import android.support.v4.app.ca.c;
import android.support.v4.app.ca.d;
import android.support.v4.app.o;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.ja;
import com.google.android.gms.common.api.internal.ka;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.m;
import java.util.concurrent.atomic.AtomicBoolean;
import zr;

public class e
  extends f
{
  private static final Object c = new Object();
  private static final e d = new e();
  public static final int e = f.a;
  private String f;
  
  static Dialog a(Context paramContext, int paramInt, com.google.android.gms.common.internal.f paramf, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AlertDialog.Builder localBuilder = null;
    if (paramInt == 0) {
      return null;
    }
    Object localObject = new TypedValue();
    paramContext.getTheme().resolveAttribute(16843529, (TypedValue)localObject, true);
    if ("Theme.Dialog.Alert".equals(paramContext.getResources().getResourceEntryName(((TypedValue)localObject).resourceId))) {
      localBuilder = new AlertDialog.Builder(paramContext, 5);
    }
    localObject = localBuilder;
    if (localBuilder == null) {
      localObject = new AlertDialog.Builder(paramContext);
    }
    ((AlertDialog.Builder)localObject).setMessage(com.google.android.gms.common.internal.e.b(paramContext, paramInt));
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject).setOnCancelListener(paramOnCancelListener);
    }
    paramOnCancelListener = com.google.android.gms.common.internal.e.a(paramContext, paramInt);
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject).setPositiveButton(paramOnCancelListener, paramf);
    }
    paramContext = com.google.android.gms.common.internal.e.e(paramContext, paramInt);
    if (paramContext != null) {
      ((AlertDialog.Builder)localObject).setTitle(paramContext);
    }
    return ((AlertDialog.Builder)localObject).create();
  }
  
  public static e a()
  {
    return d;
  }
  
  static void a(Activity paramActivity, Dialog paramDialog, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    if ((paramActivity instanceof o))
    {
      paramActivity = ((o)paramActivity).e();
      l.a(paramDialog, paramOnCancelListener).a(paramActivity, paramString);
      return;
    }
    paramActivity = paramActivity.getFragmentManager();
    c.a(paramDialog, paramOnCancelListener).show(paramActivity, paramString);
  }
  
  @TargetApi(20)
  private final void a(Context paramContext, int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    if (paramInt == 18)
    {
      d(paramContext);
      return;
    }
    if (paramPendingIntent == null)
    {
      if (paramInt == 6) {
        Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
      }
      return;
    }
    Object localObject1 = com.google.android.gms.common.internal.e.d(paramContext, paramInt);
    Object localObject2 = com.google.android.gms.common.internal.e.c(paramContext, paramInt);
    paramString = paramContext.getResources();
    NotificationManager localNotificationManager = (NotificationManager)paramContext.getSystemService("notification");
    ca.c localc = new ca.c(paramContext);
    localc.b(true);
    localc.a(true);
    localc.c((CharSequence)localObject1);
    localObject1 = new ca.b();
    ((ca.b)localObject1).a((CharSequence)localObject2);
    localc.a((ca.d)localObject1);
    if (com.google.android.gms.common.util.i.c(paramContext))
    {
      t.b(m.g());
      localc.c(paramContext.getApplicationInfo().icon);
      localc.b(2);
      if (com.google.android.gms.common.util.i.d(paramContext)) {
        localc.a(Xp.common_full_open_on_phone, paramString.getString(Yp.common_open_on_phone), paramPendingIntent);
      } else {
        localc.a(paramPendingIntent);
      }
    }
    else
    {
      localc.c(17301642);
      localc.d(paramString.getString(Yp.common_google_play_services_notification_ticker));
      localc.a(System.currentTimeMillis());
      localc.a(paramPendingIntent);
      localc.b((CharSequence)localObject2);
    }
    if (m.k())
    {
      t.b(m.k());
      paramPendingIntent = b();
      paramString = paramPendingIntent;
      if (paramPendingIntent == null)
      {
        paramPendingIntent = "com.google.android.gms.availability";
        localObject2 = localNotificationManager.getNotificationChannel("com.google.android.gms.availability");
        paramContext = com.google.android.gms.common.internal.e.b(paramContext);
        if (localObject2 == null)
        {
          localNotificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", paramContext, 4));
          paramString = paramPendingIntent;
        }
        else
        {
          paramString = paramPendingIntent;
          if (!paramContext.equals(((NotificationChannel)localObject2).getName()))
          {
            ((NotificationChannel)localObject2).setName(paramContext);
            localNotificationManager.createNotificationChannel((NotificationChannel)localObject2);
            paramString = paramPendingIntent;
          }
        }
      }
      localc.a(paramString);
    }
    paramContext = localc.a();
    if ((paramInt != 1) && (paramInt != 2) && (paramInt != 3))
    {
      paramInt = 39789;
    }
    else
    {
      paramInt = 10436;
      i.sCanceledAvailabilityNotification.set(false);
    }
    localNotificationManager.notify(paramInt, paramContext);
  }
  
  private final String b()
  {
    synchronized (c)
    {
      String str = this.f;
      return str;
    }
  }
  
  public int a(Context paramContext, int paramInt)
  {
    return super.a(paramContext, paramInt);
  }
  
  public Dialog a(Activity paramActivity, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return a(paramActivity, paramInt1, com.google.android.gms.common.internal.f.a(paramActivity, a(paramActivity, paramInt1, "d"), paramInt2), paramOnCancelListener);
  }
  
  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2)
  {
    return super.a(paramContext, paramInt1, paramInt2);
  }
  
  public PendingIntent a(Context paramContext, b paramb)
  {
    if (paramb.B()) {
      return paramb.A();
    }
    return a(paramContext, paramb.y(), 0);
  }
  
  public Intent a(Context paramContext, int paramInt, String paramString)
  {
    return super.a(paramContext, paramInt, paramString);
  }
  
  public final ja a(Context paramContext, ka paramka)
  {
    IntentFilter localIntentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
    localIntentFilter.addDataScheme("package");
    ja localja = new ja(paramka);
    paramContext.registerReceiver(localja, localIntentFilter);
    localja.a(paramContext);
    if (!a(paramContext, "com.google.android.gms"))
    {
      paramka.a();
      localja.a();
      return null;
    }
    return localja;
  }
  
  public final boolean a(Context paramContext, b paramb, int paramInt)
  {
    PendingIntent localPendingIntent = a(paramContext, paramb);
    if (localPendingIntent != null)
    {
      a(paramContext, paramb.y(), null, GoogleApiActivity.a(paramContext, localPendingIntent, paramInt));
      return true;
    }
    return false;
  }
  
  public final String b(int paramInt)
  {
    return super.b(paramInt);
  }
  
  public boolean b(Activity paramActivity, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Dialog localDialog = a(paramActivity, paramInt1, paramInt2, paramOnCancelListener);
    if (localDialog == null) {
      return false;
    }
    a(paramActivity, localDialog, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  public int c(Context paramContext)
  {
    return super.c(paramContext);
  }
  
  public void c(Context paramContext, int paramInt)
  {
    a(paramContext, paramInt, null, a(paramContext, paramInt, 0, "n"));
  }
  
  public final boolean c(int paramInt)
  {
    return super.c(paramInt);
  }
  
  final void d(Context paramContext)
  {
    new a(paramContext).sendEmptyMessageDelayed(1, 120000L);
  }
  
  @SuppressLint({"HandlerLeak"})
  private final class a
    extends zr
  {
    private final Context a;
    
    public a(Context paramContext)
    {
      super();
      this.a = paramContext.getApplicationContext();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      int i = paramMessage.what;
      if (i != 1)
      {
        paramMessage = new StringBuilder(50);
        paramMessage.append("Don't know how to handle this message: ");
        paramMessage.append(i);
        Log.w("GoogleApiAvailability", paramMessage.toString());
      }
      else
      {
        i = e.this.c(this.a);
        if (e.this.c(i)) {
          e.this.c(this.a, i);
        }
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */