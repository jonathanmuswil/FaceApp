package com.facebook.accountkit.ui;

import android.os.Parcel;
import android.os.Parcelable;
import tn;

public abstract class u
  implements Parcelable
{
  protected final g a;
  protected tn b;
  
  protected u(Parcel paramParcel)
  {
    this.a = ((g)paramParcel.readParcelable(g.class.getClassLoader()));
  }
  
  u(g paramg)
  {
    this.a = paramg;
  }
  
  public abstract tn a(AccountKitActivity paramAccountKitActivity);
  
  void a(AccountKitActivity paramAccountKitActivity, Ea paramEa)
  {
    paramAccountKitActivity.a(Ga.h, null);
    paramEa.m();
  }
  
  public abstract void b(AccountKitActivity paramAccountKitActivity);
  
  public abstract void c(AccountKitActivity paramAccountKitActivity);
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */