package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import fq;
import hq;

@yh
public final class id
  extends fq
{
  public static final Parcelable.Creator<id> CREATOR = new jd();
  public final String a;
  public final boolean b;
  public final int c;
  public final String d;
  
  public id(String paramString1, boolean paramBoolean, int paramInt, String paramString2)
  {
    this.a = paramString1;
    this.b = paramBoolean;
    this.c = paramInt;
    this.d = paramString2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.a, false);
    hq.a(paramParcel, 2, this.b);
    hq.a(paramParcel, 3, this.c);
    hq.a(paramParcel, 4, this.d, false);
    hq.a(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/id.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */