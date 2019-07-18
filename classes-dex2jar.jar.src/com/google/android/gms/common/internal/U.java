package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import fq;
import hq;

public class u
  extends fq
{
  public static final Parcelable.Creator<u> CREATOR = new F();
  private final int a;
  private final Account b;
  private final int c;
  private final GoogleSignInAccount d;
  
  u(int paramInt1, Account paramAccount, int paramInt2, GoogleSignInAccount paramGoogleSignInAccount)
  {
    this.a = paramInt1;
    this.b = paramAccount;
    this.c = paramInt2;
    this.d = paramGoogleSignInAccount;
  }
  
  public u(Account paramAccount, int paramInt, GoogleSignInAccount paramGoogleSignInAccount)
  {
    this(2, paramAccount, paramInt, paramGoogleSignInAccount);
  }
  
  public GoogleSignInAccount A()
  {
    return this.d;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.a);
    hq.a(paramParcel, 2, y(), paramInt, false);
    hq.a(paramParcel, 3, z());
    hq.a(paramParcel, 4, A(), paramInt, false);
    hq.a(paramParcel, i);
  }
  
  public Account y()
  {
    return this.b;
  }
  
  public int z()
  {
    return this.c;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */