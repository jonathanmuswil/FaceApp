import java.io.IOException;

final class cx$a
  extends cx
{
  private final byte[] d;
  private final int e;
  private final int f;
  private int g;
  
  cx$a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(null);
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cx$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */