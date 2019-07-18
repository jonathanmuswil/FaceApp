public final class LIa$d
  extends LIa
{
  private final Mka a;
  private final boolean b;
  
  public LIa$d(Mka paramMka, boolean paramBoolean)
  {
    super(null);
    this.a = paramMka;
    this.b = paramBoolean;
  }
  
  public final Mka a()
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
      if ((paramObject instanceof d))
      {
        paramObject = (d)paramObject;
        if (oXa.a(this.a, ((d)paramObject).a))
        {
          int i;
          if (this.b == ((d)paramObject).b) {
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
    Mka localMka = this.a;
    int i;
    if (localMka != null) {
      i = localMka.hashCode();
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
    localStringBuilder.append("Image(poll=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", showResult=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/LIa$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */