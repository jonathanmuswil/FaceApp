import java.util.List;

public final class pIa$b$m
  extends pIa.b
{
  private final List<List<String>> a;
  
  public pIa$b$m(List<? extends List<String>> paramList)
  {
    super(null);
    this.a = paramList;
  }
  
  public final List<List<String>> a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof m))
      {
        paramObject = (m)paramObject;
        if (oXa.a(this.a, ((m)paramObject).a)) {}
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
    localStringBuilder.append("PollCreated(filterIds=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pIa$b$m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */