package com.google.android.gms.dynamite;

import Hq;
import android.os.IInterface;
import android.os.RemoteException;

public abstract interface i
  extends IInterface
{
  public abstract int a(Hq paramHq, String paramString, boolean paramBoolean)
    throws RemoteException;
  
  public abstract Hq a(Hq paramHq, String paramString, int paramInt)
    throws RemoteException;
  
  public abstract int b(Hq paramHq, String paramString, boolean paramBoolean)
    throws RemoteException;
  
  public abstract Hq b(Hq paramHq, String paramString, int paramInt)
    throws RemoteException;
  
  public abstract int ub()
    throws RemoteException;
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/dynamite/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */