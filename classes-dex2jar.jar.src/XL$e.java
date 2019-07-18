import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class XL$e
  extends XL
{
  private final ByteBuffer d;
  private final ByteBuffer e;
  private final long f;
  private final long g;
  private final long h;
  private final long i;
  private long j;
  
  XL$e(ByteBuffer paramByteBuffer)
  {
    super(null);
    this.d = paramByteBuffer;
    this.e = paramByteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
    this.f = IN.a(paramByteBuffer);
    this.g = (this.f + paramByteBuffer.position());
    this.h = (this.f + paramByteBuffer.limit());
    this.i = (this.h - 10L);
    this.j = this.g;
  }
  
  private final void j(long paramLong)
  {
    this.e.position((int)(paramLong - this.f));
  }
  
  public final void a()
  {
    this.d.position((int)(this.j - this.f));
  }
  
  public final void a(byte paramByte)
    throws IOException
  {
    long l = this.j;
    if (l < this.h)
    {
      this.j = (1L + l);
      IN.a(l, paramByte);
      return;
    }
    throw new XL.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(l), Long.valueOf(this.h), Integer.valueOf(1) }));
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
    long l = paramLong;
    if (this.j <= this.i) {
      for (;;)
      {
        if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
        {
          l = this.j;
          this.j = (1L + l);
          IN.a(l, (byte)(int)paramLong);
          return;
        }
        l = this.j;
        this.j = (l + 1L);
        IN.a(l, (byte)((int)paramLong & 0x7F | 0x80));
        paramLong >>>= 7;
      }
    }
    for (;;)
    {
      paramLong = this.j;
      if (paramLong >= this.h) {
        break;
      }
      if ((l & 0xFFFFFFFFFFFFFF80) == 0L)
      {
        this.j = (1L + paramLong);
        IN.a(paramLong, (byte)(int)l);
        return;
      }
      this.j = (paramLong + 1L);
      IN.a(paramLong, (byte)((int)l & 0x7F | 0x80));
      l >>>= 7;
    }
    throw new XL.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(paramLong), Long.valueOf(this.h), Integer.valueOf(1) }));
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    b(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final int b()
  {
    return (int)(this.h - this.j);
  }
  
  public final void b(int paramInt)
    throws IOException
  {
    int k = paramInt;
    long l;
    if (this.j <= this.i) {
      for (;;)
      {
        if ((paramInt & 0xFFFFFF80) == 0)
        {
          l = this.j;
          this.j = (1L + l);
          IN.a(l, (byte)paramInt);
          return;
        }
        l = this.j;
        this.j = (l + 1L);
        IN.a(l, (byte)(paramInt & 0x7F | 0x80));
        paramInt >>>= 7;
      }
    }
    for (;;)
    {
      l = this.j;
      if (l >= this.h) {
        break;
      }
      if ((k & 0xFFFFFF80) == 0)
      {
        this.j = (1L + l);
        IN.a(l, (byte)k);
        return;
      }
      this.j = (l + 1L);
      IN.a(l, (byte)(k & 0x7F | 0x80));
      k >>>= 7;
    }
    throw new XL.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(l), Long.valueOf(this.h), Integer.valueOf(1) }));
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
    int k = localyL.f();
    int m = k;
    if (k == -1)
    {
      m = paramkN.e(localyL);
      localyL.a(m);
    }
    b(m);
    paramkN.a(paramWM, this.c);
  }
  
  public final void b(String paramString)
    throws IOException
  {
    long l = this.j;
    try
    {
      int k = XL.g(paramString.length() * 3);
      int m = XL.g(paramString.length());
      if (m == k)
      {
        m = (int)(this.j - this.f) + m;
        this.e.position(m);
        KN.a(paramString, this.e);
        m = this.e.position() - m;
        b(m);
        this.j += m;
        return;
      }
      m = KN.a(paramString);
      b(m);
      j(this.j);
      KN.a(paramString, this.e);
      this.j += m;
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new XL.c(paramString);
    }
    catch (IllegalArgumentException paramString)
    {
      throw new XL.c(paramString);
    }
    catch (ON localON)
    {
      this.j = l;
      j(this.j);
      a(paramString, localON);
    }
  }
  
  public final void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if ((paramArrayOfByte != null) && (paramInt1 >= 0) && (paramInt2 >= 0) && (paramArrayOfByte.length - paramInt2 >= paramInt1))
    {
      long l1 = this.h;
      long l2 = paramInt2;
      long l3 = this.j;
      if (l1 - l2 >= l3)
      {
        IN.a(paramArrayOfByte, paramInt1, l3, l2);
        this.j += l2;
        return;
      }
    }
    if (paramArrayOfByte == null) {
      throw new NullPointerException("value");
    }
    throw new XL.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(this.j), Long.valueOf(this.h), Integer.valueOf(paramInt2) }));
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
    this.e.putLong((int)(this.j - this.f), paramLong);
    this.j += 8L;
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
    this.e.putInt((int)(this.j - this.f), paramInt);
    this.j += 4L;
  }
  
  public final void e(int paramInt1, int paramInt2)
    throws IOException
  {
    a(paramInt1, 5);
    d(paramInt2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/XL$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */