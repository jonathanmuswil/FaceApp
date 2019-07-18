public final class lya$a
  extends lya
{
  private final rka c;
  
  public lya$a(rka paramrka)
  {
    super(paramrka, null);
    this.c = paramrka;
  }
  
  public rka a()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if (oXa.a(a(), ((a)paramObject).a())) {}
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
    rka localrka = a();
    int i;
    if (localrka != null) {
      i = localrka.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdjustmentsTool(tool=");
    localStringBuilder.append(a());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lya$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */