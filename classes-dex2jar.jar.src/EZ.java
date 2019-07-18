public final class ez
  extends sx<ez, ez.a>
  implements dy
{
  private static volatile my<ez> zziq;
  private static final ez zzxh = new ez();
  private int zzil;
  private int zzxf = -1;
  private int zzxg;
  
  static
  {
    sx.a(ez.class, zzxh);
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (gz.a[(paramInt - 1)])
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
            ((sx.b)paramObject1).<init>(zzxh);
            zziq = (my)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzxh;
    case 3: 
      paramObject2 = ez.c.a();
      paramObject1 = ez.b.a();
      return sx.a(zzxh, "\001\002\000\001\001\002\002\000\000\000\001\f\000\002\f\001", new Object[] { "zzil", "zzxf", paramObject2, "zzxg", paramObject1 });
    case 2: 
      return new ez.a(null);
    }
    return new ez();
  }
  
  public static final class a
    extends sx.a<ez, a>
    implements dy
  {
    private a()
    {
      super();
    }
  }
  
  public static enum b
    implements vx
  {
    private static final wx<b> v = new hz();
    private final int x;
    
    private b(int paramInt)
    {
      this.x = paramInt;
    }
    
    public static xx a()
    {
      return iz.a;
    }
    
    public final int o()
    {
      return this.x;
    }
  }
  
  public static enum c
    implements vx
  {
    private static final wx<c> t = new jz();
    private final int v;
    
    private c(int paramInt)
    {
      this.v = paramInt;
    }
    
    public static xx a()
    {
      return kz.a;
    }
    
    public final int o()
    {
      return this.v;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */