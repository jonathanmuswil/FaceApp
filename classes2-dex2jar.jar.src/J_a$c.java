import java.io.IOException;
import java.net.SocketTimeoutException;

class J_a$c
  extends fab
{
  J_a$c(J_a paramJ_a) {}
  
  protected IOException b(IOException paramIOException)
  {
    SocketTimeoutException localSocketTimeoutException = new SocketTimeoutException("timeout");
    if (paramIOException != null) {
      localSocketTimeoutException.initCause(paramIOException);
    }
    return localSocketTimeoutException;
  }
  
  protected void j()
  {
    this.k.a(s_a.f);
  }
  
  public void k()
    throws IOException
  {
    if (!i()) {
      return;
    }
    throw b(null);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/J_a$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */