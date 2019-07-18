public final class KDa$b
  extends KDa
{
  private final int b;
  
  public KDa$b(int paramInt)
  {
    super(paramInt, null);
    this.b = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        int i;
        if (this.b == ((b)paramObject).b) {
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
    return this.b;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Duo(duoPos=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KDa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */