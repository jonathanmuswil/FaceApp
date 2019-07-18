import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class cx
  extends Nw
{
  private static final Logger a = Logger.getLogger(cx.class.getName());
  private static final boolean b = Qy.b();
  fx c;
  
  public static int a(int paramInt)
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
  
  public static int a(int paramInt, Jx paramJx)
  {
    int i = l(paramInt);
    paramInt = paramJx.b();
    return i + (a(paramInt) + paramInt);
  }
  
  public static int a(Jx paramJx)
  {
    int i = paramJx.b();
    return a(i) + i;
  }
  
  static int a(by paramby, ry paramry)
  {
    paramby = (Iw)paramby;
    int i = paramby.e();
    int j = i;
    if (i == -1)
    {
      j = paramry.e(paramby);
      paramby.a(j);
    }
    return a(j) + j;
  }
  
  public static cx a(byte[] paramArrayOfByte)
  {
    return new cx.a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static int b(double paramDouble)
  {
    return 8;
  }
  
  public static int b(float paramFloat)
  {
    return 4;
  }
  
  public static int b(int paramInt)
  {
    return a(n(paramInt));
  }
  
  public static int b(int paramInt, double paramDouble)
  {
    return l(paramInt) + 8;
  }
  
  public static int b(int paramInt, float paramFloat)
  {
    return l(paramInt) + 4;
  }
  
  public static int b(int paramInt, Jx paramJx)
  {
    return (l(1) << 1) + g(2, paramInt) + a(3, paramJx);
  }
  
  public static int b(int paramInt, by paramby)
  {
    return (l(1) << 1) + g(2, paramInt) + (l(3) + b(paramby));
  }
  
  static int b(int paramInt, by paramby, ry paramry)
  {
    return l(paramInt) + a(paramby, paramry);
  }
  
  public static int b(int paramInt, String paramString)
  {
    return l(paramInt) + b(paramString);
  }
  
  public static int b(int paramInt, boolean paramBoolean)
  {
    return l(paramInt) + 1;
  }
  
  public static int b(Ow paramOw)
  {
    int i = paramOw.size();
    return a(i) + i;
  }
  
  public static int b(by paramby)
  {
    int i = paramby.c();
    return a(i) + i;
  }
  
  public static int b(String paramString)
  {
    int i;
    try
    {
      i = Sy.a(paramString);
    }
    catch (Vy localVy)
    {
      i = paramString.getBytes(ux.a).length;
    }
    return a(i) + i;
  }
  
  public static int b(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int b(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return a(i) + i;
  }
  
  public static int c(int paramInt)
  {
    return 4;
  }
  
  public static int c(int paramInt, Ow paramOw)
  {
    paramInt = l(paramInt);
    int i = paramOw.size();
    return paramInt + (a(i) + i);
  }
  
  @Deprecated
  static int c(int paramInt, by paramby, ry paramry)
  {
    int i = l(paramInt);
    paramby = (Iw)paramby;
    int j = paramby.e();
    paramInt = j;
    if (j == -1)
    {
      paramInt = paramry.e(paramby);
      paramby.a(paramInt);
    }
    return (i << 1) + paramInt;
  }
  
  @Deprecated
  public static int c(by paramby)
  {
    return paramby.c();
  }
  
  public static int d(int paramInt)
  {
    return 4;
  }
  
  public static int d(int paramInt, long paramLong)
  {
    return l(paramInt) + e(paramLong);
  }
  
  public static int d(int paramInt, Ow paramOw)
  {
    return (l(1) << 1) + g(2, paramInt) + c(3, paramOw);
  }
  
  public static int d(long paramLong)
  {
    return e(paramLong);
  }
  
  public static int e(int paramInt)
  {
    return m(paramInt);
  }
  
  public static int e(int paramInt, long paramLong)
  {
    return l(paramInt) + e(paramLong);
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
  
  static int f(int paramInt)
  {
    return a(paramInt) + paramInt;
  }
  
  public static int f(int paramInt1, int paramInt2)
  {
    return l(paramInt1) + m(paramInt2);
  }
  
  public static int f(int paramInt, long paramLong)
  {
    return l(paramInt) + e(i(paramLong));
  }
  
  public static int f(long paramLong)
  {
    return e(i(paramLong));
  }
  
  @Deprecated
  public static int g(int paramInt)
  {
    return a(paramInt);
  }
  
  public static int g(int paramInt1, int paramInt2)
  {
    return l(paramInt1) + a(paramInt2);
  }
  
  public static int g(int paramInt, long paramLong)
  {
    return l(paramInt) + 8;
  }
  
  public static int g(long paramLong)
  {
    return 8;
  }
  
  public static int h(int paramInt1, int paramInt2)
  {
    return l(paramInt1) + a(n(paramInt2));
  }
  
  public static int h(int paramInt, long paramLong)
  {
    return l(paramInt) + 8;
  }
  
  public static int h(long paramLong)
  {
    return 8;
  }
  
  public static int i(int paramInt1, int paramInt2)
  {
    return l(paramInt1) + 4;
  }
  
  private static long i(long paramLong)
  {
    return paramLong >> 63 ^ paramLong << 1;
  }
  
  public static int j(int paramInt1, int paramInt2)
  {
    return l(paramInt1) + 4;
  }
  
  public static int k(int paramInt1, int paramInt2)
  {
    return l(paramInt1) + m(paramInt2);
  }
  
  public static int l(int paramInt)
  {
    return a(paramInt << 3);
  }
  
  public static int m(int paramInt)
  {
    if (paramInt >= 0) {
      return a(paramInt);
    }
    return 10;
  }
  
  private static int n(int paramInt)
  {
    return paramInt >> 31 ^ paramInt << 1;
  }
  
  public abstract int a();
  
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
    k(Float.floatToRawIntBits(paramFloat));
  }
  
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
  
  public abstract void a(int paramInt, Ow paramOw)
    throws IOException;
  
  public abstract void a(int paramInt, by paramby)
    throws IOException;
  
  abstract void a(int paramInt, by paramby, ry paramry)
    throws IOException;
  
  public abstract void a(int paramInt, String paramString)
    throws IOException;
  
  public abstract void a(int paramInt, boolean paramBoolean)
    throws IOException;
  
  public abstract void a(long paramLong)
    throws IOException;
  
  public abstract void a(Ow paramOw)
    throws IOException;
  
  public abstract void a(by paramby)
    throws IOException;
  
  public abstract void a(String paramString)
    throws IOException;
  
  final void a(String paramString, Vy paramVy)
    throws IOException
  {
    a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramVy);
    paramString = paramString.getBytes(ux.a);
    try
    {
      i(paramString.length);
      a(paramString, 0, paramString.length);
      return;
    }
    catch (cx.b paramString)
    {
      throw paramString;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new cx.b(paramString);
    }
  }
  
  public final void a(boolean paramBoolean)
    throws IOException
  {
    a((byte)paramBoolean);
  }
  
  public final void b()
  {
    if (a() == 0) {
      return;
    }
    throw new IllegalStateException("Did not write as much data as expected.");
  }
  
  public abstract void b(int paramInt1, int paramInt2)
    throws IOException;
  
  public final void b(int paramInt, long paramLong)
    throws IOException
  {
    a(paramInt, i(paramLong));
  }
  
  public abstract void b(int paramInt, Ow paramOw)
    throws IOException;
  
  public final void b(long paramLong)
    throws IOException
  {
    a(i(paramLong));
  }
  
  abstract void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void c(int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void c(int paramInt, long paramLong)
    throws IOException;
  
  public abstract void c(long paramLong)
    throws IOException;
  
  public final void d(int paramInt1, int paramInt2)
    throws IOException
  {
    c(paramInt1, n(paramInt2));
  }
  
  public abstract void e(int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void h(int paramInt)
    throws IOException;
  
  public abstract void i(int paramInt)
    throws IOException;
  
  public final void j(int paramInt)
    throws IOException
  {
    i(n(paramInt));
  }
  
  public abstract void k(int paramInt)
    throws IOException;
  
  static final class a
    extends cx
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
        paramInt1 = paramArrayOfByte.length;
        int i = paramInt2 + 0;
        if ((paramInt2 | 0x0 | paramInt1 - i) >= 0)
        {
          this.d = paramArrayOfByte;
          this.e = 0;
          this.g = 0;
          this.f = i;
          return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(0), Integer.valueOf(paramInt2) }));
      }
      throw new NullPointerException("buffer");
    }
    
    private final void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
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
        throw new cx.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(paramInt2) }), paramArrayOfByte);
      }
    }
    
    public final int a()
    {
      return this.f - this.g;
    }
    
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
        throw new cx.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
    }
    
    public final void a(int paramInt1, int paramInt2)
      throws IOException
    {
      i(paramInt1 << 3 | paramInt2);
    }
    
    public final void a(int paramInt, long paramLong)
      throws IOException
    {
      a(paramInt, 0);
      a(paramLong);
    }
    
    public final void a(int paramInt, Ow paramOw)
      throws IOException
    {
      a(paramInt, 2);
      a(paramOw);
    }
    
    public final void a(int paramInt, by paramby)
      throws IOException
    {
      a(1, 3);
      c(2, paramInt);
      a(3, 2);
      a(paramby);
      a(1, 4);
    }
    
    final void a(int paramInt, by paramby, ry paramry)
      throws IOException
    {
      a(paramInt, 2);
      Iw localIw = (Iw)paramby;
      int i = localIw.e();
      paramInt = i;
      if (i == -1)
      {
        paramInt = paramry.e(localIw);
        localIw.a(paramInt);
      }
      i(paramInt);
      paramry.a(paramby, this.c);
    }
    
    public final void a(int paramInt, String paramString)
      throws IOException
    {
      a(paramInt, 2);
      a(paramString);
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
      if (cx.c())
      {
        l = paramLong;
        if (a() >= 10) {
          for (;;)
          {
            if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
            {
              arrayOfByte = this.d;
              i = this.g;
              this.g = (i + 1);
              Qy.a(arrayOfByte, i, (byte)(int)paramLong);
              return;
            }
            arrayOfByte = this.d;
            i = this.g;
            this.g = (i + 1);
            Qy.a(arrayOfByte, i, (byte)((int)paramLong & 0x7F | 0x80));
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
          throw new cx.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
        }
        arrayOfByte = this.d;
        i = this.g;
        this.g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)((int)l & 0x7F | 0x80));
        l >>>= 7;
      }
    }
    
    public final void a(Ow paramOw)
      throws IOException
    {
      i(paramOw.size());
      paramOw.a(this);
    }
    
    public final void a(by paramby)
      throws IOException
    {
      i(paramby.c());
      paramby.a(this);
    }
    
    public final void a(String paramString)
      throws IOException
    {
      int i = this.g;
      try
      {
        int j = cx.a(paramString.length() * 3);
        int k = cx.a(paramString.length());
        if (k == j)
        {
          this.g = (i + k);
          j = Sy.a(paramString, this.d, this.g, a());
          this.g = i;
          i(j - i - k);
          this.g = j;
          return;
        }
        i(Sy.a(paramString));
        this.g = Sy.a(paramString, this.d, this.g, a());
        return;
      }
      catch (IndexOutOfBoundsException paramString)
      {
        throw new cx.b(paramString);
      }
      catch (Vy localVy)
      {
        this.g = i;
        a(paramString, localVy);
      }
    }
    
    public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      c(paramArrayOfByte, paramInt1, paramInt2);
    }
    
    public final void b(int paramInt1, int paramInt2)
      throws IOException
    {
      a(paramInt1, 0);
      h(paramInt2);
    }
    
    public final void b(int paramInt, Ow paramOw)
      throws IOException
    {
      a(1, 3);
      c(2, paramInt);
      a(3, paramOw);
      a(1, 4);
    }
    
    public final void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      i(paramInt2);
      c(paramArrayOfByte, 0, paramInt2);
    }
    
    public final void c(int paramInt1, int paramInt2)
      throws IOException
    {
      a(paramInt1, 0);
      i(paramInt2);
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
        throw new cx.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
    }
    
    public final void e(int paramInt1, int paramInt2)
      throws IOException
    {
      a(paramInt1, 5);
      k(paramInt2);
    }
    
    public final void h(int paramInt)
      throws IOException
    {
      if (paramInt >= 0)
      {
        i(paramInt);
        return;
      }
      a(paramInt);
    }
    
    public final void i(int paramInt)
      throws IOException
    {
      int i = paramInt;
      byte[] arrayOfByte;
      if (cx.c())
      {
        i = paramInt;
        if (a() >= 10) {
          for (;;)
          {
            if ((paramInt & 0xFFFFFF80) == 0)
            {
              arrayOfByte = this.d;
              i = this.g;
              this.g = (i + 1);
              Qy.a(arrayOfByte, i, (byte)paramInt);
              return;
            }
            arrayOfByte = this.d;
            i = this.g;
            this.g = (i + 1);
            Qy.a(arrayOfByte, i, (byte)(paramInt & 0x7F | 0x80));
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
          throw new cx.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
        }
        arrayOfByte = this.d;
        paramInt = this.g;
        this.g = (paramInt + 1);
        arrayOfByte[paramInt] = ((byte)(byte)(i & 0x7F | 0x80));
        i >>>= 7;
      }
    }
    
    public final void k(int paramInt)
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
        arrayOfByte[i] = ((byte)(byte)(paramInt >>> 24));
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new cx.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
    }
  }
  
  public static final class b
    extends IOException
  {
    b(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
    
    b(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */