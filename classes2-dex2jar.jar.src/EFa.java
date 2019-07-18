import android.os.Bundle;
import android.support.v4.app.l;
import android.view.View;
import io.faceapp.k;
import io.faceapp.ui.components.DuoPartView;
import java.util.HashMap;
import java.util.List;

public final class eFa
  extends GEa<gFa, fFa>
  implements gFa
{
  public static final eFa.a ta = new eFa.a(null);
  private final int ua = 2131492997;
  private HashMap va;
  
  public void Lb()
  {
    HashMap localHashMap = this.va;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public int Zb()
  {
    return this.ua;
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    DuoPartView localDuoPartView1 = (DuoPartView)g(k.part1View);
    oXa.a(localDuoPartView1, "part1View");
    DuoPartView localDuoPartView2 = (DuoPartView)g(k.part2View);
    oXa.a(localDuoPartView2, "part2View");
    d(mWa.c(new DuoPartView[] { localDuoPartView1, localDuoPartView2 }));
    ((DuoPartView)ec().get(0)).c();
    super.a(paramView, paramBundle);
  }
  
  public int d()
  {
    return 2131689537;
  }
  
  public DuoPartView dc()
  {
    return (DuoPartView)ec().get(1);
  }
  
  public View g(int paramInt)
  {
    if (this.va == null) {
      this.va = new HashMap();
    }
    View localView1 = (View)this.va.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.va.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static final class a
  {
    public final eFa a(fFa paramfFa)
    {
      oXa.b(paramfFa, "presenter");
      eFa localeFa = new eFa();
      localeFa.a(paramfFa);
      return localeFa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/eFa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */