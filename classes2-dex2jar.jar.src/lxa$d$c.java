public final class lxa$d$c
  extends lxa.d
{
  private final lka a;
  
  public lxa$d$c(lka paramlka)
  {
    super(null);
    this.a = paramlka;
  }
  
  public final lka a()
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
    lka locallka = this.a;
    int i;
    if (locallka != null) {
      i = locallka.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("GoPro(editorFilter=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lxa$d$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */