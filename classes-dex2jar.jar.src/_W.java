public abstract class _w
{
  private int a = 100;
  private int b = Integer.MAX_VALUE;
  private boolean c = false;
  
  static _w a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramArrayOfByte = new bx(paramArrayOfByte, 0, paramInt2, false, null);
    try
    {
      paramArrayOfByte.a(paramInt2);
      return paramArrayOfByte;
    }
    catch (Bx paramArrayOfByte)
    {
      throw new IllegalArgumentException(paramArrayOfByte);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */