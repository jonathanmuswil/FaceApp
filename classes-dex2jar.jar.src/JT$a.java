import java.io.IOException;

class JT$a
  extends JT
{
  private final byte[] d;
  private final int e;
  private final int f;
  private int g;
  
  JT$a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
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
      throw new JT.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void a(long paramLong)
    throws IOException
  {
    long l = paramLong;
    if (JT.a())
    {
      l = paramLong;
      if (d() >= 10) {
        for (l = JT.b() + this.g;; l = 1L + l)
        {
          if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
          {
            jU.a(this.d, l, (byte)(int)paramLong);
            this.g += 1;
            return;
          }
          jU.a(this.d, l, (byte)((int)paramLong & 0x7F | 0x80));
          this.g += 1;
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
        byte[] arrayOfByte;
        int i;
        throw new JT.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
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
    c(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void b(int paramInt, GT paramGT)
    throws IOException
  {
    j(paramInt, 2);
    b(paramGT);
  }
  
  public final void b(int paramInt, VT paramVT)
    throws IOException
  {
    j(paramInt, 2);
    b(paramVT);
  }
  
  public final void b(int paramInt, String paramString)
    throws IOException
  {
    j(paramInt, 2);
    b(paramString);
  }
  
  public final void b(int paramInt, boolean paramBoolean)
    throws IOException
  {
    j(paramInt, 0);
    a((byte)paramBoolean);
  }
  
  public final void b(GT paramGT)
    throws IOException
  {
    h(paramGT.size());
    paramGT.a(this);
  }
  
  public final void b(VT paramVT)
    throws IOException
  {
    h(paramVT.d());
    paramVT.a(this);
  }
  
  public final void b(String paramString)
    throws IOException
  {
    int i = this.g;
    try
    {
      int j = JT.f(paramString.length() * 3);
      int k = JT.f(paramString.length());
      if (k == j)
      {
        this.g = (i + k);
        j = kU.a(paramString, this.d, this.g, d());
        this.g = i;
        h(j - i - k);
        this.g = j;
      }
      else
      {
        h(kU.a(paramString));
        this.g = kU.a(paramString, this.d, this.g, d());
      }
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new JT.b(paramString);
    }
    catch (kU.c localc)
    {
      this.g = i;
      a(paramString, localc);
    }
  }
  
  public final void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
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
      throw new JT.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(paramInt2) }), paramArrayOfByte);
    }
  }
  
  public final int d()
  {
    return this.f - this.g;
  }
  
  public final void f(int paramInt1, int paramInt2)
    throws IOException
  {
    j(paramInt1, 5);
    i(paramInt2);
  }
  
  public final void g(int paramInt1, int paramInt2)
    throws IOException
  {
    j(paramInt1, 0);
    j(paramInt2);
  }
  
  public final void h(int paramInt)
    throws IOException
  {
    int i = paramInt;
    if (JT.a())
    {
      i = paramInt;
      if (d() >= 10) {
        for (long l = JT.b() + this.g;; l = 1L + l)
        {
          if ((paramInt & 0xFFFFFF80) == 0)
          {
            jU.a(this.d, l, (byte)paramInt);
            this.g += 1;
            return;
          }
          jU.a(this.d, l, (byte)(paramInt & 0x7F | 0x80));
          this.g += 1;
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
        byte[] arrayOfByte;
        throw new JT.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
      arrayOfByte = this.d;
      paramInt = this.g;
      this.g = (paramInt + 1);
      arrayOfByte[paramInt] = ((byte)(byte)(i & 0x7F | 0x80));
      i >>>= 7;
    }
  }
  
  public final void i(int paramInt)
    throws IOException
  {
    try
    {
      byte[] arrayOfByte = this.d;
      int i = this.g;
      this.g = (i + 1);
      arrayOfByte[i] = ((byte)(byte)(paramInt & 0xFF));
      arrayOfByte = this.d;
      i = this.g;
      this.g = (i + 1);
      arrayOfByte[i] = ((byte)(byte)(paramInt >> 8 & 0xFF));
      arrayOfByte = this.d;
      i = this.g;
      this.g = (i + 1);
      arrayOfByte[i] = ((byte)(byte)(paramInt >> 16 & 0xFF));
      arrayOfByte = this.d;
      i = this.g;
      this.g = (i + 1);
      arrayOfByte[i] = ((byte)(byte)(paramInt >> 24 & 0xFF));
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new JT.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void i(int paramInt1, int paramInt2)
    throws IOException
  {
    j(paramInt1, 0);
    h(paramInt2);
  }
  
  public final void j(int paramInt)
    throws IOException
  {
    if (paramInt >= 0) {
      h(paramInt);
    } else {
      a(paramInt);
    }
  }
  
  public final void j(int paramInt1, int paramInt2)
    throws IOException
  {
    h(qU.a(paramInt1, paramInt2));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/JT$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */