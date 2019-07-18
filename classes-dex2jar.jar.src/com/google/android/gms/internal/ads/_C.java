package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

public abstract class _c
  extends YU
  implements Zc
{
  public _c()
  {
    super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      b((ParcelFileDescriptor)ZU.a(paramParcel1, ParcelFileDescriptor.CREATOR));
      return true;
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/_c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */