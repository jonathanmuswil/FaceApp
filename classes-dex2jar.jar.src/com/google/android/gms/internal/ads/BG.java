package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;

final class bg
  implements Runnable
{
  bg(Rf paramRf, AdRequest.ErrorCode paramErrorCode) {}
  
  public final void run()
  {
    try
    {
      Rf.a(this.b).a(dg.a(this.a));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.d("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */