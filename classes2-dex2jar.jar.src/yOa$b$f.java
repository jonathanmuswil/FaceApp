public final class yOa$b$f
  extends yOa.b
{
  private final int a;
  
  public yOa$b$f(int paramInt)
  {
    super(null);
    this.a = paramInt;
  }
  
  public final int a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof f))
      {
        paramObject = (f)paramObject;
        int i;
        if (this.a == ((f)paramObject).a) {
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
    return this.a;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("StyleSelected(styleId=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yOa$b$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */