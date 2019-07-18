public final class hKa$b$h
  extends hKa.b
{
  private final String a;
  
  public hKa$b$h(String paramString)
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
      if ((paramObject instanceof h))
      {
        paramObject = (h)paramObject;
        if (oXa.a(this.a, ((h)paramObject).a)) {}
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
    localStringBuilder.append("ShowVotingRequested(pollId=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hKa$b$h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */