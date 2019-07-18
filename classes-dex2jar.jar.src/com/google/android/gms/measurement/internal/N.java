package com.google.android.gms.measurement.internal;

import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

public abstract interface n
  extends IInterface
{
  public abstract List<ec> a(pc parampc, boolean paramBoolean)
    throws RemoteException;
  
  public abstract List<uc> a(String paramString1, String paramString2, pc parampc)
    throws RemoteException;
  
  public abstract List<uc> a(String paramString1, String paramString2, String paramString3)
    throws RemoteException;
  
  public abstract List<ec> a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
    throws RemoteException;
  
  public abstract List<ec> a(String paramString1, String paramString2, boolean paramBoolean, pc parampc)
    throws RemoteException;
  
  public abstract void a(long paramLong, String paramString1, String paramString2, String paramString3)
    throws RemoteException;
  
  public abstract void a(ec paramec, pc parampc)
    throws RemoteException;
  
  public abstract void a(k paramk, pc parampc)
    throws RemoteException;
  
  public abstract void a(k paramk, String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract void a(pc parampc)
    throws RemoteException;
  
  public abstract void a(uc paramuc)
    throws RemoteException;
  
  public abstract void a(uc paramuc, pc parampc)
    throws RemoteException;
  
  public abstract byte[] a(k paramk, String paramString)
    throws RemoteException;
  
  public abstract void b(pc parampc)
    throws RemoteException;
  
  public abstract String c(pc parampc)
    throws RemoteException;
  
  public abstract void d(pc parampc)
    throws RemoteException;
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */