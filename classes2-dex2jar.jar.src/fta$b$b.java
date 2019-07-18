public final class fta$b$b
  extends fta.b
{
  private final String a;
  
  public fta$b$b()
  {
    this(null, 1, null);
  }
  
  public fta$b$b(String paramString)
  {
    super(null);
    this.a = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if (oXa.a(this.a, ((b)paramObject).a)) {}
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
    localStringBuilder.append("General(reason=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fta$b$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */