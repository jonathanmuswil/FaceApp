import android.os.Bundle;
import android.support.v4.app.l;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.util.HashMap;

public abstract class qla<V extends sla, P extends rla<? super V>>
  extends l
  implements sla
{
  private final boolean Z = true;
  private P aa;
  private final QVa ba = RVa.a(new pla(this));
  private boolean ca;
  private boolean da;
  private HashMap ea;
  
  static
  {
    rXa localrXa = new rXa(vXa.a(qla.class), "presenter", "getPresenter()Lio/faceapp/mvp/MvpPresenter;");
    vXa.a(localrXa);
    Y = new XXa[] { localrXa };
  }
  
  private final void Vb()
  {
    if ((eb() != null) && (!this.da))
    {
      rla localrla = Ob();
      if (localrla != null)
      {
        Nb();
        localrla.b(this);
        this.da = true;
      }
    }
  }
  
  private final void Wb()
  {
    rla localrla = Ob();
    if (localrla != null)
    {
      Nb();
      localrla.a(this);
      this.da = false;
    }
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.ea;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public P Mb()
  {
    throw new VVa("Either [createPresenter] should be implemented OR fragment should be [isRecoverable=false]");
  }
  
  public V Nb()
  {
    return this;
  }
  
  public final P Ob()
  {
    QVa localQVa = this.ba;
    XXa localXXa = Y[0];
    return (rla)localQVa.getValue();
  }
  
  public final P Pb()
  {
    return this.aa;
  }
  
  public boolean Qb()
  {
    return this.Z;
  }
  
  public final boolean Rb()
  {
    return this.ca;
  }
  
  public void Sb()
  {
    Wb();
  }
  
  public void Tb()
  {
    Vb();
  }
  
  public final P Ub()
  {
    rla localrla = Ob();
    if (localrla != null) {
      return localrla;
    }
    throw new IllegalArgumentException("Required value was null.");
  }
  
  public Animation a(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    if ((!paramBoolean) && (Ua() != null))
    {
      localObject = Ua();
      if ((localObject != null) && (((l)localObject).mb() == true))
      {
        localObject = AnimationUtils.loadAnimation(Jb(), 2130771997);
        break label54;
      }
    }
    Object localObject = super.a(paramInt1, paramBoolean, paramInt2);
    label54:
    return (Animation)localObject;
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    super.a(paramView, paramBundle);
    this.ca = true;
    Vb();
  }
  
  public final void a(P paramP)
  {
    this.aa = paramP;
  }
  
  public void sb()
  {
    Wb();
    this.ca = false;
    super.sb();
    Lb();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */