import java.io.IOException;

class XL$a
  extends XL
{
  private final byte[] d;
  private final int e;
  private final int f;
  private int g;
  
  XL$a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(null);
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
      throw new XL.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
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
    yL localyL = (yL)paramWM;
    int i = localyL.f();
    paramInt = i;
    if (i == -1)
    {
      paramInt = paramkN.e(localyL);
      localyL.a(paramInt);
    }
    b(paramInt);
    paramkN.a(paramWM, this.c);
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
    if (XL.d())
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
            IN.a(arrayOfByte, i, (byte)(int)paramLong);
            return;
          }
          arrayOfByte = this.d;
          i = this.g;
          this.g = (i + 1);
          IN.a(arrayOfByte, i, (byte)((int)paramLong & 0x7F | 0x80));
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
        throw new XL.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
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
    if (XL.d())
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
            IN.a(arrayOfByte, i, (byte)paramInt);
            return;
          }
          arrayOfByte = this.d;
          i = this.g;
          this.g = (i + 1);
          IN.a(arrayOfByte, i, (byte)(paramInt & 0x7F | 0x80));
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
        throw new XL.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
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
  
  public final void b(String paramString)
    throws IOException
  {
    int i = this.g;
    try
    {
      int j = XL.g(paramString.length() * 3);
      int k = XL.g(paramString.length());
      if (k == j)
      {
        this.g = (i + k);
        j = KN.a(paramString, this.d, this.g, b());
        this.g = i;
        b(j - i - k);
        this.g = j;
        return;
      }
      b(KN.a(paramString));
      this.g = KN.a(paramString, this.d, this.g, b());
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new XL.c(paramString);
    }
    catch (ON localON)
    {
      this.g = i;
      a(paramString, localON);
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
      throw new XL.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(paramInt2) }), paramArrayOfByte);
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
      throw new XL.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
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
      throw new XL.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final int e()
  {
    return this.g - this.e;
  }
  
  public final void e(int paramInt1, int paramInt2)
    throws IOException
  {
    a(paramInt1, 5);
    d(paramInt2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/XL$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */