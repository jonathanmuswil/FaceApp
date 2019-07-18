import android.view.View;
import android.view.View.OnClickListener;

public final class pza
  implements View.OnClickListener
{
  public pza(qza paramqza, nza paramnza) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      VQa localVQa = qza.a(this.a);
      paramView = this.b.c();
      if (oza.b[paramView.ordinal()] != 1) {
        paramView = new mza.b.c(this.b.b());
      } else {
        paramView = new mza.b.e(this.b.b());
      }
      localVQa.a(paramView);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */