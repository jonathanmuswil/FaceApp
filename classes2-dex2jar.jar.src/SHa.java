public final class sHa
{
  private final int a;
  private final long b;
  
  public sHa(int paramInt, long paramLong)
  {
    this.a = paramInt;
    this.b = paramLong;
  }
  
  public final int a()
  {
    return this.a;
  }
  
  public final long b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof sHa))
      {
        paramObject = (sHa)paramObject;
        int i;
        if (this.a == ((sHa)paramObject).a) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          if (this.b == ((sHa)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label67;
          }
        }
      }
      return false;
    }
    label67:
    return true;
  }
  
  public int hashCode()
  {
    int i = this.a;
    long l = this.b;
    return i * 31 + (int)(l ^ l >>> 32);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("VerticalPaddingModel(paddingDp=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", uniqueId=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sHa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */