import android.support.v4.view.K;
import android.support.v4.view.L;
import android.view.View;
import java.util.ArrayList;

class qe
  extends L
{
  private boolean a = false;
  private int b = 0;
  
  qe(re paramre) {}
  
  void a()
  {
    this.b = 0;
    this.a = false;
    this.c.b();
  }
  
  public void b(View paramView)
  {
    int i = this.b + 1;
    this.b = i;
    if (i == this.c.a.size())
    {
      paramView = this.c.d;
      if (paramView != null) {
        paramView.b(null);
      }
      a();
    }
  }
  
  public void c(View paramView)
  {
    if (this.a) {
      return;
    }
    this.a = true;
    paramView = this.c.d;
    if (paramView != null) {
      paramView.c(null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */