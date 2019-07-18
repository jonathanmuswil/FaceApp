import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

public abstract interface lab
  extends Eab, ReadableByteChannel
{
  public abstract int a(wab paramwab)
    throws IOException;
  
  public abstract long a(byte paramByte)
    throws IOException;
  
  public abstract long a(Dab paramDab)
    throws IOException;
  
  public abstract boolean a(long paramLong)
    throws IOException;
  
  public abstract mab b(long paramLong)
    throws IOException;
  
  public abstract String c(long paramLong)
    throws IOException;
  
  public abstract byte[] e(long paramLong)
    throws IOException;
  
  public abstract void f(long paramLong)
    throws IOException;
  
  public abstract jab getBuffer();
  
  @Deprecated
  public abstract jab m();
  
  public abstract byte[] o()
    throws IOException;
  
  public abstract boolean p()
    throws IOException;
  
  public abstract String r()
    throws IOException;
  
  public abstract byte readByte()
    throws IOException;
  
  public abstract void readFully(byte[] paramArrayOfByte)
    throws IOException;
  
  public abstract int readInt()
    throws IOException;
  
  public abstract short readShort()
    throws IOException;
  
  public abstract int s()
    throws IOException;
  
  public abstract void skip(long paramLong)
    throws IOException;
  
  public abstract short t()
    throws IOException;
  
  public abstract long u()
    throws IOException;
  
  public abstract InputStream v();
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */