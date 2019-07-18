package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.r.a;
import fq;
import hq;

public final class Status
  extends fq
  implements l, ReflectedParcelable
{
  public static final Parcelable.Creator<Status> CREATOR = new u();
  public static final Status a = new Status(0);
  public static final Status b = new Status(14);
  public static final Status c = new Status(8);
  public static final Status d = new Status(15);
  public static final Status e = new Status(16);
  private static final Status f = new Status(17);
  public static final Status g = new Status(18);
  private final int h;
  private final int i;
  private final String j;
  private final PendingIntent k;
  
  public Status(int paramInt)
  {
    this(paramInt, null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.h = paramInt1;
    this.i = paramInt2;
    this.j = paramString;
    this.k = paramPendingIntent;
  }
  
  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }
  
  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramString, paramPendingIntent);
  }
  
  public final boolean A()
  {
    return this.k != null;
  }
  
  public final boolean B()
  {
    return this.i <= 0;
  }
  
  public final String C()
  {
    String str = this.j;
    if (str != null) {
      return str;
    }
    return d.a(this.i);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status)) {
      return false;
    }
    paramObject = (Status)paramObject;
    return (this.h == ((Status)paramObject).h) && (this.i == ((Status)paramObject).i) && (r.a(this.j, ((Status)paramObject).j)) && (r.a(this.k, ((Status)paramObject).k));
  }
  
  public final int hashCode()
  {
    return r.a(new Object[] { Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k });
  }
  
  public final String toString()
  {
    r.a locala = r.a(this);
    locala.a("statusCode", C());
    locala.a("resolution", this.k);
    return locala.toString();
  }
  
  public final Status w()
  {
    return this;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = hq.a(paramParcel);
    hq.a(paramParcel, 1, y());
    hq.a(paramParcel, 2, z(), false);
    hq.a(paramParcel, 3, this.k, paramInt, false);
    hq.a(paramParcel, 1000, this.h);
    hq.a(paramParcel, m);
  }
  
  public final int y()
  {
    return this.i;
  }
  
  public final String z()
  {
    return this.j;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/Status.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */