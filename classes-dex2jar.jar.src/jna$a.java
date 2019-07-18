import java.util.List;

public final class jna$a
{
  private final List<ika> a;
  private final String b;
  
  public jna$a(List<ika> paramList, String paramString)
  {
    this.a = paramList;
    this.b = paramString;
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final List<ika> b()
  {
    return this.a;
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
      i = ((String)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FacebookAvatarsInfo(images=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", curAvatarKey=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jna$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */