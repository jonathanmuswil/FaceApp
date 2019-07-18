import android.graphics.PointF;

public abstract class KAa$b
{
  public static final class a
    extends KAa.b
  {
    private final Gka a;
    
    public a(Gka paramGka)
    {
      super();
      this.a = paramGka;
    }
    
    public final Gka a()
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
      Gka localGka = this.a;
      int i;
      if (localGka != null) {
        i = localGka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SelectOverlay(overlay=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends KAa.b
  {
    private final Gka a;
    
    public b(Gka paramGka)
    {
      super();
      this.a = paramGka;
    }
    
    public final Gka a()
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
      Gka localGka = this.a;
      int i;
      if (localGka != null) {
        i = localGka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SelectPro(overlay=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends KAa.b
  {
    public static final c a = new c();
    
    private c()
    {
      super();
    }
  }
  
  public static final class d
    extends KAa.b
  {
    private final boolean a;
    
    public d(boolean paramBoolean)
    {
      super();
      this.a = paramBoolean;
    }
    
    public final boolean a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof d))
        {
          paramObject = (d)paramObject;
          int i;
          if (this.a == ((d)paramObject).a) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {}
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
      int i = this.a;
      int j = i;
      if (i != 0) {
        j = 1;
      }
      return j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SetBefore(before=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class e
    extends KAa.b
  {
    public static final e a = new e();
    
    private e()
    {
      super();
    }
  }
  
  public static final class f
    extends KAa.b
  {
    private final PointF a;
    
    public f(PointF paramPointF)
    {
      super();
      this.a = paramPointF;
    }
    
    public final PointF a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof f))
        {
          paramObject = (f)paramObject;
          if (oXa.a(this.a, ((f)paramObject).a)) {}
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
      PointF localPointF = this.a;
      int i;
      if (localPointF != null) {
        i = localPointF.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SetLightSource(source=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class g
    extends KAa.b
  {
    private final pya a;
    private final float b;
    
    public g(pya parampya, float paramFloat)
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
        if ((paramObject instanceof g))
        {
          paramObject = (g)paramObject;
          if ((oXa.a(this.a, ((g)paramObject).a)) && (Float.compare(this.b, ((g)paramObject).b) == 0)) {}
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KAa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */