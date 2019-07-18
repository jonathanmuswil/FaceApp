final class rAa
  extends pXa
  implements cXa<WVa<? extends Float, ? extends Boolean>, cWa>
{
  rAa(tAa paramtAa, pya parampya)
  {
    super(1);
  }
  
  public final void a(WVa<Float, Boolean> paramWVa)
  {
    Float localFloat = (Float)paramWVa.a();
    Boolean localBoolean = (Boolean)paramWVa.b();
    paramWVa = (uAa)this.b.c();
    if (paramWVa != null)
    {
      pya localpya = this.c;
      oXa.a(localFloat, "value");
      float f = localFloat.floatValue();
      oXa.a(localBoolean, "smooth");
      paramWVa.b(localpya, f, localBoolean.booleanValue());
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rAa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */