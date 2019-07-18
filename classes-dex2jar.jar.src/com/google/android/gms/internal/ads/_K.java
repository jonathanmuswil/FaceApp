package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import fq;
import hq;

@yh
public final class _k
  extends fq
{
  public static final Parcelable.Creator<_k> CREATOR = new bl();
  public final String a;
  public final int b;
  
  _k(String paramString, int paramInt)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    this.a = str;
    this.b = paramInt;
  }
  
  public static _k a(Throwable paramThrowable, int paramInt)
  {
    return new _k(paramThrowable.getMessage(), paramInt);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.a, false);
    hq.a(paramParcel, 2, this.b);
    hq.a(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/_k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */