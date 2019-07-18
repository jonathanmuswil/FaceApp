public final class Ora$a$f
  extends Ora.a
{
  private final String c;
  
  public Ora$a$f(String paramString)
  {
    super("open_poll", null);
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
      if ((paramObject instanceof f))
      {
        paramObject = (f)paramObject;
        if (oXa.a(this.c, ((f)paramObject).c)) {}
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
    localStringBuilder.append("SinglePoll(pollId=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Ora$a$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */