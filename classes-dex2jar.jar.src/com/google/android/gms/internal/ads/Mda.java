package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.c.a;
import java.util.concurrent.Future;

final class mda
  implements c.a
{
  mda(jda paramjda, dda paramdda, Hm paramHm) {}
  
  public final void onConnected(Bundle arg1)
  {
    synchronized (jda.b(this.c))
    {
      if (jda.c(this.c)) {
        return;
      }
      jda.a(this.c, true);
      Object localObject1 = jda.d(this.c);
      if (localObject1 == null) {
        return;
      }
      Object localObject3 = new com/google/android/gms/internal/ads/nda;
      ((nda)localObject3).<init>(this, (cda)localObject1, this.a, this.b);
      localObject3 = tk.a((Runnable)localObject3);
      Hm localHm = this.b;
      localObject1 = new com/google/android/gms/internal/ads/oda;
      ((oda)localObject1).<init>(this.b, (Future)localObject3);
      localHm.a((Runnable)localObject1, Cm.b);
      return;
    }
  }
  
  public final void onConnectionSuspended(int paramInt) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */