final class es
{
  private final ls a;
  private final byte[] b;
  
  private es(int paramInt)
  {
    this.b = new byte[paramInt];
    this.a = ls.a(this.b);
  }
  
  public final _r a()
  {
    if (this.a.b() == 0) {
      return new gs(this.b);
    }
    throw new IllegalStateException("Did not write as much data as expected.");
  }
  
  public final ls b()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/es.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */