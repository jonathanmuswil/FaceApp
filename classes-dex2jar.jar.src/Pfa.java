public final class pfa
{
  private final String choice;
  private final String comment;
  
  public pfa(String paramString1, String paramString2)
  {
    this.choice = paramString1;
    this.comment = paramString2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof pfa))
      {
        paramObject = (pfa)paramObject;
        if ((oXa.a(this.choice, ((pfa)paramObject).choice)) && (oXa.a(this.comment, ((pfa)paramObject).comment))) {}
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
    String str = this.choice;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = this.comment;
    if (str != null) {
      i = str.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SubmitVoteRequest(choice=");
    localStringBuilder.append(this.choice);
    localStringBuilder.append(", comment=");
    localStringBuilder.append(this.comment);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */