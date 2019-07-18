import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.support.v4.app.s;
import android.support.v7.app.l.a;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import io.faceapp.k;
import io.faceapp.m.a;
import io.faceapp.n;
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.c;
import io.faceapp.ui.components.AppBar;
import io.faceapp.ui.components.r;
import io.faceapp.ui.components.r.a;
import io.faceapp.ui.misc.c.a;
import io.faceapp.ui.misc.c.a.h;
import io.faceapp.ui.misc.d.a;
import io.faceapp.ui.user_settings.item.UserSettingsLoginItemView;
import io.faceapp.ui.user_settings.item.UserSettingsLoginItemView.a.a;
import io.faceapp.ui.user_settings.item.UserSettingsLoginItemView.a.b;
import io.faceapp.ui.user_settings.item.UserSettingsLoginItemView.a.c;
import java.util.HashMap;

public final class hNa
  extends ala<UNa, TNa>
  implements UNa, bOa.a, io.faceapp.ui.misc.d
{
  public static final hNa.a la = new hNa.a(null);
  private final int ma = 2131493019;
  private final int na = 2131689990;
  private final int oa = 2131492905;
  private final GVa<UNa.b> pa;
  private jRa qa;
  private Integer ra;
  private Uri sa;
  private boolean ta;
  private HashMap ua;
  
  public hNa()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.pa = localGVa;
  }
  
  private final void cc()
  {
    a(eb(), 500L, new iNa(this));
  }
  
  private final void g(int paramInt)
  {
    Toast.makeText(Jb(), paramInt, 1).show();
  }
  
  public void C()
  {
    fY.a(this).c().a(3335);
    o localo = Ea();
    if (localo != null) {
      localo.overridePendingTransition(2130771991, 2130771997);
    }
  }
  
  public void E()
  {
    g(2131689489);
  }
  
  public void L()
  {
    g(2131689974);
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.ua;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public void M()
  {
    g(2131689980);
  }
  
  public TNa Mb()
  {
    return new TNa();
  }
  
  public void N()
  {
    l.a locala = new l.a(Jb());
    locala.b(2131689977);
    locala.a(2131689976);
    locala.b(2131689752, new vNa(this));
    locala.a(2131689504, wNa.a);
    locala.a(true);
    locala.c();
  }
  
  public void Q()
  {
    g(2131689975);
  }
  
  public Integer Wb()
  {
    return Integer.valueOf(this.oa);
  }
  
  public int Xb()
  {
    return this.na;
  }
  
  public int Zb()
  {
    return this.ma;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 3335)
    {
      if (paramInt2 == -1) {
        this.sa = fY.b(paramIntent);
      }
    }
    else
    {
      Kra.b.b().a(paramInt1, paramInt2, paramIntent);
      this.ra = Integer.valueOf(paramInt2);
    }
  }
  
  public void a(UNa.c paramc)
  {
    oXa.b(paramc, "model");
    UNa.c.a locala = (UNa.c.a)paramc;
    ((EditText)f(k.firstNameView)).setText(locala.b());
    ((EditText)f(k.lastNameView)).setText(locala.c());
    paramc = a.a(Jb()).a(locala.a()).a(Hf.b).a(true).a(2131231087).c();
    oXa.a(paramc, "GlideApp.with(requireCon…            .circleCrop()");
    GPa.a(paramc, 0, 1, null).a((ImageView)f(k.avatarView));
    paramc = locala.d();
    ((UserSettingsLoginItemView)f(k.facebookItemView)).a(new UserSettingsLoginItemView.a.a(paramc));
    ((UserSettingsLoginItemView)f(k.vkItemView)).a(new UserSettingsLoginItemView.a.c(paramc));
    ((UserSettingsLoginItemView)f(k.phoneNumberItemView)).a(new UserSettingsLoginItemView.a.b(paramc));
  }
  
  public void a(Uri paramUri)
  {
    oXa.b(paramUri, "imageUri");
    n localn = getRouter();
    if (localn != null) {
      localn.a(paramUri, 240, this);
    }
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    Object localObject = (TextView)f(k.logoutButtonView);
    oXa.a(localObject, "logoutButtonView");
    ((View)localObject).setOnClickListener(new lNa(this, paramView));
    localObject = (ImageView)f(k.avatarEditView);
    oXa.a(localObject, "avatarEditView");
    ((View)localObject).setOnClickListener(new mNa(this, paramView));
    localObject = (AppBar)f(k.appBar);
    oXa.a(localObject, "appBar");
    localObject = (TextView)((AppBar)localObject).c(k.saveButtonView);
    oXa.a(localObject, "appBar.saveButtonView");
    ((View)localObject).setOnClickListener(new nNa(this, paramView));
    ((UserSettingsLoginItemView)f(k.facebookItemView)).a(getViewActions());
    ((UserSettingsLoginItemView)f(k.vkItemView)).a(getViewActions());
    ((UserSettingsLoginItemView)f(k.phoneNumberItemView)).a(getViewActions());
    this.qa = new jRa();
    localObject = this.qa;
    if (localObject != null)
    {
      ((jRa)localObject).b(gW.a((EditText)f(k.firstNameView)).t().e(oNa.a).e().c(new pNa(this)));
      localObject = this.qa;
      if (localObject != null)
      {
        ((jRa)localObject).b(gW.a((EditText)f(k.lastNameView)).t().e(qNa.a).e().c(new rNa(this)));
        FPa.c(this);
        super.a(paramView, paramBundle);
        return;
      }
      oXa.b("disposable");
      throw null;
    }
    oXa.b("disposable");
    throw null;
  }
  
  public void a(c.a parama)
  {
    oXa.b(parama, "errorModel");
    int i;
    if (oXa.a(parama, c.a.h.a)) {
      i = 2131689610;
    } else {
      i = 2131689994;
    }
    g(i);
  }
  
  public void a(c.a parama, Object paramObject)
  {
    oXa.b(parama, "model");
    UNa.a.a(this, parama, paramObject);
  }
  
  public void a(boolean paramBoolean)
  {
    r.a locala = r.ia;
    s locals = Ka();
    oXa.a(locals, "childFragmentManager");
    locala.a(locals, paramBoolean);
  }
  
  public void b(Uri paramUri)
  {
    oXa.b(paramUri, "resultUri");
    n localn = getRouter();
    if (localn != null) {
      m.a.a(localn, this, false, false, 6, null);
    }
    getViewActions().a(new UNa.b.k(paramUri, true));
  }
  
  public void dismiss()
  {
    this.ta = true;
    o localo = Ea();
    if (localo != null) {
      localo.onBackPressed();
    }
  }
  
  public void e(String paramString)
  {
    oXa.b(paramString, "accountId");
    l.a locala = new l.a(Jb());
    locala.b(2131689979);
    locala.a(2131689978);
    locala.b(2131689991, new xNa(this, paramString));
    locala.a(2131689504, yNa.a);
    locala.a(true);
    locala.c();
  }
  
  public View f(int paramInt)
  {
    if (this.ua == null) {
      this.ua = new HashMap();
    }
    View localView1 = (View)this.ua.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.ua.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public boolean fa()
  {
    View localView = eb();
    if (localView != null) {
      UPa.b(localView);
    }
    if (!this.ta)
    {
      getViewActions().a(new UNa.b.b(false));
      return true;
    }
    return d.a.a(this);
  }
  
  public GVa<UNa.b> getViewActions()
  {
    return this.pa;
  }
  
  public void h(String paramString)
  {
    oXa.b(paramString, "accountId");
    l.a locala = new l.a(Jb());
    locala.b(2131689982);
    locala.a(2131689981);
    locala.b(2131689991, new zNa(this, paramString));
    locala.a(2131689504, ANa.a);
    locala.a(true);
    locala.c();
  }
  
  public void j()
  {
    l.a locala = new l.a(Jb());
    locala.b(2131689970);
    locala.a(2131689969);
    locala.b(2131689872, new tNa(this));
    locala.a(2131689968, new uNa(this));
    locala.a(true);
    locala.c();
  }
  
  public XQa<_ja> m()
  {
    XQa localXQa = Kra.b.b().a(this, new hta()).d(jNa.a);
    oXa.a(localXQa, "AccountManager.socialLog…ls(it.userId, it.token) }");
    return localXQa;
  }
  
  public void sb()
  {
    jRa localjRa = this.qa;
    if (localjRa != null)
    {
      localjRa.i();
      FPa.a(this);
      super.sb();
      Lb();
      return;
    }
    oXa.b("disposable");
    throw null;
  }
  
  public void setSaveEnabled(boolean paramBoolean)
  {
    Object localObject = (AppBar)f(k.appBar);
    oXa.a(localObject, "appBar");
    localObject = (TextView)((AppBar)localObject).c(k.saveButtonView);
    oXa.a(localObject, "appBar.saveButtonView");
    ((TextView)localObject).setEnabled(paramBoolean);
  }
  
  public void vb()
  {
    super.vb();
    Object localObject = this.ra;
    if (localObject != null)
    {
      boolean bool;
      if (((Integer)localObject).intValue() == -1) {
        bool = true;
      } else {
        bool = false;
      }
      getViewActions().a(new UNa.b.a(bool));
      this.ra = null;
    }
    localObject = this.sa;
    if (localObject != null)
    {
      localObject = new UNa.b.k((Uri)localObject, false);
      if (Build.VERSION.SDK_INT >= 24) {
        getViewActions().a(localObject);
      } else {
        a(eb(), 500L, new kNa((UNa.b.k)localObject, this));
      }
      this.sa = null;
    }
  }
  
  public XQa<bka> x()
  {
    XQa localXQa = Kra.b.b().a(this, new eta()).d(sNa.a);
    oXa.a(localXQa, "AccountManager.socialLog…ls(it.userId, it.token) }");
    return localXQa;
  }
  
  public static final class a
  {
    public final hNa a()
    {
      return new hNa();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hNa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */