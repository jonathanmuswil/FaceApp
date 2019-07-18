public final class KDa$e
  extends KDa
{
  private final int b;
  
  public KDa$e(int paramInt)
  {
    super(paramInt, null);
    this.b = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof e))
      {
        paramObject = (e)paramObject;
        int i;
        if (this.b == ((e)paramObject).b) {
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
    localStringBuilder.append("Mirror(mirrorPos=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KDa$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */