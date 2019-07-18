public final class mza$b$e
  extends mza.b
{
  private final kka a;
  
  public mza$b$e(kka paramkka)
  {
    super(null);
    this.a = paramkka;
  }
  
  public final kka a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof e))
      {
        paramObject = (e)paramObject;
        if (oXa.a(this.a, ((e)paramObject).a)) {}
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
    kka localkka = this.a;
    int i;
    if (localkka != null) {
      i = localkka.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SelectPro(item=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mza$b$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */