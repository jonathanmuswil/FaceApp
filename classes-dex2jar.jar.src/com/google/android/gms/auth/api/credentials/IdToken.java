package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import fq;
import hq;

public final class IdToken
  extends fq
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<IdToken> CREATOR = new g();
  private final String a;
  private final String b;
  
  public IdToken(String paramString1, String paramString2)
  {
    t.a(TextUtils.isEmpty(paramString1) ^ true, "account type string cannot be null or empty");
    t.a(TextUtils.isEmpty(paramString2) ^ true, "id token string cannot be null or empty");
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof IdToken)) {
      return false;
    }
    paramObject = (IdToken)paramObject;
    return (r.a(this.a, ((IdToken)paramObject).a)) && (r.a(this.b, ((IdToken)paramObject).b));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 1, y(), false);
    hq.a(paramParcel, 2, z(), false);
    hq.a(paramParcel, paramInt);
  }
  
  public final String y()
  {
    return this.a;
  }
  
  public final String z()
  {
    return this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/IdToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */