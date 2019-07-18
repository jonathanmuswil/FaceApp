import java.io.Serializable;

final class tVa$c
  implements Serializable
{
  final Pab a;
  
  tVa$c(Pab paramPab)
  {
    this.a = paramPab;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NotificationLite.Subscription[");
    localStringBuilder.append(this.a);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tVa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */