import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.util.Log;

@TargetApi(21)
public class _o
  implements Wo
{
  private ConnectivityManager.NetworkCallback a;
  
  private ConnectivityManager.NetworkCallback a(RQa<Ro> paramRQa, Context paramContext)
  {
    return new Zo(this, paramRQa, paramContext);
  }
  
  private void a(ConnectivityManager paramConnectivityManager)
  {
    try
    {
      paramConnectivityManager.unregisterNetworkCallback(this.a);
    }
    catch (Exception paramConnectivityManager)
    {
      a("could not unregister network callback", paramConnectivityManager);
    }
  }
  
  public QQa<Ro> a(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    return QQa.a(new Yo(this, paramContext, localConnectivityManager)).c(new Xo(this, localConnectivityManager)).e(Ro.a(paramContext)).e();
  }
  
  public void a(String paramString, Exception paramException)
  {
    Log.e("ReactiveNetwork", paramString, paramException);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */