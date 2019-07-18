package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.t;
import fq;
import hq;

public final class k
  extends fq
{
  public static final Parcelable.Creator<k> CREATOR = new l();
  public final String a;
  public final h b;
  public final String c;
  public final long d;
  
  k(k paramk, long paramLong)
  {
    t.a(paramk);
    this.a = paramk.a;
    this.b = paramk.b;
    this.c = paramk.c;
    this.d = paramLong;
  }
  
  public k(String paramString1, h paramh, String paramString2, long paramLong)
  {
    this.a = paramString1;
    this.b = paramh;
    this.c = paramString2;
    this.d = paramLong;
  }
  
  public final String toString()
  {
    String str1 = this.c;
    String str2 = this.a;
    String str3 = String.valueOf(this.b);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 21 + String.valueOf(str2).length() + String.valueOf(str3).length());
    localStringBuilder.append("origin=");
    localStringBuilder.append(str1);
    localStringBuilder.append(",name=");
    localStringBuilder.append(str2);
    localStringBuilder.append(",params=");
    localStringBuilder.append(str3);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = hq.a(paramParcel);
    hq.a(paramParcel, 2, this.a, false);
    hq.a(paramParcel, 3, this.b, paramInt, false);
    hq.a(paramParcel, 4, this.c, false);
    hq.a(paramParcel, 5, this.d);
    hq.a(paramParcel, i);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */