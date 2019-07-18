public final class eoa$c
{
  private final Rja a;
  private final eoa.b b;
  
  public eoa$c(Rja paramRja, eoa.b paramb)
  {
    this.a = paramRja;
    this.b = paramb;
  }
  
  public final Rja a()
  {
    return this.a;
  }
  
  public final eoa.b b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if ((oXa.a(this.a, ((c)paramObject).a)) && (oXa.a(this.b, ((c)paramObject).b))) {}
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
      j = localObject.hashCode();
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
    localStringBuilder.append("RecentPhoto(imageDesc=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", source=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/eoa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */