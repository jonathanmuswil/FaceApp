package com.google.android.gms.common.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
public final class k
{
  @Deprecated
  public static long a(InputStream paramInputStream, OutputStream paramOutputStream)
    throws IOException
  {
    return a(paramInputStream, paramOutputStream, false);
  }
  
  @Deprecated
  private static long a(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean)
    throws IOException
  {
    return a(paramInputStream, paramOutputStream, paramBoolean, 1024);
  }
  
  @Deprecated
  public static long a(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean, int paramInt)
    throws IOException
  {
    byte[] arrayOfByte = new byte[paramInt];
    long l = 0L;
    try
    {
      for (;;)
      {
        int i = paramInputStream.read(arrayOfByte, 0, paramInt);
        if (i == -1) {
          break;
        }
        l += i;
        paramOutputStream.write(arrayOfByte, 0, i);
      }
      return l;
    }
    finally
    {
      if (paramBoolean)
      {
        a(paramInputStream);
        a(paramOutputStream);
      }
    }
  }
  
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      for (;;) {}
    }
  }
  
  @Deprecated
  public static byte[] a(InputStream paramInputStream, boolean paramBoolean)
    throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    a(paramInputStream, localByteArrayOutputStream, paramBoolean);
    return localByteArrayOutputStream.toByteArray();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/util/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */