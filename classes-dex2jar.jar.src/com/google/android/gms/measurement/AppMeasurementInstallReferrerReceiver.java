package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.Q;
import com.google.android.gms.measurement.internal.U;

public final class AppMeasurementInstallReferrerReceiver
  extends BroadcastReceiver
  implements U
{
  private Q a;
  
  public final BroadcastReceiver.PendingResult a()
  {
    return goAsync();
  }
  
  public final void a(Context paramContext, Intent paramIntent) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (this.a == null) {
      this.a = new Q(this);
    }
    this.a.a(paramContext, paramIntent);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/AppMeasurementInstallReferrerReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */