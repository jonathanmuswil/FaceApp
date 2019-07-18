final class eKa
  extends pXa
  implements cXa<WVa<? extends dka, ? extends Integer>, cWa>
{
  eKa(hKa paramhKa)
  {
    super(1);
  }
  
  public final void a(WVa<dka, Integer> paramWVa)
  {
    dka localdka = (dka)paramWVa.a();
    paramWVa = (Integer)paramWVa.b();
    if (localdka.i())
    {
      paramWVa = hKa.c.b.a;
    }
    else
    {
      oXa.a(localdka, "user");
      oXa.a(paramWVa, "unreadUpdates");
      paramWVa = new hKa.c.a(localdka, paramWVa.intValue());
    }
    this.b.a(paramWVa);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/eKa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */