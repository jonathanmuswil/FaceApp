import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class Dh$a
  implements Dh.c
{
  private final ByteBuffer a;
  
  Dh$a(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
    paramByteBuffer.order(ByteOrder.BIG_ENDIAN);
  }
  
  public int a()
  {
    return c() << 8 & 0xFF00 | c() & 0xFF;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt)
  {
    paramInt = Math.min(paramInt, this.a.remaining());
    if (paramInt == 0) {
      return -1;
    }
    this.a.get(paramArrayOfByte, 0, paramInt);
    return paramInt;
  }
  
  public short b()
  {
    return (short)(c() & 0xFF);
  }
  
  public int c()
  {
    if (this.a.remaining() < 1) {
      return -1;
    }
    return this.a.get();
  }
  
  public long skip(long paramLong)
  {
    int i = (int)Math.min(this.a.remaining(), paramLong);
    ByteBuffer localByteBuffer = this.a;
    localByteBuffer.position(localByteBuffer.position() + i);
    return i;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Dh$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */