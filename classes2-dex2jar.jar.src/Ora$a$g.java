public final class Ora$a$g
  extends Ora.a
{
  private final String c;
  
  public Ora$a$g(String paramString)
  {
    super("open_voting", null);
    this.c = paramString;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public final String c()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof g))
      {
        paramObject = (g)paramObject;
        if (oXa.a(this.c, ((g)paramObject).c)) {}
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
    String str = this.c;
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
    localStringBuilder.append("Voting(pollId=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Ora$a$g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */