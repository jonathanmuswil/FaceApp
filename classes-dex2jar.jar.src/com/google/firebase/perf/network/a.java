package com.google.firebase.perf.network;

import Iv;
import java.io.IOException;
import java.io.InputStream;
import vv;

public final class a
  extends InputStream
{
  private final InputStream a;
  private final vv b;
  private final Iv c;
  private long d = -1L;
  private long e;
  private long f = -1L;
  
  public a(InputStream paramInputStream, vv paramvv, Iv paramIv)
  {
    this.c = paramIv;
    this.a = paramInputStream;
    this.b = paramvv;
    this.e = this.b.m();
  }
  
  public final int available()
    throws IOException
  {
    try
    {
      int i = this.a.available();
      return i;
    }
    catch (IOException localIOException)
    {
      this.b.e(this.c.n());
      h.a(this.b);
      throw localIOException;
    }
  }
  
  public final void close()
    throws IOException
  {
    long l = this.c.n();
    if (this.f == -1L) {
      this.f = l;
    }
    try
    {
      this.a.close();
      if (this.d != -1L) {
        this.b.f(this.d);
      }
      if (this.e != -1L) {
        this.b.d(this.e);
      }
      this.b.e(this.f);
      this.b.o();
      return;
    }
    catch (IOException localIOException)
    {
      this.b.e(this.c.n());
      h.a(this.b);
      throw localIOException;
    }
  }
  
  public final void mark(int paramInt)
  {
    this.a.mark(paramInt);
  }
  
  public final boolean markSupported()
  {
    return this.a.markSupported();
  }
  
  public final int read()
    throws IOException
  {
    try
    {
      int i = this.a.read();
      long l = this.c.n();
      if (this.e == -1L) {
        this.e = l;
      }
      if ((i == -1) && (this.f == -1L))
      {
        this.f = l;
        this.b.e(this.f);
        this.b.o();
      }
      else
      {
        this.d += 1L;
        this.b.f(this.d);
      }
      return i;
    }
    catch (IOException localIOException)
    {
      this.b.e(this.c.n());
      h.a(this.b);
      throw localIOException;
    }
  }
  
  public final int read(byte[] paramArrayOfByte)
    throws IOException
  {
    try
    {
      int i = this.a.read(paramArrayOfByte);
      long l = this.c.n();
      if (this.e == -1L) {
        this.e = l;
      }
      if ((i == -1) && (this.f == -1L))
      {
        this.f = l;
        this.b.e(this.f);
        this.b.o();
      }
      else
      {
        this.d += i;
        this.b.f(this.d);
      }
      return i;
    }
    catch (IOException paramArrayOfByte)
    {
      this.b.e(this.c.n());
      h.a(this.b);
      throw paramArrayOfByte;
    }
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    try
    {
      paramInt1 = this.a.read(paramArrayOfByte, paramInt1, paramInt2);
      long l = this.c.n();
      if (this.e == -1L) {
        this.e = l;
      }
      if ((paramInt1 == -1) && (this.f == -1L))
      {
        this.f = l;
        this.b.e(this.f);
        this.b.o();
      }
      else
      {
        this.d += paramInt1;
        this.b.f(this.d);
      }
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      this.b.e(this.c.n());
      h.a(this.b);
      throw paramArrayOfByte;
    }
  }
  
  public final void reset()
    throws IOException
  {
    try
    {
      this.a.reset();
      return;
    }
    catch (IOException localIOException)
    {
      this.b.e(this.c.n());
      h.a(this.b);
      throw localIOException;
    }
  }
  
  public final long skip(long paramLong)
    throws IOException
  {
    try
    {
      long l = this.a.skip(paramLong);
      paramLong = this.c.n();
      if (this.e == -1L) {
        this.e = paramLong;
      }
      if ((l == -1L) && (this.f == -1L))
      {
        this.f = paramLong;
        this.b.e(this.f);
      }
      else
      {
        this.d += l;
        this.b.f(this.d);
      }
      return l;
    }
    catch (IOException localIOException)
    {
      this.b.e(this.c.n());
      h.a(this.b);
      throw localIOException;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/network/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */