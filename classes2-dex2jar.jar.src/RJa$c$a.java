import java.util.List;

public final class RJa$c$a
  extends RJa.c
{
  private final List<RJa.a> a;
  private final RJa.a b;
  
  public RJa$c$a(List<RJa.a> paramList, RJa.a parama)
  {
    super(null);
    this.a = paramList;
    this.b = parama;
  }
  
  public final List<RJa.a> a()
  {
    return this.a;
  }
  
  public final RJa.a b()
  {
    return this.b;
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
      i = ((RJa.a)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Free(availableItems=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", selectedProItem=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/RJa$c$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */