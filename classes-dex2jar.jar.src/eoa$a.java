import java.util.List;

public final class eoa$a
{
  private final List<eoa.c> a;
  private final boolean b;
  
  public eoa$a(List<eoa.c> paramList, boolean paramBoolean)
  {
    this.a = paramList;
    this.b = paramBoolean;
  }
  
  public final boolean a()
  {
    return this.b;
  }
  
  public final List<eoa.c> b()
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
    localStringBuilder.append("PhotoBatch(photos=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", hasMore=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/eoa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */