public final class Rfa$g
  extends Rfa
{
  private final String c;
  
  public Rfa$g(String paramString)
  {
    super(null);
    this.c = paramString;
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof g))
      {
        paramObject = (g)paramObject;
        if (oXa.a(this.c, ((g)paramObject).c)) {}
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
    String str = this.c;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("WebImageNotFound(imageUrl=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Rfa$g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */