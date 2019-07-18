public final class sFa$b$e
  extends sFa.b
{
  private final yka a;
  
  public sFa$b$e(yka paramyka)
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
      if ((paramObject instanceof e))
      {
        paramObject = (e)paramObject;
        if (oXa.a(this.a, ((e)paramObject).a)) {}
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
    localStringBuilder.append("PaidFilterClicked(filter=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sFa$b$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */