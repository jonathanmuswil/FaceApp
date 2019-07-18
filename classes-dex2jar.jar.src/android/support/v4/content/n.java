package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
public abstract class n
  extends BroadcastReceiver
{
  private static final SparseArray<PowerManager.WakeLock> a = new SparseArray();
  private static int b = 1;
  
  public static boolean a(Intent arg0)
  {
    int i = ???.getIntExtra("android.support.content.wakelockid", 0);
    if (i == 0) {
      return false;
    }
    synchronized (a)
    {
      Object localObject1 = (PowerManager.WakeLock)a.get(i);
      if (localObject1 != null)
      {
        ((PowerManager.WakeLock)localObject1).release();
        a.remove(i);
        return true;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("No active wake lock id #");
      ((StringBuilder)localObject1).append(i);
      Log.w("WakefulBroadcastReceiv.", ((StringBuilder)localObject1).toString());
      return true;
    }
  }
  
  public static ComponentName b(Context paramContext, Intent paramIntent)
  {
    synchronized (a)
    {
      int i = b;
      b += 1;
      if (b <= 0) {
        b = 1;
      }
      paramIntent.putExtra("android.support.content.wakelockid", i);
      paramIntent = paramContext.startService(paramIntent);
      if (paramIntent == null) {
        return null;
      }
      PowerManager localPowerManager = (PowerManager)paramContext.getSystemService("power");
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>();
      paramContext.append("androidx.core:wake:");
      paramContext.append(paramIntent.flattenToShortString());
      paramContext = localPowerManager.newWakeLock(1, paramContext.toString());
      paramContext.setReferenceCounted(false);
      paramContext.acquire(60000L);
      a.put(i, paramContext);
      return paramIntent;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/content/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */