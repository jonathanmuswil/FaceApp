public final class vsa$a
{
  private final String a;
  private final String b;
  private final String c;
  private final int d;
  
  public vsa$a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramInt;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public final int c()
  {
    return this.d;
  }
  
  public final String d()
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
        if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b)) && (oXa.a(this.c, ((a)paramObject).c)))
        {
          int i;
          if (this.d == ((a)paramObject).d) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label86;
          }
        }
      }
      return false;
    }
    label86:
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
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = this.c;
    if (str != null) {
      i = str.hashCode();
    }
    return ((j * 31 + k) * 31 + i) * 31 + this.d;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CacheInfo(fileMd5=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", photoCode=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", hostName=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", hostPort=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vsa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */