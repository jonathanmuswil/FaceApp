public final class KIa$d$f
  extends KIa.d
{
  private final Rja a;
  
  public KIa$d$f(Rja paramRja)
  {
    super(null);
    this.a = paramRja;
  }
  
  public final Rja a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof f))
      {
        paramObject = (f)paramObject;
        if (oXa.a(this.a, ((f)paramObject).a)) {}
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
    Rja localRja = this.a;
    int i;
    if (localRja != null) {
      i = localRja.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ImageSelected(image=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KIa$d$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */