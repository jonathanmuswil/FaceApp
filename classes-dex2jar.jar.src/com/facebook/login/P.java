package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.J;

class p
  extends M
{
  public static final Parcelable.Creator<p> CREATOR = new o();
  
  p(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  p(z paramz)
  {
    super(paramz);
  }
  
  boolean a(z.c paramc)
  {
    String str = z.p();
    paramc = J.a(this.b.n(), paramc.l(), paramc.s(), str, paramc.u(), paramc.t(), paramc.o(), a(paramc.m()), paramc.n());
    a("e2e", str);
    return a(paramc, z.s());
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  String m()
  {
    return "fb_lite_login";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/login/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */