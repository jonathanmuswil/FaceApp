import java.util.NoSuchElementException;

public enum XDa$b
{
  public static final XDa.b.a h = new XDa.b.a(null);
  private final String i;
  private final String j;
  private final int k;
  private final int l;
  
  static
  {
    b localb1 = new b("COLLAGE", 0, "fr_collage", "layouts_collage", 2131689649, 2131231008);
    a = localb1;
    b localb2 = new b("DUO", 1, "fr_duo", "layouts_duo", 2131689650, 2131231009);
    b = localb2;
    b localb3 = new b("MIRROR", 2, "fr_mirror", "layouts_mirror", 2131689653, 2131231011);
    c = localb3;
    b localb4 = new b("LENS", 3, "fr_lens", "layouts_lense", 2131689652, 2131231010);
    d = localb4;
    b localb5 = new b("STYLIST", 4, "fr_stylist", "layouts_stylist", 2131689656, 2131231012);
    e = localb5;
    b localb6 = new b("STYLIST_OLD", 5, "fr_stylist_old", "layouts_stylist", 2131689656, 2131231012);
    f = localb6;
    g = new b[] { localb1, localb2, localb3, localb4, localb5, localb6 };
  }
  
  private XDa$b(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    this.i = paramString1;
    this.j = paramString2;
    this.k = paramInt1;
    this.l = paramInt2;
  }
  
  public final String a()
  {
    return this.j;
  }
  
  public final int b()
  {
    return this.l;
  }
  
  public final String c()
  {
    return this.i;
  }
  
  public final int d()
  {
    return this.k;
  }
  
  public static final class a
  {
    public final XDa.b a(String paramString)
    {
      oXa.b(paramString, "targetTag");
      for (XDa.b localb : XDa.b.values()) {
        if (oXa.a(localb.c(), paramString)) {
          return localb;
        }
      }
      throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/XDa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */