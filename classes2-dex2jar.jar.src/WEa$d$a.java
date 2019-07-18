public final class WEa$d$a
  extends WEa.d
{
  private final int a;
  private final int b;
  
  public WEa$d$a(int paramInt1, int paramInt2)
  {
    super(null);
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public final int a()
  {
    return this.b;
  }
  
  public final int b()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        int i;
        if (this.a == ((a)paramObject).a) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          if (this.b == ((a)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label66;
          }
        }
      }
      return false;
    }
    label66:
    return true;
  }
  
  public int hashCode()
  {
    return this.a * 31 + this.b;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ContainerSizeChanged(width=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", height=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WEa$d$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */