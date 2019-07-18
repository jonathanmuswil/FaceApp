import java.nio.ByteBuffer;

final class ls$b
  extends ls.a
{
  private final ByteBuffer h;
  private int i;
  
  ls$b(ByteBuffer paramByteBuffer)
  {
    super(paramByteBuffer.array(), paramByteBuffer.arrayOffset() + paramByteBuffer.position(), paramByteBuffer.remaining());
    this.h = paramByteBuffer;
    this.i = paramByteBuffer.position();
  }
  
  public final void a()
  {
    this.h.position(this.i + d());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ls$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */