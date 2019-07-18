import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.ui.image_editor.common.view.ToolRecyclerView;
import io.faceapp.ui.image_editor.common.view.ValueRangeView;
import java.util.HashMap;

public final class eDa
  extends wza<pDa, oDa, pDa.b>
  implements pDa
{
  public static final eDa.a ta = new eDa.a(null);
  private final int ua = 2131493016;
  private final FVa<Boolean> va;
  private HashMap wa;
  
  public eDa()
  {
    FVa localFVa = FVa.f(Boolean.valueOf(false));
    oXa.a(localFVa, "BehaviorSubject.createDefault(false)");
    this.va = localFVa;
  }
  
  private final kRa ic()
  {
    kRa localkRa = QQa.a(ec(), this.va, yPa.a.a()).e().c(new fDa(this));
    oXa.a(localkRa, "Observable.combineLatest…nimateVisibility(!hide) }");
    return localkRa;
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.wa;
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
    View localView = f(k.applyCancelView);
    oXa.a(localView, "applyCancelView");
    ((TextView)localView.findViewById(k.applyView)).setOnClickListener(cc());
    localView = f(k.applyCancelView);
    oXa.a(localView, "applyCancelView");
    ((TextView)localView.findViewById(k.cancelView)).setOnClickListener(dc());
    ((ValueRangeView)f(k.intensityView)).a(fc()).a(new gDa(this));
    ((ToolRecyclerView)f(k.tatooRecyclerView)).a(new dDa(getViewActions())).animate().translationY(0.0F).start();
    fc().b(ic());
    super.a(paramView, paramBundle);
  }
  
  public void a(pDa.a parama, String paramString)
  {
    oXa.b(parama, "model");
    oXa.b(paramString, "selection");
    Object localObject = this.va;
    boolean bool;
    if (paramString.length() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    ((FVa)localObject).a(Boolean.valueOf(bool));
    localObject = (ToolRecyclerView)f(k.tatooRecyclerView);
    oXa.a(localObject, "tatooRecyclerView");
    parama = ((dDa)EPa.b((RecyclerView)localObject)).c(parama, paramString);
    if (parama != null)
    {
      int i = parama.intValue();
      ((ToolRecyclerView)f(k.tatooRecyclerView)).k(i);
    }
  }
  
  public void a(rka paramrka)
  {
    oXa.b(paramrka, "tool");
    n(paramrka.f());
  }
  
  public void d(float paramFloat)
  {
    ValueRangeView.a((ValueRangeView)f(k.intensityView), pya.m.i, paramFloat, false, 4, null);
  }
  
  public View f(int paramInt)
  {
    if (this.wa == null) {
      this.wa = new HashMap();
    }
    View localView1 = (View)this.wa.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.wa.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static final class a
  {
    public final eDa a(kya paramkya, Bundle paramBundle, rka paramrka, QQa<Bitmap> paramQQa, boolean paramBoolean)
    {
      oXa.b(paramkya, "listener");
      oXa.b(paramBundle, "config");
      oXa.b(paramrka, "tatooTool");
      oXa.b(paramQQa, "thumbSub");
      eDa localeDa = new eDa();
      localeDa.a(new oDa(paramkya, paramBundle, paramrka, paramQQa, paramBoolean));
      return localeDa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/eDa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */