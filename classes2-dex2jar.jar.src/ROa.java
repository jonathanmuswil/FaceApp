import java.util.ArrayList;

final class rOa
  extends pXa
  implements cXa<Nka, cWa>
{
  rOa(oOa paramoOa)
  {
    super(1);
  }
  
  public final void a(Nka paramNka)
  {
    oOa.a(this.b, paramNka);
    oOa.a(this.b, paramNka.o());
    oOa.a(this.b, new ArrayList(paramNka.m()));
    oOa localoOa = this.b;
    paramNka = (String)EPa.a(oOa.c(localoOa));
    if (paramNka == null)
    {
      oOa.f();
      paramNka = "I like it the most!";
    }
    oOa.a(localoOa, paramNka);
    oOa.e(this.b);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rOa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */