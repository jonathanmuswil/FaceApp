import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.g;
import com.facebook.accountkit.internal.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class tn
{
  private boolean a = false;
  private boolean b = false;
  private final List<Intent> c = new ArrayList();
  private final BroadcastReceiver d = new tn.a(this);
  
  private void a(BroadcastReceiver paramBroadcastReceiver)
  {
    Context localContext = c.f();
    if (b()) {
      g.a(localContext).a(paramBroadcastReceiver);
    } else {
      localContext.unregisterReceiver(paramBroadcastReceiver);
    }
  }
  
  private void a(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    Context localContext = c.f();
    if (b()) {
      g.a(localContext).a(paramBroadcastReceiver, paramIntentFilter);
    } else {
      localContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter);
    }
  }
  
  private void h()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    Iterator localIterator = a().iterator();
    while (localIterator.hasNext()) {
      localIntentFilter.addAction((String)localIterator.next());
    }
    a(this.d, localIntentFilter);
  }
  
  protected abstract List<String> a();
  
  protected abstract void a(Intent paramIntent);
  
  protected boolean b()
  {
    return true;
  }
  
  public boolean c()
  {
    return this.a;
  }
  
  public boolean d()
  {
    return this.b;
  }
  
  public void e()
  {
    this.a = true;
  }
  
  public void f()
  {
    if (!this.b)
    {
      this.b = true;
      h();
    }
    if (this.a)
    {
      this.a = false;
      Object localObject = new ArrayList(this.c);
      this.c.clear();
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        Intent localIntent = (Intent)((Iterator)localObject).next();
        if (d()) {
          a(localIntent);
        }
      }
    }
  }
  
  public void g()
  {
    if (!this.b) {
      return;
    }
    this.b = false;
    a(this.d);
    this.c.clear();
  }
  
  private static class a
    extends BroadcastReceiver
  {
    final WeakReference<tn> a;
    
    a(tn paramtn)
    {
      this.a = new WeakReference(paramtn);
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      paramContext = (tn)this.a.get();
      if (paramContext == null) {
        return;
      }
      if (!paramContext.a().contains(paramIntent.getAction())) {
        return;
      }
      if (paramContext.c()) {
        tn.a(paramContext).add(paramIntent);
      } else if (paramContext.d()) {
        paramContext.a(paramIntent);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */