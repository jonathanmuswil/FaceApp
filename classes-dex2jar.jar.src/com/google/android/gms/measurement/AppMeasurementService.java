package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.content.n;
import com.google.android.gms.measurement.internal.Ib;
import com.google.android.gms.measurement.internal.Mb;

public final class AppMeasurementService
  extends Service
  implements Mb
{
  private Ib<AppMeasurementService> a;
  
  private final Ib<AppMeasurementService> a()
  {
    if (this.a == null) {
      this.a = new Ib(this);
    }
    return this.a;
  }
  
  public final void a(JobParameters paramJobParameters, boolean paramBoolean)
  {
    throw new UnsupportedOperationException();
  }
  
  public final void a(Intent paramIntent)
  {
    n.a(paramIntent);
  }
  
  public final boolean a(int paramInt)
  {
    return stopSelfResult(paramInt);
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    return a().a(paramIntent);
  }
  
  public final void onCreate()
  {
    super.onCreate();
    a().a();
  }
  
  public final void onDestroy()
  {
    a().b();
    super.onDestroy();
  }
  
  public final void onRebind(Intent paramIntent)
  {
    a().b(paramIntent);
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return a().a(paramIntent, paramInt1, paramInt2);
  }
  
  public final boolean onUnbind(Intent paramIntent)
  {
    return a().c(paramIntent);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/AppMeasurementService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */