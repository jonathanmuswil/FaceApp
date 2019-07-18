public final class LIa$i
  extends LIa
{
  private final Mka a;
  
  public LIa$i(Mka paramMka)
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
      if ((paramObject instanceof i))
      {
        paramObject = (i)paramObject;
        if (oXa.a(this.a, ((i)paramObject).a)) {}
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
    localStringBuilder.append("VoteBtn(poll=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/LIa$i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */