public abstract class vKa$b
{
  public static final class a
    extends vKa.b
  {
    public static final a a = new a();
    
    private a()
    {
      super();
    }
  }
  
  public static final class b
    extends vKa.b
  {
    private final int a;
    
    public b(int paramInt)
    {
      super();
      this.a = paramInt;
    }
    
    public final int a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          int i;
          if (this.a == ((b)paramObject).a) {
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
      return this.a;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("RatingToComment(rating=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends vKa.b
  {
    private final int a;
    
    public c(int paramInt)
    {
      super();
      this.a = paramInt;
    }
    
    public final int a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof c))
        {
          paramObject = (c)paramObject;
          int i;
          if (this.a == ((c)paramObject).a) {
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
      return this.a;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("RatingToStore(rating=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vKa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */