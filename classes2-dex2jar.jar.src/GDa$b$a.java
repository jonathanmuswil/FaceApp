public final class GDa$b$a
  extends GDa.b
{
  private final nsa.b a;
  
  public GDa$b$a(nsa.b paramb)
  {
    super(null);
    this.a = paramb;
  }
  
  public final nsa.b a()
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
    nsa.b localb = this.a;
    int i;
    if (localb != null) {
      i = localb.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SaveToGallery(sharedImage=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/GDa$b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */