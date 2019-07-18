public final class Zma$a$a
{
  private final long a;
  private final Zma.a.b b;
  
  public Zma$a$a()
  {
    this(0L, null, 3, null);
  }
  
  public Zma$a$a(long paramLong, Zma.a.b paramb)
  {
    this.a = paramLong;
    this.b = paramb;
  }
  
  public final a a(long paramLong, Zma.a.b paramb)
  {
    oXa.b(paramb, "faceDetectionState");
    return new a(paramLong, paramb);
  }
  
  public final Zma.a.b a()
  {
    return this.b;
  }
  
  public final long b()
  {
    return this.a;
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
        if ((i != 0) && (oXa.a(this.b, ((a)paramObject).b))) {}
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
    Zma.a.b localb = this.b;
    int j;
    if (localb != null) {
      j = localb.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FaceCacheEntity(lastUsedDate=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", faceDetectionState=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Zma$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */