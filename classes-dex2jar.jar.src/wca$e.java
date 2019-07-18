import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class wca$e
  extends BufferedOutputStream
{
  private final CharsetEncoder a;
  
  public wca$e(OutputStream paramOutputStream, String paramString, int paramInt)
  {
    super(paramOutputStream, paramInt);
    this.a = Charset.forName(wca.a(paramString)).newEncoder();
  }
  
  public e b(String paramString)
    throws IOException
  {
    paramString = this.a.encode(CharBuffer.wrap(paramString));
    super.write(paramString.array(), 0, paramString.limit());
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wca$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */