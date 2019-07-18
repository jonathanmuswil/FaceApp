public final class LIa$c
  extends LIa
{
  private final Rka a;
  
  public LIa$c(Rka paramRka)
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
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if (oXa.a(this.a, ((c)paramObject).a)) {}
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
    localStringBuilder.append("CommentWithAvatar(vote=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/LIa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */