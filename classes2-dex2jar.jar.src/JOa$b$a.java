public final class JOa$b$a
  extends JOa.b
{
  private final String a;
  private final int b;
  private final int c;
  
  public JOa$b$a(String paramString, int paramInt1, int paramInt2)
  {
    super(null);
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final int b()
  {
    return this.c;
  }
  
  public final int c()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if (oXa.a(this.a, ((a)paramObject).a))
        {
          int i;
          if (this.b == ((a)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.c == ((a)paramObject).c) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label80;
            }
          }
        }
      }
      return false;
    }
    label80:
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
    return (i * 31 + this.b) * 31 + this.c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AddToComment(additionText=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", selectionStart=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", selectionEnd=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/JOa$b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */