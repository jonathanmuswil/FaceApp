package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class db
  extends YU
  implements cb
{
  public db()
  {
    super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 2)
    {
      float f = ja();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      return true;
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */