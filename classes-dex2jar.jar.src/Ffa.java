public final class ffa
{
  private final boolean jdField_public;
  
  public ffa(boolean paramBoolean)
  {
    this.jdField_public = paramBoolean;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof ffa))
      {
        paramObject = (ffa)paramObject;
        int i;
        if (this.jdField_public == ((ffa)paramObject).jdField_public) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {}
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
    int i = this.jdField_public;
    int j = i;
    if (i != 0) {
      j = 1;
    }
    return j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EditPollRequest(public=");
    localStringBuilder.append(this.jdField_public);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ffa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */