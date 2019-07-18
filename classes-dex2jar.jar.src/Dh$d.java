import java.io.IOException;
import java.io.InputStream;

final class Dh$d
  implements Dh.c
{
  private final InputStream a;
  
  Dh$d(InputStream paramInputStream)
  {
    this.a = paramInputStream;
  }
  
  public int a()
    throws IOException
  {
    return this.a.read() << 8 & 0xFF00 | this.a.read() & 0xFF;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt)
    throws IOException
  {
    int i = paramInt;
    while (i > 0)
    {
      int j = this.a.read(paramArrayOfByte, paramInt - i, i);
      if (j == -1) {
        break;
      }
      i -= j;
    }
    return paramInt - i;
  }
  
  public short b()
    throws IOException
  {
    return (short)(this.a.read() & 0xFF);
  }
  
  public int c()
    throws IOException
  {
    return this.a.read();
  }
  
  public long skip(long paramLong)
    throws IOException
  {
    if (paramLong < 0L) {
      return 0L;
    }
    long l1 = paramLong;
    if (l1 > 0L)
    {
      long l2 = this.a.skip(l1);
      if (l2 > 0L) {}
      for (;;)
      {
        l1 -= l2;
        break;
        if (this.a.read() == -1) {
          break label61;
        }
        l2 = 1L;
      }
    }
    label61:
    return paramLong - l1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Dh$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */