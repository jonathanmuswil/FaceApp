public final class UNa$b$h
  extends UNa.b
{
  private final String a;
  private final boolean b;
  
  public UNa$b$h(String paramString, boolean paramBoolean)
  {
    super(null);
    this.a = paramString;
    this.b = paramBoolean;
  }
  
  public final String a()
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
      if ((paramObject instanceof h))
      {
        paramObject = (h)paramObject;
        if (oXa.a(this.a, ((h)paramObject).a))
        {
          int i;
          if (this.b == ((h)paramObject).b) {
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
    String str = this.a;
    int i;
    if (str != null) {
      i = str.hashCode();
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
    localStringBuilder.append("LogoutFacebook(accountId=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", confirmed=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/UNa$b$h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */