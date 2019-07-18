final class eoa$d
{
  private final eoa.c a;
  private long b;
  private Boolean c;
  
  public eoa$d(eoa.c paramc, long paramLong, Boolean paramBoolean)
  {
    this.a = paramc;
    this.b = paramLong;
    this.c = paramBoolean;
  }
  
  public final long a()
  {
    return this.b;
  }
  
  public final void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public final void a(Boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public final eoa.c b()
  {
    return this.a;
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
          if ((i != 0) && (oXa.a(this.c, ((d)paramObject).c))) {
            break label73;
          }
        }
      }
      return false;
    }
    label73:
    return true;
  }
  
  public int hashCode()
  {
    Object localObject = this.a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((eoa.c)localObject).hashCode();
    } else {
      j = 0;
    }
    long l = this.b;
    int k = (int)(l ^ l >>> 32);
    localObject = this.c;
    if (localObject != null) {
      i = ((Boolean)localObject).hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("RecentPhotoInner(photo=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", lastUsedDate=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", faceDetected=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/eoa$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */