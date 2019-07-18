package com.bumptech.glide.load;

import Dj;
import gd;
import java.security.MessageDigest;
import ud;

public final class j
  implements g
{
  private final gd<i<?>, Object> a = new Dj();
  
  private static <T> void a(i<T> parami, Object paramObject, MessageDigest paramMessageDigest)
  {
    parami.a(paramObject, paramMessageDigest);
  }
  
  public <T> j a(i<T> parami, T paramT)
  {
    this.a.put(parami, paramT);
    return this;
  }
  
  public <T> T a(i<T> parami)
  {
    if (this.a.containsKey(parami)) {
      parami = this.a.get(parami);
    } else {
      parami = parami.a();
    }
    return parami;
  }
  
  public void a(j paramj)
  {
    this.a.a(paramj.a);
  }
  
  public void a(MessageDigest paramMessageDigest)
  {
    for (int i = 0; i < this.a.size(); i++) {
      a((i)this.a.b(i), this.a.d(i), paramMessageDigest);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof j))
    {
      paramObject = (j)paramObject;
      return this.a.equals(((j)paramObject).a);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Options{values=");
    localStringBuilder.append(this.a);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/bumptech/glide/load/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */