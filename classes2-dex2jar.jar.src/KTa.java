import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.l;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import io.faceapp.k;
import io.faceapp.n;
import io.faceapp.ui.components.AuthButtonView;
import io.faceapp.ui.components.AuthButtonView.a.a;
import io.faceapp.ui.components.AuthButtonView.a.b;
import io.faceapp.ui.misc.c.a;
import io.faceapp.ui.misc.c.a.h;
import io.faceapp.ui.misc.d;
import io.faceapp.ui.misc.d.a;
import java.util.HashMap;

public final class kta
  extends ala<Fta, Eta>
  implements Fta, Zta.a, d
{
  public static final kta.a la = new kta.a(null);
  private final int ma = 2131492971;
  private final JVa<Fta.c> na;
  private Fta.a oa;
  private Integer pa;
  private HashMap qa;
  
  public kta()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.na = localGVa;
  }
  
  private final void cc()
  {
    Object localObject = (AuthButtonView)f(k.loginFacebookBtnView);
    oXa.a(localObject, "loginFacebookBtnView");
    UPa.c((View)localObject, 0L, 1, null);
    localObject = (AuthButtonView)f(k.loginPhoneBtnView);
    oXa.a(localObject, "loginPhoneBtnView");
    UPa.c((View)localObject, 0L, 1, null);
    localObject = (ProgressBar)f(k.progressBarView);
    oXa.a(localObject, "progressBarView");
    UPa.b((View)localObject, 0L, 1, null);
  }
  
  private final void dc()
  {
    Object localObject = (AuthButtonView)f(k.loginFacebookBtnView);
    oXa.a(localObject, "loginFacebookBtnView");
    UPa.b((View)localObject, 0L, 1, null);
    localObject = (AuthButtonView)f(k.loginPhoneBtnView);
    oXa.a(localObject, "loginPhoneBtnView");
    UPa.b((View)localObject, 0L, 1, null);
    localObject = (ProgressBar)f(k.progressBarView);
    oXa.a(localObject, "progressBarView");
    UPa.c((View)localObject, 0L, 1, null);
  }
  
  private final void g(int paramInt)
  {
    Context localContext = La();
    if (localContext != null)
    {
      Toast.makeText(localContext, paramInt, 1).show();
      return;
    }
    throw new IllegalStateException("Required value was null.");
  }
  
  public void Aa()
  {
    getViewActions().a(Fta.c.e.a);
  }
  
  public void F()
  {
    g(2131689490);
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.qa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public Eta Mb()
  {
    return new Eta(this.oa);
  }
  
  public void P()
  {
    g(2131689494);
  }
  
  public void R()
  {
    n localn = getRouter();
    if (localn != null) {
      localn.a(this);
    }
  }
  
  public int Zb()
  {
    return this.ma;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    Kra.b.b().a(paramInt1, paramInt2, paramIntent);
    this.pa = Integer.valueOf(paramInt2);
  }
  
  public void a(Fta.d paramd)
  {
    oXa.b(paramd, "model");
    if (oXa.a(paramd, Fta.d.b.a))
    {
      dc();
    }
    else
    {
      if (!oXa.a(paramd, Fta.d.a.a)) {
        break label38;
      }
      cc();
    }
    return;
    label38:
    throw new UVa();
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    ((AuthButtonView)f(k.loginFacebookBtnView)).a(new AuthButtonView.a.a(null, 1, null));
    ((AuthButtonView)f(k.loginPhoneBtnView)).a(new AuthButtonView.a.b(null, 1, null));
    Object localObject = (ProgressBar)f(k.progressBarView);
    oXa.a(localObject, "progressBarView");
    localObject = ((ProgressBar)localObject).getIndeterminateDrawable();
    if (localObject != null) {
      ((Drawable)localObject).setColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }
    localObject = (AuthButtonView)f(k.loginFacebookBtnView);
    oXa.a(localObject, "loginFacebookBtnView");
    ((View)localObject).setOnClickListener(new mta(this));
    localObject = (AuthButtonView)f(k.loginPhoneBtnView);
    oXa.a(localObject, "loginPhoneBtnView");
    ((View)localObject).setOnClickListener(new nta(this));
    super.a(paramView, paramBundle);
  }
  
  public void a(c.a parama)
  {
    oXa.b(parama, "errorModel");
    int i;
    if (oXa.a(parama, c.a.h.a)) {
      i = 2131689610;
    } else {
      i = 2131689489;
    }
    g(i);
  }
  
  public void a(c.a parama, Object paramObject)
  {
    oXa.b(parama, "model");
    Fta.b.a(this, parama, paramObject);
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    l locall = cb();
    paramBundle = locall;
    if (!(locall instanceof Fta.a)) {
      paramBundle = null;
    }
    this.oa = ((Fta.a)paramBundle);
  }
  
  public void dismiss()
  {
    bc();
  }
  
  public View f(int paramInt)
  {
    if (this.qa == null) {
      this.qa = new HashMap();
    }
    View localView1 = (View)this.qa.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.qa.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public boolean fa()
  {
    getViewActions().a(Fta.c.b.a);
    return d.a.a(this);
  }
  
  public JVa<Fta.c> getViewActions()
  {
    return this.na;
  }
  
  public XQa<_ja> m()
  {
    XQa localXQa = Kra.b.b().a(this, new hta()).d(lta.a);
    oXa.a(localXQa, "AccountManager.socialLog…ls(it.userId, it.token) }");
    return localXQa;
  }
  
  public void vb()
  {
    super.vb();
    Integer localInteger = this.pa;
    if (localInteger != null)
    {
      boolean bool;
      if (localInteger.intValue() == -1) {
        bool = true;
      } else {
        bool = false;
      }
      getViewActions().a(new Fta.c.a(bool));
      this.pa = null;
    }
  }
  
  public void wb()
  {
    super.wb();
    FPa.a(this, 2131099691, true);
  }
  
  public XQa<bka> x()
  {
    XQa localXQa = Kra.b.b().a(this, new eta()).d(ota.a);
    oXa.a(localXQa, "AccountManager.socialLog…ls(it.userId, it.token) }");
    return localXQa;
  }
  
  public void xb()
  {
    FPa.b(this);
    super.xb();
  }
  
  public static final class a
  {
    public final kta a()
    {
      return new kta();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/kta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */