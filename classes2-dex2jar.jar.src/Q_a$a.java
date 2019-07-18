import java.io.IOException;

abstract class q_a$a
  implements Eab
{
  protected final pab a = new pab(q_a.d(this.c).n());
  protected boolean b;
  
  private q_a$a(q_a paramq_a) {}
  
  final void a()
  {
    if (q_a.c(this.c) == 6) {
      return;
    }
    if (q_a.c(this.c) == 5)
    {
      q_a.a(this.c, this.a);
      q_a.a(this.c, 6);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("state: ");
    localStringBuilder.append(q_a.c(this.c));
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public long b(jab paramjab, long paramLong)
    throws IOException
  {
    try
    {
      paramLong = q_a.d(this.c).b(paramjab, paramLong);
      return paramLong;
    }
    catch (IOException paramjab)
    {
      q_a.e(this.c).e();
      a();
      throw paramjab;
    }
  }
  
  public Gab n()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/q_a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */