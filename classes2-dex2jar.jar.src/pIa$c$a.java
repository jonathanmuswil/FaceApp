public final class pIa$c$a
  extends pIa.c
{
  private final pIa.a a;
  private final rIa<?> b;
  private final String c;
  
  public pIa$c$a(pIa.a parama, rIa<?> paramrIa, String paramString)
  {
    super(null);
    this.a = parama;
    this.b = paramrIa;
    this.c = paramString;
  }
  
  public final String a()
  {
    return this.c;
  }
  
  public final pIa.a b()
  {
    return this.a;
  }
  
  public final rIa<?> c()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b)) && (oXa.a(this.c, ((a)paramObject).c))) {}
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
      j = ((Enum)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    int k;
    if (localObject != null) {
      k = localObject.hashCode();
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
    localStringBuilder.append("Content(mode=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", modePresenter=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", deviceId=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pIa$c$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */