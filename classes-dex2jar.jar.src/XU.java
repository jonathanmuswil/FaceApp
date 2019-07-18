public final class xu
  extends Es<xu, xu.a>
  implements kt
{
  private static volatile st<xu> zzbg;
  private static final xu zztx = new xu();
  private int zzbb;
  private int zztu;
  private String zztv = "";
  private String zztw = "";
  
  static
  {
    Es.a(xu.class, zztx);
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (Au.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject2 = zzbg;
      paramObject1 = paramObject2;
      if (paramObject2 == null) {
        try
        {
          paramObject2 = zzbg;
          paramObject1 = paramObject2;
          if (paramObject2 == null)
          {
            paramObject1 = new Es$b;
            ((Es.b)paramObject1).<init>(zztx);
            zzbg = (st)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zztx;
    case 3: 
      return Es.a(zztx, "\001\003\000\001\001\003\003\004\000\000\000\001\004\000\002\b\001\003\b\002", new Object[] { "zzbb", "zztu", "zztv", "zztw" });
    case 2: 
      return new xu.a(null);
    }
    return new xu();
  }
  
  public static final class a
    extends Es.a<xu, a>
    implements kt
  {
    private a()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */