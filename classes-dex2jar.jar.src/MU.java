import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class mu
{
  private final ByteBuffer a;
  private ls b;
  private int c;
  
  private mu(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
    this.a.order(ByteOrder.LITTLE_ENDIAN);
  }
  
  private mu(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this(ByteBuffer.wrap(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public static int a(int paramInt)
  {
    return e(paramInt << 3);
  }
  
  public static int a(int paramInt, long paramLong)
  {
    return a(paramInt) + c(paramLong);
  }
  
  private static int a(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    int j = 0;
    for (int k = 0; (k < i) && (paramCharSequence.charAt(k) < ''); k++) {}
    int m = i;
    for (;;)
    {
      n = m;
      if (k >= i) {
        break label237;
      }
      n = paramCharSequence.charAt(k);
      if (n >= 2048) {
        break;
      }
      m += (127 - n >>> 31);
      k++;
    }
    int i1 = paramCharSequence.length();
    int n = j;
    while (k < i1)
    {
      int i2 = paramCharSequence.charAt(k);
      if (i2 < 2048)
      {
        n += (127 - i2 >>> 31);
        j = k;
      }
      else
      {
        int i3 = n + 2;
        n = i3;
        j = k;
        if (55296 <= i2)
        {
          n = i3;
          j = k;
          if (i2 <= 57343) {
            if (Character.codePointAt(paramCharSequence, k) >= 65536)
            {
              j = k + 1;
              n = i3;
            }
            else
            {
              paramCharSequence = new StringBuilder(39);
              paramCharSequence.append("Unpaired surrogate at index ");
              paramCharSequence.append(k);
              throw new IllegalArgumentException(paramCharSequence.toString());
            }
          }
        }
      }
      k = j + 1;
    }
    n = m + n;
    label237:
    if (n >= i) {
      return n;
    }
    long l = n;
    paramCharSequence = new StringBuilder(54);
    paramCharSequence.append("UTF-8 length does not fit in int: ");
    paramCharSequence.append(l + 4294967296L);
    throw new IllegalArgumentException(paramCharSequence.toString());
  }
  
  public static int a(String paramString)
  {
    int i = a(paramString);
    return e(i) + i;
  }
  
  public static long a(long paramLong)
  {
    return paramLong >> 63 ^ paramLong << 1;
  }
  
  public static mu a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static mu a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new mu(paramArrayOfByte, 0, paramInt2);
  }
  
  private static void a(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    if (!paramByteBuffer.isReadOnly())
    {
      boolean bool = paramByteBuffer.hasArray();
      int i = 0;
      int j = 0;
      char c1;
      if (bool) {
        try
        {
          byte[] arrayOfByte = paramByteBuffer.array();
          i = paramByteBuffer.arrayOffset() + paramByteBuffer.position();
          k = paramByteBuffer.remaining();
          int m = paramCharSequence.length();
          int n = k + i;
          int i1;
          while (j < m)
          {
            k = j + i;
            if (k >= n) {
              break;
            }
            i1 = paramCharSequence.charAt(j);
            if (i1 >= 128) {
              break;
            }
            arrayOfByte[k] = ((byte)(byte)i1);
            j++;
          }
          if (j == m)
          {
            k = i + m;
          }
          else
          {
            i += j;
            int i2;
            for (;;)
            {
              k = i;
              if (j >= m) {
                break label582;
              }
              i2 = paramCharSequence.charAt(j);
              if ((i2 < 128) && (i < n))
              {
                k = i + 1;
                arrayOfByte[i] = ((byte)(byte)i2);
                i = k;
              }
              for (;;)
              {
                break;
                if ((i2 < 2048) && (i <= n - 2))
                {
                  k = i + 1;
                  arrayOfByte[i] = ((byte)(byte)(i2 >>> 6 | 0x3C0));
                  i = k + 1;
                  arrayOfByte[k] = ((byte)(byte)(i2 & 0x3F | 0x80));
                }
                else if (((i2 < 55296) || (57343 < i2)) && (i <= n - 3))
                {
                  k = i + 1;
                  arrayOfByte[i] = ((byte)(byte)(i2 >>> 12 | 0x1E0));
                  i1 = k + 1;
                  arrayOfByte[k] = ((byte)(byte)(i2 >>> 6 & 0x3F | 0x80));
                  i = i1 + 1;
                  arrayOfByte[i1] = ((byte)(byte)(i2 & 0x3F | 0x80));
                }
                else
                {
                  if (i > n - 4) {
                    break label531;
                  }
                  k = j + 1;
                  if (k == paramCharSequence.length()) {
                    break label491;
                  }
                  c1 = paramCharSequence.charAt(k);
                  if (!Character.isSurrogatePair(i2, c1)) {
                    break label487;
                  }
                  j = Character.toCodePoint(i2, c1);
                  i1 = i + 1;
                  arrayOfByte[i] = ((byte)(byte)(j >>> 18 | 0xF0));
                  i = i1 + 1;
                  arrayOfByte[i1] = ((byte)(byte)(j >>> 12 & 0x3F | 0x80));
                  i1 = i + 1;
                  arrayOfByte[i] = ((byte)(byte)(j >>> 6 & 0x3F | 0x80));
                  i = i1 + 1;
                  arrayOfByte[i1] = ((byte)(byte)(j & 0x3F | 0x80));
                  j = k;
                }
              }
              j++;
            }
            label487:
            j = k;
            label491:
            paramByteBuffer = new java/lang/IllegalArgumentException;
            paramCharSequence = new java/lang/StringBuilder;
            paramCharSequence.<init>(39);
            paramCharSequence.append("Unpaired surrogate at index ");
            paramCharSequence.append(j - 1);
            paramByteBuffer.<init>(paramCharSequence.toString());
            throw paramByteBuffer;
            label531:
            paramByteBuffer = new java/lang/ArrayIndexOutOfBoundsException;
            paramCharSequence = new java/lang/StringBuilder;
            paramCharSequence.<init>(37);
            paramCharSequence.append("Failed writing ");
            paramCharSequence.append(i2);
            paramCharSequence.append(" at index ");
            paramCharSequence.append(i);
            paramByteBuffer.<init>(paramCharSequence.toString());
            throw paramByteBuffer;
          }
          label582:
          paramByteBuffer.position(k - paramByteBuffer.arrayOffset());
          return;
        }
        catch (ArrayIndexOutOfBoundsException paramCharSequence)
        {
          paramByteBuffer = new BufferOverflowException();
          paramByteBuffer.initCause(paramCharSequence);
          throw paramByteBuffer;
        }
      }
      int k = paramCharSequence.length();
      label903:
      for (j = i; j < k; j++)
      {
        int i3 = paramCharSequence.charAt(j);
        if (i3 < 128)
        {
          i = i3;
          paramByteBuffer.put((byte)i);
        }
        else
        {
          if (i3 < 2048) {}
          for (i = i3 >>> 6 | 0x3C0;; i = i3 >>> 6 & 0x3F | 0x80)
          {
            paramByteBuffer.put((byte)i);
            i = i3 & 0x3F | 0x80;
            break;
            if ((i3 >= 55296) && (57343 >= i3))
            {
              i = j + 1;
              if (i != paramCharSequence.length())
              {
                c1 = paramCharSequence.charAt(i);
                if (Character.isSurrogatePair(i3, c1))
                {
                  j = Character.toCodePoint(i3, c1);
                  paramByteBuffer.put((byte)(j >>> 18 | 0xF0));
                  paramByteBuffer.put((byte)(j >>> 12 & 0x3F | 0x80));
                  paramByteBuffer.put((byte)(j >>> 6 & 0x3F | 0x80));
                  paramByteBuffer.put((byte)(j & 0x3F | 0x80));
                  j = i;
                  break label903;
                }
                j = i;
              }
              paramCharSequence = new StringBuilder(39);
              paramCharSequence.append("Unpaired surrogate at index ");
              paramCharSequence.append(j - 1);
              throw new IllegalArgumentException(paramCharSequence.toString());
            }
            paramByteBuffer.put((byte)(i3 >>> 12 | 0x1E0));
          }
        }
      }
      return;
    }
    throw new ReadOnlyBufferException();
  }
  
  public static int b(int paramInt)
  {
    if (paramInt >= 0) {
      return e(paramInt);
    }
    return 10;
  }
  
  public static int b(int paramInt, String paramString)
  {
    return a(paramInt) + a(paramString);
  }
  
  public static int b(int paramInt, tu paramtu)
  {
    paramInt = a(paramInt);
    int i = paramtu.a();
    return paramInt + (e(i) + i);
  }
  
  public static int b(int paramInt, byte[] paramArrayOfByte)
  {
    return a(paramInt) + b(paramArrayOfByte);
  }
  
  public static int b(byte[] paramArrayOfByte)
  {
    return e(paramArrayOfByte.length) + paramArrayOfByte.length;
  }
  
  public static int c(long paramLong)
  {
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      return 1;
    }
    if ((0xFFFFFFFFFFFFC000 & paramLong) == 0L) {
      return 2;
    }
    if ((0xFFFFFFFFFFE00000 & paramLong) == 0L) {
      return 3;
    }
    if ((0xFFFFFFFFF0000000 & paramLong) == 0L) {
      return 4;
    }
    if ((0xFFFFFFF800000000 & paramLong) == 0L) {
      return 5;
    }
    if ((0xFFFFFC0000000000 & paramLong) == 0L) {
      return 6;
    }
    if ((0xFFFE000000000000 & paramLong) == 0L) {
      return 7;
    }
    if ((0xFF00000000000000 & paramLong) == 0L) {
      return 8;
    }
    if ((paramLong & 0x8000000000000000) == 0L) {
      return 9;
    }
    return 10;
  }
  
  private final void c(int paramInt)
    throws IOException
  {
    byte b1 = (byte)paramInt;
    if (this.a.hasRemaining())
    {
      this.a.put(b1);
      return;
    }
    throw new nu(this.a.position(), this.a.limit());
  }
  
  private final void d(int paramInt)
    throws IOException
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        c(paramInt);
        return;
      }
      c(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
  }
  
  private static int e(int paramInt)
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
  
  public final void a()
  {
    if (this.a.remaining() == 0) {
      return;
    }
    throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[] { Integer.valueOf(this.a.remaining()) }));
  }
  
  public final void a(int paramInt1, int paramInt2)
    throws IOException
  {
    d(paramInt1 << 3 | paramInt2);
  }
  
  public final void a(int paramInt, it paramit)
    throws IOException
  {
    if (this.b == null) {
      this.b = ls.a(this.a);
    }
    for (;;)
    {
      this.c = this.a.position();
      break;
      if (this.c == this.a.position()) {
        break;
      }
      this.b.b(this.a.array(), this.c, this.a.position() - this.c);
    }
    ls localls = this.b;
    localls.a(paramInt, paramit);
    localls.a();
    this.c = this.a.position();
  }
  
  public final void a(int paramInt, String paramString)
    throws IOException
  {
    a(paramInt, 2);
    try
    {
      int i = e(paramString.length());
      if (i == e(paramString.length() * 3))
      {
        int j = this.a.position();
        if (this.a.remaining() >= i)
        {
          this.a.position(j + i);
          a(paramString, this.a);
          paramInt = this.a.position();
          this.a.position(j);
          d(paramInt - j - i);
          this.a.position(paramInt);
          return;
        }
        paramString = new nu;
        paramString.<init>(j + i, this.a.limit());
        throw paramString;
      }
      d(a(paramString));
      a(paramString, this.a);
      return;
    }
    catch (BufferOverflowException paramString)
    {
      nu localnu = new nu(this.a.position(), this.a.limit());
      localnu.initCause(paramString);
      throw localnu;
    }
  }
  
  public final void a(int paramInt, tu paramtu)
    throws IOException
  {
    a(paramInt, 2);
    if (paramtu.a < 0) {
      paramtu.a();
    }
    d(paramtu.a);
    paramtu.a(this);
  }
  
  public final void a(int paramInt, boolean paramBoolean)
    throws IOException
  {
    a(25, 0);
    byte b1 = (byte)paramBoolean;
    if (this.a.hasRemaining())
    {
      this.a.put(b1);
      return;
    }
    throw new nu(this.a.position(), this.a.limit());
  }
  
  public final void a(int paramInt, byte[] paramArrayOfByte)
    throws IOException
  {
    a(paramInt, 2);
    d(paramArrayOfByte.length);
    paramInt = paramArrayOfByte.length;
    if (this.a.remaining() >= paramInt)
    {
      this.a.put(paramArrayOfByte, 0, paramInt);
      return;
    }
    throw new nu(this.a.position(), this.a.limit());
  }
  
  public final void b(int paramInt1, int paramInt2)
    throws IOException
  {
    a(paramInt1, 0);
    if (paramInt2 >= 0)
    {
      d(paramInt2);
      return;
    }
    b(paramInt2);
  }
  
  public final void b(int paramInt, long paramLong)
    throws IOException
  {
    a(paramInt, 0);
    b(paramLong);
  }
  
  public final void b(long paramLong)
    throws IOException
  {
    for (;;)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      {
        c((int)paramLong);
        return;
      }
      c((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */