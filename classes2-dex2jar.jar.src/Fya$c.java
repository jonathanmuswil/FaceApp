public abstract class Fya$c
{
  public static final class a
    extends Fya.c
  {
    public static final a a = new a();
    
    private a()
    {
      super();
    }
  }
  
  public static final class b
    extends Fya.c
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static final class c
    extends Fya.c
  {
    private final jka a;
    
    public c(jka paramjka)
    {
      super();
      this.a = paramjka;
    }
    
    public final jka a()
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
      jka localjka = this.a;
      int i;
      if (localjka != null) {
        i = localjka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SelectAdjust(adjust=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends Fya.c
  {
    private final jka a;
    
    public d(jka paramjka)
    {
      super();
      this.a = paramjka;
    }
    
    public final jka a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof d))
        {
          paramObject = (d)paramObject;
          if (oXa.a(this.a, ((d)paramObject).a)) {}
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
      jka localjka = this.a;
      int i;
      if (localjka != null) {
        i = localjka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SelectReset(adjust=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class e
    extends Fya.c
  {
    private final pya a;
    private final float b;
    
    public e(pya parampya, float paramFloat)
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
        if ((paramObject instanceof e))
        {
          paramObject = (e)paramObject;
          if ((oXa.a(this.a, ((e)paramObject).a)) && (Float.compare(this.b, ((e)paramObject).b) == 0)) {}
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Fya$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */