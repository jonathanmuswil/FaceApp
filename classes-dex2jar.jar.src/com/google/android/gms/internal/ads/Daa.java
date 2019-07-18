package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class daa
  extends caa
{
  public static final Parcelable.Creator<daa> CREATOR = new eaa();
  private final String b;
  private final String c;
  
  daa(Parcel paramParcel)
  {
    super(paramParcel.readString());
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
  }
  
  public daa(String paramString1, String paramString2, String paramString3)
  {
    super(paramString1);
    this.b = null;
    this.c = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (daa.class == paramObject.getClass()))
    {
      paramObject = (daa)paramObject;
      if ((this.a.equals(((caa)paramObject).a)) && (Hba.a(this.b, ((daa)paramObject).b)) && (Hba.a(this.c, ((daa)paramObject).c))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = this.a.hashCode();
    String str = this.b;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = this.c;
    if (str != null) {
      j = str.hashCode();
    }
    return ((i + 527) * 31 + k) * 31 + j;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/daa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */