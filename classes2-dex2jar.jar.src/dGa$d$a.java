import java.util.List;

public final class dGa$d$a
  extends dGa.d
{
  private final List<dGa.b> a;
  private final boolean b;
  
  public dGa$d$a(List<? extends dGa.b> paramList, boolean paramBoolean)
  {
    super(null);
    this.a = paramList;
    this.b = paramBoolean;
  }
  
  public final List<dGa.b> a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if (oXa.a(this.a, ((a)paramObject).a))
        {
          int i;
          if (this.b == ((a)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label58;
          }
        }
      }
      return false;
    }
    label58:
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
    int j = this.b;
    int k = j;
    if (j != 0) {
      k = 1;
    }
    return i * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Content(parts=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", allFilled=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dGa$d$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */