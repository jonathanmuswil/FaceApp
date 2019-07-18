package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class ag
  implements Runnable
{
  ag(Rf paramRf) {}
  
  public final void run()
  {
    try
    {
      Rf.a(this.a).r();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.d("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */