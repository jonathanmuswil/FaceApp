package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.Ib;
import com.google.android.gms.measurement.internal.Mb;

@TargetApi(24)
public final class AppMeasurementJobService
  extends JobService
  implements Mb
{
  private Ib<AppMeasurementJobService> a;
  
  private final Ib<AppMeasurementJobService> a()
  {
    if (this.a == null) {
      this.a = new Ib(this);
    }
    return this.a;
  }
  
  @TargetApi(24)
  public final void a(JobParameters paramJobParameters, boolean paramBoolean)
  {
    jobFinished(paramJobParameters, false);
  }
  
  public final void a(Intent paramIntent) {}
  
  public final boolean a(int paramInt)
  {
    throw new UnsupportedOperationException();
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
  
  public final boolean onStartJob(JobParameters paramJobParameters)
  {
    return a().a(paramJobParameters);
  }
  
  public final boolean onStopJob(JobParameters paramJobParameters)
  {
    return false;
  }
  
  public final boolean onUnbind(Intent paramIntent)
  {
    return a().c(paramIntent);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/AppMeasurementJobService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */