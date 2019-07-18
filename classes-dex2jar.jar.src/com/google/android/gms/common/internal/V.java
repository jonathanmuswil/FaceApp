package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.b;
import fq;
import hq;

public class v
  extends fq
{
  public static final Parcelable.Creator<v> CREATOR = new G();
  private final int a;
  private IBinder b;
  private b c;
  private boolean d;
  private boolean e;
  
  v(int paramInt, IBinder paramIBinder, b paramb, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramInt;
    this.b = paramIBinder;
    this.c = paramb;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }
  
  public boolean A()
  {
    return this.d;
  }
  
  public boolean B()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof v)) {
      return false;
    }
    paramObject = (v)paramObject;
    return (this.c.equals(((v)paramObject).c)) && (y().equals(((v)paramObject).y()));
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.a);
    hq.a(paramParcel, 2, this.b, false);
    hq.a(paramParcel, 3, z(), paramInt, false);
    hq.a(paramParcel, 4, A());
    hq.a(paramParcel, 5, B());
    hq.a(paramParcel, i);
  }
  
  public m y()
  {
    return m.a.a(this.b);
  }
  
  public b z()
  {
    return this.c;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */