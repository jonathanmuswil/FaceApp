package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import fq;
import hq;

@yh
public final class sd
  extends fq
{
  public static final Parcelable.Creator<sd> CREATOR = new ud();
  public final int a;
  
  public sd(int paramInt)
  {
    this.a = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.a);
    hq.a(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */