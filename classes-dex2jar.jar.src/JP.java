import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;

public class jp
  implements Wo
{
  private kRa a(uRa paramuRa)
  {
    return lRa.a(new ip(this, paramuRa));
  }
  
  public QQa<Ro> a(Context paramContext)
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    return QQa.a(new gp(this, paramContext, localIntentFilter)).b(Ro.a());
  }
  
  protected void a(Context paramContext, BroadcastReceiver paramBroadcastReceiver)
  {
    try
    {
      paramContext.unregisterReceiver(paramBroadcastReceiver);
    }
    catch (Exception paramContext)
    {
      a("receiver was already unregistered", paramContext);
    }
  }
  
  public void a(String paramString, Exception paramException)
  {
    Log.e("ReactiveNetwork", paramString, paramException);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */