package com.google.android.gms.common;

import Iq;
import Zu;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.O;
import com.google.android.gms.common.internal.P;
import fq;
import hq;

public final class x
  extends fq
{
  public static final Parcelable.Creator<x> CREATOR = new y();
  private final String a;
  private final r b;
  private final boolean c;
  private final boolean d;
  
  x(String paramString, IBinder paramIBinder, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramString;
    this.b = a(paramIBinder);
    this.c = paramBoolean1;
    this.d = paramBoolean2;
  }
  
  x(String paramString, r paramr, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramString;
    this.b = paramr;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
  }
  
  private static r a(IBinder paramIBinder)
  {
    Object localObject = null;
    if (paramIBinder == null) {
      return null;
    }
    try
    {
      paramIBinder = P.a(paramIBinder).ha();
      if (paramIBinder == null) {
        paramIBinder = null;
      } else {
        paramIBinder = (byte[])Iq.J(paramIBinder);
      }
      if (paramIBinder != null)
      {
        paramIBinder = new s(paramIBinder);
      }
      else
      {
        Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
        paramIBinder = (IBinder)localObject;
      }
      return paramIBinder;
    }
    catch (RemoteException paramIBinder)
    {
      Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", paramIBinder);
    }
    return null;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.a, false);
    r localr = this.b;
    if (localr == null)
    {
      Log.w("GoogleCertificatesQuery", "certificate binder is null");
      localr = null;
    }
    else
    {
      localr.asBinder();
    }
    hq.a(paramParcel, 2, localr, false);
    hq.a(paramParcel, 3, this.c);
    hq.a(paramParcel, 4, this.d);
    hq.a(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */