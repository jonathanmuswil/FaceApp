class Lf$b
  implements Runnable
{
  private final hj a;
  
  Lf$b(Lf paramLf, hj paramhj)
  {
    this.a = paramhj;
  }
  
  public void run()
  {
    synchronized (this.b)
    {
      if (this.b.b.a(this.a))
      {
        this.b.v.d();
        this.b.b(this.a);
        this.b.c(this.a);
      }
      this.b.b();
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Lf$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */