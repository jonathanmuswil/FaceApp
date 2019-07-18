package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import fq;
import hq;

@yh
public final class qd
  extends fq
{
  public static final Parcelable.Creator<qd> CREATOR = new rd();
  public final String a;
  public final Bundle b;
  
  public qd(String paramString, Bundle paramBundle)
  {
    this.a = paramString;
    this.b = paramBundle;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.a, false);
    hq.a(paramParcel, 2, this.b, false);
    hq.a(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */