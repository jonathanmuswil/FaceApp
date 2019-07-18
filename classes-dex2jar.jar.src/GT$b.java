import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

final class GT$b
  extends GT.f
{
  private final int e;
  private final int f;
  
  GT$b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    GT.a(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
    throws IOException
  {
    throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
  }
  
  protected void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.d, p() + paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public byte p(int paramInt)
  {
    GT.a(paramInt, size());
    return this.d[(this.e + paramInt)];
  }
  
  protected int p()
  {
    return this.e;
  }
  
  public int size()
  {
    return this.f;
  }
  
  Object writeReplace()
  {
    return GT.a(o());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/GT$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */