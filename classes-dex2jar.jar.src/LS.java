import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class ls
  extends Zr
{
  private static final Logger a = Logger.getLogger(ls.class.getName());
  private static final boolean b = Yt.b();
  ns c;
  
  public static int a(int paramInt, Rs paramRs)
  {
    paramInt = e(paramInt);
    int i = paramRs.a();
    return paramInt + (g(i) + i);
  }
  
  public static int a(Rs paramRs)
  {
    int i = paramRs.a();
    return g(i) + i;
  }
  
  public static int a(_r param_r)
  {
    int i = param_r.size();
    return g(i) + i;
  }
  
  public static int a(it paramit)
  {
    int i = paramit.s();
    return g(i) + i;
  }
  
  static int a(it paramit, zt paramzt)
  {
    paramit = (Qr)paramit;
    int i = paramit.b();
    int j = i;
    if (i == -1)
    {
      j = paramzt.c(paramit);
      paramit.a(j);
    }
    return g(j) + j;
  }
  
  public static int a(String paramString)
  {
    int i;
    try
    {
      i = _t.a(paramString);
    }
    catch (cu localcu)
    {
      i = paramString.getBytes(Gs.a).length;
    }
    return g(i) + i;
  }
  
  public static ls a(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.hasArray()) {
      return new ls.b(paramByteBuffer);
    }
    if ((paramByteBuffer.isDirect()) && (!paramByteBuffer.isReadOnly()))
    {
      if (Yt.c()) {
        return new ls.e(paramByteBuffer);
      }
      return new ls.d(paramByteBuffer);
    }
    throw new IllegalArgumentException("ByteBuffer is read-only");
  }
  
  public static ls a(byte[] paramArrayOfByte)
  {
    return new ls.a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static int b(double paramDouble)
  {
    return 8;
  }
  
  public static int b(float paramFloat)
  {
    return 4;
  }
  
  public static int b(int paramInt, double paramDouble)
  {
    return e(paramInt) + 8;
  }
  
  public static int b(int paramInt, float paramFloat)
  {
    return e(paramInt) + 4;
  }
  
  public static int b(int paramInt, Rs paramRs)
  {
    return (e(1) << 1) + g(2, paramInt) + a(3, paramRs);
  }
  
  static int b(int paramInt, it paramit, zt paramzt)
  {
    return e(paramInt) + a(paramit, paramzt);
  }
  
  public static int b(int paramInt, String paramString)
  {
    return e(paramInt) + a(paramString);
  }
  
  public static int b(int paramInt, boolean paramBoolean)
  {
    return e(paramInt) + 1;
  }
  
  @Deprecated
  public static int b(it paramit)
  {
    return paramit.s();
  }
  
  public static int b(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int b(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return g(i) + i;
  }
  
  public static int c(int paramInt, _r param_r)
  {
    int i = e(paramInt);
    paramInt = param_r.size();
    return i + (g(paramInt) + paramInt);
  }
  
  public static int c(int paramInt, it paramit)
  {
    return e(paramInt) + a(paramit);
  }
  
  @Deprecated
  static int c(int paramInt, it paramit, zt paramzt)
  {
    int i = e(paramInt);
    paramit = (Qr)paramit;
    int j = paramit.b();
    paramInt = j;
    if (j == -1)
    {
      paramInt = paramzt.c(paramit);
      paramit.a(paramInt);
    }
    return (i << 1) + paramInt;
  }
  
  public static int d(int paramInt, long paramLong)
  {
    return e(paramInt) + e(paramLong);
  }
  
  public static int d(int paramInt, _r param_r)
  {
    return (e(1) << 1) + g(2, paramInt) + c(3, param_r);
  }
  
  public static int d(int paramInt, it paramit)
  {
    return (e(1) << 1) + g(2, paramInt) + c(3, paramit);
  }
  
  public static int d(long paramLong)
  {
    return e(paramLong);
  }
  
  public static int e(int paramInt)
  {
    return g(paramInt << 3);
  }
  
  public static int e(int paramInt, long paramLong)
  {
    return e(paramInt) + e(paramLong);
  }
  
  public static int e(long paramLong)
  {
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      return 1;
    }
    if (paramLong < 0L) {
      return 10;
    }
    if ((0xFFFFFFF800000000 & paramLong) != 0L)
    {
      i = 6;
      paramLong >>>= 28;
    }
    else
    {
      i = 2;
    }
    int j = i;
    long l = paramLong;
    if ((0xFFFFFFFFFFE00000 & paramLong) != 0L)
    {
      j = i + 2;
      l = paramLong >>> 14;
    }
    int i = j;
    if ((l & 0xFFFFFFFFFFFFC000) != 0L) {
      i = j + 1;
    }
    return i;
  }
  
  public static int f(int paramInt)
  {
    if (paramInt >= 0) {
      return g(paramInt);
    }
    return 10;
  }
  
  public static int f(int paramInt1, int paramInt2)
  {
    return e(paramInt1) + f(paramInt2);
  }
  
  public static int f(int paramInt, long paramLong)
  {
    return e(paramInt) + e(i(paramLong));
  }
  
  public static int f(long paramLong)
  {
    return e(i(paramLong));
  }
  
  public static int g(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((paramInt & 0xF0000000) == 0) {
      return 4;
    }
    return 5;
  }
  
  public static int g(int paramInt1, int paramInt2)
  {
    return e(paramInt1) + g(paramInt2);
  }
  
  public static int g(int paramInt, long paramLong)
  {
    return e(paramInt) + 8;
  }
  
  public static int g(long paramLong)
  {
    return 8;
  }
  
  public static int h(int paramInt)
  {
    return g(m(paramInt));
  }
  
  public static int h(int paramInt1, int paramInt2)
  {
    return e(paramInt1) + g(m(paramInt2));
  }
  
  public static int h(int paramInt, long paramLong)
  {
    return e(paramInt) + 8;
  }
  
  public static int h(long paramLong)
  {
    return 8;
  }
  
  public static int i(int paramInt)
  {
    return 4;
  }
  
  public static int i(int paramInt1, int paramInt2)
  {
    return e(paramInt1) + 4;
  }
  
  private static long i(long paramLong)
  {
    return paramLong >> 63 ^ paramLong << 1;
  }
  
  public static int j(int paramInt)
  {
    return 4;
  }
  
  public static int j(int paramInt1, int paramInt2)
  {
    return e(paramInt1) + 4;
  }
  
  public static int k(int paramInt)
  {
    return f(paramInt);
  }
  
  public static int k(int paramInt1, int paramInt2)
  {
    return e(paramInt1) + f(paramInt2);
  }
  
  @Deprecated
  public static int l(int paramInt)
  {
    return g(paramInt);
  }
  
  private static int m(int paramInt)
  {
    return paramInt >> 31 ^ paramInt << 1;
  }
  
  public abstract void a()
    throws IOException;
  
  public abstract void a(byte paramByte)
    throws IOException;
  
  public final void a(double paramDouble)
    throws IOException
  {
    c(Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void a(float paramFloat)
    throws IOException
  {
    d(Float.floatToRawIntBits(paramFloat));
  }
  
  public abstract void a(int paramInt)
    throws IOException;
  
  public final void a(int paramInt, double paramDouble)
    throws IOException
  {
    c(paramInt, Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void a(int paramInt, float paramFloat)
    throws IOException
  {
    e(paramInt, Float.floatToRawIntBits(paramFloat));
  }
  
  public abstract void a(int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void a(int paramInt, long paramLong)
    throws IOException;
  
  public abstract void a(int paramInt, _r param_r)
    throws IOException;
  
  public abstract void a(int paramInt, it paramit)
    throws IOException;
  
  abstract void a(int paramInt, it paramit, zt paramzt)
    throws IOException;
  
  public abstract void a(int paramInt, String paramString)
    throws IOException;
  
  public abstract void a(int paramInt, boolean paramBoolean)
    throws IOException;
  
  public abstract void a(long paramLong)
    throws IOException;
  
  final void a(String paramString, cu paramcu)
    throws IOException
  {
    a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramcu);
    paramString = paramString.getBytes(Gs.a);
    try
    {
      b(paramString.length);
      a(paramString, 0, paramString.length);
      return;
    }
    catch (ls.c paramString)
    {
      throw paramString;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new ls.c(paramString);
    }
  }
  
  public final void a(boolean paramBoolean)
    throws IOException
  {
    a((byte)paramBoolean);
  }
  
  public abstract int b();
  
  public abstract void b(int paramInt)
    throws IOException;
  
  public abstract void b(int paramInt1, int paramInt2)
    throws IOException;
  
  public final void b(int paramInt, long paramLong)
    throws IOException
  {
    a(paramInt, i(paramLong));
  }
  
  public abstract void b(int paramInt, _r param_r)
    throws IOException;
  
  public abstract void b(int paramInt, it paramit)
    throws IOException;
  
  public final void b(long paramLong)
    throws IOException
  {
    a(i(paramLong));
  }
  
  public abstract void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException;
  
  public final void c(int paramInt)
    throws IOException
  {
    b(m(paramInt));
  }
  
  public abstract void c(int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void c(int paramInt, long paramLong)
    throws IOException;
  
  public abstract void c(long paramLong)
    throws IOException;
  
  public abstract void d(int paramInt)
    throws IOException;
  
  public final void d(int paramInt1, int paramInt2)
    throws IOException
  {
    c(paramInt1, m(paramInt2));
  }
  
  public abstract void e(int paramInt1, int paramInt2)
    throws IOException;
  
  static class a
    extends ls
  {
    private final byte[] d;
    private final int e;
    private final int f;
    private int g;
    
    a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      super();
      if (paramArrayOfByte != null)
      {
        int i = paramArrayOfByte.length;
        int j = paramInt1 + paramInt2;
        if ((paramInt1 | paramInt2 | i - j) >= 0)
        {
          this.d = paramArrayOfByte;
          this.e = paramInt1;
          this.g = paramInt1;
          this.f = j;
          return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
      }
      throw new NullPointerException("buffer");
    }
    
    public void a() {}
    
    public final void a(byte paramByte)
      throws IOException
    {
      try
      {
        byte[] arrayOfByte = this.d;
        int i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)paramByte);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new ls.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
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
      Qr localQr = (Qr)paramit;
      int i = localQr.b();
      paramInt = i;
      if (i == -1)
      {
        paramInt = paramzt.c(localQr);
        localQr.a(paramInt);
      }
      b(paramInt);
      paramzt.a(paramit, this.c);
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
      byte[] arrayOfByte;
      int i;
      if (ls.c())
      {
        l = paramLong;
        if (b() >= 10) {
          for (;;)
          {
            if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
            {
              arrayOfByte = this.d;
              i = this.g;
              this.g = (i + 1);
              Yt.a(arrayOfByte, i, (byte)(int)paramLong);
              return;
            }
            arrayOfByte = this.d;
            i = this.g;
            this.g = (i + 1);
            Yt.a(arrayOfByte, i, (byte)((int)paramLong & 0x7F | 0x80));
            paramLong >>>= 7;
          }
        }
      }
      for (;;)
      {
        if ((l & 0xFFFFFFFFFFFFFF80) == 0L) {}
        try
        {
          arrayOfByte = this.d;
          i = this.g;
          this.g = (i + 1);
          arrayOfByte[i] = ((byte)(byte)(int)l);
          return;
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
        {
          throw new ls.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
        }
        arrayOfByte = this.d;
        i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)((int)l & 0x7F | 0x80));
        l >>>= 7;
      }
    }
    
    public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      b(paramArrayOfByte, paramInt1, paramInt2);
    }
    
    public final int b()
    {
      return this.f - this.g;
    }
    
    public final void b(int paramInt)
      throws IOException
    {
      int i = paramInt;
      byte[] arrayOfByte;
      if (ls.c())
      {
        i = paramInt;
        if (b() >= 10) {
          for (;;)
          {
            if ((paramInt & 0xFFFFFF80) == 0)
            {
              arrayOfByte = this.d;
              i = this.g;
              this.g = (i + 1);
              Yt.a(arrayOfByte, i, (byte)paramInt);
              return;
            }
            arrayOfByte = this.d;
            i = this.g;
            this.g = (i + 1);
            Yt.a(arrayOfByte, i, (byte)(paramInt & 0x7F | 0x80));
            paramInt >>>= 7;
          }
        }
      }
      for (;;)
      {
        if ((i & 0xFFFFFF80) == 0) {}
        try
        {
          arrayOfByte = this.d;
          paramInt = this.g;
          this.g = (paramInt + 1);
          arrayOfByte[paramInt] = ((byte)(byte)i);
          return;
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
        {
          throw new ls.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
        }
        arrayOfByte = this.d;
        paramInt = this.g;
        this.g = (paramInt + 1);
        arrayOfByte[paramInt] = ((byte)(byte)(i & 0x7F | 0x80));
        i >>>= 7;
      }
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
    
    public final void b(String paramString)
      throws IOException
    {
      int i = this.g;
      try
      {
        int j = ls.g(paramString.length() * 3);
        int k = ls.g(paramString.length());
        if (k == j)
        {
          this.g = (i + k);
          j = _t.a(paramString, this.d, this.g, b());
          this.g = i;
          b(j - i - k);
          this.g = j;
          return;
        }
        b(_t.a(paramString));
        this.g = _t.a(paramString, this.d, this.g, b());
        return;
      }
      catch (IndexOutOfBoundsException paramString)
      {
        throw new ls.c(paramString);
      }
      catch (cu localcu)
      {
        this.g = i;
        a(paramString, localcu);
      }
    }
    
    public final void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      try
      {
        System.arraycopy(paramArrayOfByte, paramInt1, this.d, this.g, paramInt2);
        this.g += paramInt2;
        return;
      }
      catch (IndexOutOfBoundsException paramArrayOfByte)
      {
        throw new ls.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(paramInt2) }), paramArrayOfByte);
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
        byte[] arrayOfByte = this.d;
        int i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)(int)paramLong);
        arrayOfByte = this.d;
        i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)(int)(paramLong >> 8));
        arrayOfByte = this.d;
        i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)(int)(paramLong >> 16));
        arrayOfByte = this.d;
        i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)(int)(paramLong >> 24));
        arrayOfByte = this.d;
        i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)(int)(paramLong >> 32));
        arrayOfByte = this.d;
        i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)(int)(paramLong >> 40));
        arrayOfByte = this.d;
        i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)(int)(paramLong >> 48));
        arrayOfByte = this.d;
        i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)(int)(paramLong >> 56));
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new ls.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
    }
    
    public final void c(it paramit)
      throws IOException
    {
      b(paramit.s());
      paramit.a(this);
    }
    
    public final int d()
    {
      return this.g - this.e;
    }
    
    public final void d(int paramInt)
      throws IOException
    {
      try
      {
        byte[] arrayOfByte = this.d;
        int i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)paramInt);
        arrayOfByte = this.d;
        i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)(paramInt >> 8));
        arrayOfByte = this.d;
        i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)(paramInt >> 16));
        arrayOfByte = this.d;
        i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)(paramInt >> 24));
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new ls.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
    }
    
    public final void e(int paramInt1, int paramInt2)
      throws IOException
    {
      a(paramInt1, 5);
      d(paramInt2);
    }
  }
  
  static final class b
    extends ls.a
  {
    private final ByteBuffer h;
    private int i;
    
    b(ByteBuffer paramByteBuffer)
    {
      super(paramByteBuffer.arrayOffset() + paramByteBuffer.position(), paramByteBuffer.remaining());
      this.h = paramByteBuffer;
      this.i = paramByteBuffer.position();
    }
    
    public final void a()
    {
      this.h.position(this.i + d());
    }
  }
  
  public static final class c
    extends IOException
  {
    c(String paramString)
    {
      super();
    }
    
    c(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
    
    c(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
  
  static final class d
    extends ls
  {
    private final ByteBuffer d;
    private final ByteBuffer e;
    private final int f;
    
    d(ByteBuffer paramByteBuffer)
    {
      super();
      this.d = paramByteBuffer;
      this.e = paramByteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
      this.f = paramByteBuffer.position();
    }
    
    private final void c(String paramString)
      throws IOException
    {
      try
      {
        _t.a(paramString, this.e);
        return;
      }
      catch (IndexOutOfBoundsException paramString)
      {
        throw new ls.c(paramString);
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
        throw new ls.c(localBufferOverflowException);
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
          throw new ls.c(localBufferOverflowException);
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
          throw new ls.c(localBufferOverflowException);
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
      int i = localQr.b();
      int j = i;
      if (i == -1)
      {
        j = paramzt.c(localQr);
        localQr.a(j);
      }
      b(j);
      paramzt.a(paramit, this.c);
    }
    
    public final void b(String paramString)
      throws IOException
    {
      int i = this.e.position();
      try
      {
        int j = ls.g(paramString.length() * 3);
        int k = ls.g(paramString.length());
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
        b(_t.a(paramString));
        c(paramString);
        return;
      }
      catch (IllegalArgumentException paramString)
      {
        throw new ls.c(paramString);
      }
      catch (cu localcu)
      {
        this.e.position(i);
        a(paramString, localcu);
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
        throw new ls.c(paramArrayOfByte);
      }
      catch (IndexOutOfBoundsException paramArrayOfByte)
      {
        throw new ls.c(paramArrayOfByte);
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
        throw new ls.c(localBufferOverflowException);
      }
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
      try
      {
        this.e.putInt(paramInt);
        return;
      }
      catch (BufferOverflowException localBufferOverflowException)
      {
        throw new ls.c(localBufferOverflowException);
      }
    }
    
    public final void e(int paramInt1, int paramInt2)
      throws IOException
    {
      a(paramInt1, 5);
      d(paramInt2);
    }
  }
  
  static final class e
    extends ls
  {
    private final ByteBuffer d;
    private final ByteBuffer e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private long j;
    
    e(ByteBuffer paramByteBuffer)
    {
      super();
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
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */