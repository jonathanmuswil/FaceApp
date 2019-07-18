public final class KDa$a
  extends KDa
{
  private final int b;
  
  public KDa$a(int paramInt)
  {
    super(paramInt, null);
    this.b = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        int i;
        if (this.b == ((a)paramObject).b) {
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
    localStringBuilder.append("Collage(collagePos=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KDa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */