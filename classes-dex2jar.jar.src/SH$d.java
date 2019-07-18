import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class SH$d
  extends SH
{
  private final ByteBuffer d;
  private final ByteBuffer e;
  private final int f;
  
  SH$d(ByteBuffer paramByteBuffer)
  {
    super(null);
    this.d = paramByteBuffer;
    this.e = paramByteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
    this.f = paramByteBuffer.position();
  }
  
  private final void c(String paramString)
    throws IOException
  {
    try
    {
      JJ.a(paramString, this.e);
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new SH.c(paramString);
    }
  }
  
  public final void a()
  {
    this.d.position(this.e.position());
  }
  
  public final void a(byte paramByte)
    throws IOException
  {
    try
    {
      this.e.put(paramByte);
      return;
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      throw new SH.c(localBufferOverflowException);
    }
  }
  
  public final void a(int paramInt)
    throws IOException
  {
    if (paramInt >= 0)
    {
      b(paramInt);
      return;
    }
    a(paramInt);
  }
  
  public final void a(int paramInt1, int paramInt2)
    throws IOException
  {
    b(paramInt1 << 3 | paramInt2);
  }
  
  public final void a(int paramInt, long paramLong)
    throws IOException
  {
    a(paramInt, 0);
    a(paramLong);
  }
  
  public final void a(int paramInt, BH paramBH)
    throws IOException
  {
    a(paramInt, 2);
    b(paramBH);
  }
  
  public final void a(int paramInt, TI paramTI)
    throws IOException
  {
    a(paramInt, 2);
    c(paramTI);
  }
  
  final void a(int paramInt, TI paramTI, iJ paramiJ)
    throws IOException
  {
    a(paramInt, 2);
    b(paramTI, paramiJ);
  }
  
  public final void a(int paramInt, String paramString)
    throws IOException
  {
    a(paramInt, 2);
    b(paramString);
  }
  
  public final void a(int paramInt, boolean paramBoolean)
    throws IOException
  {
    a(paramInt, 0);
    a((byte)paramBoolean);
  }
  
  public final void a(long paramLong)
    throws IOException
  {
    for (;;)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {}
      try
      {
        this.e.put((byte)(int)paramLong);
        return;
      }
      catch (BufferOverflowException localBufferOverflowException)
      {
        throw new SH.c(localBufferOverflowException);
      }
      this.e.put((byte)((int)paramLong & 0x7F | 0x80));
      paramLong >>>= 7;
    }
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    b(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final int b()
  {
    return this.e.remaining();
  }
  
  public final void b(int paramInt)
    throws IOException
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0) {}
      try
      {
        this.e.put((byte)paramInt);
        return;
      }
      catch (BufferOverflowException localBufferOverflowException)
      {
        throw new SH.c(localBufferOverflowException);
      }
      this.e.put((byte)(paramInt & 0x7F | 0x80));
      paramInt >>>= 7;
    }
  }
  
  public final void b(int paramInt1, int paramInt2)
    throws IOException
  {
    a(paramInt1, 0);
    a(paramInt2);
  }
  
  public final void b(int paramInt, BH paramBH)
    throws IOException
  {
    a(1, 3);
    c(2, paramInt);
    a(3, paramBH);
    a(1, 4);
  }
  
  public final void b(int paramInt, TI paramTI)
    throws IOException
  {
    a(1, 3);
    c(2, paramInt);
    a(3, paramTI);
    a(1, 4);
  }
  
  public final void b(BH paramBH)
    throws IOException
  {
    b(paramBH.size());
    paramBH.a(this);
  }
  
  final void b(TI paramTI, iJ paramiJ)
    throws IOException
  {
    sH localsH = (sH)paramTI;
    int i = localsH.g();
    int j = i;
    if (i == -1)
    {
      j = paramiJ.d(localsH);
      localsH.a(j);
    }
    b(j);
    paramiJ.a(paramTI, this.c);
  }
  
  public final void b(String paramString)
    throws IOException
  {
    int i = this.e.position();
    try
    {
      int j = SH.g(paramString.length() * 3);
      int k = SH.g(paramString.length());
      if (k == j)
      {
        j = this.e.position() + k;
        this.e.position(j);
        c(paramString);
        k = this.e.position();
        this.e.position(i);
        b(k - j);
        this.e.position(k);
        return;
      }
      b(JJ.a(paramString));
      c(paramString);
      return;
    }
    catch (IllegalArgumentException paramString)
    {
      throw new SH.c(paramString);
    }
    catch (OJ localOJ)
    {
      this.e.position(i);
      a(paramString, localOJ);
    }
  }
  
  public final void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    try
    {
      this.e.put(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    catch (BufferOverflowException paramArrayOfByte)
    {
      throw new SH.c(paramArrayOfByte);
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw new SH.c(paramArrayOfByte);
    }
  }
  
  public final void c(int paramInt1, int paramInt2)
    throws IOException
  {
    a(paramInt1, 0);
    b(paramInt2);
  }
  
  public final void c(int paramInt, long paramLong)
    throws IOException
  {
    a(paramInt, 1);
    c(paramLong);
  }
  
  public final void c(long paramLong)
    throws IOException
  {
    try
    {
      this.e.putLong(paramLong);
      return;
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      throw new SH.c(localBufferOverflowException);
    }
  }
  
  public final void c(TI paramTI)
    throws IOException
  {
    b(paramTI.c());
    paramTI.a(this);
  }
  
  public final void d(int paramInt)
    throws IOException
  {
    try
    {
      this.e.putInt(paramInt);
      return;
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      throw new SH.c(localBufferOverflowException);
    }
  }
  
  public final void e(int paramInt1, int paramInt2)
    throws IOException
  {
    a(paramInt1, 5);
    d(paramInt2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/SH$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */