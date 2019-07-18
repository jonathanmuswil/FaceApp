import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

class q_a$c
  extends q_a.a
{
  private final pZa d;
  private long e = -1L;
  private boolean f = true;
  
  q_a$c(q_a paramq_a, pZa parampZa)
  {
    super(paramq_a, null);
    this.d = parampZa;
  }
  
  private void b()
    throws IOException
  {
    if (this.e != -1L) {
      q_a.d(this.g).r();
    }
    try
    {
      this.e = q_a.d(this.g).u();
      Object localObject = q_a.d(this.g).r().trim();
      if (this.e >= 0L) {
        if (!((String)localObject).isEmpty())
        {
          boolean bool = ((String)localObject).startsWith(";");
          if (!bool) {}
        }
        else
        {
          if (this.e == 0L)
          {
            this.f = false;
            localObject = this.g;
            q_a.a((q_a)localObject, q_a.g((q_a)localObject));
            i_a.a(q_a.a(this.g).g(), this.d, q_a.f(this.g));
            a();
          }
          return;
        }
      }
      ProtocolException localProtocolException = new java/net/ProtocolException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("expected chunk size and optional extensions but was \"");
      localStringBuilder.append(this.e);
      localStringBuilder.append((String)localObject);
      localStringBuilder.append("\"");
      localProtocolException.<init>(localStringBuilder.toString());
      throw localProtocolException;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new ProtocolException(localNumberFormatException.getMessage());
    }
  }
  
  public long b(jab paramjab, long paramLong)
    throws IOException
  {
    if (paramLong >= 0L)
    {
      if (!this.b)
      {
        if (!this.f) {
          return -1L;
        }
        long l = this.e;
        if ((l == 0L) || (l == -1L))
        {
          b();
          if (!this.f) {
            return -1L;
          }
        }
        paramLong = super.b(paramjab, Math.min(paramLong, this.e));
        if (paramLong != -1L)
        {
          this.e -= paramLong;
          return paramLong;
        }
        q_a.e(this.g).e();
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
    if ((this.f) && (!LZa.a(this, 100, TimeUnit.MILLISECONDS)))
    {
      q_a.e(this.g).e();
      a();
    }
    this.b = true;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/q_a$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */