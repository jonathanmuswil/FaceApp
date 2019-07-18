public final class _ja
{
  private final String a;
  private final String b;
  
  public _ja(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final String b()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof _ja))
      {
        paramObject = (_ja)paramObject;
        if ((oXa.a(this.a, ((_ja)paramObject).a)) && (oXa.a(this.b, ((_ja)paramObject).b))) {}
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
    String str = this.a;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = this.b;
    if (str != null) {
      i = str.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FacebookCredentials(userId=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", token=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_ja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */