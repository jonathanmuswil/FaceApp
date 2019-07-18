import java.io.IOException;

final class q_a$e
  implements Dab
{
  private final pab a = new pab(q_a.b(this.c).n());
  private boolean b;
  
  private q_a$e(q_a paramq_a) {}
  
  public void a(jab paramjab, long paramLong)
    throws IOException
  {
    if (!this.b)
    {
      LZa.a(paramjab.size(), 0L, paramLong);
      q_a.b(this.c).a(paramjab, paramLong);
      return;
    }
    throw new IllegalStateException("closed");
  }
  
  public void close()
    throws IOException
  {
    if (this.b) {
      return;
    }
    this.b = true;
    q_a.a(this.c, this.a);
    q_a.a(this.c, 3);
  }
  
  public void flush()
    throws IOException
  {
    if (this.b) {
      return;
    }
    q_a.b(this.c).flush();
  }
  
  public Gab n()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/q_a$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */