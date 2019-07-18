package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.n;
import fq;
import hq;

@yh
public final class aa
  extends fq
{
  public static final Parcelable.Creator<aa> CREATOR = new ba();
  public final boolean a;
  public final boolean b;
  public final boolean c;
  
  public aa(n paramn)
  {
    this(paramn.c(), paramn.b(), paramn.a());
  }
  
  public aa(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.a = paramBoolean1;
    this.b = paramBoolean2;
    this.c = paramBoolean3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 2, this.a);
    hq.a(paramParcel, 3, this.b);
    hq.a(paramParcel, 4, this.c);
    hq.a(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */