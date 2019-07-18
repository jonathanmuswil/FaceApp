package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.t;
import fq;
import hq;

public class SignInAccount
  extends fq
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<SignInAccount> CREATOR = new f();
  @Deprecated
  private String a;
  private GoogleSignInAccount b;
  @Deprecated
  private String c;
  
  SignInAccount(String paramString1, GoogleSignInAccount paramGoogleSignInAccount, String paramString2)
  {
    this.b = paramGoogleSignInAccount;
    t.a(paramString1, "8.3 and 8.4 SDKs require non-null email");
    this.a = paramString1;
    t.a(paramString2, "8.3 and 8.4 SDKs require non-null userId");
    this.c = paramString2;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = hq.a(paramParcel);
    hq.a(paramParcel, 4, this.a, false);
    hq.a(paramParcel, 7, this.b, paramInt, false);
    hq.a(paramParcel, 8, this.c, false);
    hq.a(paramParcel, i);
  }
  
  public final GoogleSignInAccount y()
  {
    return this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/SignInAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */