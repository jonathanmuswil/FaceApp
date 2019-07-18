public abstract class hAa$b
{
  public static final class a
    extends hAa.b
  {
    private final tka a;
    
    public a(tka paramtka)
    {
      super();
      this.a = paramtka;
    }
    
    public final tka a()
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
      tka localtka = this.a;
      int i;
      if (localtka != null) {
        i = localtka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SelectEffect(effect=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends hAa.b
  {
    private final tka a;
    
    public b(tka paramtka)
    {
      super();
      this.a = paramtka;
    }
    
    public final tka a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if (oXa.a(this.a, ((b)paramObject).a)) {}
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
      tka localtka = this.a;
      int i;
      if (localtka != null) {
        i = localtka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SelectPro(effect=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends hAa.b
  {
    public static final c a = new c();
    
    private c()
    {
      super();
    }
  }
  
  public static final class d
    extends hAa.b
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hAa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */