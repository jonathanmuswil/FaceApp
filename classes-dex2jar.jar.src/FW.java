public final class fw
  extends sx<fw, fw.a>
  implements dy
{
  private static volatile my<fw> zziq;
  private static final fw zzkk = new fw();
  private int zzil;
  private String zzin = "";
  private String zzkh = "";
  private String zzki = "";
  private ez zzkj;
  
  static
  {
    sx.a(fw.class, zzkk);
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (gw.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject2 = zziq;
      paramObject1 = paramObject2;
      if (paramObject2 == null) {
        try
        {
          paramObject2 = zziq;
          paramObject1 = paramObject2;
          if (paramObject2 == null)
          {
            paramObject1 = new sx$b;
            ((sx.b)paramObject1).<init>(zzkk);
            zziq = (my)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzkk;
    case 3: 
      return sx.a(zzkk, "\001\004\000\001\002\005\004\000\000\000\002\b\000\003\b\001\004\b\002\005\t\003", new Object[] { "zzil", "zzin", "zzkh", "zzki", "zzkj" });
    case 2: 
      return new fw.a(null);
    }
    return new fw();
  }
  
  public static final class a
    extends sx.a<fw, a>
    implements dy
  {
    private a()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */