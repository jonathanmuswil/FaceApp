public final class Rfa$d
  extends Rfa
{
  private final Throwable c;
  
  public Rfa$d(Throwable paramThrowable)
  {
    super(null);
    this.c = paramThrowable;
  }
  
  public final Throwable b()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof d))
      {
        paramObject = (d)paramObject;
        if (oXa.a(this.c, ((d)paramObject).c)) {}
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
    Throwable localThrowable = this.c;
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
    localStringBuilder.append("RetryableError(error=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Rfa$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */