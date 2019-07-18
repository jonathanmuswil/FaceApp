import java.io.IOException;
import java.net.ProtocolException;

final class VZa$b
  extends oab
{
  private final long b;
  private long c;
  private boolean d;
  private boolean e;
  
  VZa$b(VZa paramVZa, Eab paramEab, long paramLong)
  {
    super(paramEab);
    this.b = paramLong;
    if (paramLong == 0L) {
      a(null);
    }
  }
  
  IOException a(IOException paramIOException)
  {
    if (this.d) {
      return paramIOException;
    }
    this.d = true;
    return this.f.a(this.c, true, false, paramIOException);
  }
  
  public long b(jab paramjab, long paramLong)
    throws IOException
  {
    if (!this.e) {
      try
      {
        paramLong = a().b(paramjab, paramLong);
        if (paramLong == -1L)
        {
          a(null);
          return -1L;
        }
        long l = this.c + paramLong;
        if ((this.b != -1L) && (l > this.b))
        {
          ProtocolException localProtocolException = new java/net/ProtocolException;
          paramjab = new java/lang/StringBuilder;
          paramjab.<init>();
          paramjab.append("expected ");
          paramjab.append(this.b);
          paramjab.append(" bytes but received ");
          paramjab.append(l);
          localProtocolException.<init>(paramjab.toString());
          throw localProtocolException;
        }
        this.c = l;
        if (l == this.b) {
          a(null);
        }
        return paramLong;
      }
      catch (IOException paramjab)
      {
        throw a(paramjab);
      }
    }
    throw new IllegalStateException("closed");
  }
  
  public void close()
    throws IOException
  {
    if (this.e) {
      return;
    }
    this.e = true;
    try
    {
      super.close();
      a(null);
      return;
    }
    catch (IOException localIOException)
    {
      throw a(localIOException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/VZa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */