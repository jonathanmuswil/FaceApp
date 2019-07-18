public final class tfa
{
  private final String poll_id;
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof tfa))
      {
        paramObject = (tfa)paramObject;
        if (oXa.a(this.poll_id, ((tfa)paramObject).poll_id)) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final String getPoll_id()
  {
    return this.poll_id;
  }
  
  public int hashCode()
  {
    String str = this.poll_id;
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
    localStringBuilder.append("PollPostData(poll_id=");
    localStringBuilder.append(this.poll_id);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */