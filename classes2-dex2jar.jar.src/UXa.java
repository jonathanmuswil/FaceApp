import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v4.app.G;
import android.support.v4.app.l;
import android.support.v4.app.s;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.Toast;
import io.faceapp.MainActivity;
import io.faceapp.k;
import io.faceapp.ui.components.ImageDisplay;
import io.faceapp.ui.image_editor.common.view.BeforeAfterView;
import io.faceapp.ui.image_editor.common.view.ResultingBitmapView;
import io.faceapp.ui.image_editor.common.view.ResultingBitmapView.d;
import io.faceapp.ui.image_editor.common.view.ResultingBitmapView.d.b;
import io.faceapp.ui.image_editor.common.view.ScrollableContentView;
import io.faceapp.ui.image_editor.common.view.ToolRecyclerView;
import io.faceapp.ui.misc.c.a;
import io.faceapp.ui.misc.d;
import io.faceapp.ui.misc.d.a;
import java.util.HashMap;
import java.util.Set;

public final class uxa
  extends qIa<fya, Qxa>
  implements fya, d
{
  public static final uxa.a qa = new uxa.a(null);
  private final int ra = 2131492989;
  private final int sa = 2131689678;
  private final int ta = 2131492901;
  private final GVa<fya.b> ua;
  private final jRa va;
  private boolean wa;
  private final Kxa xa;
  private HashMap ya;
  
  public uxa()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.ua = localGVa;
    this.va = new jRa();
    this.wa = true;
    this.xa = new Kxa(this);
  }
  
  private final void B(boolean paramBoolean)
  {
    Object localObject = Float.valueOf(Wa().getDimension(2131165428));
    ((Float)localObject).floatValue();
    if (!paramBoolean) {
      localObject = null;
    }
    float f;
    if (localObject != null) {
      f = ((Float)localObject).floatValue();
    } else {
      f = 0.0F;
    }
    ((BeforeAfterView)f(k.beforeAfterView)).animate().translationY(f).start();
    localObject = (ToolRecyclerView)f(k.toolsRecyclerView);
    oXa.a(localObject, "toolsRecyclerView");
    UPa.b((View)localObject, 0L, 1, null);
  }
  
  private final void a(String paramString, boolean paramBoolean, bXa<? extends wza<?, ?, ?>> parambXa)
  {
    B(paramBoolean);
    Object localObject = ec();
    if ((localObject == null) || ((oXa.a(((l)localObject).bb(), paramString) ^ true)))
    {
      parambXa = (wza)parambXa.b();
      localObject = Ka().a();
      ((G)localObject).a(true);
      ((G)localObject).a(2130771986, 2130771987, 2130771986, 2130771987);
      ((G)localObject).b(2131296533, parambXa, paramString);
      ((G)localObject).a();
    }
    parambXa = ac();
    if (parambXa != null) {
      parambXa.a(paramString);
    }
  }
  
  private final void b(Context paramContext)
  {
    vqa.l.a(paramContext, 1, 0);
  }
  
  private final wza<?, ?, ?> ec()
  {
    return (wza)Ka().a(2131296533);
  }
  
  private final void fc()
  {
    ToolRecyclerView localToolRecyclerView = (ToolRecyclerView)f(k.toolsRecyclerView);
    oXa.a(localToolRecyclerView, "toolsRecyclerView");
    UPa.c(localToolRecyclerView, 0L, 1, null);
    ((BeforeAfterView)f(k.beforeAfterView)).animate().translationY(0.0F).start();
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.ya;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public Integer Wb()
  {
    return Integer.valueOf(this.ta);
  }
  
  public int Xb()
  {
    return this.sa;
  }
  
  public int Zb()
  {
    return this.ra;
  }
  
  public void a(Matrix paramMatrix, vka paramvka)
  {
    oXa.b(paramvka, "primaryFace");
    ((ResultingBitmapView)f(k.resultingBitmapView)).a(paramMatrix, paramvka);
  }
  
  public void a(Bundle paramBundle, eBa parameBa, rka paramrka)
  {
    oXa.b(paramBundle, "config");
    oXa.b(parameBa, "processor");
    oXa.b(paramrka, "adjustTool");
    a("fr_adjust_editor", false, new Bxa(this, paramBundle, parameBa, paramrka));
  }
  
  public void a(Bundle paramBundle, eBa parameBa, rka paramrka, QQa<Bitmap> paramQQa, boolean paramBoolean)
  {
    oXa.b(paramBundle, "sourceConfig");
    oXa.b(parameBa, "processor");
    oXa.b(paramrka, "backTool");
    oXa.b(paramQQa, "thumbSub");
    ((ScrollableContentView)((ResultingBitmapView)f(k.resultingBitmapView)).getContentView()).b();
    a("fr_background_editor", true, new Cxa(this, paramBundle, parameBa, paramrka, paramQQa, paramBoolean));
  }
  
  public void a(Bundle paramBundle, lya.g paramg)
  {
    oXa.b(paramBundle, "config");
    oXa.b(paramg, "rangeTool");
    a("fr_lens_blur_editor", false, new Gxa(this, paramBundle, paramg));
  }
  
  public void a(Bundle paramBundle, mka parammka, QQa<Bitmap> paramQQa, boolean paramBoolean1, boolean paramBoolean2)
  {
    oXa.b(paramBundle, "config");
    oXa.b(parammka, "folder");
    oXa.b(paramQQa, "thumbSub");
    a("fr_filter_editor", true, new Fxa(this, paramBundle, parammka, paramQQa, paramBoolean1, paramBoolean2));
  }
  
  public void a(Bundle paramBundle, rka paramrka, QQa<Bitmap> paramQQa, boolean paramBoolean)
  {
    oXa.b(paramBundle, "config");
    oXa.b(paramrka, "overlayTool");
    oXa.b(paramQQa, "thumbSub");
    ((ScrollableContentView)((ResultingBitmapView)f(k.resultingBitmapView)).getContentView()).b();
    a("fr_overlay_editor", true, new Ixa(this, paramBundle, paramrka, paramQQa, paramBoolean));
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    Object localObject = (ImageView)f(k.menuShareBtnView);
    oXa.a(localObject, "menuShareBtnView");
    ((View)localObject).setOnClickListener(new wxa(this));
    localObject = (ImageView)f(k.menuSaveBtnView);
    oXa.a(localObject, "menuSaveBtnView");
    ((View)localObject).setOnClickListener(new xxa(this));
    ((ResultingBitmapView)f(k.resultingBitmapView)).a(this.va).a(new yxa(this)).a(new zxa(this));
    ((BeforeAfterView)f(k.beforeAfterView)).a(this.va).a(new Axa(this));
    ((ToolRecyclerView)f(k.toolsRecyclerView)).a(new gya(getViewActions()));
    localObject = ((ResultingBitmapView)f(k.resultingBitmapView)).getMatrixChangedObs();
    if (localObject != null) {
      this.va.b(((QQa)localObject).c(new vxa(this)));
    }
    this.wa = true;
    super.a(paramView, paramBundle);
  }
  
  public void a(fya.a parama, Set<String> paramSet)
  {
    oXa.b(parama, "model");
    oXa.b(paramSet, "selection");
    ToolRecyclerView localToolRecyclerView = (ToolRecyclerView)f(k.toolsRecyclerView);
    oXa.a(localToolRecyclerView, "toolsRecyclerView");
    ((gya)EPa.b(localToolRecyclerView)).c(parama, paramSet);
  }
  
  public void a(ResultingBitmapView.d paramd)
  {
    oXa.b(paramd, "model");
    ResultingBitmapView localResultingBitmapView = (ResultingBitmapView)f(k.resultingBitmapView);
    oXa.a(localResultingBitmapView, "resultingBitmapView");
    UPa.c(localResultingBitmapView, 0L, 1, null);
    ((ResultingBitmapView)f(k.resultingBitmapView)).a(paramd);
    if (this.wa)
    {
      this.wa = false;
      paramd = La();
      if (paramd != null)
      {
        oXa.a(paramd, "it");
        b(paramd);
      }
    }
  }
  
  public void a(c.a parama, Object paramObject)
  {
    oXa.b(parama, "model");
    ((ResultingBitmapView)f(k.resultingBitmapView)).a(new ResultingBitmapView.d.b(parama));
  }
  
  public void b(Bundle paramBundle, eBa parameBa, rka paramrka)
  {
    oXa.b(paramBundle, "sourceConfig");
    oXa.b(parameBa, "processor");
    oXa.b(paramrka, "cropTool");
    a("fr_crop_editor", false, new Dxa(this, paramBundle, parameBa, paramrka));
  }
  
  public void b(Bundle paramBundle, rka paramrka, QQa<Bitmap> paramQQa, boolean paramBoolean)
  {
    oXa.b(paramBundle, "config");
    oXa.b(paramrka, "tatooTool");
    oXa.b(paramQQa, "thumbSub");
    a("fr_tatoo_editor", true, new Jxa(this, paramBundle, paramrka, paramQQa, paramBoolean));
  }
  
  public void c(Bundle paramBundle, rka paramrka, QQa<Bitmap> paramQQa, boolean paramBoolean)
  {
    oXa.b(paramBundle, "config");
    oXa.b(paramrka, "effectTool");
    oXa.b(paramQQa, "thumbSub");
    a("fr_effect_editor", true, new Exa(this, paramBundle, paramrka, paramQQa, paramBoolean));
  }
  
  public void e()
  {
    Toast localToast = Toast.makeText(La(), 2131689613, 1);
    Object localObject = KOa.b;
    Context localContext = Jb();
    oXa.a(localContext, "requireContext()");
    localToast.setGravity(80, 0, ((KOa)localObject).c(localContext, 2131165558));
    localObject = eb();
    if (localObject != null) {
      ((View)localObject).post(new Hxa(localToast));
    }
  }
  
  public View f(int paramInt)
  {
    if (this.ya == null) {
      this.ya = new HashMap();
    }
    View localView1 = (View)this.ya.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.ya.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public Integer f()
  {
    Object localObject = La();
    if (localObject != null)
    {
      localObject = ((Context)localObject).getResources();
      if (localObject != null) {
        return Integer.valueOf((int)((Resources)localObject).getDimension(2131165431));
      }
    }
    localObject = null;
    return (Integer)localObject;
  }
  
  public boolean fa()
  {
    wza localwza = ec();
    if (localwza != null)
    {
      G localG = Ka().a();
      localG.a(2130771986, 2130771987, 2130771986, 2130771987);
      localG.a(localwza);
      localG.a();
      return true;
    }
    return d.a.a(this);
  }
  
  public Bitmap g()
  {
    return ((ScrollableContentView)((ResultingBitmapView)f(k.resultingBitmapView)).getContentView()).getResultingBitmap();
  }
  
  public GVa<fya.b> getViewActions()
  {
    return this.ua;
  }
  
  public Context h()
  {
    return La();
  }
  
  public void sb()
  {
    this.va.i();
    ((ResultingBitmapView)f(k.resultingBitmapView)).a();
    super.sb();
    Lb();
  }
  
  public static final class a
  {
    public final uxa a(Qxa paramQxa)
    {
      oXa.b(paramQxa, "presenter");
      uxa localuxa = new uxa();
      localuxa.a(paramQxa);
      return localuxa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/uxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */