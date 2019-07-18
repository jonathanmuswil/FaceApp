public final class Vza$a$d
  extends Vza.a
{
  private final oxa a;
  
  public Vza$a$d(oxa paramoxa)
  {
    super(null);
    this.a = paramoxa;
  }
  
  public final oxa a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof d))
      {
        paramObject = (d)paramObject;
        if (oXa.a(this.a, ((d)paramObject).a)) {}
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
    oxa localoxa = this.a;
    int i;
    if (localoxa != null) {
      i = localoxa.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SetCropType(cropType=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Vza$a$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */