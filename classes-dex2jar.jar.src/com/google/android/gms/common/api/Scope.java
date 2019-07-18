package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import fq;
import hq;

public final class Scope
  extends fq
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<Scope> CREATOR = new t();
  private final int a;
  private final String b;
  
  Scope(int paramInt, String paramString)
  {
    com.google.android.gms.common.internal.t.a(paramString, "scopeUri must not be null or empty");
    this.a = paramInt;
    this.b = paramString;
  }
  
  public Scope(String paramString)
  {
    this(1, paramString);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Scope)) {
      return false;
    }
    return this.b.equals(((Scope)paramObject).b);
  }
  
  public final int hashCode()
  {
    return this.b.hashCode();
  }
  
  public final String toString()
  {
    return this.b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.a);
    hq.a(paramParcel, 2, y(), false);
    hq.a(paramParcel, paramInt);
  }
  
  public final String y()
  {
    return this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/Scope.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */