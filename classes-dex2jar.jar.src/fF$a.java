import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

class ff$a
  implements ff.b
{
  public HttpURLConnection a(URL paramURL)
    throws IOException
  {
    return (HttpURLConnection)FirebasePerfUrlConnection.instrument(paramURL.openConnection());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ff$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */