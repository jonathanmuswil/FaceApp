package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import fq;
import hq;
import java.util.Iterator;

public final class h
  extends fq
  implements Iterable<String>
{
  public static final Parcelable.Creator<h> CREATOR = new j();
  private final Bundle a;
  
  h(Bundle paramBundle)
  {
    this.a = paramBundle;
  }
  
  final Object b(String paramString)
  {
    return this.a.get(paramString);
  }
  
  final Long c(String paramString)
  {
    return Long.valueOf(this.a.getLong(paramString));
  }
  
  final String d(String paramString)
  {
    return this.a.getString(paramString);
  }
  
  final Double e(String paramString)
  {
    return Double.valueOf(this.a.getDouble(paramString));
  }
  
  public final Iterator<String> iterator()
  {
    return new i(this);
  }
  
  public final int size()
  {
    return this.a.size();
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 2, y(), false);
    hq.a(paramParcel, paramInt);
  }
  
  public final Bundle y()
  {
    return new Bundle(this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */