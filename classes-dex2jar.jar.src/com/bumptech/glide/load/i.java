package com.bumptech.glide.load;

import Nj;
import java.security.MessageDigest;

public final class i<T>
{
  private static final a<Object> a = new h();
  private final T b;
  private final a<T> c;
  private final String d;
  private volatile byte[] e;
  
  private i(String paramString, T paramT, a<T> parama)
  {
    Nj.a(paramString);
    this.d = paramString;
    this.b = paramT;
    Nj.a(parama);
    this.c = ((a)parama);
  }
  
  public static <T> i<T> a(String paramString)
  {
    return new i(paramString, null, b());
  }
  
  public static <T> i<T> a(String paramString, T paramT)
  {
    return new i(paramString, paramT, b());
  }
  
  public static <T> i<T> a(String paramString, T paramT, a<T> parama)
  {
    return new i(paramString, paramT, parama);
  }
  
  private static <T> a<T> b()
  {
    return a;
  }
  
  private byte[] c()
  {
    if (this.e == null) {
      this.e = this.d.getBytes(g.a);
    }
    return this.e;
  }
  
  public T a()
  {
    return (T)this.b;
  }
  
  public void a(T paramT, MessageDigest paramMessageDigest)
  {
    this.c.a(c(), paramT, paramMessageDigest);
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof i))
    {
      paramObject = (i)paramObject;
      return this.d.equals(((i)paramObject).d);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.d.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Option{key='");
    localStringBuilder.append(this.d);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static abstract interface a<T>
  {
    public abstract void a(byte[] paramArrayOfByte, T paramT, MessageDigest paramMessageDigest);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/bumptech/glide/load/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */