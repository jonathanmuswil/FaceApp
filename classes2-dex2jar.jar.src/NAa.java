import android.os.Bundle;
import android.support.v4.app.l;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.ui.image_editor.common.view.ValueRangeView;
import java.util.HashMap;

public final class nAa
  extends wza<uAa, tAa, uAa.a>
  implements uAa
{
  public static final nAa.a ta = new nAa.a(null);
  private final int ua = 2131492993;
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
    View localView = f(k.applyCancelView);
    oXa.a(localView, "applyCancelView");
    ((TextView)localView.findViewById(k.applyView)).setOnClickListener(cc());
    localView = f(k.applyCancelView);
    oXa.a(localView, "applyCancelView");
    ((TextView)localView.findViewById(k.cancelView)).setOnClickListener(dc());
    ((ValueRangeView)f(k.apertureRangeView)).a(fc()).a(new oAa(this)).animate().translationY(0.0F).withEndAction(new pAa(this)).start();
    super.a(paramView, paramBundle);
  }
  
  public void a(rka paramrka)
  {
    oXa.b(paramrka, "tool");
    n(paramrka.f());
  }
  
  public void b(pya parampya, float paramFloat, boolean paramBoolean)
  {
    oXa.b(parampya, "range");
    ((ValueRangeView)f(k.apertureRangeView)).a(parampya, paramFloat, paramBoolean);
  }
  
  public View f(int paramInt)
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
    public final nAa a(kya paramkya, Bundle paramBundle, lya.g paramg)
    {
      oXa.b(paramkya, "listener");
      oXa.b(paramBundle, "config");
      oXa.b(paramg, "rangeTool");
      nAa localnAa = new nAa();
      localnAa.a(new tAa(paramkya, paramBundle, paramg));
      return localnAa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/nAa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */