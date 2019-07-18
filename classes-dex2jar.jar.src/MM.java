import java.io.IOException;
import java.io.InputStream;

class mm
  implements Fba.c
{
  mm(nm paramnm, byte[] paramArrayOfByte, int[] paramArrayOfInt) {}
  
  public void a(InputStream paramInputStream, int paramInt)
    throws IOException
  {
    try
    {
      paramInputStream.read(this.a, this.b[0], paramInt);
      int[] arrayOfInt = this.b;
      arrayOfInt[0] += paramInt;
      return;
    }
    finally
    {
      paramInputStream.close();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */