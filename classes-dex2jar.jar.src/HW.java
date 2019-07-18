public final class hw
  extends sx<hw, hw.a>
  implements dy
{
  private static volatile my<hw> zziq;
  private static final hw zzkn = new hw();
  private int zzil;
  private long zzis;
  private int zzkl;
  private int zzkm;
  
  static
  {
    sx.a(hw.class, zzkn);
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (iw.a[(paramInt - 1)])
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
            ((sx.b)paramObject1).<init>(zzkn);
            zziq = (my)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzkn;
    case 3: 
      return sx.a(zzkn, "\001\003\000\001\001\003\003\000\000\000\001\002\000\002\004\001\003\004\002", new Object[] { "zzil", "zzis", "zzkl", "zzkm" });
    case 2: 
      return new hw.a(null);
    }
    return new hw();
  }
  
  public static final class a
    extends sx.a<hw, a>
    implements dy
  {
    private a()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */