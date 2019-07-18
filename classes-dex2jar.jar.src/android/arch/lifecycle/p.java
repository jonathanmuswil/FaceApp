package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class p
  extends Fragment
{
  private a a;
  
  public static void a(Activity paramActivity)
  {
    paramActivity = paramActivity.getFragmentManager();
    if (paramActivity.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null)
    {
      paramActivity.beginTransaction().add(new p(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
      paramActivity.executePendingTransactions();
    }
  }
  
  private void a(d.a parama)
  {
    Object localObject = getActivity();
    if ((localObject instanceof i))
    {
      ((i)localObject).ka().b(parama);
      return;
    }
    if ((localObject instanceof f))
    {
      localObject = ((f)localObject).ka();
      if ((localObject instanceof h)) {
        ((h)localObject).b(parama);
      }
    }
  }
  
  private void a(a parama)
  {
    if (parama != null) {
      parama.onCreate();
    }
  }
  
  private void b(a parama)
  {
    if (parama != null) {
      parama.onResume();
    }
  }
  
  private void c(a parama)
  {
    if (parama != null) {
      parama.i();
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    a(this.a);
    a(d.a.ON_CREATE);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    a(d.a.ON_DESTROY);
    this.a = null;
  }
  
  public void onPause()
  {
    super.onPause();
    a(d.a.ON_PAUSE);
  }
  
  public void onResume()
  {
    super.onResume();
    b(this.a);
    a(d.a.ON_RESUME);
  }
  
  public void onStart()
  {
    super.onStart();
    c(this.a);
    a(d.a.ON_START);
  }
  
  public void onStop()
  {
    super.onStop();
    a(d.a.ON_STOP);
  }
  
  static abstract interface a
  {
    public abstract void i();
    
    public abstract void onCreate();
    
    public abstract void onResume();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/arch/lifecycle/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */