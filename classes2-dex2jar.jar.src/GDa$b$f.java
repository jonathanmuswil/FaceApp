public final class GDa$b$f
  extends GDa.b
{
  private final nsa.b a;
  
  public GDa$b$f(nsa.b paramb)
  {
    super(null);
    this.a = paramb;
  }
  
  public final nsa.b a()
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
    nsa.b localb = this.a;
    int i;
    if (localb != null) {
      i = localb.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ShareTwitter(sharedImage=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/GDa$b$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */