public final class lya$g
  extends lya
{
  private final rka c;
  private final pya d;
  
  public lya$g(rka paramrka, pya parampya)
  {
    super(paramrka, null);
    this.c = paramrka;
    this.d = parampya;
  }
  
  public rka a()
  {
    return this.c;
  }
  
  public final pya b()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof g))
      {
        paramObject = (g)paramObject;
        if ((oXa.a(a(), ((g)paramObject).a())) && (oXa.a(this.d, ((g)paramObject).d))) {}
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
    Object localObject = a();
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((rka)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.d;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("RangeTool(tool=");
    localStringBuilder.append(a());
    localStringBuilder.append(", range=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lya$g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */