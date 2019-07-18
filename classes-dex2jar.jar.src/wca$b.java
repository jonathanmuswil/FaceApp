import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public abstract interface wca$b
{
  public static final b a = new xca();
  
  public abstract HttpURLConnection a(URL paramURL)
    throws IOException;
  
  public abstract HttpURLConnection a(URL paramURL, Proxy paramProxy)
    throws IOException;
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wca$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */