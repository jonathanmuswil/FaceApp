public final class FGa$c$b
  extends FGa.c
{
  private final int a;
  
  public FGa$c$b(int paramInt)
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
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        int i;
        if (this.a == ((b)paramObject).a) {
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
    localStringBuilder.append("PartClicked(partIndex=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/FGa$c$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */