import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

class Cj$a
  extends InputStream
{
  private final ByteBuffer a;
  private int b = -1;
  
  Cj$a(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
  }
  
  public int available()
  {
    return this.a.remaining();
  }
  
  public void mark(int paramInt)
  {
    try
    {
      this.b = this.a.position();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean markSupported()
  {
    return true;
  }
  
  public int read()
  {
    if (!this.a.hasRemaining()) {
      return -1;
    }
    return this.a.get();
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (!this.a.hasRemaining()) {
      return -1;
    }
    paramInt2 = Math.min(paramInt2, available());
    this.a.get(paramArrayOfByte, paramInt1, paramInt2);
    return paramInt2;
  }
  
  public void reset()
    throws IOException
  {
    try
    {
      if (this.b != -1)
      {
        this.a.position(this.b);
        return;
      }
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("Cannot reset to unset mark position");
      throw localIOException;
    }
    finally {}
  }
  
  public long skip(long paramLong)
    throws IOException
  {
    if (!this.a.hasRemaining()) {
      return -1L;
    }
    paramLong = Math.min(paramLong, available());
    ByteBuffer localByteBuffer = this.a;
    localByteBuffer.position((int)(localByteBuffer.position() + paramLong));
    return paramLong;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Cj$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */