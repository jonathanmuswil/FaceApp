class Kb$a
  extends Fb
{
  Kb a;
  
  Kb$a(Kb paramKb)
  {
    this.a = paramKb;
  }
  
  public void b(Eb paramEb)
  {
    paramEb = this.a;
    if (!paramEb.N)
    {
      paramEb.p();
      this.a.N = true;
    }
  }
  
  public void d(Eb paramEb)
  {
    Kb localKb = this.a;
    localKb.M -= 1;
    if (localKb.M == 0)
    {
      localKb.N = false;
      localKb.a();
    }
    paramEb.b(this);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Kb$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */