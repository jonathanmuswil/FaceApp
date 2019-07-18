import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.ui.image_editor.common.view.ToolRecyclerView;
import io.faceapp.ui.image_editor.common.view.ValueRangeView;
import java.util.HashMap;

public final class xya
  extends wza<Fya, Eya, Fya.c>
  implements Fya
{
  public static final xya.a ta = new xya.a(null);
  private final int ua = 2131492970;
  private final int va = 2131492895;
  private HashMap wa;
  
  public void Lb()
  {
    HashMap localHashMap = this.wa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public Integer Wb()
  {
    return Integer.valueOf(this.va);
  }
  
  public int Zb()
  {
    return this.ua;
  }
  
  public void a(Fya.a parama, Fya.b paramb)
  {
    oXa.b(parama, "model");
    oXa.b(paramb, "state");
    ToolRecyclerView localToolRecyclerView = (ToolRecyclerView)f(k.adjustRecyclerView);
    oXa.a(localToolRecyclerView, "adjustRecyclerView");
    parama = ((wya)EPa.b(localToolRecyclerView)).c(parama, paramb);
    if (parama != null)
    {
      int i = parama.intValue();
      ((ToolRecyclerView)f(k.adjustRecyclerView)).k(i);
    }
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
    ((TextView)f(k.menuResetBtnView)).setOnClickListener(new yya(this));
    ((ImageView)f(k.autoAdjust)).setOnClickListener(new zya(this));
    ((ValueRangeView)f(k.intensityView)).a(fc()).a(new Aya(this));
    ((ToolRecyclerView)f(k.adjustRecyclerView)).a(new wya(getViewActions())).animate().translationY(0.0F).start();
    super.a(paramView, paramBundle);
  }
  
  public void a(pya parampya, float paramFloat, boolean paramBoolean)
  {
    oXa.b(parampya, "range");
    ((ValueRangeView)f(k.intensityView)).a(parampya, paramFloat, paramBoolean);
  }
  
  public void a(rka paramrka)
  {
    oXa.b(paramrka, "tool");
    n(paramrka.f());
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
    public final xya a(kya paramkya, Bundle paramBundle, eBa parameBa, rka paramrka)
    {
      oXa.b(paramkya, "listener");
      oXa.b(paramBundle, "config");
      oXa.b(parameBa, "processor");
      oXa.b(paramrka, "adjustTool");
      xya localxya = new xya();
      localxya.a(new Eya(paramkya, paramBundle, parameBa, paramrka));
      return localxya;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */