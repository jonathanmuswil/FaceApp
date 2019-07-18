package com.google.android.gms.internal.ads;

import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.c.b;

final class _ca
  implements c.b
{
  _ca(Wca paramWca) {}
  
  public final void onConnectionFailed(b arg1)
  {
    synchronized (Wca.c(this.a))
    {
      Wca.a(this.a, null);
      if (Wca.d(this.a) != null) {
        Wca.a(this.a, null);
      }
      Wca.c(this.a).notifyAll();
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/_ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */