public final class KFa$b$b
  extends KFa.b
{
  private final String a;
  private final String b;
  
  public KFa$b$b(String paramString1, String paramString2)
  {
    super(null);
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if ((oXa.a(this.a, ((b)paramObject).a)) && (oXa.a(this.b, ((b)paramObject).b))) {}
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
    localStringBuilder.append("FilterUnselected(sectionId=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", filterId=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KFa$b$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */