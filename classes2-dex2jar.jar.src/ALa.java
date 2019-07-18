import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

final class aLa
  implements View.OnKeyListener
{
  aLa(bLa parambLa) {}
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if (paramInt == 4)
    {
      oXa.a(paramKeyEvent, "event");
      if (paramKeyEvent.getAction() == 1)
      {
        bLa.a(this.a).a(Boolean.valueOf(true));
        break label42;
      }
    }
    bool = false;
    label42:
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/aLa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */