public final class UNa$c$a
  extends UNa.c
{
  private final String a;
  private final String b;
  private final String c;
  private final dka d;
  
  public UNa$c$a(String paramString1, String paramString2, String paramString3, dka paramdka)
  {
    super(null);
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramdka;
  }
  
  public final String a()
  {
    return this.c;
  }
  
  public final String b()
  {
    return this.a;
  }
  
  public final String c()
  {
    return this.b;
  }
  
  public final dka d()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b)) && (oXa.a(this.c, ((a)paramObject).c)) && (oXa.a(this.d, ((a)paramObject).d))) {}
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
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.c;
    int m;
    if (localObject != null) {
      m = ((String)localObject).hashCode();
    } else {
      m = 0;
    }
    localObject = this.d;
    if (localObject != null) {
      i = ((dka)localObject).hashCode();
    }
    return ((j * 31 + k) * 31 + m) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Content(firstName=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", lastName=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", avatarUri=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", user=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/UNa$c$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */