import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.support.v4.app.s;
import android.support.v7.app.l.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import io.faceapp.k;
import io.faceapp.m.a;
import io.faceapp.n;
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.c;
import io.faceapp.ui.components.r;
import io.faceapp.ui.components.r.a;
import io.faceapp.ui.misc.c.a;
import io.faceapp.ui.misc.c.a.h;
import io.faceapp.ui.misc.c.a.l;
import io.faceapp.ui.misc.c.a.m;
import io.faceapp.ui.misc.d.a;
import io.faceapp.ui.misc.recycler.view.ContentErrorView;
import io.faceapp.ui.misc.recycler.view.LoadingView;
import io.faceapp.ui.polls.item.PartAuthorItemView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class cOa
  extends ala<yOa, oOa>
  implements yOa, JOa.d, io.faceapp.ui.misc.d
{
  public static final cOa.a la = new cOa.a(null);
  private final int ma = 2131493020;
  private final int na = 2131690008;
  private final int oa = 2131492906;
  private final GVa<yOa.b> pa;
  private final FVa<yOa.c> qa;
  private List<View> ra;
  private String sa;
  private yOa.d ta;
  private boolean ua;
  private kRa va;
  private HashMap wa;
  
  public cOa()
  {
    Object localObject = GVa.t();
    oXa.a(localObject, "PublishSubject.create()");
    this.pa = ((GVa)localObject);
    localObject = FVa.f(yOa.c.b.a);
    oXa.a(localObject, "BehaviorSubject.createDefault(Loading)");
    this.qa = ((FVa)localObject);
  }
  
  private final void a(jHa paramjHa)
  {
    ((ContentErrorView)f(k.contentErrorView)).a(paramjHa);
    paramjHa = (LoadingView)f(k.loadingView);
    oXa.a(paramjHa, "loadingView");
    UPa.c(paramjHa);
    paramjHa = (ContentErrorView)f(k.contentErrorView);
    oXa.a(paramjHa, "contentErrorView");
    UPa.c(paramjHa, 0L, 1, null);
    paramjHa = (PartAuthorItemView)f(k.pollAuthorView);
    oXa.a(paramjHa, "pollAuthorView");
    UPa.c(paramjHa);
    paramjHa = (TextView)f(k.menuSubmitBtnView);
    oXa.a(paramjHa, "menuSubmitBtnView");
    UPa.c(paramjHa);
    paramjHa = (ConstraintLayout)f(k.imageContainerView);
    oXa.a(paramjHa, "imageContainerView");
    UPa.c(paramjHa);
    paramjHa = (TextView)f(k.selectLabelView);
    oXa.a(paramjHa, "selectLabelView");
    UPa.c(paramjHa);
    paramjHa = (TextView)f(k.commentsLabelView);
    oXa.a(paramjHa, "commentsLabelView");
    UPa.c(paramjHa);
    paramjHa = (ConstraintLayout)f(k.commentContainerView);
    oXa.a(paramjHa, "commentContainerView");
    UPa.c(paramjHa);
  }
  
  private final void a(yOa.c.c paramc)
  {
    paramc = paramc.a();
    if (oXa.a(paramc, c.a.h.a)) {
      paramc = jHa.e.a();
    } else if (oXa.a(paramc, c.a.m.a)) {
      paramc = jHa.e.a(new dOa(this));
    } else if (oXa.a(paramc, c.a.l.a)) {
      paramc = jHa.e.a(2131689616);
    } else {
      paramc = jHa.e.c();
    }
    a(paramc);
  }
  
  private final void a(yOa.c.e parame)
  {
    Object localObject1 = (LoadingView)f(k.loadingView);
    oXa.a(localObject1, "loadingView");
    UPa.b((View)localObject1, 0L, 1, null);
    localObject1 = (ContentErrorView)f(k.contentErrorView);
    oXa.a(localObject1, "contentErrorView");
    UPa.b((View)localObject1, 0L, 1, null);
    localObject1 = (PartAuthorItemView)f(k.pollAuthorView);
    oXa.a(localObject1, "pollAuthorView");
    UPa.c((View)localObject1, 0L, 1, null);
    localObject1 = (TextView)f(k.menuSubmitBtnView);
    oXa.a(localObject1, "menuSubmitBtnView");
    UPa.c((View)localObject1, 0L, 1, null);
    localObject1 = (TextView)f(k.menuSubmitBtnView);
    oXa.a(localObject1, "menuSubmitBtnView");
    ((TextView)localObject1).setEnabled(true);
    localObject1 = (ConstraintLayout)f(k.imageContainerView);
    oXa.a(localObject1, "imageContainerView");
    UPa.c((View)localObject1, 0L, 1, null);
    localObject1 = this.ra;
    if (localObject1 != null)
    {
      int i = 0;
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = ((Iterator)localObject1).next();
        if (i >= 0)
        {
          localObject2 = (View)localObject2;
          float f;
          if (i == parame.b()) {
            f = 1.0F;
          } else {
            f = 0.0F;
          }
          ((View)localObject2).setAlpha(f);
          i++;
        }
        else
        {
          mWa.c();
          throw null;
        }
      }
      localObject1 = (TextView)f(k.selectLabelView);
      oXa.a(localObject1, "selectLabelView");
      UPa.c((View)localObject1);
      localObject1 = (TextView)f(k.commentsLabelView);
      oXa.a(localObject1, "commentsLabelView");
      UPa.c((View)localObject1, 0L, 1, null);
      localObject1 = (ConstraintLayout)f(k.commentContainerView);
      oXa.a(localObject1, "commentContainerView");
      UPa.c((View)localObject1, 0L, 1, null);
      localObject1 = (TextView)f(k.commentView);
      oXa.a(localObject1, "commentView");
      ((TextView)localObject1).setText(parame.a());
      return;
    }
    oXa.b("selectedOverlayViews");
    throw null;
  }
  
  private final void cc()
  {
    a(jHa.e.a(2131690001));
  }
  
  private final void dc()
  {
    Object localObject = (LoadingView)f(k.loadingView);
    oXa.a(localObject, "loadingView");
    UPa.e((View)localObject);
    localObject = (ContentErrorView)f(k.contentErrorView);
    oXa.a(localObject, "contentErrorView");
    UPa.c((View)localObject);
    localObject = (PartAuthorItemView)f(k.pollAuthorView);
    oXa.a(localObject, "pollAuthorView");
    UPa.c((View)localObject);
    localObject = (TextView)f(k.menuSubmitBtnView);
    oXa.a(localObject, "menuSubmitBtnView");
    UPa.c((View)localObject);
    localObject = (ConstraintLayout)f(k.imageContainerView);
    oXa.a(localObject, "imageContainerView");
    UPa.c((View)localObject);
    localObject = (TextView)f(k.selectLabelView);
    oXa.a(localObject, "selectLabelView");
    UPa.c((View)localObject);
    localObject = (TextView)f(k.commentsLabelView);
    oXa.a(localObject, "commentsLabelView");
    UPa.c((View)localObject);
    localObject = (ConstraintLayout)f(k.commentContainerView);
    oXa.a(localObject, "commentContainerView");
    UPa.c((View)localObject);
  }
  
  private final void ec()
  {
    Object localObject = (LoadingView)f(k.loadingView);
    oXa.a(localObject, "loadingView");
    UPa.b((View)localObject, 0L, 1, null);
    localObject = (ContentErrorView)f(k.contentErrorView);
    oXa.a(localObject, "contentErrorView");
    UPa.b((View)localObject, 0L, 1, null);
    localObject = (PartAuthorItemView)f(k.pollAuthorView);
    oXa.a(localObject, "pollAuthorView");
    UPa.c((View)localObject, 0L, 1, null);
    localObject = (TextView)f(k.menuSubmitBtnView);
    oXa.a(localObject, "menuSubmitBtnView");
    UPa.c((View)localObject, 0L, 1, null);
    localObject = (TextView)f(k.menuSubmitBtnView);
    oXa.a(localObject, "menuSubmitBtnView");
    ((TextView)localObject).setEnabled(false);
    localObject = (ConstraintLayout)f(k.imageContainerView);
    oXa.a(localObject, "imageContainerView");
    UPa.c((View)localObject, 0L, 1, null);
    localObject = this.ra;
    if (localObject != null)
    {
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((View)((Iterator)localObject).next()).setAlpha(0.0F);
      }
      localObject = (TextView)f(k.selectLabelView);
      oXa.a(localObject, "selectLabelView");
      UPa.c((View)localObject, 0L, 1, null);
      localObject = (TextView)f(k.commentsLabelView);
      oXa.a(localObject, "commentsLabelView");
      UPa.c((View)localObject);
      localObject = (ConstraintLayout)f(k.commentContainerView);
      oXa.a(localObject, "commentContainerView");
      UPa.c((View)localObject);
      return;
    }
    oXa.b("selectedOverlayViews");
    throw null;
  }
  
  private final void g(int paramInt)
  {
    Toast localToast = Toast.makeText(La(), paramInt, 1);
    View localView = eb();
    if (localView != null) {
      localView.post(new nOa(localToast));
    }
  }
  
  public void G()
  {
    g(2131690007);
  }
  
  public void I()
  {
    g(2131690005);
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.wa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public oOa Mb()
  {
    String str = this.sa;
    if (str != null) {
      return new oOa(str, this.ta);
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
  
  public void a(Mka paramMka)
  {
    oXa.b(paramMka, "poll");
    ((PartAuthorItemView)f(k.pollAuthorView)).a(new LIa.a(paramMka));
    Context localContext = La();
    if (localContext != null)
    {
      paramMka = a.a(localContext).a(paramMka.o()).b(new jOa(this)).a(2131231088);
      oXa.a(paramMka, "GlideApp\n               …r(R.drawable.placeholder)");
      GPa.a(paramMka, 0, 1, null).a((ImageView)f(k.imageView));
      return;
    }
    throw new IllegalStateException("Required value was null.");
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    Object localObject1 = f(k.originOverlayView);
    oXa.a(localObject1, "originOverlayView");
    int i = 0;
    View localView1 = f(k.selectedOverlay1View);
    oXa.a(localView1, "selectedOverlay1View");
    View localView2 = f(k.selectedOverlay2View);
    oXa.a(localView2, "selectedOverlay2View");
    Object localObject2 = f(k.selectedOverlay3View);
    oXa.a(localObject2, "selectedOverlay3View");
    this.ra = mWa.c(new View[] { localObject1, localView1, localView2, localObject2 });
    localObject2 = this.ra;
    if (localObject2 != null)
    {
      localObject1 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = ((Iterator)localObject1).next();
        if (i >= 0)
        {
          localView1 = (View)localObject2;
          if (i == 0) {
            localObject2 = yOa.b.d.a;
          } else {
            localObject2 = new yOa.b.f(i);
          }
          localView1.setOnClickListener(new eOa((yOa.b)localObject2, this));
          i++;
        }
        else
        {
          mWa.c();
          throw null;
        }
      }
      localObject2 = (TextView)f(k.menuSubmitBtnView);
      oXa.a(localObject2, "menuSubmitBtnView");
      ((View)localObject2).setOnClickListener(new fOa(this));
      localObject2 = (ConstraintLayout)f(k.commentContainerView);
      oXa.a(localObject2, "commentContainerView");
      ((View)localObject2).setOnClickListener(new gOa(this));
      super.a(paramView, paramBundle);
      return;
    }
    oXa.b("selectedOverlayViews");
    throw null;
  }
  
  public void a(c.a parama, Object paramObject)
  {
    oXa.b(parama, "model");
    yOa.a.a(this, parama, paramObject);
  }
  
  public void a(String paramString, ArrayList<String> paramArrayList)
  {
    oXa.b(paramString, "curComment");
    oXa.b(paramArrayList, "suggestedComments");
    n localn = getRouter();
    if (localn != null) {
      localn.a(paramString, paramArrayList, this);
    }
  }
  
  public void a(yOa.c paramc)
  {
    oXa.b(paramc, "model");
    if (oXa.a(paramc, yOa.c.b.a))
    {
      dc();
    }
    else if (oXa.a(paramc, yOa.c.a.a))
    {
      cc();
    }
    else if (oXa.a(paramc, yOa.c.d.a))
    {
      this.qa.a(paramc);
    }
    else if ((paramc instanceof yOa.c.e))
    {
      this.qa.a(paramc);
    }
    else
    {
      if (!(paramc instanceof yOa.c.c)) {
        break label96;
      }
      a((yOa.c.c)paramc);
    }
    return;
    label96:
    throw new UVa();
  }
  
  public void a(boolean paramBoolean)
  {
    r.a locala = r.ia;
    s locals = Ka();
    oXa.a(locals, "childFragmentManager");
    locala.a(locals, paramBoolean);
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    paramBundle = Ja();
    if (paramBundle != null)
    {
      oXa.a(paramBundle, "it");
      this.sa = EPa.c(paramBundle, "poll_id");
      if (paramBundle != null)
      {
        oXa.a(paramBundle, "arguments?.also {\n      … necessary params\")\n    }");
        l locall = cb();
        paramBundle = locall;
        if (!(locall instanceof yOa.d)) {
          paramBundle = null;
        }
        this.ta = ((yOa.d)paramBundle);
        return;
      }
    }
    throw new IllegalArgumentException("Fragment created without necessary params");
  }
  
  public void dismiss()
  {
    this.ua = true;
    o localo = Ea();
    if (localo != null) {
      localo.onBackPressed();
    }
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
  
  public void f(String paramString)
  {
    oXa.b(paramString, "pollId");
    n localn = getRouter();
    if (localn != null) {
      m.a.a(localn, paramString, null, true, 2, null);
    }
  }
  
  public boolean fa()
  {
    if (!this.ua)
    {
      getViewActions().a(new yOa.b.c(false));
      return true;
    }
    return d.a.a(this);
  }
  
  public GVa<yOa.b> getViewActions()
  {
    return this.pa;
  }
  
  public void i()
  {
    n localn = getRouter();
    if (localn != null) {
      m.a.a(localn, false, true, 1, null);
    }
  }
  
  public void j()
  {
    Object localObject = La();
    if (localObject != null)
    {
      localObject = new l.a((Context)localObject);
      ((l.a)localObject).b(2131690004);
      ((l.a)localObject).a(2131690003);
      ((l.a)localObject).b(2131689953, new kOa(this));
      ((l.a)localObject).a(2131689504, new mOa(this));
      ((l.a)localObject).a(true);
      ((l.a)localObject).c();
      return;
    }
    throw new IllegalStateException("Required value was null.");
  }
  
  public void l(String paramString)
  {
    oXa.b(paramString, "newComment");
    n localn = getRouter();
    if (localn != null) {
      m.a.a(localn, this, false, false, 6, null);
    }
    getViewActions().a(new yOa.b.b(paramString));
  }
  
  public void sb()
  {
    kRa localkRa = this.va;
    if (localkRa != null) {
      localkRa.i();
    }
    super.sb();
    Lb();
  }
  
  public void xb()
  {
    this.qa.a(yOa.c.b.a);
    super.xb();
  }
  
  public static final class a
  {
    public final cOa a(String paramString)
    {
      oXa.b(paramString, "pollId");
      cOa localcOa = new cOa();
      Bundle localBundle = new Bundle();
      localBundle.putString("poll_id", paramString);
      localcOa.m(localBundle);
      return localcOa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/cOa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */