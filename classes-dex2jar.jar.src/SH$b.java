import java.nio.ByteBuffer;

final class SH$b
  extends SH.a
{
  private final ByteBuffer h;
  private int i;
  
  SH$b(ByteBuffer paramByteBuffer)
  {
    super(paramByteBuffer.array(), paramByteBuffer.arrayOffset() + paramByteBuffer.position(), paramByteBuffer.remaining());
    this.h = paramByteBuffer;
    this.i = paramByteBuffer.position();
  }
  
  public final void a()
  {
    this.h.position(this.i + e());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/SH$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */