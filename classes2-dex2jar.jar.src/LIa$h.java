public final class LIa$h
  extends LIa
{
  private final Mka a;
  
  public LIa$h(Mka paramMka)
  {
    super(null);
    this.a = paramMka;
  }
  
  public final Mka a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof h))
      {
        paramObject = (h)paramObject;
        if (oXa.a(this.a, ((h)paramObject).a)) {}
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
    Mka localMka = this.a;
    int i;
    if (localMka != null) {
      i = localMka.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ShowAllComments(poll=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/LIa$h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */