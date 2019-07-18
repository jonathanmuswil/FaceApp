import java.util.List;

public final class FGa$d$b
  extends FGa.d
{
  private final List<FGa.b> a;
  
  public FGa$d$b(List<? extends FGa.b> paramList)
  {
    super(null);
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/FGa$d$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */