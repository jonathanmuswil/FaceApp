import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class ls$e
  extends ls
{
  private final ByteBuffer d;
  private final ByteBuffer e;
  private final long f;
  private final long g;
  private final long h;
  private final long i;
  private long j;
  
  ls$e(ByteBuffer paramByteBuffer)
  {
    super(null);
    this.d = paramByteBuffer;
    this.e = paramByteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
    this.f = Yt.a(paramByteBuffer);
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
      Yt.a(l, paramByte);
      return;
    }
    throw new ls.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(l), Long.valueOf(this.h), Integer.valueOf(1) }));
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
  
  public final void a(int paramInt, _r param_r)
    throws IOException
  {
    a(paramInt, 2);
    b(param_r);
  }
  
  public final void a(int paramInt, it paramit)
    throws IOException
  {
    a(paramInt, 2);
    c(paramit);
  }
  
  final void a(int paramInt, it paramit, zt paramzt)
    throws IOException
  {
    a(paramInt, 2);
    b(paramit, paramzt);
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
    long l1 = paramLong;
    long l2;
    if (this.j <= this.i) {
      for (;;)
      {
        if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
        {
          l2 = this.j;
          this.j = (1L + l2);
          Yt.a(l2, (byte)(int)paramLong);
          return;
        }
        l1 = this.j;
        this.j = (l1 + 1L);
        Yt.a(l1, (byte)((int)paramLong & 0x7F | 0x80));
        paramLong >>>= 7;
      }
    }
    for (;;)
    {
      l2 = this.j;
      if (l2 >= this.h) {
        break label143;
      }
      if ((l1 & 0xFFFFFFFFFFFFFF80) == 0L)
      {
        paramLong = l1;
        break;
      }
      this.j = (l2 + 1L);
      Yt.a(l2, (byte)((int)l1 & 0x7F | 0x80));
      l1 >>>= 7;
    }
    label143:
    throw new ls.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(l2), Long.valueOf(this.h), Integer.valueOf(1) }));
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
          Yt.a(l, (byte)paramInt);
          return;
        }
        l = this.j;
        this.j = (l + 1L);
        Yt.a(l, (byte)(paramInt & 0x7F | 0x80));
        paramInt >>>= 7;
      }
    }
    for (;;)
    {
      l = this.j;
      if (l >= this.h) {
        break label127;
      }
      if ((k & 0xFFFFFF80) == 0)
      {
        paramInt = k;
        break;
      }
      this.j = (l + 1L);
      Yt.a(l, (byte)(k & 0x7F | 0x80));
      k >>>= 7;
    }
    label127:
    throw new ls.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(l), Long.valueOf(this.h), Integer.valueOf(1) }));
  }
  
  public final void b(int paramInt1, int paramInt2)
    throws IOException
  {
    a(paramInt1, 0);
    a(paramInt2);
  }
  
  public final void b(int paramInt, _r param_r)
    throws IOException
  {
    a(1, 3);
    c(2, paramInt);
    a(3, param_r);
    a(1, 4);
  }
  
  public final void b(int paramInt, it paramit)
    throws IOException
  {
    a(1, 3);
    c(2, paramInt);
    a(3, paramit);
    a(1, 4);
  }
  
  public final void b(_r param_r)
    throws IOException
  {
    b(param_r.size());
    param_r.a(this);
  }
  
  final void b(it paramit, zt paramzt)
    throws IOException
  {
    Qr localQr = (Qr)paramit;
    int k = localQr.b();
    int m = k;
    if (k == -1)
    {
      m = paramzt.c(localQr);
      localQr.a(m);
    }
    b(m);
    paramzt.a(paramit, this.c);
  }
  
  public final void b(String paramString)
    throws IOException
  {
    long l = this.j;
    try
    {
      int k = ls.g(paramString.length() * 3);
      int m = ls.g(paramString.length());
      if (m == k)
      {
        m = (int)(this.j - this.f) + m;
        this.e.position(m);
        _t.a(paramString, this.e);
        m = this.e.position() - m;
        b(m);
        this.j += m;
        return;
      }
      m = _t.a(paramString);
      b(m);
      j(this.j);
      _t.a(paramString, this.e);
      this.j += m;
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new ls.c(paramString);
    }
    catch (IllegalArgumentException paramString)
    {
      throw new ls.c(paramString);
    }
    catch (cu localcu)
    {
      this.j = l;
      j(this.j);
      a(paramString, localcu);
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
        Yt.a(paramArrayOfByte, paramInt1, l3, l2);
        this.j += l2;
        return;
      }
    }
    if (paramArrayOfByte == null) {
      throw new NullPointerException("value");
    }
    throw new ls.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(this.j), Long.valueOf(this.h), Integer.valueOf(paramInt2) }));
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
  
  public final void c(it paramit)
    throws IOException
  {
    b(paramit.s());
    paramit.a(this);
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ls$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */