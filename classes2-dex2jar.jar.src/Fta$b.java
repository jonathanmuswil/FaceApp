public abstract class fta$b
  extends fta
{
  private fta$b()
  {
    super(null);
  }
  
  public static final class a
    extends fta.b
  {
    public static final a a = new a();
    
    private a()
    {
      super();
    }
  }
  
  public static final class b
    extends fta.b
  {
    private final String a;
    
    public b()
    {
      this(null, 1, null);
    }
    
    public b(String paramString)
    {
      super();
      this.a = paramString;
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
      String str = this.a;
      int i;
      if (str != null) {
        i = str.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("General(reason=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends fta.b
  {
    public static final c a = new c();
    
    private c()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fta$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */