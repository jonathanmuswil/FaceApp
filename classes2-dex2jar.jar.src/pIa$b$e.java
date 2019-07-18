public final class pIa$b$e
  extends pIa.b
{
  private final KDa a;
  
  public pIa$b$e(KDa paramKDa)
  {
    super(null);
    this.a = paramKDa;
  }
  
  public final KDa a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof e))
      {
        paramObject = (e)paramObject;
        if (oXa.a(this.a, ((e)paramObject).a)) {}
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
    KDa localKDa = this.a;
    int i;
    if (localKDa != null) {
      i = localKDa.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LayoutsAddPhoto(target=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pIa$b$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */