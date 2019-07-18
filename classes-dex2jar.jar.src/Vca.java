import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class vca
  extends wca.a<wca>
{
  vca(wca paramwca, Closeable paramCloseable, boolean paramBoolean, InputStream paramInputStream, OutputStream paramOutputStream)
  {
    super(paramCloseable, paramBoolean);
  }
  
  public wca b()
    throws IOException
  {
    byte[] arrayOfByte = new byte[wca.a(this.e)];
    for (;;)
    {
      int i = this.c.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      this.d.write(arrayOfByte, 0, i);
    }
    return this.e;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */