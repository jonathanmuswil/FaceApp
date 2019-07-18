public final class Awa$b$a
  extends Awa.b
{
  private final String a;
  private final wwa b;
  
  public Awa$b$a(String paramString, wwa paramwwa)
  {
    super(null);
    this.a = paramString;
    this.b = paramwwa;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final wwa b()
  {
    return this.b;
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
    Object localObject = this.a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    if (localObject != null) {
      i = ((Enum)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Content(draft=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", mode=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Awa$b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */