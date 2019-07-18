import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.m.a;
import io.faceapp.n;
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.c;
import io.faceapp.services.glide.d;
import io.faceapp.ui.misc.c.a;
import io.faceapp.ui.misc.c.a.h;
import io.faceapp.ui.misc.c.a.l;
import io.faceapp.ui.misc.c.a.m;
import io.faceapp.ui.misc.recycler.view.ContentErrorView;
import io.faceapp.ui.misc.recycler.view.LoadingView;
import java.util.HashMap;
import java.util.List;

public final class _ta
  extends ala<lua, kua>
  implements lua, Fta.a
{
  public static final _ta.a la = new _ta.a(null);
  private final int ma = 2131492973;
  private final int na = 2131690008;
  private final int oa = 2131492897;
  private final GVa<lua.b> pa;
  private String qa;
  private List<View> ra;
  private HashMap sa;
  
  public _ta()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.pa = localGVa;
  }
  
  private final void a(lua.c.a parama)
  {
    TextView localTextView = (TextView)f(k.label1View);
    oXa.a(localTextView, "label1View");
    Object localObject = b(2131689487);
    oXa.a(localObject, "getString(R.string.AuthForVote_WaitingForVote)");
    localTextView.setText(zYa.b((String)localObject, "{name}", parama.b(), false, 4, null));
    localObject = La();
    if (localObject != null)
    {
      parama = a.a((Context)localObject).a(parama.a()).b(new aua(this)).a(2131231088);
      oXa.a(parama, "GlideApp\n               …r(R.drawable.placeholder)");
      GPa.a(parama, 0, 1, null).a((ImageView)f(k.imageView));
      return;
    }
    throw new IllegalStateException("Required value was null.");
  }
  
  private final void a(lua.c.c paramc)
  {
    paramc = paramc.a();
    if (oXa.a(paramc, c.a.h.a)) {
      paramc = jHa.e.a();
    } else if (oXa.a(paramc, c.a.m.a)) {
      paramc = jHa.e.a(new bua(this));
    } else if (oXa.a(paramc, c.a.l.a)) {
      paramc = jHa.e.a(2131689616);
    } else {
      paramc = jHa.e.c();
    }
    ((ContentErrorView)f(k.contentErrorView)).a(paramc);
    paramc = (ContentErrorView)f(k.contentErrorView);
    oXa.a(paramc, "contentErrorView");
    UPa.c(paramc, 0L, 1, null);
    paramc = (LoadingView)f(k.loadingView);
    oXa.a(paramc, "loadingView");
    UPa.c(paramc);
    paramc = this.ra;
    if (paramc != null)
    {
      UPa.d(paramc);
      return;
    }
    oXa.b("contentViews");
    throw null;
  }
  
  private final void cc()
  {
    Object localObject = (LoadingView)f(k.loadingView);
    oXa.a(localObject, "loadingView");
    UPa.e((View)localObject);
    localObject = (ContentErrorView)f(k.contentErrorView);
    oXa.a(localObject, "contentErrorView");
    UPa.c((View)localObject);
    localObject = this.ra;
    if (localObject != null)
    {
      UPa.d((Iterable)localObject);
      return;
    }
    oXa.b("contentViews");
    throw null;
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.sa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public kua Mb()
  {
    String str = this.qa;
    if (str != null) {
      return new kua(str);
    }
    oXa.b("pollId");
    throw null;
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
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    TextView localTextView1 = (TextView)f(k.menuLaterBtnView);
    oXa.a(localTextView1, "menuLaterBtnView");
    ConstraintLayout localConstraintLayout = (ConstraintLayout)f(k.imageContainerView);
    oXa.a(localConstraintLayout, "imageContainerView");
    TextView localTextView2 = (TextView)f(k.label1View);
    oXa.a(localTextView2, "label1View");
    TextView localTextView3 = (TextView)f(k.loginView);
    oXa.a(localTextView3, "loginView");
    TextView localTextView4 = (TextView)f(k.label2View);
    oXa.a(localTextView4, "label2View");
    this.ra = mWa.c(new View[] { localTextView1, localConstraintLayout, localTextView2, localTextView3, localTextView4 });
    localTextView2 = (TextView)f(k.menuLaterBtnView);
    oXa.a(localTextView2, "menuLaterBtnView");
    localTextView2.setOnClickListener(new dua(this));
    localTextView2 = (TextView)f(k.loginView);
    oXa.a(localTextView2, "loginView");
    localTextView2.setOnClickListener(new eua(this));
    super.a(paramView, paramBundle);
  }
  
  public void a(c.a parama, Object paramObject)
  {
    oXa.b(parama, "model");
    lua.a.a(this, parama, paramObject);
  }
  
  public void a(lua.c paramc)
  {
    oXa.b(paramc, "model");
    if (oXa.a(paramc, lua.c.b.a))
    {
      cc();
    }
    else if ((paramc instanceof lua.c.a))
    {
      a((lua.c.a)paramc);
    }
    else
    {
      if (!(paramc instanceof lua.c.c)) {
        break label58;
      }
      a((lua.c.c)paramc);
    }
    return;
    label58:
    throw new UVa();
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    paramBundle = Ja();
    if (paramBundle != null)
    {
      oXa.a(paramBundle, "it");
      this.qa = EPa.c(paramBundle, "poll_id");
      if (paramBundle != null)
      {
        oXa.a(paramBundle, "arguments?.also {\n      … necessary params\")\n    }");
        return;
      }
    }
    throw new IllegalArgumentException("Fragment created without necessary params");
  }
  
  public View f(int paramInt)
  {
    if (this.sa == null) {
      this.sa = new HashMap();
    }
    View localView1 = (View)this.sa.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.sa.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public void g(String paramString)
  {
    oXa.b(paramString, "pollId");
    n localn = getRouter();
    if (localn != null) {
      m.a.a(localn, paramString, null, true, 2, null);
    }
  }
  
  public GVa<lua.b> getViewActions()
  {
    return this.pa;
  }
  
  public void i()
  {
    n localn = getRouter();
    if (localn != null) {
      m.a.a(localn, true, false, 2, null);
    }
  }
  
  public void k()
  {
    n localn = getRouter();
    if (localn != null) {
      localn.a(this);
    }
  }
  
  public void p(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      long l = Wa().getInteger(2131361801);
      n localn = getRouter();
      if (localn != null) {
        m.a.a(localn, this, false, false, 6, null);
      }
      a(eb(), l + 250L, new cua(this));
    }
  }
  
  public void sb()
  {
    List localList = this.ra;
    if (localList != null)
    {
      localList.clear();
      super.sb();
      Lb();
      return;
    }
    oXa.b("contentViews");
    throw null;
  }
  
  public static final class a
  {
    public final _ta a(String paramString)
    {
      oXa.b(paramString, "pollId");
      _ta local_ta = new _ta();
      Bundle localBundle = new Bundle();
      localBundle.putString("poll_id", paramString);
      local_ta.m(localBundle);
      return local_ta;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_ta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */