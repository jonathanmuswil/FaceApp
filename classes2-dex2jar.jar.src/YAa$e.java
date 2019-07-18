public final class YAa$e
  extends YAa
{
  private final Gka b;
  
  public YAa$e(Gka paramGka)
  {
    super(null);
    this.b = paramGka;
  }
  
  public VOa a()
  {
    return this.b.c();
  }
  
  public String b()
  {
    String str = this.b.f();
    if (str != null) {
      return str;
    }
    throw new IllegalArgumentException("Required value was null.");
  }
  
  public String c()
  {
    return this.b.g();
  }
  
  public String d()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("OVERLAY_PREVIEW_");
    localStringBuilder.append(this.b.b());
    return localStringBuilder.toString();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof e))
      {
        paramObject = (e)paramObject;
        if (oXa.a(this.b, ((e)paramObject).b)) {}
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
    Gka localGka = this.b;
    int i;
    if (localGka != null) {
      i = localGka.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("OverlayProBannerSource(over=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/YAa$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */