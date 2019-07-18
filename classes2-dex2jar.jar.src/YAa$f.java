public final class YAa$f
  extends YAa
{
  private final Kka b;
  
  public YAa$f(Kka paramKka)
  {
    super(null);
    this.b = paramKka;
  }
  
  public VOa a()
  {
    return this.b.c();
  }
  
  public String b()
  {
    String str = this.b.d();
    if (str != null) {
      return str;
    }
    throw new IllegalArgumentException("Required value was null.");
  }
  
  public String c()
  {
    return this.b.e();
  }
  
  public String d()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("TATOO_PREVIEW_");
    localStringBuilder.append(this.b.b());
    return localStringBuilder.toString();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof f))
      {
        paramObject = (f)paramObject;
        if (oXa.a(this.b, ((f)paramObject).b)) {}
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
    Kka localKka = this.b;
    int i;
    if (localKka != null) {
      i = localKka.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("TatooProBannerSource(tatoo=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/YAa$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */