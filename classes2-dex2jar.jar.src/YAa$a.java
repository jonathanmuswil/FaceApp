public final class YAa$a
  extends YAa
{
  private final kka b;
  
  public YAa$a(kka paramkka)
  {
    super(null);
    this.b = paramkka;
  }
  
  public VOa a()
  {
    return this.b.c();
  }
  
  public String b()
  {
    String str = this.b.e();
    if (str != null) {
      return str;
    }
    throw new IllegalArgumentException("Required value was null.");
  }
  
  public String c()
  {
    return this.b.f();
  }
  
  public String d()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("BACKGROUND_PREVIEW_");
    localStringBuilder.append(this.b.b());
    return localStringBuilder.toString();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if (oXa.a(this.b, ((a)paramObject).b)) {}
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
    kka localkka = this.b;
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
    localStringBuilder.append("BackgroundProBannerSource(back=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/YAa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */