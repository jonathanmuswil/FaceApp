public class eca
  implements cca
{
  private final long a;
  private final int b;
  
  public eca(long paramLong, int paramInt)
  {
    this.a = paramLong;
    this.b = paramInt;
  }
  
  public long a(int paramInt)
  {
    return (this.a * Math.pow(this.b, paramInt));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/eca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */