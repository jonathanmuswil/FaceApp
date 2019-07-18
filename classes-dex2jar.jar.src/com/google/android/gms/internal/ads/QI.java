package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class qi
  extends XU
  implements pi
{
  qi(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
  }
  
  public final void a(mi parammi, String paramString1, String paramString2)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, parammi);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    b(2, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */