package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.r;
import fq;
import hq;
import java.util.List;

@yh
public final class sea
  extends fq
{
  public static final Parcelable.Creator<sea> CREATOR = new uea();
  public final int a;
  @Deprecated
  public final long b;
  public final Bundle c;
  @Deprecated
  public final int d;
  public final List<String> e;
  public final boolean f;
  public final int g;
  public final boolean h;
  public final String i;
  public final W j;
  public final Location k;
  public final String l;
  public final Bundle m;
  public final Bundle n;
  public final List<String> o;
  public final String p;
  public final String q;
  @Deprecated
  public final boolean r;
  public final mea s;
  public final int t;
  public final String u;
  
  public sea(int paramInt1, long paramLong, Bundle paramBundle1, int paramInt2, List<String> paramList1, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, W paramW, Location paramLocation, String paramString2, Bundle paramBundle2, Bundle paramBundle3, List<String> paramList2, String paramString3, String paramString4, boolean paramBoolean3, mea parammea, int paramInt4, String paramString5)
  {
    this.a = paramInt1;
    this.b = paramLong;
    if (paramBundle1 == null) {
      paramBundle1 = new Bundle();
    }
    this.c = paramBundle1;
    this.d = paramInt2;
    this.e = paramList1;
    this.f = paramBoolean1;
    this.g = paramInt3;
    this.h = paramBoolean2;
    this.i = paramString1;
    this.j = paramW;
    this.k = paramLocation;
    this.l = paramString2;
    if (paramBundle2 == null) {
      paramBundle2 = new Bundle();
    }
    this.m = paramBundle2;
    this.n = paramBundle3;
    this.o = paramList2;
    this.p = paramString3;
    this.q = paramString4;
    this.r = paramBoolean3;
    this.s = parammea;
    this.t = paramInt4;
    this.u = paramString5;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof sea)) {
      return false;
    }
    paramObject = (sea)paramObject;
    return (this.a == ((sea)paramObject).a) && (this.b == ((sea)paramObject).b) && (r.a(this.c, ((sea)paramObject).c)) && (this.d == ((sea)paramObject).d) && (r.a(this.e, ((sea)paramObject).e)) && (this.f == ((sea)paramObject).f) && (this.g == ((sea)paramObject).g) && (this.h == ((sea)paramObject).h) && (r.a(this.i, ((sea)paramObject).i)) && (r.a(this.j, ((sea)paramObject).j)) && (r.a(this.k, ((sea)paramObject).k)) && (r.a(this.l, ((sea)paramObject).l)) && (r.a(this.m, ((sea)paramObject).m)) && (r.a(this.n, ((sea)paramObject).n)) && (r.a(this.o, ((sea)paramObject).o)) && (r.a(this.p, ((sea)paramObject).p)) && (r.a(this.q, ((sea)paramObject).q)) && (this.r == ((sea)paramObject).r) && (this.t == ((sea)paramObject).t) && (r.a(this.u, ((sea)paramObject).u));
  }
  
  public final int hashCode()
  {
    return r.a(new Object[] { Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r), Integer.valueOf(this.t), this.u });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.a);
    hq.a(paramParcel, 2, this.b);
    hq.a(paramParcel, 3, this.c, false);
    hq.a(paramParcel, 4, this.d);
    hq.b(paramParcel, 5, this.e, false);
    hq.a(paramParcel, 6, this.f);
    hq.a(paramParcel, 7, this.g);
    hq.a(paramParcel, 8, this.h);
    hq.a(paramParcel, 9, this.i, false);
    hq.a(paramParcel, 10, this.j, paramInt, false);
    hq.a(paramParcel, 11, this.k, paramInt, false);
    hq.a(paramParcel, 12, this.l, false);
    hq.a(paramParcel, 13, this.m, false);
    hq.a(paramParcel, 14, this.n, false);
    hq.b(paramParcel, 15, this.o, false);
    hq.a(paramParcel, 16, this.p, false);
    hq.a(paramParcel, 17, this.q, false);
    hq.a(paramParcel, 18, this.r);
    hq.a(paramParcel, 19, this.s, paramInt, false);
    hq.a(paramParcel, 20, this.t);
    hq.a(paramParcel, 21, this.u, false);
    hq.a(paramParcel, i1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */