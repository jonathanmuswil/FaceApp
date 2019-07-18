public final class Rva$e$c
  extends Rva.e
{
  private final Mka a;
  
  public Rva$e$c(Mka paramMka)
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
    localStringBuilder.append("Ready(createdPoll=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Rva$e$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */