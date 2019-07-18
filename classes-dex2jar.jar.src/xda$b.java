import java.util.List;

final class xda$b
{
  private final List<bfa> a;
  private final long b;
  
  public xda$b(List<bfa> paramList, long paramLong)
  {
    this.a = paramList;
    this.b = paramLong;
  }
  
  public final List<bfa> a()
  {
    return this.a;
  }
  
  public final boolean b()
  {
    boolean bool;
    if (System.currentTimeMillis() - this.b <= xda.a()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if (oXa.a(this.a, ((b)paramObject).a))
        {
          int i;
          if (this.b == ((b)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label59;
          }
        }
      }
      return false;
    }
    label59:
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
    long l = this.b;
    return i * 31 + (int)(l ^ l >>> 32);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LastLoadedHosts(hosts=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", loadTimestamp=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xda$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */