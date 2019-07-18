import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Group;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.support.v7.app.l.a;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import io.faceapp.k;
import io.faceapp.m.a;
import io.faceapp.n;
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.c;
import io.faceapp.ui.components.CircularProgressBar;
import io.faceapp.ui.misc.c.a;
import io.faceapp.ui.misc.c.a.h;
import io.faceapp.ui.misc.c.a.m;
import io.faceapp.ui.misc.d.a;
import io.faceapp.ui.misc.recycler.view.InPhotoErrorView;
import java.util.HashMap;
import java.util.List;

public final class xva
  extends ala<Rva, Mva>
  implements Rva, io.faceapp.ui.misc.d, Fta.a
{
  public static final xva.a la = new xva.a(null);
  private HashMap Aa;
  private final int ma = 2131492977;
  private final int na = 2131689528;
  private final int oa = 2131492898;
  private final GVa<Rva.d> pa;
  private List<View> qa;
  private List<View> ra;
  private Rva.a sa;
  private Rva.b ta;
  private Uri ua;
  private Uri va;
  private Mka wa;
  private boolean xa;
  private kRa ya;
  private boolean za;
  
  public xva()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.pa = localGVa;
  }
  
  private final void a(float paramFloat)
  {
    Object localObject = (ImageView)f(k.imageView);
    ((View)localObject).getViewTreeObserver().addOnPreDrawListener(new Eva((View)localObject, paramFloat));
    localObject = (ConstraintLayout)f(k.imageContainerView);
    ((View)localObject).getViewTreeObserver().addOnPreDrawListener(new Fva((View)localObject));
  }
  
  private final void a(Rva.e.a parama)
  {
    Object localObject = La();
    if (localObject != null)
    {
      io.faceapp.services.glide.d locald = a.a((Context)localObject);
      localObject = this.va;
      if (localObject != null)
      {
        locald.a((Uri)localObject).a(Hf.b).a((ImageView)f(k.imageView));
        localObject = this.qa;
        if (localObject != null)
        {
          UPa.b((Iterable)localObject);
          localObject = (InPhotoErrorView)f(k.errorInPhotoView);
          oXa.a(localObject, "errorInPhotoView");
          UPa.c((View)localObject);
          localObject = this.ra;
          if (localObject != null)
          {
            UPa.d((Iterable)localObject);
            ((CircularProgressBar)f(k.progressView)).setProgress(parama.a());
            return;
          }
          oXa.b("readyViews");
          throw null;
        }
        oXa.b("preparingViews");
        throw null;
      }
      oXa.b("loadingImageUri");
      throw null;
    }
    throw new IllegalStateException("Required value was null.");
  }
  
  private final void a(Rva.e.b paramb)
  {
    paramb = paramb.a();
    if (oXa.a(paramb, c.a.h.a)) {
      paramb = jHa.e.a();
    } else if (oXa.a(paramb, c.a.m.a)) {
      paramb = jHa.e.a(new yva(this));
    } else {
      paramb = jHa.e.c();
    }
    ((InPhotoErrorView)f(k.errorInPhotoView)).a(paramb);
    paramb = La();
    if (paramb != null)
    {
      io.faceapp.services.glide.d locald = a.a(paramb);
      paramb = this.va;
      if (paramb != null)
      {
        locald.a(paramb).a(Hf.b).a((ImageView)f(k.imageView));
        paramb = (InPhotoErrorView)f(k.errorInPhotoView);
        oXa.a(paramb, "errorInPhotoView");
        UPa.c(paramb, 0L, 1, null);
        paramb = this.qa;
        if (paramb != null)
        {
          UPa.d(paramb);
          paramb = this.ra;
          if (paramb != null)
          {
            UPa.d(paramb);
            return;
          }
          oXa.b("readyViews");
          throw null;
        }
        oXa.b("preparingViews");
        throw null;
      }
      oXa.b("loadingImageUri");
      throw null;
    }
    throw new IllegalStateException("Required value was null.");
  }
  
  private final void a(Rva.e.c paramc)
  {
    ImageView localImageView = (ImageView)f(k.imageView);
    Object localObject = this.ua;
    if (localObject != null)
    {
      localImageView.setImageURI((Uri)localObject);
      localObject = this.qa;
      if (localObject != null)
      {
        UPa.d((Iterable)localObject);
        localObject = (InPhotoErrorView)f(k.errorInPhotoView);
        oXa.a(localObject, "errorInPhotoView");
        UPa.c((View)localObject);
        localObject = this.ra;
        if (localObject != null)
        {
          UPa.b((Iterable)localObject);
          localObject = Ja();
          if (localObject != null) {
            ((Bundle)localObject).putParcelable("created_poll", paramc.a());
          }
          return;
        }
        oXa.b("readyViews");
        throw null;
      }
      oXa.b("preparingViews");
      throw null;
    }
    oXa.b("readyImageUri");
    throw null;
  }
  
  private final void cc()
  {
    a(eb(), 500L, new Ava(this));
  }
  
  private final void dc()
  {
    l.a locala = new l.a(Jb());
    locala.b(2131689525);
    locala.a(2131689524);
    locala.b(2131689523, new Jva(this));
    locala.a(2131689518, new Kva(this));
    locala.a(false);
    locala.c();
  }
  
  private final void g(int paramInt)
  {
    Toast localToast = Toast.makeText(La(), paramInt, 1);
    KOa localKOa = KOa.b;
    Object localObject = Jb();
    oXa.a(localObject, "requireContext()");
    localToast.setGravity(80, 0, localKOa.c((Context)localObject, 2131165342));
    localObject = eb();
    if (localObject != null) {
      ((View)localObject).post(new Lva(localToast));
    }
  }
  
  public boolean B()
  {
    return this.za;
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.Aa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public Mva Mb()
  {
    Rva.a locala = this.sa;
    if (locala != null)
    {
      Rva.b localb = this.ta;
      if (localb != null) {
        return new Mva(locala, localb, this.wa);
      }
      oXa.b("resultListener");
      throw null;
    }
    oXa.b("initialData");
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
  
  public void a(Rva.e parame)
  {
    oXa.b(parame, "model");
    kRa localkRa = this.ya;
    if (localkRa != null) {
      localkRa.i();
    }
    if ((parame instanceof Rva.e.a)) {
      a((Rva.e.a)parame);
    } else if ((parame instanceof Rva.e.b)) {
      a((Rva.e.b)parame);
    } else if ((parame instanceof Rva.e.c)) {
      this.ya = ((CircularProgressBar)f(k.progressView)).a().b(new zva(this, parame));
    }
  }
  
  public void a(Uri paramUri1, Uri paramUri2, float paramFloat)
  {
    oXa.b(paramUri1, "imageUri");
    oXa.b(paramUri2, "loadingUri");
    this.ua = paramUri1;
    this.va = paramUri2;
    a(paramFloat);
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    Object localObject1 = (CircularProgressBar)f(k.progressView);
    oXa.a(localObject1, "progressView");
    Object localObject2 = (TextView)f(k.preparingLabelView);
    oXa.a(localObject2, "preparingLabelView");
    this.qa = mWa.c(new View[] { localObject1, localObject2 });
    View localView = f(k.shareFacebookBtnView);
    oXa.a(localView, "shareFacebookBtnView");
    FrameLayout localFrameLayout = (FrameLayout)f(k.customButtonsView);
    oXa.a(localFrameLayout, "customButtonsView");
    Group localGroup = (Group)f(k.optionLabelsView);
    oXa.a(localGroup, "optionLabelsView");
    localObject1 = (TextView)f(k.createdTitleView);
    oXa.a(localObject1, "createdTitleView");
    localObject2 = (TextView)f(k.createdLabelView);
    oXa.a(localObject2, "createdLabelView");
    this.ra = mWa.c(new View[] { localView, localFrameLayout, localGroup, localObject1, localObject2 });
    localObject2 = f(k.shareFacebookBtnView);
    oXa.a(localObject2, "shareFacebookBtnView");
    ((View)localObject2).setOnClickListener(new Bva(this));
    localObject2 = (ImageView)f(k.menuShareBtnView);
    oXa.a(localObject2, "menuShareBtnView");
    ((View)localObject2).setOnClickListener(new Cva(this));
    localObject2 = (ImageView)f(k.menuSaveBtnView);
    oXa.a(localObject2, "menuSaveBtnView");
    ((View)localObject2).setOnClickListener(new Dva(this));
    super.a(paramView, paramBundle);
  }
  
  public void a(c.a parama, Object paramObject)
  {
    oXa.b(parama, "model");
    Rva.c.a(this, parama, paramObject);
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    paramBundle = Ja();
    if (paramBundle != null)
    {
      oXa.a(paramBundle, "it");
      this.sa = ((Rva.a)EPa.b(paramBundle, "initial_data"));
      this.wa = ((Mka)paramBundle.getParcelable("created_poll"));
      if (paramBundle != null)
      {
        oXa.a(paramBundle, "arguments?.also {\n      … necessary params\")\n    }");
        try
        {
          paramBundle = cb();
          if (paramBundle != null)
          {
            paramBundle = (Rva.b)paramBundle;
            this.ta = paramBundle;
            return;
          }
          paramBundle = new _Va;
          paramBundle.<init>("null cannot be cast to non-null type io.faceapp.ui.create_poll.CreatePollView.CreatePollListener");
          throw paramBundle;
        }
        catch (ClassCastException paramBundle)
        {
          throw new IllegalStateException("No result listener defined for CreatePoll screen");
        }
      }
    }
    throw new IllegalArgumentException("Fragment created without necessary params");
  }
  
  public void d(String paramString)
  {
    oXa.b(paramString, "pollUrl");
    String str1 = b(2131689832);
    oXa.a(str1, "getString(R.string.Polls_InviteMoreMessage)");
    String str2 = b(2131689527);
    oXa.a(str2, "getString(R.string.CreatePoll_SharePollVia)");
    KOa localKOa = KOa.b;
    Context localContext = Jb();
    oXa.a(localContext, "requireContext()");
    localKOa.a(localContext, paramString, str1, str2);
  }
  
  public void dismiss()
  {
    this.xa = true;
    o localo = Ea();
    if (localo != null) {
      localo.onBackPressed();
    }
  }
  
  public void e()
  {
    throw new IllegalStateException("This method should never be called for CreatePoll Fragment");
  }
  
  public View f(int paramInt)
  {
    if (this.Aa == null) {
      this.Aa = new HashMap();
    }
    View localView1 = (View)this.Aa.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.Aa.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public boolean fa()
  {
    if (!this.xa)
    {
      getViewActions().a(new Rva.d.a(false));
      return true;
    }
    return d.a.a(this);
  }
  
  public GVa<Rva.d> getViewActions()
  {
    return this.pa;
  }
  
  public Context h()
  {
    return La();
  }
  
  public void j()
  {
    l.a locala = new l.a(Jb());
    locala.b(2131689522);
    locala.a(2131689521);
    locala.b(2131689935, new Gva(this));
    locala.a(2131689757, new Hva(this));
    locala.a(true);
    locala.c();
  }
  
  public void k()
  {
    n localn = getRouter();
    if (localn != null) {
      localn.a(this);
    }
    this.za = true;
  }
  
  public void l()
  {
    g(2131689599);
  }
  
  public void p(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      n localn = getRouter();
      if (localn != null) {
        m.a.a(localn, this, false, false, 6, null);
      }
    }
    this.za = false;
    getViewActions().a(Rva.d.c.a);
  }
  
  public void sb()
  {
    Object localObject = this.qa;
    if (localObject != null)
    {
      ((List)localObject).clear();
      localObject = this.ra;
      if (localObject != null)
      {
        ((List)localObject).clear();
        localObject = this.ya;
        if (localObject != null) {
          ((kRa)localObject).i();
        }
        this.ya = null;
        super.sb();
        Lb();
        return;
      }
      oXa.b("readyViews");
      throw null;
    }
    oXa.b("preparingViews");
    throw null;
  }
  
  public void u()
  {
    a(eb(), 1000L, new Iva(this));
  }
  
  public static final class a
  {
    public final xva a(Rva.a parama)
    {
      oXa.b(parama, "initialData");
      xva localxva = new xva();
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("initial_data", parama);
      localxva.m(localBundle);
      return localxva;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xva.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */