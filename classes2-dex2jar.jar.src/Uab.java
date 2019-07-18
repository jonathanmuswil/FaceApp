import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

final class uab
  extends fab
{
  uab(Socket paramSocket) {}
  
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
    try
    {
      this.k.close();
    }
    catch (AssertionError localAssertionError)
    {
      if (vab.a(localAssertionError))
      {
        localObject1 = vab.a;
        localObject2 = Level.WARNING;
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("Failed to close timed out socket ");
        ((StringBuilder)localObject3).append(this.k);
        ((Logger)localObject1).log((Level)localObject2, ((StringBuilder)localObject3).toString(), localAssertionError);
      }
      else
      {
        throw localAssertionError;
      }
    }
    catch (Exception localException)
    {
      Object localObject2 = vab.a;
      Object localObject3 = Level.WARNING;
      Object localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Failed to close timed out socket ");
      ((StringBuilder)localObject1).append(this.k);
      ((Logger)localObject2).log((Level)localObject3, ((StringBuilder)localObject1).toString(), localException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/uab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */