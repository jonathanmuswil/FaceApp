import java.io.IOException;

final class q_a$b
  implements Dab
{
  private final pab a = new pab(q_a.b(this.c).n());
  private boolean b;
  
  q_a$b(q_a paramq_a) {}
  
  public void a(jab paramjab, long paramLong)
    throws IOException
  {
    if (!this.b)
    {
      if (paramLong == 0L) {
        return;
      }
      q_a.b(this.c).d(paramLong);
      q_a.b(this.c).a("\r\n");
      q_a.b(this.c).a(paramjab, paramLong);
      q_a.b(this.c).a("\r\n");
      return;
    }
    throw new IllegalStateException("closed");
  }
  
  public void close()
    throws IOException
  {
    try
    {
      boolean bool = this.b;
      if (bool) {
        return;
      }
      this.b = true;
      q_a.b(this.c).a("0\r\n\r\n");
      q_a.a(this.c, this.a);
      q_a.a(this.c, 3);
      return;
    }
    finally {}
  }
  
  public void flush()
    throws IOException
  {
    try
    {
      boolean bool = this.b;
      if (bool) {
        return;
      }
      q_a.b(this.c).flush();
      return;
    }
    finally {}
  }
  
  public Gab n()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/q_a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */