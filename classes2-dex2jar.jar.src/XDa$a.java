public final class XDa$a
{
  public static final XDa.a.a a = new XDa.a.a(null);
  private final XDa.b b;
  private final String c;
  
  public final String a()
  {
    return this.c;
  }
  
  public final XDa.b b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((oXa.a(this.b, ((a)paramObject).b)) && (oXa.a(this.c, ((a)paramObject).c))) {}
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
    Object localObject = this.b;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((Enum)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.c;
    if (localObject != null) {
      i = ((String)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AddToLayoutsRequest(layoutMode=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", filterId=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/XDa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */