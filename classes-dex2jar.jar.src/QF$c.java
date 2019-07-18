import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class QF$c
  implements Application.ActivityLifecycleCallbacks
{
  QF$c(QF paramQF) {}
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    QF.a(this.a, new lG(this, paramActivity, paramBundle));
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    QF.a(this.a, new rG(this, paramActivity));
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    QF.a(this.a, new oG(this, paramActivity));
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    QF.a(this.a, new nG(this, paramActivity));
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    mK localmK = new mK();
    QF.a(this.a, new qG(this, paramActivity, localmK));
    paramActivity = localmK.b(50L);
    if (paramActivity != null) {
      paramBundle.putAll(paramActivity);
    }
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    QF.a(this.a, new mG(this, paramActivity));
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    QF.a(this.a, new pG(this, paramActivity));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/QF$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */