import java.util.List;

public final class JOa$c$a
  extends JOa.c
{
  private final List<String> a;
  
  public JOa$c$a(List<String> paramList)
  {
    super(null);
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
    localStringBuilder.append("Content(suggests=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/JOa$c$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */