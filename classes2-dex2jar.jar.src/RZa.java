public final class rza
  extends Iza<String>
{
  private final boolean a;
  
  public rza(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public Iza<String> a(boolean paramBoolean)
  {
    return new rza(paramBoolean);
  }
  
  public boolean a()
  {
    return this.a;
  }
  
  public boolean a(String paramString)
  {
    oXa.b(paramString, "selection");
    return oXa.a(paramString, "android-gallery");
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof rza))
      {
        paramObject = (rza)paramObject;
        int i;
        if (a() == ((rza)paramObject).a()) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {}
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
    int i = a();
    int j = i;
    if (i != 0) {
      j = 1;
    }
    return j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("GalleryItem(selected=");
    localStringBuilder.append(a());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */