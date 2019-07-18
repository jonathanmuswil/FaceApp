final class vua
  extends pXa
  implements cXa<WVa<? extends Boolean, ? extends Boolean>, cWa>
{
  vua(Dua paramDua)
  {
    super(1);
  }
  
  public final void a(WVa<Boolean, Boolean> paramWVa)
  {
    Boolean localBoolean1 = (Boolean)paramWVa.a();
    Boolean localBoolean2 = (Boolean)paramWVa.b();
    paramWVa = (Eua)this.b.c();
    if (paramWVa != null)
    {
      oXa.a(localBoolean1, "available");
      boolean bool = localBoolean1.booleanValue();
      oXa.a(localBoolean2, "enabled");
      paramWVa.a(new Eua.c.a(bool, localBoolean2.booleanValue()));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */