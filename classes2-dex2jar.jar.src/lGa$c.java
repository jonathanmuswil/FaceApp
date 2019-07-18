import java.util.List;

final class lGa$c
{
  private final List<List<String>> a;
  
  public lGa$c(List<? extends List<String>> paramList)
  {
    this.a = paramList;
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
    localStringBuilder.append("PollInfo(filterIds=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lGa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */