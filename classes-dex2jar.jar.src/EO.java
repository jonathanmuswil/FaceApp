import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import java.util.concurrent.Executor;

final class eo
  implements Application.ActivityLifecycleCallbacks
{
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity)
  {
    FacebookSdk.i().execute(new co(this));
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity)
  {
    if ((fo.b().booleanValue()) && (paramActivity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity"))) {
      FacebookSdk.i().execute(new do(this));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/eo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */