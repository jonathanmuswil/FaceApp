package com.facebook.accountkit.ui;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.accountkit.internal.c;

class oa
  extends Ea
{
  public static final Parcelable.Creator<oa> CREATOR = new na();
  private String e;
  
  protected oa(Parcel paramParcel)
  {
    super(paramParcel);
    this.d = ((u)paramParcel.readParcelable(s.class.getClassLoader()));
    this.e = paramParcel.readString();
  }
  
  public oa(g paramg)
  {
    super(Ia.b);
    this.d = new s(paramg);
  }
  
  public void a(AccountKitActivity.a parama, String paramString)
  {
    if (q())
    {
      String str = this.e;
      if (str != null) {
        c.a(str, parama.a(), paramString);
      }
    }
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(this.d, paramInt);
    paramParcel.writeString(this.e);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/oa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */