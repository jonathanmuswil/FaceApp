public final class YAa$c
  extends YAa
{
  private final tka b;
  
  public YAa$c(tka paramtka)
  {
    super(null);
    this.b = paramtka;
  }
  
  public VOa a()
  {
    return this.b.b();
  }
  
  public String b()
  {
    String str = this.b.c();
    if (str != null) {
      return str;
    }
    throw new IllegalArgumentException("Required value was null.");
  }
  
  public String c()
  {
    return this.b.d();
  }
  
  public String d()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EFFECT_PREVIEW_");
    localStringBuilder.append(this.b.a());
    return localStringBuilder.toString();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if (oXa.a(this.b, ((c)paramObject).b)) {}
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
    tka localtka = this.b;
    int i;
    if (localtka != null) {
      i = localtka.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EffectProBannerSource(effect=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/YAa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */