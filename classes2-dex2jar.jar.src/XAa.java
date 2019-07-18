import android.view.View;
import android.view.View.OnClickListener;

public final class xAa
  implements View.OnClickListener
{
  public xAa(yAa paramyAa, vAa paramvAa) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      VQa localVQa = yAa.a(this.a);
      paramView = this.b.c();
      if (wAa.b[paramView.ordinal()] != 1) {
        paramView = new KAa.b.a(this.b.b());
      } else {
        paramView = new KAa.b.b(this.b.b());
      }
      localVQa.a(paramView);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xAa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */