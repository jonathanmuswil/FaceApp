final class Abb$a
  implements kRa
{
  private final Rab<?> a;
  private volatile boolean b;
  
  Abb$a(Rab<?> paramRab)
  {
    this.a = paramRab;
  }
  
  public boolean h()
  {
    return this.b;
  }
  
  public void i()
  {
    this.b = true;
    this.a.cancel();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Abb$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */