package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import fq;
import hq;

@yh
public final class mea
  extends fq
{
  public static final Parcelable.Creator<mea> CREATOR = new nea();
  public final String a;
  public final String b;
  
  public mea(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.a, false);
    hq.a(paramParcel, 2, this.b, false);
    hq.a(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */