import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

class q_a$d
  extends q_a.a
{
  private long d;
  
  q_a$d(q_a paramq_a, long paramLong)
  {
    super(paramq_a, null);
    this.d = paramLong;
    if (this.d == 0L) {
      a();
    }
  }
  
  public long b(jab paramjab, long paramLong)
    throws IOException
  {
    if (paramLong >= 0L)
    {
      if (!this.b)
      {
        long l = this.d;
        if (l == 0L) {
          return -1L;
        }
        paramLong = super.b(paramjab, Math.min(l, paramLong));
        if (paramLong != -1L)
        {
          this.d -= paramLong;
          if (this.d == 0L) {
            a();
          }
          return paramLong;
        }
        q_a.e(this.e).e();
        paramjab = new ProtocolException("unexpected end of stream");
        a();
        throw paramjab;
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
    if ((this.d != 0L) && (!LZa.a(this, 100, TimeUnit.MILLISECONDS)))
    {
      q_a.e(this.e).e();
      a();
    }
    this.b = true;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/q_a$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */