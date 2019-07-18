public final class lxa$e$a
  extends lxa.e
{
  private final Eka a;
  
  public lxa$e$a(Eka paramEka)
  {
    super(null);
    this.a = paramEka;
  }
  
  public final Eka a()
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
    Eka localEka = this.a;
    int i;
    if (localEka != null) {
      i = localEka.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FilterClicked(filter=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lxa$e$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */