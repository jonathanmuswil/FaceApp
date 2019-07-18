public final class _Pa$a
{
  private final long a;
  private final long b;
  private final int c;
  private final String d;
  private final String e;
  
  public _Pa$a(long paramLong1, long paramLong2, int paramInt, String paramString1, String paramString2)
  {
    this.a = paramLong1;
    this.b = paramLong2;
    this.c = paramInt;
    this.d = paramString1;
    this.e = paramString2;
  }
  
  public final String a()
  {
    return this.e;
  }
  
  public final int b()
  {
    return this.c;
  }
  
  public final String c()
  {
    return this.d;
  }
  
  public final long d()
  {
    return this.b;
  }
  
  public final long e()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        int i;
        if (this.a == ((a)paramObject).a) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
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
            if ((i != 0) && (oXa.a(this.d, ((a)paramObject).d)) && (oXa.a(this.e, ((a)paramObject).e))) {
              break label118;
            }
          }
        }
      }
      return false;
    }
    label118:
    return true;
  }
  
  public int hashCode()
  {
    long l = this.a;
    int i = (int)(l ^ l >>> 32);
    l = this.b;
    int j = (int)(l ^ l >>> 32);
    int k = this.c;
    String str = this.d;
    int m = 0;
    int n;
    if (str != null) {
      n = str.hashCode();
    } else {
      n = 0;
    }
    str = this.e;
    if (str != null) {
      m = str.hashCode();
    }
    return (((i * 31 + j) * 31 + k) * 31 + n) * 31 + m;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LogEvent(timestamp=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", threadId=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", priority=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", tag=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", message=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_Pa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */