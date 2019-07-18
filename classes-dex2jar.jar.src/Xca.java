import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

final class xca
  implements wca.b
{
  public HttpURLConnection a(URL paramURL)
    throws IOException
  {
    return (HttpURLConnection)FirebasePerfUrlConnection.instrument(paramURL.openConnection());
  }
  
  public HttpURLConnection a(URL paramURL, Proxy paramProxy)
    throws IOException
  {
    return (HttpURLConnection)FirebasePerfUrlConnection.instrument(paramURL.openConnection(paramProxy));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */