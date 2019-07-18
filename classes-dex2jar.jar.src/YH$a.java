final class YH$a
{
  private final Object a;
  private final int b;
  
  YH$a(Object paramObject, int paramInt)
  {
    this.a = paramObject;
    this.b = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    return (this.a == ((a)paramObject).a) && (this.b == ((a)paramObject).b);
  }
  
  public final int hashCode()
  {
    return System.identityHashCode(this.a) * 65535 + this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/YH$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */