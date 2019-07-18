package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.n;
import com.google.android.gms.measurement.internal.Q;
import com.google.android.gms.measurement.internal.U;

public final class AppMeasurementReceiver
  extends n
  implements U
{
  private Q c;
  
  public final BroadcastReceiver.PendingResult a()
  {
    return goAsync();
  }
  
  public final void a(Context paramContext, Intent paramIntent)
  {
    n.b(paramContext, paramIntent);
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (this.c == null) {
      this.c = new Q(this);
    }
    this.c.a(paramContext, paramIntent);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/AppMeasurementReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */