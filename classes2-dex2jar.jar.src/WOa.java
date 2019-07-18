final class wOa
  extends pXa
  implements cXa<WVa<? extends Mka, ? extends Rka>, cWa>
{
  wOa(oOa paramoOa)
  {
    super(1);
  }
  
  public final void a(WVa<Mka, Rka> paramWVa)
  {
    paramWVa = (Rka)paramWVa.b();
    if (oOa.b(this.b) != null)
    {
      oOa.b(this.b).a(oOa.a(this.b), paramWVa);
    }
    else
    {
      paramWVa = (yOa)this.b.c();
      if (paramWVa != null) {
        paramWVa.f(oOa.a(this.b));
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wOa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */