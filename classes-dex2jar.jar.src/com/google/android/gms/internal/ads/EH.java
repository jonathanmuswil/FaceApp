package com.google.android.gms.internal.ads;

import Hq;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class eh
  extends XU
  implements ch
{
  eh(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
  }
  
  public final boolean Ja()
    throws RemoteException
  {
    Parcel localParcel = a(11, a());
    boolean bool = ZU.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final void Wa()
    throws RemoteException
  {
    b(9, a());
  }
  
  public final void i()
    throws RemoteException
  {
    b(3, a());
  }
  
  public final void i(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramBundle);
    localParcel = a(6, localParcel);
    if (localParcel.readInt() != 0) {
      paramBundle.readFromParcel(localParcel);
    }
    localParcel.recycle();
  }
  
  public final void j()
    throws RemoteException
  {
    b(7, a());
  }
  
  public final void k(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramBundle);
    b(1, localParcel);
  }
  
  public final void kb()
    throws RemoteException
  {
    b(2, a());
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeInt(paramInt1);
    localParcel.writeInt(paramInt2);
    ZU.a(localParcel, paramIntent);
    b(12, localParcel);
  }
  
  public final void onDestroy()
    throws RemoteException
  {
    b(8, a());
  }
  
  public final void onPause()
    throws RemoteException
  {
    b(5, a());
  }
  
  public final void onResume()
    throws RemoteException
  {
    b(4, a());
  }
  
  public final void y(Hq paramHq)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramHq);
    b(13, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/eh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */