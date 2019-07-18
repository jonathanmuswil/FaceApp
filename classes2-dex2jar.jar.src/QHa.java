public final class qHa
{
  private final boolean a;
  private final String b;
  
  public final String a()
  {
    return this.b;
  }
  
  public final boolean b()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof qHa))
      {
        paramObject = (qHa)paramObject;
        int i;
        if (this.a == ((qHa)paramObject).a) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.b, ((qHa)paramObject).b))) {}
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
    boolean bool1 = this.a;
    boolean bool2 = bool1;
    if (bool1) {
      bool2 = true;
    }
    String str = this.b;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return bool2 * true + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ServerContractFailedModel(isFatal=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", message=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qHa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */