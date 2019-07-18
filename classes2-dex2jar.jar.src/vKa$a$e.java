public final class vKa$a$e
  extends vKa.a
{
  private final int a;
  
  public vKa$a$e(int paramInt)
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
      if ((paramObject instanceof e))
      {
        paramObject = (e)paramObject;
        int i;
        if (this.a == ((e)paramObject).a) {
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
    localStringBuilder.append("RateClicked(rating=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vKa$a$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */