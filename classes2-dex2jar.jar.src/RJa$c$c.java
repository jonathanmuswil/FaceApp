public final class RJa$c$c
  extends RJa.c
{
  private final qja a;
  private final boolean b;
  
  public RJa$c$c(qja paramqja, boolean paramBoolean)
  {
    super(null);
    this.a = paramqja;
    this.b = paramBoolean;
  }
  
  public final qja a()
  {
    return this.a;
  }
  
  public final boolean b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if (oXa.a(this.a, ((c)paramObject).a))
        {
          int i;
          if (this.b == ((c)paramObject).b) {
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
    qja localqja = this.a;
    int i;
    if (localqja != null) {
      i = localqja.hashCode();
    } else {
      i = 0;
    }
    int j = this.b;
    int k = j;
    if (j != 0) {
      k = 1;
    }
    return i * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Purchased(sku=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", isDebugPurchase=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/RJa$c$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */