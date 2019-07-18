import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.d;
import java.util.Collections;
import java.util.List;

public class zq
{
  private static final Object a = new Object();
  private static volatile zq b;
  private static boolean c = false;
  private final List<String> d;
  private final List<String> e;
  private final List<String> f;
  private final List<String> g;
  
  private zq()
  {
    List localList = Collections.EMPTY_LIST;
    this.d = localList;
    this.e = localList;
    this.f = localList;
    this.g = localList;
  }
  
  public static zq a()
  {
    if (b == null) {
      synchronized (a)
      {
        if (b == null)
        {
          zq localzq = new zq;
          localzq.<init>();
          b = localzq;
        }
      }
    }
    return b;
  }
  
  @SuppressLint({"UntrackedBindService"})
  public void a(Context paramContext, ServiceConnection paramServiceConnection)
  {
    paramContext.unbindService(paramServiceConnection);
  }
  
  public boolean a(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    return a(paramContext, paramContext.getClass().getName(), paramIntent, paramServiceConnection, paramInt);
  }
  
  public final boolean a(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    paramString = paramIntent.getComponent();
    boolean bool;
    if (paramString == null) {
      bool = false;
    } else {
      bool = d.b(paramContext, paramString.getPackageName());
    }
    if (bool)
    {
      Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
      return false;
    }
    return paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */