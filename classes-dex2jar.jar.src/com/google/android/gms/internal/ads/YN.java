package com.google.android.gms.internal.ads;

import android.os.Handler;

@yh
final class yn
  implements Runnable
{
  private gn a;
  private boolean b = false;
  
  yn(gn paramgn)
  {
    this.a = paramgn;
  }
  
  private final void c()
  {
    vk.a.removeCallbacks(this);
    vk.a.postDelayed(this, 250L);
  }
  
  public final void a()
  {
    this.b = true;
    this.a.h();
  }
  
  public final void b()
  {
    this.b = false;
    c();
  }
  
  public final void run()
  {
    if (!this.b)
    {
      this.a.h();
      c();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */