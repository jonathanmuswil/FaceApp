package com.google.android.gms.internal.ads;

import android.content.Context;

final class xk
  implements Runnable
{
  xk(vk paramvk, Context paramContext) {}
  
  public final void run()
  {
    synchronized (vk.a(this.b))
    {
      vk.a(this.b, vk.c(this.a));
      vk.a(this.b).notifyAll();
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */