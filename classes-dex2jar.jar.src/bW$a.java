import android.view.View;
import android.view.View.OnClickListener;

final class bW$a
  extends dRa
  implements View.OnClickListener
{
  private final View b;
  private final VQa<? super Object> c;
  
  bW$a(View paramView, VQa<? super Object> paramVQa)
  {
    this.b = paramView;
    this.c = paramVQa;
  }
  
  protected void j()
  {
    this.b.setOnClickListener(null);
  }
  
  public void onClick(View paramView)
  {
    if (!h()) {
      this.c.a(YV.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bW$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */