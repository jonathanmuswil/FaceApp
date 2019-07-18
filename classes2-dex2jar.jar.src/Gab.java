import java.io.UnsupportedEncodingException;

final class gab
{
  private static final byte[] a = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private static final byte[] b = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
  
  public static String a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, a);
  }
  
  private static String a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = new byte[(paramArrayOfByte1.length + 2) / 3 * 4];
    int i = paramArrayOfByte1.length - paramArrayOfByte1.length % 3;
    int j = 0;
    int k = 0;
    int m;
    while (j < i)
    {
      m = k + 1;
      arrayOfByte[k] = ((byte)paramArrayOfByte2[((paramArrayOfByte1[j] & 0xFF) >> 2)]);
      k = m + 1;
      int n = paramArrayOfByte1[j];
      int i1 = j + 1;
      arrayOfByte[m] = ((byte)paramArrayOfByte2[((n & 0x3) << 4 | (paramArrayOfByte1[i1] & 0xFF) >> 4)]);
      m = k + 1;
      n = paramArrayOfByte1[i1];
      i1 = j + 2;
      arrayOfByte[k] = ((byte)paramArrayOfByte2[((n & 0xF) << 2 | (paramArrayOfByte1[i1] & 0xFF) >> 6)]);
      k = m + 1;
      arrayOfByte[m] = ((byte)paramArrayOfByte2[(paramArrayOfByte1[i1] & 0x3F)]);
      j += 3;
    }
    j = paramArrayOfByte1.length % 3;
    if (j != 1)
    {
      if (j == 2)
      {
        j = k + 1;
        arrayOfByte[k] = ((byte)paramArrayOfByte2[((paramArrayOfByte1[i] & 0xFF) >> 2)]);
        m = j + 1;
        k = paramArrayOfByte1[i];
        i++;
        arrayOfByte[j] = ((byte)paramArrayOfByte2[((paramArrayOfByte1[i] & 0xFF) >> 4 | (k & 0x3) << 4)]);
        arrayOfByte[m] = ((byte)paramArrayOfByte2[((paramArrayOfByte1[i] & 0xF) << 2)]);
        arrayOfByte[(m + 1)] = ((byte)61);
      }
    }
    else
    {
      j = k + 1;
      arrayOfByte[k] = ((byte)paramArrayOfByte2[((paramArrayOfByte1[i] & 0xFF) >> 2)]);
      k = j + 1;
      arrayOfByte[j] = ((byte)paramArrayOfByte2[((paramArrayOfByte1[i] & 0x3) << 4)]);
      arrayOfByte[k] = ((byte)61);
      arrayOfByte[(k + 1)] = ((byte)61);
    }
    try
    {
      paramArrayOfByte1 = new String(arrayOfByte, "US-ASCII");
      return paramArrayOfByte1;
    }
    catch (UnsupportedEncodingException paramArrayOfByte1)
    {
      throw new AssertionError(paramArrayOfByte1);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */