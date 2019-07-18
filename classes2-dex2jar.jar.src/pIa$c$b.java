public final class pIa$c$b
  extends pIa.c
{
  private final Rja a;
  private final pIa.a b;
  private final String c;
  
  public pIa$c$b(Rja paramRja, pIa.a parama, String paramString)
  {
    super(null);
    this.a = paramRja;
    this.b = parama;
    this.c = paramString;
  }
  
  public final Rja a()
  {
    return this.a;
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public final pIa.a c()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if ((oXa.a(this.a, ((b)paramObject).a)) && (oXa.a(this.b, ((b)paramObject).b)) && (oXa.a(this.c, ((b)paramObject).c))) {}
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
    int k;
    if (localObject != null) {
      k = ((Enum)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.c;
    if (localObject != null) {
      i = ((String)localObject).hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Uploading(imageDesc=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", startMode=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", payload=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pIa$c$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */