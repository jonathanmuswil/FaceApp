final class kU$b
  extends kU.a
{
  private static int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while ((paramInt1 < paramInt2) && (paramArrayOfByte[paramInt1] >= 0)) {
      paramInt1++;
    }
    if (paramInt1 >= paramInt2) {
      paramInt1 = 0;
    } else {
      paramInt1 = c(paramArrayOfByte, paramInt1, paramInt2);
    }
    return paramInt1;
  }
  
  private static int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    label207:
    for (;;)
    {
      if (paramInt1 >= paramInt2) {
        return 0;
      }
      int i = paramInt1 + 1;
      int j = paramArrayOfByte[paramInt1];
      paramInt1 = i;
      if (j < 0) {
        if (j < -32)
        {
          if (i >= paramInt2) {
            return j;
          }
          if (j >= -62)
          {
            paramInt1 = i + 1;
            if (paramArrayOfByte[i] <= -65) {}
          }
          else
          {
            return -1;
          }
        }
        else if (j < -16)
        {
          if (i >= paramInt2 - 1) {
            return kU.a(paramArrayOfByte, i, paramInt2);
          }
          int k = i + 1;
          paramInt1 = paramArrayOfByte[i];
          if ((paramInt1 <= -65) && ((j != -32) || (paramInt1 >= -96)) && ((j != -19) || (paramInt1 < -96)))
          {
            paramInt1 = k + 1;
            if (paramArrayOfByte[k] <= -65) {}
          }
          else
          {
            return -1;
          }
        }
        else
        {
          if (i >= paramInt2 - 2) {
            return kU.a(paramArrayOfByte, i, paramInt2);
          }
          paramInt1 = i + 1;
          i = paramArrayOfByte[i];
          if ((i <= -65) && ((j << 28) + (i + 112) >> 30 == 0))
          {
            i = paramInt1 + 1;
            if (paramArrayOfByte[paramInt1] <= -65)
            {
              paramInt1 = i + 1;
              if (paramArrayOfByte[i] <= -65) {
                break label207;
              }
            }
          }
          return -1;
        }
      }
    }
  }
  
  int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    if (paramInt1 != 0)
    {
      if (paramInt2 >= paramInt3) {
        return paramInt1;
      }
      int j = (byte)paramInt1;
      if (j < -32)
      {
        if (j >= -62)
        {
          paramInt1 = paramInt2 + 1;
          if (paramArrayOfByte[paramInt2] <= -65) {
            break label293;
          }
        }
        return -1;
      }
      if (j < -16)
      {
        k = (byte)(paramInt1 >> 8);
        paramInt1 = k;
        i = paramInt2;
        if (k == 0)
        {
          i = paramInt2 + 1;
          paramInt1 = paramArrayOfByte[paramInt2];
          if (i >= paramInt3) {
            return kU.a(j, paramInt1);
          }
        }
        if ((paramInt1 <= -65) && ((j != -32) || (paramInt1 >= -96)) && ((j != -19) || (paramInt1 < -96)))
        {
          paramInt1 = i + 1;
          if (paramArrayOfByte[i] <= -65) {
            break label293;
          }
        }
        return -1;
      }
      i = (byte)(paramInt1 >> 8);
      int m = 0;
      if (i == 0)
      {
        k = paramInt2 + 1;
        int n = paramArrayOfByte[paramInt2];
        i = n;
        paramInt2 = m;
        paramInt1 = k;
        if (k >= paramInt3) {
          return kU.a(j, n);
        }
      }
      else
      {
        k = (byte)(paramInt1 >> 16);
        paramInt1 = paramInt2;
        paramInt2 = k;
      }
      m = paramInt2;
      int k = paramInt1;
      if (paramInt2 == 0)
      {
        k = paramInt1 + 1;
        m = paramArrayOfByte[paramInt1];
        if (k >= paramInt3) {
          return kU.a(j, i, m);
        }
      }
      if ((i <= -65) && ((j << 28) + (i + 112) >> 30 == 0) && (m <= -65))
      {
        i = k + 1;
        if (paramArrayOfByte[k] <= -65) {}
      }
      else
      {
        return -1;
      }
    }
    paramInt1 = i;
    label293:
    return b(paramArrayOfByte, paramInt1, paramInt3);
  }
  
  int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramCharSequence.length();
    int j = paramInt2 + paramInt1;
    int k;
    for (paramInt2 = 0; paramInt2 < i; paramInt2++)
    {
      k = paramInt2 + paramInt1;
      if (k >= j) {
        break;
      }
      m = paramCharSequence.charAt(paramInt2);
      if (m >= 128) {
        break;
      }
      paramArrayOfByte[k] = ((byte)(byte)m);
    }
    if (paramInt2 == i) {
      return paramInt1 + i;
    }
    int m = paramInt1 + paramInt2;
    paramInt1 = paramInt2;
    while (paramInt1 < i)
    {
      int n = paramCharSequence.charAt(paramInt1);
      if ((n < 128) && (m < j))
      {
        paramInt2 = m + 1;
        paramArrayOfByte[m] = ((byte)(byte)n);
      }
      for (;;)
      {
        break;
        if ((n < 2048) && (m <= j - 2))
        {
          k = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(n >>> 6 | 0x3C0));
          paramInt2 = k + 1;
          paramArrayOfByte[k] = ((byte)(byte)(n & 0x3F | 0x80));
        }
        else if (((n < 55296) || (57343 < n)) && (m <= j - 3))
        {
          paramInt2 = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(n >>> 12 | 0x1E0));
          m = paramInt2 + 1;
          paramArrayOfByte[paramInt2] = ((byte)(byte)(n >>> 6 & 0x3F | 0x80));
          paramInt2 = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(n & 0x3F | 0x80));
        }
        else
        {
          if (m > j - 4) {
            break label463;
          }
          paramInt2 = paramInt1 + 1;
          if (paramInt2 == paramCharSequence.length()) {
            break label450;
          }
          char c = paramCharSequence.charAt(paramInt2);
          if (!Character.isSurrogatePair(n, c)) {
            break label447;
          }
          paramInt1 = Character.toCodePoint(n, c);
          k = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(paramInt1 >>> 18 | 0xF0));
          m = k + 1;
          paramArrayOfByte[k] = ((byte)(byte)(paramInt1 >>> 12 & 0x3F | 0x80));
          k = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(paramInt1 >>> 6 & 0x3F | 0x80));
          m = k + 1;
          paramArrayOfByte[k] = ((byte)(byte)(paramInt1 & 0x3F | 0x80));
          paramInt1 = paramInt2;
          paramInt2 = m;
        }
      }
      paramInt1++;
      m = paramInt2;
      continue;
      label447:
      paramInt1 = paramInt2;
      label450:
      throw new kU.c(paramInt1 - 1, i);
      label463:
      if ((55296 <= n) && (n <= 57343))
      {
        paramInt2 = paramInt1 + 1;
        if ((paramInt2 == paramCharSequence.length()) || (!Character.isSurrogatePair(n, paramCharSequence.charAt(paramInt2)))) {
          throw new kU.c(paramInt1, i);
        }
      }
      paramCharSequence = new StringBuilder();
      paramCharSequence.append("Failed writing ");
      paramCharSequence.append(n);
      paramCharSequence.append(" at index ");
      paramCharSequence.append(m);
      throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
    }
    return m;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kU$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */