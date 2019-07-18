public abstract class pDa$b
{
  public static final class a
    extends pDa.b
  {
    private final Kka a;
    
    public a(Kka paramKka)
    {
      super();
      this.a = paramKka;
    }
    
    public final Kka a()
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
      Kka localKka = this.a;
      int i;
      if (localKka != null) {
        i = localKka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SelectPro(tatoo=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends pDa.b
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static final class c
    extends pDa.b
  {
    private final Kka a;
    
    public c(Kka paramKka)
    {
      super();
      this.a = paramKka;
    }
    
    public final Kka a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof c))
        {
          paramObject = (c)paramObject;
          if (oXa.a(this.a, ((c)paramObject).a)) {}
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
      Kka localKka = this.a;
      int i;
      if (localKka != null) {
        i = localKka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SelectTatoo(tatoo=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends pDa.b
  {
    private final pya a;
    private final float b;
    
    public d(pya parampya, float paramFloat)
    {
      super();
      this.a = parampya;
      this.b = paramFloat;
    }
    
    public final pya a()
    {
      return this.a;
    }
    
    public final float b()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof d))
        {
          paramObject = (d)paramObject;
          if ((oXa.a(this.a, ((d)paramObject).a)) && (Float.compare(this.b, ((d)paramObject).b) == 0)) {}
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
      pya localpya = this.a;
      int i;
      if (localpya != null) {
        i = localpya.hashCode();
      } else {
        i = 0;
      }
      return i * 31 + Float.floatToIntBits(this.b);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SetValue(range=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", value=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pDa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */