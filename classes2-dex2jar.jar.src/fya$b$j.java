public final class fya$b$j
  extends fya.b
{
  private final mka a;
  
  public fya$b$j(mka parammka)
  {
    super(null);
    this.a = parammka;
  }
  
  public final mka a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof j))
      {
        paramObject = (j)paramObject;
        if (oXa.a(this.a, ((j)paramObject).a)) {}
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
    mka localmka = this.a;
    int i;
    if (localmka != null) {
      i = localmka.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SwitchToFolder(folder=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fya$b$j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */