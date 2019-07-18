class M$a
{
  private z a;
  private z b;
  private int c;
  private z.b d;
  private int e;
  
  public M$a(z paramz)
  {
    this.a = paramz;
    this.b = paramz.g();
    this.c = paramz.b();
    this.d = paramz.f();
    this.e = paramz.a();
  }
  
  public void a(B paramB)
  {
    paramB.a(this.a.h()).a(this.b, this.c, this.d, this.e);
  }
  
  public void b(B paramB)
  {
    this.a = paramB.a(this.a.h());
    paramB = this.a;
    if (paramB != null)
    {
      this.b = paramB.g();
      this.c = this.a.b();
      this.d = this.a.f();
      this.e = this.a.a();
    }
    else
    {
      this.b = null;
      this.c = 0;
      this.d = z.b.b;
      this.e = 0;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/M$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */