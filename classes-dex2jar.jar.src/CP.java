import android.content.Context;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;

class cp
  extends ConnectivityManager.NetworkCallback
{
  cp(dp paramdp, Context paramContext) {}
  
  public void onAvailable(Network paramNetwork)
  {
    this.b.a(Ro.a(this.a));
  }
  
  public void onLost(Network paramNetwork)
  {
    this.b.a(Ro.a(this.a));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */