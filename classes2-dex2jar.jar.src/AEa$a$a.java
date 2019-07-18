public final class AEa$a$a
  extends AEa.a
{
  private final int b;
  private final Rja c;
  
  public AEa$a$a(int paramInt, Rja paramRja)
  {
    super(paramInt, null);
    this.b = paramInt;
    this.c = paramRja;
  }
  
  public final Rja b()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        int i;
        if (this.b == ((a)paramObject).b) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.c, ((a)paramObject).c))) {}
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
    Rja localRja = this.c;
    int j;
    if (localRja != null) {
      j = localRja.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NewPhoto(i=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", imageDesc=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/AEa$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */