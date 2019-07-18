public final class pIa$b$n
  extends pIa.b
{
  private final pIa.a a;
  
  public pIa$b$n(pIa.a parama)
  {
    super(null);
    this.a = parama;
  }
  
  public final pIa.a a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof n))
      {
        paramObject = (n)paramObject;
        if (oXa.a(this.a, ((n)paramObject).a)) {}
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
    pIa.a locala = this.a;
    int i;
    if (locala != null) {
      i = locala.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SwitchToMode(newMode=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pIa$b$n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */