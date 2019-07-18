import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.l;
import android.support.v7.app.C;
import android.view.View;
import java.util.HashMap;

public abstract class ola<V extends sla, P extends rla<? super V>>
  extends C
  implements sla
{
  private P ia;
  private final QVa ja = RVa.a(new nla(this));
  private boolean ka;
  private HashMap la;
  
  static
  {
    rXa localrXa = new rXa(vXa.a(ola.class), "presenter", "getPresenter()Lio/faceapp/mvp/MvpPresenter;");
    vXa.a(localrXa);
    ha = new XXa[] { localrXa };
  }
  
  public void Ob()
  {
    HashMap localHashMap = this.la;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public final P Pb()
  {
    return this.ia;
  }
  
  public V Qb()
  {
    return this;
  }
  
  public final P Rb()
  {
    QVa localQVa = this.ja;
    XXa localXXa = ha[0];
    return (rla)localQVa.getValue();
  }
  
  public final boolean Sb()
  {
    return this.ka;
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    super.a(paramView, paramBundle);
    int i = 1;
    this.ka = true;
    paramView = Rb();
    if (paramView != null)
    {
      Qb();
      paramView.b(this);
    }
    if (paramBundle == null) {
      i = 0;
    }
    if (i != 0) {
      dismiss();
    }
  }
  
  public final void a(P paramP)
  {
    this.ia = paramP;
  }
  
  public void sb()
  {
    rla localrla = Rb();
    if (localrla != null)
    {
      Qb();
      localrla.a(this);
    }
    this.ka = false;
    super.sb();
    Ob();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ola.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */