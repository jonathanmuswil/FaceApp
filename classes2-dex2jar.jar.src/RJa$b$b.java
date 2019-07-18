public final class RJa$b$b
  extends RJa.b
{
  private final RJa.a a;
  
  public RJa$b$b(RJa.a parama)
  {
    super(null);
    this.a = parama;
  }
  
  public final RJa.a a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if (oXa.a(this.a, ((b)paramObject).a)) {}
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
    RJa.a locala = this.a;
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
    localStringBuilder.append("ProOptionClicked(proItem=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/RJa$b$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */