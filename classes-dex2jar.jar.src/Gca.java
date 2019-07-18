public class gca
{
  private final int a;
  private final cca b;
  private final fca c;
  
  public gca(int paramInt, cca paramcca, fca paramfca)
  {
    this.a = paramInt;
    this.b = paramcca;
    this.c = paramfca;
  }
  
  public gca(cca paramcca, fca paramfca)
  {
    this(0, paramcca, paramfca);
  }
  
  public long a()
  {
    return this.b.a(this.a);
  }
  
  public gca b()
  {
    return new gca(this.b, this.c);
  }
  
  public gca c()
  {
    return new gca(this.a + 1, this.b, this.c);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */