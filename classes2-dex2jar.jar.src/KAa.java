import android.view.View;
import android.view.View.OnClickListener;

public final class kAa
  implements View.OnClickListener
{
  public kAa(lAa paramlAa, iAa paramiAa) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      VQa localVQa = lAa.a(this.a);
      paramView = this.b.c();
      if (jAa.b[paramView.ordinal()] != 1) {
        paramView = new hAa.b.a(this.b.b());
      } else {
        paramView = new hAa.b.b(this.b.b());
      }
      localVQa.a(paramView);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/kAa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */