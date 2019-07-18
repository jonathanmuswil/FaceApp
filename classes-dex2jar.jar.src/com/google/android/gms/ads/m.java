package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.Tl;
import com.google.android.gms.internal.ads.Z;
import com.google.android.gms.internal.ads.q;
import com.google.android.gms.internal.ads.yh;

@yh
public final class m
{
  private final Object a = new Object();
  private q b;
  private a c;
  
  public final q a()
  {
    synchronized (this.a)
    {
      q localq = this.b;
      return localq;
    }
  }
  
  public final void a(a parama)
  {
    t.a(parama, "VideoLifecycleCallbacks may not be null.");
    synchronized (this.a)
    {
      this.c = parama;
      if (this.b == null) {
        return;
      }
      try
      {
        q localq = this.b;
        Z localZ = new com/google/android/gms/internal/ads/Z;
        localZ.<init>(parama);
        localq.a(localZ);
      }
      catch (RemoteException parama)
      {
        Tl.b("Unable to call setVideoLifecycleCallbacks on video controller.", parama);
      }
      return;
    }
  }
  
  public final void a(q paramq)
  {
    synchronized (this.a)
    {
      this.b = paramq;
      if (this.c != null) {
        a(this.c);
      }
      return;
    }
  }
  
  public static class a
  {
    public void a() {}
    
    public void a(boolean paramBoolean) {}
    
    public void b() {}
    
    public void c() {}
    
    public void d() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */