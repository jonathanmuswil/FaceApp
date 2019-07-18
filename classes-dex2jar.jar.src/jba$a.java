import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class jba$a
  implements ServiceConnection
{
  private boolean a = false;
  private final LinkedBlockingQueue<IBinder> b = new LinkedBlockingQueue(1);
  
  public IBinder a()
  {
    if (this.a) {
      Naa.e().b("Fabric", "getBinder already called");
    }
    this.a = true;
    try
    {
      IBinder localIBinder = (IBinder)this.b.poll(200L, TimeUnit.MILLISECONDS);
      return localIBinder;
    }
    catch (InterruptedException localInterruptedException) {}
    return null;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    try
    {
      this.b.put(paramIBinder);
      return;
    }
    catch (InterruptedException paramComponentName)
    {
      for (;;) {}
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.b.clear();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jba$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */