package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

public abstract interface mi
  extends IInterface
{
  public abstract int I()
    throws RemoteException;
  
  public abstract String getType()
    throws RemoteException;
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */