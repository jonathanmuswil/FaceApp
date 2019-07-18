import java.io.IOException;

public class tu
{
  protected volatile int a = -1;
  
  public static final void a(tu paramtu, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      paramArrayOfByte = mu.a(paramArrayOfByte, 0, paramInt2);
      paramtu.a(paramArrayOfByte);
      paramArrayOfByte.a();
      return;
    }
    catch (IOException paramtu)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", paramtu);
    }
  }
  
  public final int a()
  {
    int i = b();
    this.a = i;
    return i;
  }
  
  public void a(mu parammu)
    throws IOException
  {}
  
  protected int b()
  {
    return 0;
  }
  
  public tu c()
    throws CloneNotSupportedException
  {
    return (tu)super.clone();
  }
  
  public String toString()
  {
    return vu.a(this);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */