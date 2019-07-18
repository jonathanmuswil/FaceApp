import java.util.List;

public final class WEa$e$a
  extends WEa.e
{
  private final List<WEa.c> a;
  private final boolean b;
  
  public WEa$e$a(List<? extends WEa.c> paramList, boolean paramBoolean)
  {
    super(null);
    this.a = paramList;
    this.b = paramBoolean;
  }
  
  public final List<WEa.c> a()
  {
    return this.a;
  }
  
  public final boolean b()
  {
    return this.b;
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
    localStringBuilder.append("Parts(parts=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", showWatermark=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WEa$e$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */