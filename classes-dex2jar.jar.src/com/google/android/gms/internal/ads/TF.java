package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class tf
  extends XU
  implements rf
{
  tf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
  }
  
  public final void a(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeInt(paramInt);
    b(3, localParcel);
  }
  
  public final void a(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramBundle);
    b(19, localParcel);
  }
  
  public final void a(Bb paramBb, String paramString)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramBb);
    localParcel.writeString(paramString);
    b(10, localParcel);
  }
  
  public final void a(Ki paramKi)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramKi);
    b(14, localParcel);
  }
  
  public final void a(Mi paramMi)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramMi);
    b(16, localParcel);
  }
  
  public final void a(uf paramuf)
    throws RemoteException
  {
    Parcel localParcel = a();
    ZU.a(localParcel, paramuf);
    b(7, localParcel);
  }
  
  public final void a(String paramString1, String paramString2)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    b(9, localParcel);
  }
  
  public final void b(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeInt(paramInt);
    b(17, localParcel);
  }
  
  public final void h()
    throws RemoteException
  {
    b(6, a());
  }
  
  public final void k()
    throws RemoteException
  {
    b(8, a());
  }
  
  public final void ka()
    throws RemoteException
  {
    b(15, a());
  }
  
  public final void l()
    throws RemoteException
  {
    b(1, a());
  }
  
  public final void na()
    throws RemoteException
  {
    b(11, a());
  }
  
  public final void o(String paramString)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString);
    b(12, localParcel);
  }
  
  public final void p()
    throws RemoteException
  {
    b(5, a());
  }
  
  public final void q()
    throws RemoteException
  {
    b(4, a());
  }
  
  public final void r()
    throws RemoteException
  {
    b(2, a());
  }
  
  public final void ra()
    throws RemoteException
  {
    b(20, a());
  }
  
  public final void xa()
    throws RemoteException
  {
    b(13, a());
  }
  
  public final void xb()
    throws RemoteException
  {
    b(18, a());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */