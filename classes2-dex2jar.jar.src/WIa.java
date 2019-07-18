import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.m.a;
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.c;
import io.faceapp.services.glide.d;
import io.faceapp.ui.components.AppBar.b.b;
import io.faceapp.ui.components.AppBar.b.e;
import io.faceapp.ui.components.q;
import io.faceapp.ui.components.q.a;
import java.util.HashMap;

public final class wIa
  extends ala<KIa, BIa>
  implements KIa
{
  public static final wIa.a la = new wIa.a(null);
  private final int ma = 2131493002;
  private final int na = 2131689479;
  private final int oa = 2131492903;
  private final boolean pa = true;
  private final GVa<KIa.d> qa;
  private q.a ra;
  private boolean sa;
  private Rja ta;
  private HashMap ua;
  
  public wIa()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.qa = localGVa;
    this.sa = true;
  }
  
  private final void cc()
  {
    e(2131689479);
    a(AppBar.b.e.c);
    A(Sra.a.b());
  }
  
  private final void dc()
  {
    e(2131689823);
    a(AppBar.b.b.c);
    A(false);
  }
  
  public void D()
  {
    fY.a(this).c().a(3334);
    o localo = Ea();
    if (localo != null) {
      localo.overridePendingTransition(2130771991, 2130771997);
    }
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.ua;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public BIa Mb()
  {
    return new BIa(this.ra);
  }
  
  public Integer Wb()
  {
    return Integer.valueOf(this.oa);
  }
  
  public int Xb()
  {
    return this.na;
  }
  
  public boolean Yb()
  {
    return this.pa;
  }
  
  public int Zb()
  {
    return this.ma;
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    oXa.b(paramLayoutInflater, "inflater");
    this.sa = true;
    return super.a(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 3334) && (paramInt2 == -1))
    {
      paramIntent = fY.b(paramIntent);
      oXa.a(paramIntent, "Matisse.obtainSingleResult(data)");
      paramIntent = paramIntent.toString();
      oXa.a(paramIntent, "selected.toString()");
      this.ta = new Vja(paramIntent, null, 2, null);
    }
  }
  
  public void a(KIa.e parame)
  {
    oXa.b(parame, "model");
    Object localObject = (RecyclerView)f(k.recyclerView);
    oXa.a(localObject, "recyclerView");
    ((tIa)EPa.b((RecyclerView)localObject)).a(parame);
    if (parame.a() != null)
    {
      localObject = a.a(Jb()).a(parame.a()).c().a(2131231089);
      oXa.a(localObject, "GlideApp.with(requireCon…placeholder_user_profile)");
      oXa.a(GPa.a((c)localObject, 0, 1, null).a((ImageView)f(k.menuUserProfileView)), "GlideApp.with(requireCon…into(menuUserProfileView)");
    }
    else
    {
      ((ImageView)f(k.menuUserProfileView)).setImageResource(2131231089);
    }
    if (parame.b() == 0)
    {
      parame = (TextView)f(k.menuUpdatesUnreadCountView);
      oXa.a(parame, "menuUpdatesUnreadCountView");
      UPa.c(parame);
    }
    else
    {
      localObject = (TextView)f(k.menuUpdatesUnreadCountView);
      oXa.a(localObject, "menuUpdatesUnreadCountView");
      MOa localMOa = MOa.a;
      Context localContext = Jb();
      oXa.a(localContext, "requireContext()");
      ((TextView)localObject).setText(localMOa.a(localContext, parame.b()));
      parame = (TextView)f(k.menuUpdatesUnreadCountView);
      oXa.a(parame, "menuUpdatesUnreadCountView");
      UPa.c(parame, 0L, 1, null);
    }
    if (this.sa)
    {
      this.sa = false;
      EPa.a(this);
    }
  }
  
  public void a(Rja paramRja, int paramInt)
  {
    oXa.b(paramRja, "image");
    if (ob()) {
      return;
    }
    long l = Wa().getInteger(2131361801);
    io.faceapp.n localn = getRouter();
    if (localn != null) {
      m.a.a(localn, this, false, false, 6, null);
    }
    a(eb(), l, new xIa(this, paramRja));
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    Object localObject1 = Wa();
    oXa.a(localObject1, "resources");
    Object localObject2 = new tIa((Resources)localObject1, 4, getViewActions());
    Object localObject3 = new GridLayoutManager(La(), 4);
    ((GridLayoutManager)localObject3).a(new zIa((tIa)localObject2));
    localObject1 = (RecyclerView)f(k.recyclerView);
    ((RecyclerView)localObject1).setHasFixedSize(false);
    ((RecyclerView)localObject1).setLayoutManager((RecyclerView.i)localObject3);
    ((RecyclerView)localObject1).setAdapter((RecyclerView.a)localObject2);
    ((RecyclerView)localObject1).setItemAnimator(null);
    localObject3 = KOa.b;
    localObject2 = paramView.getContext();
    oXa.a(localObject2, "view.context");
    ((RecyclerView)localObject1).a(new io.faceapp.ui.components.n(((KOa)localObject3).c((Context)localObject2, 2131165447), 4, 3, 0, 8, null));
    localObject1 = (ImageView)f(k.menuUserProfileView);
    oXa.a(localObject1, "menuUserProfileView");
    ((View)localObject1).setOnClickListener(new AIa(this));
    if (this.ra != null) {
      dc();
    } else {
      cc();
    }
    super.a(paramView, paramBundle);
  }
  
  protected void bc()
  {
    if (this.ra != null) {
      super.bc();
    } else {
      getViewActions().a(KIa.d.h.a);
    }
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    try
    {
      if (cb() != null)
      {
        q.a locala = new io/faceapp/ui/components/q$a;
        paramBundle = cb();
        if (paramBundle != null)
        {
          locala.<init>((q)paramBundle, db());
          this.ra = locala;
        }
        else
        {
          paramBundle = new _Va;
          paramBundle.<init>("null cannot be cast to non-null type io.faceapp.ui.components.ImageSelectListener");
          throw paramBundle;
        }
      }
      return;
    }
    catch (ClassCastException paramBundle)
    {
      throw new IllegalStateException("Incompatible result listener defined for PhotoPicker screen");
    }
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
  
  public GVa<KIa.d> getViewActions()
  {
    return this.qa;
  }
  
  public void s()
  {
    io.faceapp.n localn = getRouter();
    if (localn != null) {
      localn.c(this, 3);
    }
  }
  
  public void vb()
  {
    super.vb();
    Rja localRja = this.ta;
    if (localRja != null)
    {
      if (Build.VERSION.SDK_INT >= 24) {
        a(localRja, 2);
      } else {
        a(eb(), 500L, new yIa(localRja, this));
      }
      this.ta = null;
    }
  }
  
  public void z()
  {
    io.faceapp.n localn = getRouter();
    if (localn != null) {
      localn.d(this, 4);
    }
  }
  
  public void za()
  {
    io.faceapp.n localn = getRouter();
    if (localn != null) {
      localn.b(this, 1);
    }
  }
  
  public static final class a
  {
    public final wIa a()
    {
      return new wIa();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wIa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */