package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.t;
import fq;
import hq;

public final class ec
  extends fq
{
  public static final Parcelable.Creator<ec> CREATOR = new fc();
  private final int a;
  public final String b;
  public final long c;
  public final Long d;
  private final Float e;
  public final String f;
  public final String g;
  public final Double h;
  
  ec(int paramInt, String paramString1, long paramLong, Long paramLong1, Float paramFloat, String paramString2, String paramString3, Double paramDouble)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramLong;
    this.d = paramLong1;
    paramString1 = null;
    this.e = null;
    if (paramInt == 1)
    {
      if (paramFloat != null) {
        paramString1 = Double.valueOf(paramFloat.doubleValue());
      }
      this.h = paramString1;
    }
    else
    {
      this.h = paramDouble;
    }
    this.f = paramString2;
    this.g = paramString3;
  }
  
  ec(gc paramgc)
  {
    this(paramgc.c, paramgc.d, paramgc.e, paramgc.b);
  }
  
  ec(String paramString1, long paramLong, Object paramObject, String paramString2)
  {
    t.b(paramString1);
    this.a = 2;
    this.b = paramString1;
    this.c = paramLong;
    this.g = paramString2;
    if (paramObject == null)
    {
      this.d = null;
      this.e = null;
      this.h = null;
      this.f = null;
      return;
    }
    if ((paramObject instanceof Long))
    {
      this.d = ((Long)paramObject);
      this.e = null;
      this.h = null;
      this.f = null;
      return;
    }
    if ((paramObject instanceof String))
    {
      this.d = null;
      this.e = null;
      this.h = null;
      this.f = ((String)paramObject);
      return;
    }
    if ((paramObject instanceof Double))
    {
      this.d = null;
      this.e = null;
      this.h = ((Double)paramObject);
      this.f = null;
      return;
    }
    throw new IllegalArgumentException("User attribute given of un-supported type");
  }
  
  ec(String paramString1, long paramLong, String paramString2)
  {
    t.b(paramString1);
    this.a = 2;
    this.b = paramString1;
    this.c = 0L;
    this.d = null;
    this.e = null;
    this.h = null;
    this.f = null;
    this.g = null;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.a);
    hq.a(paramParcel, 2, this.b, false);
    hq.a(paramParcel, 3, this.c);
    hq.a(paramParcel, 4, this.d, false);
    hq.a(paramParcel, 5, null, false);
    hq.a(paramParcel, 6, this.f, false);
    hq.a(paramParcel, 7, this.g, false);
    hq.a(paramParcel, 8, this.h, false);
    hq.a(paramParcel, paramInt);
  }
  
  public final Object y()
  {
    Object localObject = this.d;
    if (localObject != null) {
      return localObject;
    }
    localObject = this.h;
    if (localObject != null) {
      return localObject;
    }
    localObject = this.f;
    if (localObject != null) {
      return localObject;
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */