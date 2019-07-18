public final class KAa$b$a
  extends KAa.b
{
  private final Gka a;
  
  public KAa$b$a(Gka paramGka)
  {
    super(null);
    this.a = paramGka;
  }
  
  public final Gka a()
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
    Gka localGka = this.a;
    int i;
    if (localGka != null) {
      i = localGka.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SelectOverlay(overlay=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KAa$b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */