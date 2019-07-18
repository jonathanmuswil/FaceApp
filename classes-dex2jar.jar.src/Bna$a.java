public final class Bna$a
{
  private final long a;
  private final String b;
  private String c;
  
  public Bna$a(long paramLong, String paramString1, String paramString2)
  {
    this.a = paramLong;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public final long a()
  {
    return this.a;
  }
  
  public final void a(String paramString)
  {
    this.c = paramString;
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public final String c()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        int i;
        if (this.a == ((a)paramObject).a) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.b, ((a)paramObject).b)) && (oXa.a(this.c, ((a)paramObject).c))) {}
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
    long l = this.a;
    int i = (int)(l ^ l >>> 32);
    String str = this.b;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = this.c;
    if (str != null) {
      j = str.hashCode();
    }
    return (i * 31 + k) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("GalleryImage(id=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", uri=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", thumbUri=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Bna$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */