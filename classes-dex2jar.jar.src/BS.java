import java.util.Arrays;

final class bs
  implements ds
{
  public final byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return Arrays.copyOfRange(paramArrayOfByte, paramInt1, paramInt2 + paramInt1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */