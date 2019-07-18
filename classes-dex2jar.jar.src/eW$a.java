import android.view.View;
import android.view.View.OnLayoutChangeListener;

final class eW$a
  extends dRa
  implements View.OnLayoutChangeListener
{
  private final View b;
  private final VQa<? super dW> c;
  
  eW$a(View paramView, VQa<? super dW> paramVQa)
  {
    this.b = paramView;
    this.c = paramVQa;
  }
  
  protected void j()
  {
    this.b.removeOnLayoutChangeListener(this);
  }
  
  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if (!h()) {
      this.c.a(dW.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/eW$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */