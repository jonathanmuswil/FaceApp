public final class KAa$b$b
  extends KAa.b
{
  private final Gka a;
  
  public KAa$b$b(Gka paramGka)
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
    localStringBuilder.append("SelectPro(overlay=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KAa$b$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */