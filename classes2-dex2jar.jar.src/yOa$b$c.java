public final class yOa$b$c
  extends yOa.b
{
  private final boolean a;
  
  public yOa$b$c(boolean paramBoolean)
  {
    super(null);
    this.a = paramBoolean;
  }
  
  public final boolean a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        int i;
        if (this.a == ((c)paramObject).a) {
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
    int i = this.a;
    int j = i;
    if (i != 0) {
      j = 1;
    }
    return j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Dismiss(confirmed=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yOa$b$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */