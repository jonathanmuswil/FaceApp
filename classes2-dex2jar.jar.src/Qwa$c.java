final class Qwa$c
{
  private final lxa.b a;
  private final Eka b;
  private final boolean c;
  
  public Qwa$c(lxa.b paramb, Eka paramEka, boolean paramBoolean)
  {
    this.a = paramb;
    this.b = paramEka;
    this.c = paramBoolean;
  }
  
  public final Eka a()
  {
    return this.b;
  }
  
  public final lxa.b b()
  {
    return this.a;
  }
  
  public final boolean c()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if ((oXa.a(this.a, ((c)paramObject).a)) && (oXa.a(this.b, ((c)paramObject).b)))
        {
          int i;
          if (this.c == ((c)paramObject).c) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label72;
          }
        }
      }
      return false;
    }
    label72:
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
      i = ((Eka)localObject).hashCode();
    }
    int k = this.c;
    int m = k;
    if (k != 0) {
      m = 1;
    }
    return (j * 31 + i) * 31 + m;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("GeneralImageState(viewModel=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", filter=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", isPro=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Qwa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */