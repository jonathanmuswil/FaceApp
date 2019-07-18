public final class yu
  extends Es<yu, yu.a>
  implements kt
{
  private static final yu zzbfc = new yu();
  private static volatile st<yu> zzbg;
  private int zzbb;
  private int zzbfa = -1;
  private int zzbfb;
  
  static
  {
    Es.a(yu.class, zzbfc);
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
            ((Es.b)paramObject1).<init>(zzbfc);
            zzbg = (st)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzbfc;
    case 3: 
      paramObject1 = yu.c.a();
      paramObject2 = yu.b.a();
      return Es.a(zzbfc, "\001\002\000\001\001\002\002\003\000\000\000\001\f\000\002\f\001", new Object[] { "zzbb", "zzbfa", paramObject1, "zzbfb", paramObject2 });
    case 2: 
      return new yu.a(null);
    }
    return new yu();
  }
  
  public static final class a
    extends Es.a<yu, a>
    implements kt
  {
    private a()
    {
      super();
    }
  }
  
  public static enum b
    implements Hs
  {
    private static final Is<b> v = new Bu();
    private final int x;
    
    private b(int paramInt)
    {
      this.x = paramInt;
    }
    
    public static Is<b> a()
    {
      return v;
    }
    
    public static b a(int paramInt)
    {
      if (paramInt != 100)
      {
        switch (paramInt)
        {
        default: 
          return null;
        case 19: 
          return t;
        case 18: 
          return s;
        case 17: 
          return r;
        case 16: 
          return q;
        case 15: 
          return p;
        case 14: 
          return o;
        case 13: 
          return n;
        case 12: 
          return m;
        case 11: 
          return l;
        case 10: 
          return k;
        case 9: 
          return j;
        case 8: 
          return i;
        case 7: 
          return h;
        case 6: 
          return g;
        case 5: 
          return f;
        case 4: 
          return e;
        case 3: 
          return d;
        case 2: 
          return c;
        case 1: 
          return b;
        }
        return a;
      }
      return u;
    }
    
    public final int m()
    {
      return this.x;
    }
  }
  
  public static enum c
    implements Hs
  {
    private static final Is<c> t = new Cu();
    private final int v;
    
    private c(int paramInt)
    {
      this.v = paramInt;
    }
    
    public static Is<c> a()
    {
      return t;
    }
    
    public static c a(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return null;
      case 17: 
        return s;
      case 16: 
        return r;
      case 15: 
        return q;
      case 14: 
        return p;
      case 13: 
        return o;
      case 12: 
        return n;
      case 11: 
        return m;
      case 10: 
        return l;
      case 9: 
        return k;
      case 8: 
        return j;
      case 7: 
        return i;
      case 6: 
        return h;
      case 5: 
        return g;
      case 4: 
        return f;
      case 3: 
        return e;
      case 2: 
        return d;
      case 1: 
        return c;
      case 0: 
        return b;
      }
      return a;
    }
    
    public final int m()
    {
      return this.v;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */