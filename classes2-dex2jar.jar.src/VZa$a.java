public abstract class Vza$a
{
  public static final class a
    extends Vza.a
  {
    public static final a a = new a();
    
    private a()
    {
      super();
    }
  }
  
  public static final class b
    extends Vza.a
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static final class c
    extends Vza.a
  {
    public static final c a = new c();
    
    private c()
    {
      super();
    }
  }
  
  public static final class d
    extends Vza.a
  {
    private final oxa a;
    
    public d(oxa paramoxa)
    {
      super();
      this.a = paramoxa;
    }
    
    public final oxa a()
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
      oxa localoxa = this.a;
      int i;
      if (localoxa != null) {
        i = localoxa.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SetCropType(cropType=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class e
    extends Vza.a
  {
    public static final e a = new e();
    
    private e()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Vza$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */