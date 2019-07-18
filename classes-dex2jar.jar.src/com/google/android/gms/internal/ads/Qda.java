package com.google.android.gms.internal.ads;

import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.c.b;

final class qda
  implements c.b
{
  qda(jda paramjda, Hm paramHm) {}
  
  public final void onConnectionFailed(b arg1)
  {
    synchronized (jda.b(this.b))
    {
      Hm localHm = this.a;
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("Connection failed.");
      localHm.a(localRuntimeException);
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */