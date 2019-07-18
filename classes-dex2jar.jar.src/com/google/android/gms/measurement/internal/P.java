package com.google.android.gms.measurement.internal;

import MG;
import PF;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class p
  extends PF
  implements n
{
  p(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
  }
  
  public final List<ec> a(pc parampc, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = a();
    MG.a(localParcel, parampc);
    MG.a(localParcel, paramBoolean);
    localParcel = a(7, localParcel);
    parampc = localParcel.createTypedArrayList(ec.CREATOR);
    localParcel.recycle();
    return parampc;
  }
  
  public final List<uc> a(String paramString1, String paramString2, pc parampc)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    MG.a(localParcel, parampc);
    paramString2 = a(16, localParcel);
    paramString1 = paramString2.createTypedArrayList(uc.CREATOR);
    paramString2.recycle();
    return paramString1;
  }
  
  public final List<uc> a(String paramString1, String paramString2, String paramString3)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeString(paramString3);
    paramString2 = a(17, localParcel);
    paramString1 = paramString2.createTypedArrayList(uc.CREATOR);
    paramString2.recycle();
    return paramString1;
  }
  
  public final List<ec> a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeString(paramString3);
    MG.a(localParcel, paramBoolean);
    paramString2 = a(15, localParcel);
    paramString1 = paramString2.createTypedArrayList(ec.CREATOR);
    paramString2.recycle();
    return paramString1;
  }
  
  public final List<ec> a(String paramString1, String paramString2, boolean paramBoolean, pc parampc)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    MG.a(localParcel, paramBoolean);
    MG.a(localParcel, parampc);
    paramString1 = a(14, localParcel);
    paramString2 = paramString1.createTypedArrayList(ec.CREATOR);
    paramString1.recycle();
    return paramString2;
  }
  
  public final void a(long paramLong, String paramString1, String paramString2, String paramString3)
    throws RemoteException
  {
    Parcel localParcel = a();
    localParcel.writeLong(paramLong);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeString(paramString3);
    b(10, localParcel);
  }
  
  public final void a(ec paramec, pc parampc)
    throws RemoteException
  {
    Parcel localParcel = a();
    MG.a(localParcel, paramec);
    MG.a(localParcel, parampc);
    b(2, localParcel);
  }
  
  public final void a(k paramk, pc parampc)
    throws RemoteException
  {
    Parcel localParcel = a();
    MG.a(localParcel, paramk);
    MG.a(localParcel, parampc);
    b(1, localParcel);
  }
  
  public final void a(k paramk, String paramString1, String paramString2)
    throws RemoteException
  {
    Parcel localParcel = a();
    MG.a(localParcel, paramk);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    b(5, localParcel);
  }
  
  public final void a(pc parampc)
    throws RemoteException
  {
    Parcel localParcel = a();
    MG.a(localParcel, parampc);
    b(18, localParcel);
  }
  
  public final void a(uc paramuc)
    throws RemoteException
  {
    Parcel localParcel = a();
    MG.a(localParcel, paramuc);
    b(13, localParcel);
  }
  
  public final void a(uc paramuc, pc parampc)
    throws RemoteException
  {
    Parcel localParcel = a();
    MG.a(localParcel, paramuc);
    MG.a(localParcel, parampc);
    b(12, localParcel);
  }
  
  public final byte[] a(k paramk, String paramString)
    throws RemoteException
  {
    Parcel localParcel = a();
    MG.a(localParcel, paramk);
    localParcel.writeString(paramString);
    paramk = a(9, localParcel);
    paramString = paramk.createByteArray();
    paramk.recycle();
    return paramString;
  }
  
  public final void b(pc parampc)
    throws RemoteException
  {
    Parcel localParcel = a();
    MG.a(localParcel, parampc);
    b(6, localParcel);
  }
  
  public final String c(pc parampc)
    throws RemoteException
  {
    Object localObject = a();
    MG.a((Parcel)localObject, parampc);
    parampc = a(11, (Parcel)localObject);
    localObject = parampc.readString();
    parampc.recycle();
    return (String)localObject;
  }
  
  public final void d(pc parampc)
    throws RemoteException
  {
    Parcel localParcel = a();
    MG.a(localParcel, parampc);
    b(4, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */