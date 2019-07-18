package com.google.android.gms.internal.ads;

import Hq;
import android.os.IInterface;
import android.os.RemoteException;

public abstract interface kb
  extends IInterface
{
  public abstract void a(Hq paramHq, int paramInt)
    throws RemoteException;
  
  public abstract void b(String paramString, Hq paramHq)
    throws RemoteException;
  
  public abstract void c(Hq paramHq)
    throws RemoteException;
  
  public abstract void d(Hq paramHq)
    throws RemoteException;
  
  public abstract void destroy()
    throws RemoteException;
  
  public abstract Hq q(String paramString)
    throws RemoteException;
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */