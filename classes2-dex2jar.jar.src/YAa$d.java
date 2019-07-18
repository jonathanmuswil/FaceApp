public final class YAa$d
  extends YAa
{
  private final lka b;
  
  public YAa$d(lka paramlka)
  {
    super(null);
    this.b = paramlka;
  }
  
  public VOa a()
  {
    return this.b.n();
  }
  
  public String b()
  {
    String str = this.b.o();
    if (str != null) {
      return str;
    }
    throw new IllegalArgumentException("Required value was null.");
  }
  
  public String c()
  {
    return this.b.p();
  }
  
  public String d()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FILTER_PREVIEW_");
    localStringBuilder.append(this.b.m());
    return localStringBuilder.toString();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof d))
      {
        paramObject = (d)paramObject;
        if (oXa.a(this.b, ((d)paramObject).b)) {}
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
    lka locallka = this.b;
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
    localStringBuilder.append("FilterProBannerSource(filter=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/YAa$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */