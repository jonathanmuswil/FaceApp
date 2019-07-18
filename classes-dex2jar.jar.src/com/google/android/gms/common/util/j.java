package com.google.android.gms.common.util;

public class j
{
  private static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  private static final char[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  
  public static String a(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar1 = new char[paramArrayOfByte.length << 1];
    int i = 0;
    int j = 0;
    while (i < paramArrayOfByte.length)
    {
      int k = paramArrayOfByte[i] & 0xFF;
      int m = j + 1;
      char[] arrayOfChar2 = b;
      arrayOfChar1[j] = ((char)arrayOfChar2[(k >>> 4)]);
      j = m + 1;
      arrayOfChar1[m] = ((char)arrayOfChar2[(k & 0xF)]);
      i++;
    }
    return new String(arrayOfChar1);
  }
  
  public static String a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i = paramArrayOfByte.length;
    StringBuilder localStringBuilder = new StringBuilder(i << 1);
    for (int j = 0; (j < i) && ((!paramBoolean) || (j != i - 1) || ((paramArrayOfByte[j] & 0xFF) != 0)); j++)
    {
      localStringBuilder.append(a[((paramArrayOfByte[j] & 0xF0) >>> 4)]);
      localStringBuilder.append(a[(paramArrayOfByte[j] & 0xF)]);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/util/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */