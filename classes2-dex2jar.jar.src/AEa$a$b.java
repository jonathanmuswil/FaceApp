public final class AEa$a$b
  extends AEa.a
{
  private final int b;
  private final Eda c;
  private final String d;
  
  public AEa$a$b(int paramInt, Eda paramEda, String paramString)
  {
    super(paramInt, null);
    this.b = paramInt;
    this.c = paramEda;
    this.d = paramString;
  }
  
  public final String b()
  {
    return this.d;
  }
  
  public final Eda c()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        int i;
        if (this.b == ((b)paramObject).b) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.c, ((b)paramObject).c)) && (oXa.a(this.d, ((b)paramObject).d))) {}
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
    int i = this.b;
    Object localObject = this.c;
    int j = 0;
    int k;
    if (localObject != null) {
      k = ((Eda)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.d;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    }
    return (i * 31 + k) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("UploadedPhoto(i=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", photoOp=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", filterId=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/AEa$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */