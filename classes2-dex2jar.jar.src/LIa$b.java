public final class LIa$b
  extends LIa
{
  private final Rka a;
  
  public LIa$b(Rka paramRka)
  {
    super(null);
    this.a = paramRka;
  }
  
  public final Rka a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if (oXa.a(this.a, ((b)paramObject).a)) {}
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
    Rka localRka = this.a;
    int i;
    if (localRka != null) {
      i = localRka.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Comment(vote=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/LIa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */