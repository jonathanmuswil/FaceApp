public final class pIa$b$g
  extends pIa.b
{
  private final JDa a;
  
  public pIa$b$g(JDa paramJDa)
  {
    super(null);
    this.a = paramJDa;
  }
  
  public final JDa a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof g))
      {
        paramObject = (g)paramObject;
        if (oXa.a(this.a, ((g)paramObject).a)) {}
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
    JDa localJDa = this.a;
    int i;
    if (localJDa != null) {
      i = localJDa.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LayoutsFilterSelectorRequested(request=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pIa$b$g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */