package com.google.firebase.perf.network;

import Iv;
import java.io.IOException;
import java.io.OutputStream;
import vv;

public final class b
  extends OutputStream
{
  private OutputStream a;
  private long b = -1L;
  private vv c;
  private final Iv d;
  
  public b(OutputStream paramOutputStream, vv paramvv, Iv paramIv)
  {
    this.a = paramOutputStream;
    this.c = paramvv;
    this.d = paramIv;
  }
  
  public final void close()
    throws IOException
  {
    long l = this.b;
    if (l != -1L) {
      this.c.a(l);
    }
    this.c.c(this.d.n());
    try
    {
      this.a.close();
      return;
    }
    catch (IOException localIOException)
    {
      this.c.e(this.d.n());
      h.a(this.c);
      throw localIOException;
    }
  }
  
  public final void flush()
    throws IOException
  {
    try
    {
      this.a.flush();
      return;
    }
    catch (IOException localIOException)
    {
      this.c.e(this.d.n());
      h.a(this.c);
      throw localIOException;
    }
  }
  
  public final void write(int paramInt)
    throws IOException
  {
    try
    {
      this.a.write(paramInt);
      this.b += 1L;
      this.c.a(this.b);
      return;
    }
    catch (IOException localIOException)
    {
      this.c.e(this.d.n());
      h.a(this.c);
      throw localIOException;
    }
  }
  
  public final void write(byte[] paramArrayOfByte)
    throws IOException
  {
    try
    {
      this.a.write(paramArrayOfByte);
      this.b += paramArrayOfByte.length;
      this.c.a(this.b);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      this.c.e(this.d.n());
      h.a(this.c);
      throw paramArrayOfByte;
    }
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    try
    {
      this.a.write(paramArrayOfByte, paramInt1, paramInt2);
      this.b += paramInt2;
      this.c.a(this.b);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      this.c.e(this.d.n());
      h.a(this.c);
      throw paramArrayOfByte;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/network/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */