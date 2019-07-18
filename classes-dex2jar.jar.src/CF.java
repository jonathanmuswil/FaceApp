import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class cf
  extends FilterInputStream
{
  private static final byte[] a = { -1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0 };
  private static final int b = a.length;
  private static final int c = b + 2;
  private final byte d;
  private int e;
  
  public cf(InputStream paramInputStream, int paramInt)
  {
    super(paramInputStream);
    if ((paramInt >= -1) && (paramInt <= 8))
    {
      this.d = ((byte)(byte)paramInt);
      return;
    }
    paramInputStream = new StringBuilder();
    paramInputStream.append("Cannot add invalid orientation: ");
    paramInputStream.append(paramInt);
    throw new IllegalArgumentException(paramInputStream.toString());
  }
  
  public void mark(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean markSupported()
  {
    return false;
  }
  
  public int read()
    throws IOException
  {
    int i = this.e;
    if (i >= 2)
    {
      j = c;
      if (i <= j)
      {
        if (i == j)
        {
          j = this.d;
          break label55;
        }
        j = a[(i - 2)] & 0xFF;
        break label55;
      }
    }
    int j = super.read();
    label55:
    if (j != -1) {
      this.e += 1;
    }
    return j;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    int i = this.e;
    int j = c;
    if (i > j)
    {
      paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    }
    else if (i == j)
    {
      paramArrayOfByte[paramInt1] = ((byte)this.d);
      paramInt1 = 1;
    }
    else if (i < 2)
    {
      paramInt1 = super.read(paramArrayOfByte, paramInt1, 2 - i);
    }
    else
    {
      paramInt2 = Math.min(j - i, paramInt2);
      System.arraycopy(a, this.e - 2, paramArrayOfByte, paramInt1, paramInt2);
      paramInt1 = paramInt2;
    }
    if (paramInt1 > 0) {
      this.e += paramInt1;
    }
    return paramInt1;
  }
  
  public void reset()
    throws IOException
  {
    throw new UnsupportedOperationException();
  }
  
  public long skip(long paramLong)
    throws IOException
  {
    paramLong = super.skip(paramLong);
    if (paramLong > 0L) {
      this.e = ((int)(this.e + paramLong));
    }
    return paramLong;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */