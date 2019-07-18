final class kU$d
  extends kU.a
{
  private static int a(byte[] paramArrayOfByte, int paramInt1, long paramLong, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2) {
          return kU.a(paramInt1, jU.a(paramArrayOfByte, paramLong), jU.a(paramArrayOfByte, paramLong + 1L));
        }
        throw new AssertionError();
      }
      return kU.a(paramInt1, jU.a(paramArrayOfByte, paramLong));
    }
    return kU.a(paramInt1);
  }
  
  private static int a(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    int i = b(paramArrayOfByte, paramLong, paramInt);
    paramInt -= i;
    paramLong += i;
    int j = 0;
    i = paramInt;
    paramInt = j;
    long l1;
    for (;;)
    {
      l1 = paramLong;
      if (i <= 0) {
        break;
      }
      l1 = paramLong + 1L;
      paramInt = jU.a(paramArrayOfByte, paramLong);
      if (paramInt < 0) {
        break;
      }
      i--;
      paramLong = l1;
    }
    if (i == 0) {
      return 0;
    }
    i--;
    if (paramInt < -32)
    {
      if (i == 0) {
        return paramInt;
      }
      i--;
      if (paramInt >= -62)
      {
        paramLong = 1L + l1;
        paramInt = i;
        if (jU.a(paramArrayOfByte, l1) > -65) {}
      }
    }
    label210:
    label212:
    do
    {
      long l2;
      do
      {
        break;
        return -1;
        if (paramInt >= -16) {
          break label212;
        }
        if (i < 2) {
          return a(paramArrayOfByte, paramInt, l1, i);
        }
        i -= 2;
        l2 = l1 + 1L;
        j = jU.a(paramArrayOfByte, l1);
        if ((j > -65) || ((paramInt == -32) && (j < -96)) || ((paramInt == -19) && (j >= -96))) {
          break label210;
        }
        paramLong = 1L + l2;
        paramInt = i;
      } while (jU.a(paramArrayOfByte, l2) <= -65);
      return -1;
      if (i < 3) {
        return a(paramArrayOfByte, paramInt, l1, i);
      }
      i -= 3;
      paramLong = l1 + 1L;
      j = jU.a(paramArrayOfByte, l1);
      if ((j > -65) || ((paramInt << 28) + (j + 112) >> 30 != 0)) {
        break label301;
      }
      l1 = paramLong + 1L;
      if (jU.a(paramArrayOfByte, paramLong) > -65) {
        break label301;
      }
      paramLong = 1L + l1;
      paramInt = i;
    } while (jU.a(paramArrayOfByte, l1) <= -65);
    label301:
    return -1;
  }
  
  static boolean a()
  {
    boolean bool;
    if ((jU.b()) && (jU.c())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static int b(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    if (paramInt < 16) {
      return 0;
    }
    int i = (int)paramLong & 0x7;
    int j = i;
    while (j > 0)
    {
      if (jU.a(paramArrayOfByte, paramLong) < 0) {
        return i - j;
      }
      j--;
      paramLong = 1L + paramLong;
    }
    for (j = paramInt - i; (j >= 8) && ((jU.b(paramArrayOfByte, paramLong) & 0x8080808080808080) == 0L); j -= 8) {
      paramLong += 8L;
    }
    return paramInt - j;
  }
  
  int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = paramArrayOfByte.length;
    int j = 0;
    if ((paramInt2 | paramInt3 | i - paramInt3) >= 0)
    {
      long l1 = jU.a() + paramInt2;
      long l2 = jU.a() + paramInt3;
      long l3;
      if (paramInt1 != 0)
      {
        if (l1 >= l2) {
          return paramInt1;
        }
        i = (byte)paramInt1;
        if (i < -32)
        {
          if (i >= -62)
          {
            l3 = l1 + 1L;
            if (jU.a(paramArrayOfByte, l1) <= -65) {}
          }
          else
          {
            return -1;
          }
        }
        else
        {
          long l4;
          if (i < -16)
          {
            paramInt2 = (byte)(paramInt1 >> 8);
            l4 = l1;
            paramInt1 = paramInt2;
            if (paramInt2 == 0)
            {
              l4 = l1 + 1L;
              paramInt1 = jU.a(paramArrayOfByte, l1);
              if (l4 >= l2) {
                return kU.a(i, paramInt1);
              }
            }
            if ((paramInt1 <= -65) && ((i != -32) || (paramInt1 >= -96)) && ((i != -19) || (paramInt1 < -96)))
            {
              l3 = l4 + 1L;
              if (jU.a(paramArrayOfByte, l4) <= -65) {}
            }
            else
            {
              return -1;
            }
          }
          else
          {
            paramInt2 = (byte)(paramInt1 >> 8);
            if (paramInt2 == 0)
            {
              l3 = l1 + 1L;
              paramInt2 = jU.a(paramArrayOfByte, l1);
              if (l3 >= l2) {
                return kU.a(i, paramInt2);
              }
              l1 = l3;
              paramInt1 = j;
            }
            else
            {
              paramInt1 = (byte)(paramInt1 >> 16);
            }
            paramInt3 = paramInt1;
            l4 = l1;
            if (paramInt1 == 0)
            {
              l4 = l1 + 1L;
              paramInt3 = jU.a(paramArrayOfByte, l1);
              if (l4 >= l2) {
                return kU.a(i, paramInt2, paramInt3);
              }
            }
            if ((paramInt2 <= -65) && ((i << 28) + (paramInt2 + 112) >> 30 == 0) && (paramInt3 <= -65))
            {
              l3 = l4 + 1L;
              if (jU.a(paramArrayOfByte, l4) <= -65) {}
            }
            else
            {
              return -1;
            }
          }
        }
      }
      else
      {
        l3 = l1;
      }
      return a(paramArrayOfByte, l3, (int)(l2 - l3));
    }
    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
  }
  
  int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l1 = jU.a() + paramInt1;
    long l2 = paramInt2 + l1;
    int i = paramCharSequence.length();
    if ((i <= paramInt2) && (paramArrayOfByte.length - paramInt2 >= paramInt1))
    {
      paramInt2 = 0;
      long l3;
      for (;;)
      {
        l3 = 1L;
        if (paramInt2 >= i) {
          break;
        }
        paramInt1 = paramCharSequence.charAt(paramInt2);
        if (paramInt1 >= 128) {
          break;
        }
        jU.a(paramArrayOfByte, l1, (byte)paramInt1);
        paramInt2++;
        l1 = 1L + l1;
      }
      paramInt1 = paramInt2;
      long l4 = l1;
      if (paramInt2 == i) {
        l3 = jU.a();
      }
      for (;;)
      {
        return (int)(l1 - l3);
        while (paramInt1 < i)
        {
          int j = paramCharSequence.charAt(paramInt1);
          if ((j < 128) && (l4 < l2))
          {
            jU.a(paramArrayOfByte, l4, (byte)j);
            long l5 = l3;
            l1 = l4 + l3;
            l3 = l5;
          }
          for (;;)
          {
            break;
            if ((j < 2048) && (l4 <= l2 - 2L))
            {
              l1 = l4 + l3;
              jU.a(paramArrayOfByte, l4, (byte)(j >>> 6 | 0x3C0));
              jU.a(paramArrayOfByte, l1, (byte)(j & 0x3F | 0x80));
              l1 += l3;
            }
            else if (((j < 55296) || (57343 < j)) && (l4 <= l2 - 3L))
            {
              l1 = l4 + l3;
              jU.a(paramArrayOfByte, l4, (byte)(j >>> 12 | 0x1E0));
              l3 = l1 + l3;
              jU.a(paramArrayOfByte, l1, (byte)(j >>> 6 & 0x3F | 0x80));
              jU.a(paramArrayOfByte, l3, (byte)(j & 0x3F | 0x80));
              l1 = l3 + 1L;
              l3 = 1L;
            }
            else
            {
              if (l4 > l2 - 4L) {
                break label519;
              }
              paramInt2 = paramInt1 + 1;
              if (paramInt2 == i) {
                break label506;
              }
              char c = paramCharSequence.charAt(paramInt2);
              if (!Character.isSurrogatePair(j, c)) {
                break label503;
              }
              paramInt1 = Character.toCodePoint(j, c);
              l3 = l4 + 1L;
              jU.a(paramArrayOfByte, l4, (byte)(paramInt1 >>> 18 | 0xF0));
              l1 = l3 + 1L;
              jU.a(paramArrayOfByte, l3, (byte)(paramInt1 >>> 12 & 0x3F | 0x80));
              l4 = l1 + 1L;
              jU.a(paramArrayOfByte, l1, (byte)(paramInt1 >>> 6 & 0x3F | 0x80));
              l3 = 1L;
              l1 = l4 + 1L;
              jU.a(paramArrayOfByte, l4, (byte)(paramInt1 & 0x3F | 0x80));
              paramInt1 = paramInt2;
            }
          }
          paramInt1++;
          l4 = l1;
          continue;
          label503:
          paramInt1 = paramInt2;
          label506:
          throw new kU.c(paramInt1 - 1, i);
          label519:
          if ((55296 <= j) && (j <= 57343))
          {
            paramInt2 = paramInt1 + 1;
            if ((paramInt2 == i) || (!Character.isSurrogatePair(j, paramCharSequence.charAt(paramInt2)))) {
              throw new kU.c(paramInt1, i);
            }
          }
          paramCharSequence = new StringBuilder();
          paramCharSequence.append("Failed writing ");
          paramCharSequence.append(j);
          paramCharSequence.append(" at index ");
          paramCharSequence.append(l4);
          throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
        }
        l3 = jU.a();
        l1 = l4;
      }
    }
    paramArrayOfByte = new StringBuilder();
    paramArrayOfByte.append("Failed writing ");
    paramArrayOfByte.append(paramCharSequence.charAt(i - 1));
    paramArrayOfByte.append(" at index ");
    paramArrayOfByte.append(paramInt1 + paramInt2);
    throw new ArrayIndexOutOfBoundsException(paramArrayOfByte.toString());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kU$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */