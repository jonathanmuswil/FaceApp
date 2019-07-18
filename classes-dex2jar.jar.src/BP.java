import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class bp
  extends BroadcastReceiver
{
  bp(dp paramdp) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (this.a.c(paramContext)) {
      this.a.a(Ro.a());
    } else {
      this.a.a(Ro.a(paramContext));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */