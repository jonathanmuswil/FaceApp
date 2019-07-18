import android.view.View;
import android.view.View.OnAttachStateChangeListener;

class cY$a
  extends dRa
  implements View.OnAttachStateChangeListener
{
  final RQa<Object> b;
  
  public cY$a(RQa<Object> paramRQa)
  {
    RQa localRQa;
    this.b = localRQa;
  }
  
  protected void j()
  {
    this.c.b.removeOnAttachStateChangeListener(this);
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    this.b.a(cY.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cY$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */