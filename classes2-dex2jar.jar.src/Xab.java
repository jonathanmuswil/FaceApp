import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

final class xab
  implements kab
{
  public final jab a = new jab();
  public final Dab b;
  boolean c;
  
  xab(Dab paramDab)
  {
    if (paramDab != null)
    {
      this.b = paramDab;
      return;
    }
    throw new NullPointerException("sink == null");
  }
  
  public kab a(String paramString)
    throws IOException
  {
    if (!this.c)
    {
      this.a.a(paramString);
      q();
      return this;
    }
    throw new IllegalStateException("closed");
  }
  
  public kab a(String paramString, Charset paramCharset)
    throws IOException
  {
    if (!this.c)
    {
      this.a.a(paramString, paramCharset);
      q();
      return this;
    }
    throw new IllegalStateException("closed");
  }
  
  public kab a(mab parammab)
    throws IOException
  {
    if (!this.c)
    {
      this.a.a(parammab);
      q();
      return this;
    }
    throw new IllegalStateException("closed");
  }
  
  public void a(jab paramjab, long paramLong)
    throws IOException
  {
    if (!this.c)
    {
      this.a.a(paramjab, paramLong);
      q();
      return;
    }
    throw new IllegalStateException("closed");
  }
  
  public void close()
    throws IOException
  {
    if (this.c) {
      return;
    }
    try
    {
      if (this.a.c > 0L) {
        this.b.a(this.a, this.a.c);
      }
      Object localObject1 = null;
    }
    catch (Throwable localThrowable1) {}
    Object localObject2;
    try
    {
      this.b.close();
      localObject2 = localThrowable1;
    }
    catch (Throwable localThrowable2)
    {
      localObject2 = localThrowable1;
      if (localThrowable1 == null) {
        localObject2 = localThrowable2;
      }
    }
    this.c = true;
    if (localObject2 == null) {
      return;
    }
    Hab.a((Throwable)localObject2);
    throw null;
  }
  
  public kab d(long paramLong)
    throws IOException
  {
    if (!this.c)
    {
      this.a.d(paramLong);
      q();
      return this;
    }
    throw new IllegalStateException("closed");
  }
  
  public void flush()
    throws IOException
  {
    if (!this.c)
    {
      jab localjab = this.a;
      long l = localjab.c;
      if (l > 0L) {
        this.b.a(localjab, l);
      }
      this.b.flush();
      return;
    }
    throw new IllegalStateException("closed");
  }
  
  public kab g(long paramLong)
    throws IOException
  {
    if (!this.c)
    {
      this.a.g(paramLong);
      q();
      return this;
    }
    throw new IllegalStateException("closed");
  }
  
  public boolean isOpen()
  {
    return this.c ^ true;
  }
  
  public jab m()
  {
    return this.a;
  }
  
  public Gab n()
  {
    return this.b.n();
  }
  
  public kab q()
    throws IOException
  {
    if (!this.c)
    {
      long l = this.a.b();
      if (l > 0L) {
        this.b.a(this.a, l);
      }
      return this;
    }
    throw new IllegalStateException("closed");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("buffer(");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public int write(ByteBuffer paramByteBuffer)
    throws IOException
  {
    if (!this.c)
    {
      int i = this.a.write(paramByteBuffer);
      q();
      return i;
    }
    throw new IllegalStateException("closed");
  }
  
  public kab write(byte[] paramArrayOfByte)
    throws IOException
  {
    if (!this.c)
    {
      this.a.write(paramArrayOfByte);
      q();
      return this;
    }
    throw new IllegalStateException("closed");
  }
  
  public kab write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (!this.c)
    {
      this.a.write(paramArrayOfByte, paramInt1, paramInt2);
      q();
      return this;
    }
    throw new IllegalStateException("closed");
  }
  
  public kab writeByte(int paramInt)
    throws IOException
  {
    if (!this.c)
    {
      this.a.writeByte(paramInt);
      q();
      return this;
    }
    throw new IllegalStateException("closed");
  }
  
  public kab writeInt(int paramInt)
    throws IOException
  {
    if (!this.c)
    {
      this.a.writeInt(paramInt);
      q();
      return this;
    }
    throw new IllegalStateException("closed");
  }
  
  public kab writeShort(int paramInt)
    throws IOException
  {
    if (!this.c)
    {
      this.a.writeShort(paramInt);
      q();
      return this;
    }
    throw new IllegalStateException("closed");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */