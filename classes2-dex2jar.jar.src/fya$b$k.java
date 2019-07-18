public final class fya$b$k
  extends fya.b
{
  private final lya a;
  
  public fya$b$k(lya paramlya)
  {
    super(null);
    this.a = paramlya;
  }
  
  public final lya a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof k))
      {
        paramObject = (k)paramObject;
        if (oXa.a(this.a, ((k)paramObject).a)) {}
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
    lya locallya = this.a;
    int i;
    if (locallya != null) {
      i = locallya.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SwitchToTool(type=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fya$b$k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */