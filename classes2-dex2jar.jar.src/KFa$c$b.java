import java.util.List;

public final class KFa$c$b
  extends KFa.c
{
  private final List<LFa> a;
  private final List<MFa> b;
  
  public KFa$c$b(List<LFa> paramList, List<MFa> paramList1)
  {
    super(null);
    this.a = paramList;
    this.b = paramList1;
  }
  
  public final List<MFa> a()
  {
    return this.b;
  }
  
  public final List<LFa> b()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if ((oXa.a(this.a, ((b)paramObject).a)) && (oXa.a(this.b, ((b)paramObject).b))) {}
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
    int i = 0;
    int j;
    if (localList != null) {
      j = localList.hashCode();
    } else {
      j = 0;
    }
    localList = this.b;
    if (localList != null) {
      i = localList.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("WithSelection(selectedFilters=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", sections=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KFa$c$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */