package com.facebook.accountkit.ui;

import Vm;
import Ym;
import android.os.Parcel;
import android.os.Parcelable.Creator;

class l
  implements Ym
{
  public static final Parcelable.Creator<l> CREATOR = new k();
  private final boolean a;
  private final Vm b;
  private final String c;
  
  private l(Parcel paramParcel)
  {
    this.c = paramParcel.readString();
    this.b = ((Vm)paramParcel.readParcelable(Vm.class.getClassLoader()));
    int i = paramParcel.readByte();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    this.a = bool;
  }
  
  public l(String paramString, Vm paramVm, boolean paramBoolean)
  {
    this.a = paramBoolean;
    this.b = paramVm;
    this.c = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.c);
    paramParcel.writeParcelable(this.b, paramInt);
    paramParcel.writeByte((byte)this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */