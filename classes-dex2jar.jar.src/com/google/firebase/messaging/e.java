package com.google.firebase.messaging;

import Dz;
import Ez;
import Rz;
import Sz;
import Tz;
import Uz;
import Vz;
import Yz;
import Zz;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.app.ca.c;
import android.util.Log;
import cA;
import com.google.android.gms.common.util.m;
import java.util.Iterator;
import java.util.List;

final class e
{
  private final Context a;
  private final Bundle b;
  
  public e(Context paramContext, Bundle paramBundle)
  {
    this.a = paramContext.getApplicationContext();
    this.b = paramBundle;
  }
  
  private final Bundle b()
  {
    try
    {
      Bundle localBundle = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128).metaData;
      if (localBundle != null) {
        return localBundle;
      }
      localBundle = Bundle.EMPTY;
      return localBundle;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return Bundle.EMPTY;
  }
  
  final boolean a()
  {
    Object localObject1 = new Uz("FirebaseMessaging", this.b);
    if ("1".equals(((Uz)localObject1).a("gcm.n.noui"))) {
      return true;
    }
    if (!((KeyguardManager)this.a.getSystemService("keyguard")).inKeyguardRestrictedInputMode())
    {
      if (!m.h()) {
        SystemClock.sleep(10L);
      }
      i = Process.myPid();
      localObject2 = ((ActivityManager)this.a.getSystemService("activity")).getRunningAppProcesses();
      if (localObject2 != null)
      {
        localObject3 = ((List)localObject2).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject3).next();
          if (((ActivityManager.RunningAppProcessInfo)localObject2).pid == i) {
            if (((ActivityManager.RunningAppProcessInfo)localObject2).importance == 100)
            {
              i = 1;
              break label137;
            }
          }
        }
      }
    }
    int i = 0;
    label137:
    if (i != 0) {
      return false;
    }
    PackageManager localPackageManager = this.a.getPackageManager();
    String str = this.a.getPackageName();
    ApplicationInfo localApplicationInfo = this.a.getApplicationInfo();
    Object localObject2 = new Rz(this.a);
    Sz localSz = new Sz(this.a);
    NotificationManager localNotificationManager = (NotificationManager)this.a.getSystemService("notification");
    Object localObject3 = new Yz(this.b, str);
    ((Yz)localObject3).a(localApplicationInfo.icon);
    ((Yz)localObject3).a(localApplicationInfo.loadLabel(localPackageManager));
    ((Yz)localObject3).a(localPackageManager.getLaunchIntentForPackage(str));
    ((Yz)localObject3).a((Zz)localObject2);
    ((Yz)localObject3).a(localSz);
    ((Yz)localObject3).a(new f(this, localNotificationManager));
    ((Yz)localObject3).a("FCM-Notification");
    ((Yz)localObject3).a(b());
    ((Yz)localObject3).a(this.a.getResources());
    ((Yz)localObject3).a(new Tz(this.a, this.b));
    ((Yz)localObject3).b(localApplicationInfo.targetSdkVersion);
    localObject1 = new Dz(((Yz)localObject3).a(), (Uz)localObject1);
    localObject1 = new Vz(this.a, (cA)localObject1).a();
    if (Log.isLoggable("FirebaseMessaging", 3)) {
      Log.d("FirebaseMessaging", "Showing notification");
    }
    ((NotificationManager)this.a.getSystemService("notification")).notify(((Ez)localObject1).b, 0, ((Ez)localObject1).a.a());
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/messaging/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */