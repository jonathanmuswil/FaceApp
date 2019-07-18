import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.NetworkRequest.Builder;
import android.os.PowerManager;
import android.util.Log;

@TargetApi(23)
public class dp
  implements Wo
{
  private ConnectivityManager.NetworkCallback a;
  private final JVa<Ro> b = GVa.t().s();
  private final BroadcastReceiver c = a();
  
  public QQa<Ro> a(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    this.a = b(paramContext);
    d(paramContext);
    localConnectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addCapability(13).build(), this.a);
    return this.b.a(wQa.e).a(new ap(this, localConnectivityManager, paramContext)).d(Ro.a(paramContext)).c().h();
  }
  
  protected BroadcastReceiver a()
  {
    return new bp(this);
  }
  
  protected void a(Ro paramRo)
  {
    this.b.a(paramRo);
  }
  
  protected void a(ConnectivityManager paramConnectivityManager)
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
  
  public void a(String paramString, Exception paramException)
  {
    Log.e("ReactiveNetwork", paramString, paramException);
  }
  
  protected ConnectivityManager.NetworkCallback b(Context paramContext)
  {
    return new cp(this, paramContext);
  }
  
  protected boolean c(Context paramContext)
  {
    String str = paramContext.getPackageName();
    paramContext = (PowerManager)paramContext.getSystemService("power");
    boolean bool = paramContext.isIgnoringBatteryOptimizations(str);
    if ((paramContext.isDeviceIdleMode()) && (!bool)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected void d(Context paramContext)
  {
    IntentFilter localIntentFilter = new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED");
    paramContext.registerReceiver(this.c, localIntentFilter);
  }
  
  protected void e(Context paramContext)
  {
    try
    {
      paramContext.unregisterReceiver(this.c);
    }
    catch (Exception paramContext)
    {
      a("could not unregister receiver", paramContext);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */