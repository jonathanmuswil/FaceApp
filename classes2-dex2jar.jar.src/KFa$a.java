import java.util.List;

public abstract class KFa$a
{
  public static final class a
    extends KFa.a
  {
    private final List<String> a;
    
    public a(List<String> paramList)
    {
      super();
      this.a = paramList;
    }
    
    public final List<String> a()
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
      List localList = this.a;
      int i;
      if (localList != null) {
        i = localList.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Filters(filterIds=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends KFa.a
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KFa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */