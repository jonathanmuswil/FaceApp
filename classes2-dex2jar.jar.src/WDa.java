import android.view.View;
import android.view.View.OnClickListener;

public final class wDa
  implements View.OnClickListener
{
  public wDa(rDa paramrDa) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      paramView = rDa.a(this.a);
      if (paramView != null) {
        this.a.getViewActions().a(new GDa.b.f(paramView));
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wDa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */