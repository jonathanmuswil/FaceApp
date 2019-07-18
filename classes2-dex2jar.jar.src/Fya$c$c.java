public final class Fya$c$c
  extends Fya.c
{
  private final jka a;
  
  public Fya$c$c(jka paramjka)
  {
    super(null);
    this.a = paramjka;
  }
  
  public final jka a()
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
    jka localjka = this.a;
    int i;
    if (localjka != null) {
      i = localjka.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SelectAdjust(adjust=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Fya$c$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */