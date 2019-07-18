package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.t;
import fq;
import hq;

public final class pc
  extends fq
{
  public static final Parcelable.Creator<pc> CREATOR = new qc();
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final long e;
  public final long f;
  public final String g;
  public final boolean h;
  public final boolean i;
  public final long j;
  public final String k;
  public final long l;
  public final long m;
  public final int n;
  public final boolean o;
  public final boolean p;
  public final boolean q;
  public final String r;
  public final Boolean s;
  public final long t;
  
  pc(String paramString1, String paramString2, String paramString3, long paramLong1, String paramString4, long paramLong2, long paramLong3, String paramString5, boolean paramBoolean1, boolean paramBoolean2, String paramString6, long paramLong4, long paramLong5, int paramInt, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, String paramString7, Boolean paramBoolean, long paramLong6)
  {
    t.b(paramString1);
    this.a = paramString1;
    if (TextUtils.isEmpty(paramString2)) {
      paramString2 = null;
    }
    this.b = paramString2;
    this.c = paramString3;
    this.j = paramLong1;
    this.d = paramString4;
    this.e = paramLong2;
    this.f = paramLong3;
    this.g = paramString5;
    this.h = paramBoolean1;
    this.i = paramBoolean2;
    this.k = paramString6;
    this.l = paramLong4;
    this.m = paramLong5;
    this.n = paramInt;
    this.o = paramBoolean3;
    this.p = paramBoolean4;
    this.q = paramBoolean5;
    this.r = paramString7;
    this.s = paramBoolean;
    this.t = paramLong6;
  }
  
  pc(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5, boolean paramBoolean1, boolean paramBoolean2, long paramLong3, String paramString6, long paramLong4, long paramLong5, int paramInt, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, String paramString7, Boolean paramBoolean, long paramLong6)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.j = paramLong3;
    this.d = paramString4;
    this.e = paramLong1;
    this.f = paramLong2;
    this.g = paramString5;
    this.h = paramBoolean1;
    this.i = paramBoolean2;
    this.k = paramString6;
    this.l = paramLong4;
    this.m = paramLong5;
    this.n = paramInt;
    this.o = paramBoolean3;
    this.p = paramBoolean4;
    this.q = paramBoolean5;
    this.r = paramString7;
    this.s = paramBoolean;
    this.t = paramLong6;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 2, this.a, false);
    hq.a(paramParcel, 3, this.b, false);
    hq.a(paramParcel, 4, this.c, false);
    hq.a(paramParcel, 5, this.d, false);
    hq.a(paramParcel, 6, this.e);
    hq.a(paramParcel, 7, this.f);
    hq.a(paramParcel, 8, this.g, false);
    hq.a(paramParcel, 9, this.h);
    hq.a(paramParcel, 10, this.i);
    hq.a(paramParcel, 11, this.j);
    hq.a(paramParcel, 12, this.k, false);
    hq.a(paramParcel, 13, this.l);
    hq.a(paramParcel, 14, this.m);
    hq.a(paramParcel, 15, this.n);
    hq.a(paramParcel, 16, this.o);
    hq.a(paramParcel, 17, this.p);
    hq.a(paramParcel, 18, this.q);
    hq.a(paramParcel, 19, this.r, false);
    hq.a(paramParcel, 21, this.s, false);
    hq.a(paramParcel, 22, this.t);
    hq.a(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/pc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */