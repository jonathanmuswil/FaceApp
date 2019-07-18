public final class pIa$b$f
  extends pIa.b
{
  private final KDa a;
  private final Eda b;
  private final yka c;
  
  public pIa$b$f(KDa paramKDa, Eda paramEda, yka paramyka)
  {
    super(null);
    this.a = paramKDa;
    this.b = paramEda;
    this.c = paramyka;
  }
  
  public final yka a()
  {
    return this.c;
  }
  
  public final Eda b()
  {
    return this.b;
  }
  
  public final KDa c()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof f))
      {
        paramObject = (f)paramObject;
        if ((oXa.a(this.a, ((f)paramObject).a)) && (oXa.a(this.b, ((f)paramObject).b)) && (oXa.a(this.c, ((f)paramObject).c))) {}
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
      k = ((Eda)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.c;
    if (localObject != null) {
      i = ((yka)localObject).hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LayoutsFilterSelected(target=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", photoOp=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", filter=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pIa$b$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */