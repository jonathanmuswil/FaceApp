public final class mza$b$c
  extends mza.b
{
  private final kka a;
  
  public mza$b$c(kka paramkka)
  {
    super(null);
    this.a = paramkka;
  }
  
  public final kka a()
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
    kka localkka = this.a;
    int i;
    if (localkka != null) {
      i = localkka.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SelectBackground(item=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mza$b$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */