package com.facebook.accountkit.internal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.net.HttpCookie;

final class qa
  implements Serializable
{
  private transient HttpCookie a;
  private Field b;
  
  private String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
    int i = paramArrayOfByte.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramArrayOfByte[j] & 0xFF;
      if (k < 16) {
        localStringBuilder.append('0');
      }
      localStringBuilder.append(Integer.toHexString(k));
    }
    return localStringBuilder.toString();
  }
  
  private void a(boolean paramBoolean)
  {
    try
    {
      b();
      this.b.set(this.a, Boolean.valueOf(paramBoolean));
      return;
    }
    catch (NoSuchFieldException|IllegalAccessException|IllegalArgumentException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  private boolean a()
  {
    try
    {
      b();
      boolean bool = ((Boolean)this.b.get(this.a)).booleanValue();
      return bool;
    }
    catch (NoSuchFieldException|IllegalAccessException|IllegalArgumentException localNoSuchFieldException) {}
    return false;
  }
  
  private void b()
    throws NoSuchFieldException
  {
    this.b = this.a.getClass().getDeclaredField("httpOnly");
    this.b.setAccessible(true);
  }
  
  private byte[] b(String paramString)
  {
    int i = paramString.length();
    byte[] arrayOfByte = new byte[i / 2];
    for (int j = 0; j < i; j += 2) {
      arrayOfByte[(j / 2)] = ((byte)(byte)((Character.digit(paramString.charAt(j), 16) << 4) + Character.digit(paramString.charAt(j + 1), 16)));
    }
    return arrayOfByte;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
    throws IOException, ClassNotFoundException
  {
    this.a = new HttpCookie((String)paramObjectInputStream.readObject(), (String)paramObjectInputStream.readObject());
    this.a.setComment((String)paramObjectInputStream.readObject());
    this.a.setCommentURL((String)paramObjectInputStream.readObject());
    this.a.setDomain((String)paramObjectInputStream.readObject());
    this.a.setMaxAge(paramObjectInputStream.readLong());
    this.a.setPath((String)paramObjectInputStream.readObject());
    this.a.setPortlist((String)paramObjectInputStream.readObject());
    this.a.setVersion(paramObjectInputStream.readInt());
    this.a.setSecure(paramObjectInputStream.readBoolean());
    this.a.setDiscard(paramObjectInputStream.readBoolean());
    a(paramObjectInputStream.readBoolean());
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream)
    throws IOException
  {
    paramObjectOutputStream.writeObject(this.a.getName());
    paramObjectOutputStream.writeObject(this.a.getValue());
    paramObjectOutputStream.writeObject(this.a.getComment());
    paramObjectOutputStream.writeObject(this.a.getCommentURL());
    paramObjectOutputStream.writeObject(this.a.getDomain());
    paramObjectOutputStream.writeLong(this.a.getMaxAge());
    paramObjectOutputStream.writeObject(this.a.getPath());
    paramObjectOutputStream.writeObject(this.a.getPortlist());
    paramObjectOutputStream.writeInt(this.a.getVersion());
    paramObjectOutputStream.writeBoolean(this.a.getSecure());
    paramObjectOutputStream.writeBoolean(this.a.getDiscard());
    paramObjectOutputStream.writeBoolean(a());
  }
  
  public String a(HttpCookie paramHttpCookie)
  {
    this.a = paramHttpCookie;
    paramHttpCookie = new ByteArrayOutputStream();
    try
    {
      ObjectOutputStream localObjectOutputStream = new java/io/ObjectOutputStream;
      localObjectOutputStream.<init>(paramHttpCookie);
      localObjectOutputStream.writeObject(this);
      return a(paramHttpCookie.toByteArray());
    }
    catch (IOException paramHttpCookie) {}
    return null;
  }
  
  public HttpCookie a(String paramString)
  {
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(b(paramString));
    try
    {
      paramString = new java/io/ObjectInputStream;
      paramString.<init>(localByteArrayInputStream);
      paramString = ((qa)paramString.readObject()).a;
    }
    catch (IOException|ClassNotFoundException paramString)
    {
      paramString = null;
    }
    return paramString;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/qa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */