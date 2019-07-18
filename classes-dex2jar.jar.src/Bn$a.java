import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.FacebookSdk;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public class Bn$a
  implements View.OnTouchListener
{
  private In a;
  private WeakReference<View> b;
  private WeakReference<View> c;
  private View.OnTouchListener d;
  private boolean e = false;
  
  public Bn$a(In paramIn, View paramView1, View paramView2)
  {
    if ((paramIn != null) && (paramView1 != null) && (paramView2 != null))
    {
      this.d = Nn.e(paramView2);
      this.a = paramIn;
      this.b = new WeakReference(paramView2);
      this.c = new WeakReference(paramView1);
      this.e = true;
    }
  }
  
  private void i()
  {
    Object localObject = this.a;
    if (localObject == null) {
      return;
    }
    localObject = ((In)localObject).b();
    Bundle localBundle = zn.a(this.a, (View)this.c.get(), (View)this.b.get());
    if (localBundle.containsKey("_valueToSum")) {
      localBundle.putDouble("_valueToSum", Wn.a(localBundle.getString("_valueToSum")));
    }
    localBundle.putString("_is_fb_codeless", "1");
    FacebookSdk.i().execute(new An(this, (String)localObject, localBundle));
  }
  
  public boolean h()
  {
    return this.e;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    boolean bool = true;
    if (i == 1) {
      i();
    }
    View.OnTouchListener localOnTouchListener = this.d;
    if ((localOnTouchListener == null) || (!localOnTouchListener.onTouch(paramView, paramMotionEvent))) {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Bn$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */