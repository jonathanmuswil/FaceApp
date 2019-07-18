import android.view.View;
import android.view.View.OnFocusChangeListener;

final class cW$a
  extends dRa
  implements View.OnFocusChangeListener
{
  private final View b;
  private final VQa<? super Boolean> c;
  
  cW$a(View paramView, VQa<? super Boolean> paramVQa)
  {
    this.b = paramView;
    this.c = paramVQa;
  }
  
  protected void j()
  {
    this.b.setOnFocusChangeListener(null);
  }
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (!h()) {
      this.c.a(Boolean.valueOf(paramBoolean));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cW$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */