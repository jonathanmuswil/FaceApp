public abstract interface uAa
  extends sla
{
  public abstract void a(rka paramrka);
  
  public abstract void b(pya parampya, float paramFloat, boolean paramBoolean);
  
  public abstract QQa<uAa.a> getViewActions();
  
  public static abstract class a
  {
    public static final class a
      extends uAa.a
    {
      public static final a a = new a();
      
      private a()
      {
        super();
      }
    }
    
    public static final class b
      extends uAa.a
    {
      private final pya a;
      private final float b;
      
      public b(pya parampya, float paramFloat)
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
          if ((paramObject instanceof b))
          {
            paramObject = (b)paramObject;
            if ((oXa.a(this.a, ((b)paramObject).a)) && (Float.compare(this.b, ((b)paramObject).b) == 0)) {}
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/uAa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */