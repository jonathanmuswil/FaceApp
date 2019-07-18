package com.facebook.accountkit.ui;

import Rm;
import Vm;
import Xm;
import android.os.Parcel;
import android.os.Parcelable.Creator;

class i
  implements Xm
{
  public static final Parcelable.Creator<i> CREATOR = new h();
  private final Rm a;
  private final String b;
  private final boolean c;
  private final Vm d;
  private final String e;
  private final long f;
  
  public i(Rm paramRm, String paramString1, String paramString2, long paramLong, Vm paramVm, boolean paramBoolean)
  {
    this.a = paramRm;
    this.b = paramString1;
    this.f = paramLong;
    this.c = paramBoolean;
    this.d = paramVm;
    this.e = paramString2;
  }
  
  private i(Parcel paramParcel)
  {
    this.a = ((Rm)paramParcel.readParcelable(Rm.class.getClassLoader()));
    this.b = paramParcel.readString();
    this.e = paramParcel.readString();
    this.f = paramParcel.readLong();
    this.d = ((Vm)paramParcel.readParcelable(Vm.class.getClassLoader()));
    int i = paramParcel.readByte();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    this.c = bool;
  }
  
  public Rm a()
  {
    return this.a;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Vm getError()
  {
    return this.d;
  }
  
  public boolean j()
  {
    boolean bool;
    if ((this.d == null) && (this.b == null) && (this.a == null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.e);
    paramParcel.writeLong(this.f);
    paramParcel.writeParcelable(this.d, paramInt);
    paramParcel.writeByte((byte)this.c);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */