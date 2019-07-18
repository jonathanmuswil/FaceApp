package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import fq;
import hq;

public class a
  extends fq
{
  public static final Parcelable.Creator<a> CREATOR = new d();
  private final int a;
  private int b;
  private Bundle c;
  
  a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramBundle;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.a);
    hq.a(paramParcel, 2, y());
    hq.a(paramParcel, 3, this.c, false);
    hq.a(paramParcel, paramInt);
  }
  
  public int y()
  {
    return this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */