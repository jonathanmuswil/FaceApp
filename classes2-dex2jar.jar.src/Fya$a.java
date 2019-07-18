public final class fya$a
{
  private final oka a;
  private final boolean b;
  private final boolean c;
  
  public fya$a(oka paramoka, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramoka;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
  }
  
  public final boolean a()
  {
    return this.c;
  }
  
  public final oka b()
  {
    return this.a;
  }
  
  public final boolean c()
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
    oka localoka = this.a;
    int i;
    if (localoka != null) {
      i = localoka.hashCode();
    } else {
      i = 0;
    }
    int j = this.b;
    int k = j;
    int m;
    if (j != 0) {
      m = 1;
    }
    int n = this.c;
    j = n;
    if (n != 0) {
      j = 1;
    }
    return (i * 31 + m) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ToolsModel(mode=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", isPro=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", demoMode=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fya$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */