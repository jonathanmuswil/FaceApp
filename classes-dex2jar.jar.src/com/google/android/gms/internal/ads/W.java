package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import fq;
import hq;

@yh
public final class w
  extends fq
{
  public static final Parcelable.Creator<w> CREATOR = new x();
  private final int a;
  
  public w(int paramInt)
  {
    this.a = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 2, this.a);
    hq.a(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */