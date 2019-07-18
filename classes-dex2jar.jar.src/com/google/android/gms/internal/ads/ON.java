package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

@yh
@TargetApi(14)
public final class on
{
  private final long a;
  private long b;
  private boolean c;
  
  on()
  {
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    ga localga = ra.L;
    this.a = localTimeUnit.toNanos(((Long)Kea.e().a(localga)).longValue());
    this.c = true;
  }
  
  public final void a()
  {
    this.c = true;
  }
  
  public final void a(SurfaceTexture paramSurfaceTexture, dn paramdn)
  {
    if (paramdn == null) {
      return;
    }
    long l = paramSurfaceTexture.getTimestamp();
    if ((this.c) || (Math.abs(l - this.b) >= this.a))
    {
      this.c = false;
      this.b = l;
      vk.a.post(new qn(this, paramdn));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/on.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */