public final class WEa$a
{
  private final int a;
  private final String b;
  
  public WEa$a(int paramInt, String paramString)
  {
    this.a = paramInt;
    this.b = paramString;
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final int b()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        int i;
        if (this.a == ((a)paramObject).a) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.b, ((a)paramObject).b))) {}
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
    int i = this.a;
    String str = this.b;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AddToDuoRequest(index=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", filterId=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WEa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */