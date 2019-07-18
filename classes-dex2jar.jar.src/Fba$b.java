import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

final class Fba$b
  extends InputStream
{
  private int a;
  private int b;
  
  private Fba$b(Fba paramFba, Fba.a parama)
  {
    this.a = Fba.a(paramFba, parama.b + 4);
    this.b = parama.c;
  }
  
  public int read()
    throws IOException
  {
    if (this.b == 0) {
      return -1;
    }
    Fba.a(this.c).seek(this.a);
    int i = Fba.a(this.c).read();
    this.a = Fba.a(this.c, this.a + 1);
    this.b -= 1;
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    Fba.a(paramArrayOfByte, "buffer");
    if (((paramInt1 | paramInt2) >= 0) && (paramInt2 <= paramArrayOfByte.length - paramInt1))
    {
      int i = this.b;
      if (i > 0)
      {
        int j = paramInt2;
        if (paramInt2 > i) {
          j = i;
        }
        Fba.a(this.c, this.a, paramArrayOfByte, paramInt1, j);
        this.a = Fba.a(this.c, this.a + j);
        this.b -= j;
        return j;
      }
      return -1;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Fba$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */