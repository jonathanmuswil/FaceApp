public abstract class gNa$c
{
  public static abstract class a
    extends gNa.c
  {
    private a()
    {
      super();
    }
    
    public static final class a
      extends gNa.c.a
    {
      private final WVa<Float, Float> a;
      
      public a(WVa<Float, Float> paramWVa)
      {
        super();
        this.a = paramWVa;
      }
      
      public final WVa<Float, Float> a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof a))
          {
            paramObject = (a)paramObject;
            if (oXa.a(this.a, ((a)paramObject).a)) {}
          }
          else
          {
            return false;
          }
        }
        return true;
      }
      
      public int hashCode()
      {
        WVa localWVa = this.a;
        int i;
        if (localWVa != null) {
          i = localWVa.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("FaceClicked(point=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends gNa.c.a
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends gNa.c.a
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
  }
  
  public static abstract class b
    extends gNa.c
  {
    private b()
    {
      super();
    }
    
    public static final class a
      extends gNa.c.b
    {
      public static final a a = new a();
      
      private a()
      {
        super();
      }
    }
    
    public static final class b
      extends gNa.c.b
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends gNa.c.b
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gNa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */