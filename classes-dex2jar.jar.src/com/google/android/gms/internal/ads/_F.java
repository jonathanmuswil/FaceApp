package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class _f
  implements Runnable
{
  _f(Rf paramRf) {}
  
  public final void run()
  {
    try
    {
      Rf.a(this.a).h();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.d("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/_f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */