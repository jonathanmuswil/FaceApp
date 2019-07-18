package com.facebook.accountkit.ui;

import Sm;
import an;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class s
  extends u
{
  public static final Parcelable.Creator<s> CREATOR = new r();
  
  protected s(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public s(g paramg)
  {
    super(paramg);
  }
  
  private void e(AccountKitActivity paramAccountKitActivity)
  {
    paramAccountKitActivity = paramAccountKitActivity.o();
    if (!(paramAccountKitActivity instanceof ja)) {
      return;
    }
    ((ja)paramAccountKitActivity).l();
  }
  
  private an l()
  {
    return (an)this.b;
  }
  
  public an a(AccountKitActivity paramAccountKitActivity)
  {
    if (l() == null) {
      this.b = new p(this, paramAccountKitActivity);
    }
    return l();
  }
  
  public void a(AccountKitActivity paramAccountKitActivity, oa paramoa, String paramString)
  {
    paramAccountKitActivity.a(Ga.d, null);
    paramoa.a(paramString);
    paramoa.a(this.a.r(), this.a.m());
  }
  
  public void b(AccountKitActivity paramAccountKitActivity)
  {
    paramAccountKitActivity.a(Ga.i, null);
  }
  
  public void c(AccountKitActivity paramAccountKitActivity)
  {
    if (!(paramAccountKitActivity.o() instanceof rb)) {
      return;
    }
    paramAccountKitActivity.a(Ga.j, null);
  }
  
  public void d(AccountKitActivity paramAccountKitActivity)
  {
    Sm.a();
    paramAccountKitActivity.a(Ga.c, new q(this, paramAccountKitActivity));
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */