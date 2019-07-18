import java.io.IOException;

class q_a$f
  extends q_a.a
{
  private boolean d;
  
  private q_a$f(q_a paramq_a)
  {
    super(paramq_a, null);
  }
  
  public long b(jab paramjab, long paramLong)
    throws IOException
  {
    if (paramLong >= 0L)
    {
      if (!this.b)
      {
        if (this.d) {
          return -1L;
        }
        paramLong = super.b(paramjab, paramLong);
        if (paramLong == -1L)
        {
          this.d = true;
          a();
          return -1L;
        }
        return paramLong;
      }
      throw new IllegalStateException("closed");
    }
    paramjab = new StringBuilder();
    paramjab.append("byteCount < 0: ");
    paramjab.append(paramLong);
    throw new IllegalArgumentException(paramjab.toString());
  }
  
  public void close()
    throws IOException
  {
    if (this.b) {
      return;
    }
    if (!this.d) {
      a();
    }
    this.b = true;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/q_a$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */