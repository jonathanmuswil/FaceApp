public final class pIa$b$l
  extends pIa.b
{
  private final Eda a;
  
  public pIa$b$l(Eda paramEda)
  {
    super(null);
    this.a = paramEda;
  }
  
  public final Eda a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof l))
      {
        paramObject = (l)paramObject;
        if (oXa.a(this.a, ((l)paramObject).a)) {}
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
    Eda localEda = this.a;
    int i;
    if (localEda != null) {
      i = localEda.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PhotoUploaded(uploadedPhotoOp=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pIa$b$l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */