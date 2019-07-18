package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@yh
public final class vl
{
  private Map<Integer, Bitmap> a = new ConcurrentHashMap();
  private AtomicInteger b = new AtomicInteger(0);
  
  public final Bitmap a(Integer paramInteger)
  {
    return (Bitmap)this.a.get(paramInteger);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */