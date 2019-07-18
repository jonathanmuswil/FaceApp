public abstract class is
{
  private int a = 100;
  private int b = Integer.MAX_VALUE;
  private boolean c = false;
  
  public static int a(int paramInt)
  {
    return -(paramInt & 0x1) ^ paramInt >>> 1;
  }
  
  public static long a(long paramLong)
  {
    return -(paramLong & 1L) ^ paramLong >>> 1;
  }
  
  static is a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramArrayOfByte = new ks(paramArrayOfByte, 0, paramInt2, false, null);
    try
    {
      paramArrayOfByte.b(paramInt2);
      return paramArrayOfByte;
    }
    catch (Ks paramArrayOfByte)
    {
      throw new IllegalArgumentException(paramArrayOfByte);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/is.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */