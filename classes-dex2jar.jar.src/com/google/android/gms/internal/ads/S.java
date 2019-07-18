package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class s
  extends XU
  implements q
{
  s(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IVideoController");
  }
  
  public final void a(t paramt)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramt);
    b(8, localParcel);
  }
  
  public final t gb()
    throws RemoteException
  {
    Parcel localParcel = a(11, a());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null)
    {
      localObject = null;
    }
    else
    {
      localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
      if ((localObject instanceof t)) {
        localObject = (t)localObject;
      } else {
        localObject = new v(localIBinder);
      }
    }
    localParcel.recycle();
    return (t)localObject;
  }
  
  public final float ja()
    throws RemoteException
  {
    Parcel localParcel = a(9, a());
    float f = localParcel.readFloat();
    localParcel.recycle();
    return f;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */