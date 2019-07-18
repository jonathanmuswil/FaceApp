public final class lja$c
  extends lja
{
  private final qja c;
  private final String d;
  
  public lja$c(qja paramqja, String paramString)
  {
    super(lja.e.c, null);
    this.c = paramqja;
    this.d = paramString;
  }
  
  public final String a()
  {
    return this.d;
  }
  
  public final qja b()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if ((oXa.a(this.c, ((c)paramObject).c)) && (oXa.a(this.d, ((c)paramObject).d))) {}
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
    Object localObject = this.c;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((Enum)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.d;
    if (localObject != null) {
      i = ((String)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DebugPro(");
    localStringBuilder.append(this.c.f());
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lja$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */