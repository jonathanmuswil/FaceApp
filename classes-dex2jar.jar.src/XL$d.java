import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class XL$d
  extends XL
{
  private final ByteBuffer d;
  private final ByteBuffer e;
  private final int f;
  
  XL$d(ByteBuffer paramByteBuffer)
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
      KN.a(paramString, this.e);
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new XL.c(paramString);
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
      throw new XL.c(localBufferOverflowException);
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
  
  public final void a(int paramInt, IL paramIL)
    throws IOException
  {
    a(paramInt, 2);
    b(paramIL);
  }
  
  public final void a(int paramInt, WM paramWM)
    throws IOException
  {
    a(paramInt, 2);
    c(paramWM);
  }
  
  final void a(int paramInt, WM paramWM, kN paramkN)
    throws IOException
  {
    a(paramInt, 2);
    b(paramWM, paramkN);
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
        throw new XL.c(localBufferOverflowException);
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
        throw new XL.c(localBufferOverflowException);
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
  
  public final void b(int paramInt, IL paramIL)
    throws IOException
  {
    a(1, 3);
    c(2, paramInt);
    a(3, paramIL);
    a(1, 4);
  }
  
  public final void b(int paramInt, WM paramWM)
    throws IOException
  {
    a(1, 3);
    c(2, paramInt);
    a(3, paramWM);
    a(1, 4);
  }
  
  public final void b(IL paramIL)
    throws IOException
  {
    b(paramIL.size());
    paramIL.a(this);
  }
  
  final void b(WM paramWM, kN paramkN)
    throws IOException
  {
    yL localyL = (yL)paramWM;
    int i = localyL.f();
    int j = i;
    if (i == -1)
    {
      j = paramkN.e(localyL);
      localyL.a(j);
    }
    b(j);
    paramkN.a(paramWM, this.c);
  }
  
  public final void b(String paramString)
    throws IOException
  {
    int i = this.e.position();
    try
    {
      int j = XL.g(paramString.length() * 3);
      int k = XL.g(paramString.length());
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
      b(KN.a(paramString));
      c(paramString);
      return;
    }
    catch (IllegalArgumentException paramString)
    {
      throw new XL.c(paramString);
    }
    catch (ON localON)
    {
      this.e.position(i);
      a(paramString, localON);
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
      throw new XL.c(paramArrayOfByte);
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw new XL.c(paramArrayOfByte);
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
      throw new XL.c(localBufferOverflowException);
    }
  }
  
  public final void c(WM paramWM)
    throws IOException
  {
    b(paramWM.a());
    paramWM.a(this);
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
      throw new XL.c(localBufferOverflowException);
    }
  }
  
  public final void e(int paramInt1, int paramInt2)
    throws IOException
  {
    a(paramInt1, 5);
    d(paramInt2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/XL$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */