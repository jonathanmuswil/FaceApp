import java.io.Serializable;

final class tVa$b
  implements Serializable
{
  final Throwable a;
  
  tVa$b(Throwable paramThrowable)
  {
    this.a = paramThrowable;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof b))
    {
      paramObject = (b)paramObject;
      return ORa.a(this.a, ((b)paramObject).a);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NotificationLite.Error[");
    localStringBuilder.append(this.a);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tVa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */