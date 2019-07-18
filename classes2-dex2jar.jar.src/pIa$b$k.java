public final class pIa$b$k
  extends pIa.b
{
  private final String a;
  
  public pIa$b$k(String paramString)
  {
    super(null);
    this.a = paramString;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof k))
      {
        paramObject = (k)paramObject;
        if (oXa.a(this.a, ((k)paramObject).a)) {}
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
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("OpenProScreen(from=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pIa$b$k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */