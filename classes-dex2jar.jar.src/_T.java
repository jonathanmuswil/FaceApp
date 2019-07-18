import java.nio.ByteBuffer;

final class _t
{
  private static final au a;
  
  static
  {
    int i;
    if ((Yt.b()) && (Yt.c())) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject;
    if (i != 0) {
      localObject = new du();
    } else {
      localObject = new bu();
    }
    a = (au)localObject;
  }
  
  static int a(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    int j = 0;
    for (int k = 0; (k < i) && (paramCharSequence.charAt(k) < ''); k++) {}
    int m = i;
    for (;;)
    {
      n = m;
      if (k >= i) {
        break label213;
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
              throw new cu(k, i1);
            }
          }
        }
      }
      k = j + 1;
    }
    n = m + n;
    label213:
    if (n >= i) {
      return n;
    }
    long l = n;
    paramCharSequence = new StringBuilder(54);
    paramCharSequence.append("UTF-8 length does not fit in int: ");
    paramCharSequence.append(l + 4294967296L);
    throw new IllegalArgumentException(paramCharSequence.toString());
  }
  
  static int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a.a(paramCharSequence, paramArrayOfByte, paramInt1, paramInt2);
  }
  
  static void a(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    au localau = a;
    if (paramByteBuffer.hasArray())
    {
      int i = paramByteBuffer.arrayOffset();
      paramByteBuffer.position(a(paramCharSequence, paramByteBuffer.array(), paramByteBuffer.position() + i, paramByteBuffer.remaining()) - i);
      return;
    }
    if (paramByteBuffer.isDirect())
    {
      localau.a(paramCharSequence, paramByteBuffer);
      return;
    }
    au.b(paramCharSequence, paramByteBuffer);
  }
  
  public static boolean a(byte[] paramArrayOfByte)
  {
    return a.a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a.a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private static int b(int paramInt)
  {
    int i = paramInt;
    if (paramInt > -12) {
      i = -1;
    }
    return i;
  }
  
  private static int b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= -12) && (paramInt2 <= -65)) {
      return paramInt1 ^ paramInt2 << 8;
    }
    return -1;
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 <= -12) && (paramInt2 <= -65) && (paramInt3 <= -65)) {
      return paramInt1 ^ paramInt2 << 8 ^ paramInt3 << 16;
    }
    return -1;
  }
  
  private static int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte[(paramInt1 - 1)];
    paramInt2 -= paramInt1;
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2) {
          return b(i, paramArrayOfByte[paramInt1], paramArrayOfByte[(paramInt1 + 1)]);
        }
        throw new AssertionError();
      }
      return b(i, paramArrayOfByte[paramInt1]);
    }
    return b(i);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */