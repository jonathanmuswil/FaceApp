package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zi
  extends XU
  implements xi
{
  zi(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
  }
  
  public final void T()
    throws RemoteException
  {
    b(6, a());
  }
  
  public final void a(mi parammi)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, parammi);
    b(5, localParcel);
  }
  
  public final void ba()
    throws RemoteException
  {
    b(4, a());
  }
  
  public final void c(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeInt(paramInt);
    b(7, localParcel);
  }
  
  public final void ca()
    throws RemoteException
  {
    b(2, a());
  }
  
  public final void ia()
    throws RemoteException
  {
    b(1, a());
  }
  
  public final void n()
    throws RemoteException
  {
    b(3, a());
  }
  
  public final void o()
    throws RemoteException
  {
    b(8, a());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */