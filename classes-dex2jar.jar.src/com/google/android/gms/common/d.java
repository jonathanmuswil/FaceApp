package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.r.a;
import fq;
import hq;

public class d
  extends fq
{
  public static final Parcelable.Creator<d> CREATOR = new o();
  private final String a;
  @Deprecated
  private final int b;
  private final long c;
  
  public d(String paramString, int paramInt, long paramLong)
  {
    this.a = paramString;
    this.b = paramInt;
    this.c = paramLong;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof d))
    {
      paramObject = (d)paramObject;
      if (((y() != null) && (y().equals(((d)paramObject).y()))) || ((y() == null) && (((d)paramObject).y() == null) && (z() == ((d)paramObject).z()))) {
        return true;
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    return r.a(new Object[] { y(), Long.valueOf(z()) });
  }
  
  public String toString()
  {
    r.a locala = r.a(this);
    locala.a("name", y());
    locala.a("version", Long.valueOf(z()));
    return locala.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 1, y(), false);
    hq.a(paramParcel, 2, this.b);
    hq.a(paramParcel, 3, z());
    hq.a(paramParcel, paramInt);
  }
  
  public String y()
  {
    return this.a;
  }
  
  public long z()
  {
    long l1 = this.c;
    long l2 = l1;
    if (l1 == -1L) {
      l2 = this.b;
    }
    return l2;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */