import java.util.List;

public abstract class FGa$d
{
  public static final class a
    extends FGa.d
  {
    private final List<FGa.b> a;
    private final Boolean b;
    
    public a(List<? extends FGa.b> paramList, Boolean paramBoolean)
    {
      super();
      this.a = paramList;
      this.b = paramBoolean;
    }
    
    public final Boolean a()
    {
      return this.b;
    }
    
    public final List<FGa.b> b()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b))) {}
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
      Object localObject = this.a;
      int i = 0;
      int j;
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      if (localObject != null) {
        i = ((Boolean)localObject).hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("AllFilled(parts=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", createdJustNow=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends FGa.d
  {
    private final List<FGa.b> a;
    
    public b(List<? extends FGa.b> paramList)
    {
      super();
      this.a = paramList;
    }
    
    public final List<FGa.b> a()
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
      localStringBuilder.append("PartlyFilled(parts=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/FGa$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */