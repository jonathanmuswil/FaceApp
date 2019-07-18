package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.r;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

final class da
{
  private final KeyPair a;
  private final long b;
  
  da(KeyPair paramKeyPair, long paramLong)
  {
    this.a = paramKeyPair;
    this.b = paramLong;
  }
  
  private final String b()
  {
    return Base64.encodeToString(this.a.getPublic().getEncoded(), 11);
  }
  
  private final String c()
  {
    return Base64.encodeToString(this.a.getPrivate().getEncoded(), 11);
  }
  
  final KeyPair a()
  {
    return this.a;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof da)) {
      return false;
    }
    paramObject = (da)paramObject;
    return (this.b == ((da)paramObject).b) && (this.a.getPublic().equals(((da)paramObject).a.getPublic())) && (this.a.getPrivate().equals(((da)paramObject).a.getPrivate()));
  }
  
  public final int hashCode()
  {
    return r.a(new Object[] { this.a.getPublic(), this.a.getPrivate(), Long.valueOf(this.b) });
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */