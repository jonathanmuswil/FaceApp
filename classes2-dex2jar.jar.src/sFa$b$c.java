public final class sFa$b$c
  extends sFa.b
{
  private final yka a;
  
  public sFa$b$c(yka paramyka)
  {
    super(null);
    this.a = paramyka;
  }
  
  public final yka a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if (oXa.a(this.a, ((c)paramObject).a)) {}
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
    yka localyka = this.a;
    int i;
    if (localyka != null) {
      i = localyka.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("GoPro(filter=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sFa$b$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */