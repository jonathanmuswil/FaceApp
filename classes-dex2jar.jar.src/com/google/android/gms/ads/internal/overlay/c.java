package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.ads.yh;
import fq;
import hq;

@yh
public final class c
  extends fq
{
  public static final Parcelable.Creator<c> CREATOR = new b();
  private final String a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final String f;
  private final String g;
  public final Intent h;
  
  public c(Intent paramIntent)
  {
    this(null, null, null, null, null, null, null, paramIntent);
  }
  
  public c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, null);
  }
  
  public c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, Intent paramIntent)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramString5;
    this.f = paramString6;
    this.g = paramString7;
    this.h = paramIntent;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = hq.a(paramParcel);
    hq.a(paramParcel, 2, this.a, false);
    hq.a(paramParcel, 3, this.b, false);
    hq.a(paramParcel, 4, this.c, false);
    hq.a(paramParcel, 5, this.d, false);
    hq.a(paramParcel, 6, this.e, false);
    hq.a(paramParcel, 7, this.f, false);
    hq.a(paramParcel, 8, this.g, false);
    hq.a(paramParcel, 9, this.h, paramInt, false);
    hq.a(paramParcel, i);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */