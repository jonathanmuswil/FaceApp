import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

public abstract interface kab
  extends Dab, WritableByteChannel
{
  public abstract kab a(String paramString)
    throws IOException;
  
  public abstract kab a(String paramString, Charset paramCharset)
    throws IOException;
  
  public abstract kab a(mab parammab)
    throws IOException;
  
  public abstract kab d(long paramLong)
    throws IOException;
  
  public abstract void flush()
    throws IOException;
  
  public abstract kab g(long paramLong)
    throws IOException;
  
  public abstract jab m();
  
  public abstract kab q()
    throws IOException;
  
  public abstract kab write(byte[] paramArrayOfByte)
    throws IOException;
  
  public abstract kab write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract kab writeByte(int paramInt)
    throws IOException;
  
  public abstract kab writeInt(int paramInt)
    throws IOException;
  
  public abstract kab writeShort(int paramInt)
    throws IOException;
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/kab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */