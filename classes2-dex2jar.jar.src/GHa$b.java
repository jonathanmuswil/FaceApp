public final class GHa$b
  extends GHa
{
  private final VOa b;
  
  public GHa$b(VOa paramVOa)
  {
    super(paramVOa, null);
    this.b = paramVOa;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if (oXa.a(this.b, ((b)paramObject).b)) {}
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
    VOa localVOa = this.b;
    int i;
    if (localVOa != null) {
      i = localVOa.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NoPurchase(g=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/GHa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */