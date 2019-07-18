import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import com.facebook.FacebookSdk;
import com.facebook.p;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public class xn
{
  private static final String a = "xn";
  
  public static xn.a a(In paramIn, View paramView1, View paramView2)
  {
    return new xn.a(paramIn, paramView1, paramView2);
  }
  
  public static class a
    extends View.AccessibilityDelegate
  {
    private In a;
    private WeakReference<View> b;
    private WeakReference<View> c;
    private int d;
    private View.AccessibilityDelegate e;
    private boolean f = false;
    protected boolean g = false;
    
    public a() {}
    
    public a(In paramIn, View paramView1, View paramView2)
    {
      if ((paramIn != null) && (paramView1 != null) && (paramView2 != null))
      {
        this.e = Nn.d(paramView2);
        this.a = paramIn;
        this.b = new WeakReference(paramView2);
        this.c = new WeakReference(paramView1);
        paramView1 = paramIn.c();
        int i = vn.a[paramIn.c().ordinal()];
        if (i != 1)
        {
          if (i != 2)
          {
            if (i == 3)
            {
              this.d = 16;
            }
            else
            {
              paramIn = new StringBuilder();
              paramIn.append("Unsupported action type: ");
              paramIn.append(paramView1.toString());
              throw new p(paramIn.toString());
            }
          }
          else {
            this.d = 4;
          }
        }
        else {
          this.d = 1;
        }
        this.f = true;
      }
    }
    
    private void b()
    {
      String str = this.a.b();
      Bundle localBundle = zn.a(this.a, (View)this.c.get(), (View)this.b.get());
      if (localBundle.containsKey("_valueToSum")) {
        localBundle.putDouble("_valueToSum", Wn.a(localBundle.getString("_valueToSum")));
      }
      localBundle.putString("_is_fb_codeless", "1");
      FacebookSdk.i().execute(new wn(this, str, localBundle));
    }
    
    public boolean a()
    {
      return this.f;
    }
    
    public void sendAccessibilityEvent(View paramView, int paramInt)
    {
      if (paramInt == -1) {
        Log.e(xn.a(), "Unsupported action type");
      }
      if (paramInt != this.d) {
        return;
      }
      View.AccessibilityDelegate localAccessibilityDelegate = this.e;
      if ((localAccessibilityDelegate != null) && (!(localAccessibilityDelegate instanceof a))) {
        localAccessibilityDelegate.sendAccessibilityEvent(paramView, paramInt);
      }
      b();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */