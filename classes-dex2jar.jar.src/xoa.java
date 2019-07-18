final class xoa
  extends pXa
  implements cXa<eoa.c, Boolean>
{
  public static final xoa b = new xoa();
  
  xoa()
  {
    super(1);
  }
  
  public final boolean a(eoa.c paramc)
  {
    oXa.b(paramc, "photo");
    Zma.a.a locala = eoa.a(eoa.j, paramc);
    if (locala != null)
    {
      Object localObject = eoa.a(eoa.j, locala.a());
      boolean bool;
      if (localObject != null)
      {
        bool = ((Boolean)localObject).booleanValue();
      }
      else
      {
        localObject = eoa.j;
        if ((!(paramc.a() instanceof Uja)) && (!(paramc.a() instanceof Tja))) {
          localObject = WOa.e.a(eoa.d(eoa.j), paramc.a());
        } else {
          localObject = Boolean.valueOf(true);
        }
        if (localObject != null)
        {
          Zma.a.b localb;
          if (((Boolean)localObject).booleanValue()) {
            localb = Zma.a.b.c;
          } else {
            localb = Zma.a.b.b;
          }
          eoa.a(eoa.j, paramc, Zma.a.a.a(locala, 0L, localb, 1, null));
        }
        if (localObject != null) {
          bool = ((Boolean)localObject).booleanValue();
        } else {
          bool = false;
        }
      }
      return bool;
    }
    throw new IllegalStateException("Required value was null.");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xoa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */