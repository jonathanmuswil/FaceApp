package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.ads.yh;
import fq;
import hq;

@yh
public final class h
  extends fq
{
  public static final Parcelable.Creator<h> CREATOR = new i();
  public final boolean a;
  public final boolean b;
  private final String c;
  public final boolean d;
  public final float e;
  public final int f;
  public final boolean g;
  public final boolean h;
  public final boolean i;
  
  h(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, float paramFloat, int paramInt, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    this.a = paramBoolean1;
    this.b = paramBoolean2;
    this.c = paramString;
    this.d = paramBoolean3;
    this.e = paramFloat;
    this.f = paramInt;
    this.g = paramBoolean4;
    this.h = paramBoolean5;
    this.i = paramBoolean6;
  }
  
  public h(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat, int paramInt, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    this(false, paramBoolean2, null, false, 0.0F, -1, paramBoolean4, paramBoolean5, paramBoolean6);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 2, this.a);
    hq.a(paramParcel, 3, this.b);
    hq.a(paramParcel, 4, this.c, false);
    hq.a(paramParcel, 5, this.d);
    hq.a(paramParcel, 6, this.e);
    hq.a(paramParcel, 7, this.f);
    hq.a(paramParcel, 8, this.g);
    hq.a(paramParcel, 9, this.h);
    hq.a(paramParcel, 10, this.i);
    hq.a(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */