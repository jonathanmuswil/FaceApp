public final class qBa$b
  extends qBa
{
  private final Throwable a;
  
  public qBa$b(Throwable paramThrowable)
  {
    super(null);
    this.a = paramThrowable;
  }
  
  public final Throwable a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if (oXa.a(this.a, ((b)paramObject).a)) {}
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
    Throwable localThrowable = this.a;
    int i;
    if (localThrowable != null) {
      i = localThrowable.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Failure(reason=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qBa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */