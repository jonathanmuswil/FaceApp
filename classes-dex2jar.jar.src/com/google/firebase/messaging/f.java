package com.google.firebase.messaging;

import aA;
import android.annotation.TargetApi;
import android.app.NotificationManager;
import com.google.android.gms.common.util.m;

final class f
  implements aA
{
  f(e parame, NotificationManager paramNotificationManager) {}
  
  @TargetApi(26)
  public final boolean a(String paramString)
  {
    if (!m.k()) {
      return true;
    }
    return this.a.getNotificationChannel(paramString) != null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/messaging/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */