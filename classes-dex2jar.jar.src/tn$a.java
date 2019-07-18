import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.List;

class tn$a
  extends BroadcastReceiver
{
  final WeakReference<tn> a;
  
  tn$a(tn paramtn)
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tn$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */