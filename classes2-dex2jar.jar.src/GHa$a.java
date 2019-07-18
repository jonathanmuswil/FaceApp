public final class GHa$a
  extends GHa
{
  private final HHa.a b;
  private final boolean c;
  
  public GHa$a(HHa.a parama, boolean paramBoolean)
  {
    super(parama.a(), null);
    this.b = parama;
    this.c = paramBoolean;
  }
  
  public final HHa.a b()
  {
    return this.b;
  }
  
  public final boolean c()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if (oXa.a(this.b, ((a)paramObject).b))
        {
          int i;
          if (this.c == ((a)paramObject).c) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label58;
          }
        }
      }
      return false;
    }
    label58:
    return true;
  }
  
  public int hashCode()
  {
    HHa.a locala = this.b;
    int i;
    if (locala != null) {
      i = locala.hashCode();
    } else {
      i = 0;
    }
    int j = this.c;
    int k = j;
    if (j != 0) {
      k = 1;
    }
    return i * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdsUser(purchasePage=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", isTrial=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/GHa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */