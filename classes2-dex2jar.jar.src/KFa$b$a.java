public final class KFa$b$a
  extends KFa.b
{
  private final String a;
  private final String b;
  
  public KFa$b$a(String paramString1, String paramString2)
  {
    super(null);
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final String b()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b))) {}
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
    String str = this.a;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = this.b;
    if (str != null) {
      i = str.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FilterSelected(sectionId=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", filterId=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KFa$b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */