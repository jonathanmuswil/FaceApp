import java.nio.ByteBuffer;

abstract class au
{
  static void b(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    int i = paramCharSequence.length();
    int j = paramByteBuffer.position();
    k = 0;
    if (k < i)
    {
      m = j;
      n = k;
    }
    for (;;)
    {
      try
      {
        i1 = paramCharSequence.charAt(k);
        if (i1 < 128)
        {
          m = j;
          n = k;
          paramByteBuffer.put(j + k, (byte)i1);
          k++;
          break;
        }
        if (k == i)
        {
          m = j;
          n = k;
          paramByteBuffer.position(j + k);
          return;
        }
        j += k;
        if (k < i)
        {
          m = j;
          n = k;
          i2 = paramCharSequence.charAt(k);
          if (i2 < 128)
          {
            m = j;
            n = k;
            paramByteBuffer.put(j, (byte)i2);
          }
          else if (i2 < 2048)
          {
            m = j + 1;
            b = (byte)(i2 >>> 6 | 0xC0);
            n = m;
            try
            {
              paramByteBuffer.put(j, b);
              n = m;
              paramByteBuffer.put(m, (byte)(i2 & 0x3F | 0x80));
              j = m;
            }
            catch (IndexOutOfBoundsException localIndexOutOfBoundsException1)
            {
              m = n;
              continue;
            }
          }
          else if ((i2 >= 55296) && (57343 >= i2))
          {
            n = k + 1;
            if (n != i) {
              k = j;
            }
          }
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException3)
      {
        int i1;
        int i2;
        byte b;
        char c;
        cu localcu;
        k = n;
        continue;
      }
      try
      {
        c = paramCharSequence.charAt(n);
        k = j;
        if (Character.isSurrogatePair(i2, c))
        {
          k = j;
          int i3 = Character.toCodePoint(i2, c);
          m = j + 1;
          b = (byte)(i3 >>> 18 | 0xF0);
          k = m;
          try
          {
            paramByteBuffer.put(j, b);
            i1 = m + 1;
            b = (byte)(i3 >>> 12 & 0x3F | 0x80);
            k = i1;
            paramByteBuffer.put(m, b);
            j = i1 + 1;
            b = (byte)(i3 >>> 6 & 0x3F | 0x80);
            k = j;
            paramByteBuffer.put(i1, b);
            k = j;
            paramByteBuffer.put(j, (byte)(i3 & 0x3F | 0x80));
            k = n;
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException2)
          {
            continue;
          }
        }
        else
        {
          k = n;
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException4)
      {
        continue;
      }
      m = k;
      k = n;
      continue;
      m = j;
      n = k;
      localcu = new cu;
      m = j;
      n = k;
      localcu.<init>(k, i);
      m = j;
      n = k;
      throw localcu;
      i1 = j + 1;
      b = (byte)(i2 >>> 12 | 0xE0);
      n = i1;
      paramByteBuffer.put(j, b);
      j = i1 + 1;
      b = (byte)(i2 >>> 6 & 0x3F | 0x80);
      m = j;
      n = k;
      paramByteBuffer.put(i1, b);
      m = j;
      n = k;
      paramByteBuffer.put(j, (byte)(i2 & 0x3F | 0x80));
      k++;
      j++;
    }
    int m = j;
    n = k;
    paramByteBuffer.position(j);
    return;
    j = paramByteBuffer.position();
    n = Math.max(k, m - paramByteBuffer.position() + 1);
    c = paramCharSequence.charAt(k);
    paramCharSequence = new StringBuilder(37);
    paramCharSequence.append("Failed writing ");
    paramCharSequence.append(c);
    paramCharSequence.append(" at index ");
    paramCharSequence.append(j + n);
    throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
  }
  
  abstract int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3);
  
  abstract int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  abstract void a(CharSequence paramCharSequence, ByteBuffer paramByteBuffer);
  
  final boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a(0, paramArrayOfByte, paramInt1, paramInt2) == 0;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */