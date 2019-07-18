package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.t;
import fq;
import hq;

public final class SignInConfiguration
  extends fq
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<SignInConfiguration> CREATOR = new v();
  private final String a;
  private GoogleSignInOptions b;
  
  public SignInConfiguration(String paramString, GoogleSignInOptions paramGoogleSignInOptions)
  {
    t.b(paramString);
    this.a = paramString;
    this.b = paramGoogleSignInOptions;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof SignInConfiguration)) {
      return false;
    }
    SignInConfiguration localSignInConfiguration = (SignInConfiguration)paramObject;
    if (this.a.equals(localSignInConfiguration.a))
    {
      paramObject = this.b;
      if (paramObject == null ? localSignInConfiguration.b == null : ((GoogleSignInOptions)paramObject).equals(localSignInConfiguration.b)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    b localb = new b();
    localb.a(this.a);
    localb.a(this.b);
    return localb.a();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = hq.a(paramParcel);
    hq.a(paramParcel, 2, this.a, false);
    hq.a(paramParcel, 5, this.b, paramInt, false);
    hq.a(paramParcel, i);
  }
  
  public final GoogleSignInOptions y()
  {
    return this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/SignInConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */