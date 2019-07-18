package com.google.firebase.perf.internal;

import android.support.annotation.Keep;
import iv;
import java.util.concurrent.TimeUnit;
import zv;

@Keep
public class FeatureControl
{
  private static final FeatureControl zzci = new FeatureControl();
  private static final long zzcl = TimeUnit.HOURS.toMinutes(4L);
  private final RemoteConfigManager zzcj;
  private zv zzck;
  
  private FeatureControl()
  {
    this(RemoteConfigManager.zzbz(), null);
  }
  
  private FeatureControl(RemoteConfigManager paramRemoteConfigManager, zv paramzv)
  {
    this.zzcj = paramRemoteConfigManager;
    this.zzck = new zv();
  }
  
  public static FeatureControl zzaq()
  {
    try
    {
      FeatureControl localFeatureControl = zzci;
      return localFeatureControl;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private final long zzb(String paramString, long paramLong)
  {
    int i = iv.a(this.zzcj.zzc(paramString, paramLong));
    i = this.zzck.a(paramString, i);
    if ((i != Integer.MAX_VALUE) && (i != Integer.MIN_VALUE)) {
      return i;
    }
    return paramLong;
  }
  
  public final void zza(zv paramzv)
  {
    this.zzck = paramzv;
  }
  
  public final boolean zzar()
  {
    return zzb("sessions_feature_enabled", 1L) != 0L;
  }
  
  public final boolean zzas()
  {
    return zzb("sessions_cpu_capture_enabled", 1L) != 0L;
  }
  
  public final boolean zzat()
  {
    return zzb("sessions_memory_capture_enabled", 1L) != 0L;
  }
  
  public final float zzau()
  {
    float f = this.zzcj.zza("sessions_sampling_percentage", 1.0F);
    return this.zzck.a("sessions_sampling_percentage", f);
  }
  
  public final long zzav()
  {
    return zzb("sessions_cpu_capture_frequency_fg_ms", 100L);
  }
  
  public final long zzaw()
  {
    return zzb("sessions_memory_capture_frequency_fg_ms", 100L);
  }
  
  public final long zzax()
  {
    return zzb("sessions_cpu_capture_frequency_bg_ms", 0L);
  }
  
  public final long zzay()
  {
    return zzb("sessions_memory_capture_frequency_bg_ms", 0L);
  }
  
  public final long zzaz()
  {
    return zzb("sessions_max_length_minutes", zzcl);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/internal/FeatureControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */