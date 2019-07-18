public final class gNa$c$a$a
  extends gNa.c.a
{
  private final WVa<Float, Float> a;
  
  public gNa$c$a$a(WVa<Float, Float> paramWVa)
  {
    super(null);
    this.a = paramWVa;
  }
  
  public final WVa<Float, Float> a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if (oXa.a(this.a, ((a)paramObject).a)) {}
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
    WVa localWVa = this.a;
    int i;
    if (localWVa != null) {
      i = localWVa.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FaceClicked(point=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gNa$c$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */