package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.t;
import fq;
import hq;

public final class uc
  extends fq
{
  public static final Parcelable.Creator<uc> CREATOR = new vc();
  public String a;
  public String b;
  public ec c;
  public long d;
  public boolean e;
  public String f;
  public k g;
  public long h;
  public k i;
  public long j;
  public k k;
  
  uc(uc paramuc)
  {
    t.a(paramuc);
    this.a = paramuc.a;
    this.b = paramuc.b;
    this.c = paramuc.c;
    this.d = paramuc.d;
    this.e = paramuc.e;
    this.f = paramuc.f;
    this.g = paramuc.g;
    this.h = paramuc.h;
    this.i = paramuc.i;
    this.j = paramuc.j;
    this.k = paramuc.k;
  }
  
  uc(String paramString1, String paramString2, ec paramec, long paramLong1, boolean paramBoolean, String paramString3, k paramk1, long paramLong2, k paramk2, long paramLong3, k paramk3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramec;
    this.d = paramLong1;
    this.e = paramBoolean;
    this.f = paramString3;
    this.g = paramk1;
    this.h = paramLong2;
    this.i = paramk2;
    this.j = paramLong3;
    this.k = paramk3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = hq.a(paramParcel);
    hq.a(paramParcel, 2, this.a, false);
    hq.a(paramParcel, 3, this.b, false);
    hq.a(paramParcel, 4, this.c, paramInt, false);
    hq.a(paramParcel, 5, this.d);
    hq.a(paramParcel, 6, this.e);
    hq.a(paramParcel, 7, this.f, false);
    hq.a(paramParcel, 8, this.g, paramInt, false);
    hq.a(paramParcel, 9, this.h);
    hq.a(paramParcel, 10, this.i, paramInt, false);
    hq.a(paramParcel, 11, this.j);
    hq.a(paramParcel, 12, this.k, paramInt, false);
    hq.a(paramParcel, m);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/uc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */