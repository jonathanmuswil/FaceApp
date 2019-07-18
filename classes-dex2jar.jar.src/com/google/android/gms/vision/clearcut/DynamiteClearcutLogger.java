package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.vision.L;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import java.util.concurrent.TimeUnit;
import wL;

@Keep
public class DynamiteClearcutLogger
{
  private static final ThreadPoolExecutor zzbo = new ThreadPoolExecutor(1, 2, 2L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), new ThreadPoolExecutor.DiscardPolicy());
  private b zzbp = new b(0.03333333333333333D);
  private VisionClearcutLogger zzbq;
  
  public DynamiteClearcutLogger(Context paramContext)
  {
    this.zzbq = new VisionClearcutLogger(paramContext);
  }
  
  public final void zza(int paramInt, wL paramwL)
  {
    if ((paramInt == 3) && (!this.zzbp.a()))
    {
      L.zza("Skipping image analysis log due to rate limiting", new Object[0]);
      return;
    }
    zzbo.execute(new a(this, paramInt, paramwL));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/vision/clearcut/DynamiteClearcutLogger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */