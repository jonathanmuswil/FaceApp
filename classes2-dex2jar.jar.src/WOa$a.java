import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class WOa$a
  implements WOa.c
{
  private final byte[] a;
  
  public WOa$a(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  public InputStream a()
  {
    return new ByteArrayInputStream(this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WOa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */