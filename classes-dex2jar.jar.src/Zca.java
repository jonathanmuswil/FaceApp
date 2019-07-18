import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public final class zca
{
  public static final SSLSocketFactory a(Aca paramAca)
    throws KeyManagementException, NoSuchAlgorithmException
  {
    SSLContext localSSLContext = SSLContext.getInstance("TLS");
    localSSLContext.init(null, new TrustManager[] { new Bca(new Cca(paramAca.b(), paramAca.a()), paramAca) }, null);
    return localSSLContext.getSocketFactory();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */