package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class pd
  extends XU
  implements nd
{
  pd(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
  }
  
  public final void a(List<id> paramList)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeTypedList(paramList);
    b(1, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */