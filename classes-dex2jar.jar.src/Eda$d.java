final class Eda$d
{
  private final String a;
  private final boolean b;
  private final boolean c;
  
  public Eda$d(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramString;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof d))
      {
        paramObject = (d)paramObject;
        if (oXa.a(this.a, ((d)paramObject).a))
        {
          int i;
          if (this.b == ((d)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.c == ((d)paramObject).c) {
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
    localStringBuilder.append("OpFilterKey(filterId=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", noWatermark=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", noArrow=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Eda$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */