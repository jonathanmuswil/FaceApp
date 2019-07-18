import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.FacebookSdk;

final class bo
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    fo.a(go.a(FacebookSdk.d(), paramIBinder));
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */