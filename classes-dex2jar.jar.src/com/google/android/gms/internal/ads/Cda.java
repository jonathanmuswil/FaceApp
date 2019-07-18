package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.internal.c.a;
import com.google.android.gms.common.internal.c.b;

@yh
public final class cda
  extends com.google.android.gms.ads.internal.c<gda>
{
  cda(Context paramContext, Looper paramLooper, c.a parama, c.b paramb)
  {
    super(li.b(paramContext), paramLooper, 123, parama, paramb, null);
  }
  
  public final gda A()
    throws DeadObjectException
  {
    return (gda)super.v();
  }
  
  protected final String w()
  {
    return "com.google.android.gms.ads.internal.cache.ICacheService";
  }
  
  protected final String x()
  {
    return "com.google.android.gms.ads.service.CACHE";
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */