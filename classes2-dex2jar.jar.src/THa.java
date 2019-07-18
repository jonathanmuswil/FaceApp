import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout.a;
import android.support.v4.app.l;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.f;
import android.support.v4.view.s;
import android.support.v7.app.l.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.rd.PageIndicatorView;
import io.faceapp.k;
import io.faceapp.m.a;
import io.faceapp.n;
import io.faceapp.ui.components.AppBar.b.a;
import io.faceapp.ui.components.AppBar.b.b;
import io.faceapp.ui.components.rtlviewpager.RtlViewPager;
import io.faceapp.ui.onboarding.page.TutorialPageView;
import io.faceapp.ui.onboarding.page.TutorialPageView.a;
import io.faceapp.ui.onboarding.page.YearlyPageView;
import io.faceapp.ui.onboarding.page.YearlyPageView.a;
import io.faceapp.ui.onboarding.page.YearlyTrialPageView;
import io.faceapp.ui.onboarding.page.YearlyTrialPageView.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class tHa
  extends ala<WHa, OHa>
  implements WHa
{
  public static final tHa.a la = new tHa.a(null);
  private final int ma = 2131492999;
  private final JVa<WHa.a> na;
  private ViewPager.f oa;
  private jRa pa;
  private HashMap qa;
  
  public tHa()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.na = localGVa;
  }
  
  private final void B(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      ec();
      return;
    }
    a(AppBar.b.b.c);
    Object localObject = (TextView)f(k.startTrialBtnView);
    oXa.a(localObject, "startTrialBtnView");
    a((View)localObject, 2131165530);
    localObject = new xHa(this);
    this.oa = ((ViewPager.f)localObject);
    ((RtlViewPager)f(k.pagerView)).a((ViewPager.f)localObject);
  }
  
  private final void a(View paramView, float paramFloat)
  {
    if (paramFloat > 0)
    {
      UPa.e(paramView);
      paramView.setAlpha(paramFloat);
    }
    else
    {
      UPa.c(paramView);
    }
  }
  
  private final void a(View paramView, int paramInt)
  {
    Object localObject = paramView.getLayoutParams();
    if (localObject != null)
    {
      localObject = (ConstraintLayout.a)localObject;
      KOa localKOa = KOa.b;
      Resources localResources = Wa();
      oXa.a(localResources, "resources");
      ((ViewGroup.MarginLayoutParams)localObject).bottomMargin = localKOa.a(localResources, paramInt);
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      return;
    }
    throw new _Va("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
  }
  
  private final void cc()
  {
    Context localContext = La();
    if (localContext != null)
    {
      oXa.a(localContext, "context ?: return");
      jRa localjRa = this.pa;
      if (localjRa != null)
      {
        localjRa.b(Gqa.k.a(localContext).a(new vHa(this), wHa.a));
        return;
      }
      oXa.b("innerDisposable");
      throw null;
    }
  }
  
  private final void dc()
  {
    yHa localyHa = new yHa(this);
    this.oa = localyHa;
    ((RtlViewPager)f(k.pagerView)).a(localyHa);
  }
  
  private final void ec()
  {
    a(AppBar.b.a.c);
    Object localObject = (TextView)f(k.startTrialBtnView);
    oXa.a(localObject, "startTrialBtnView");
    a((View)localObject, 2131165529);
    localObject = new zHa(this);
    this.oa = ((ViewPager.f)localObject);
    ((RtlViewPager)f(k.pagerView)).a((ViewPager.f)localObject);
  }
  
  private final void fc()
  {
    ViewPager.f localf = this.oa;
    if (localf != null)
    {
      ((RtlViewPager)f(k.pagerView)).b(localf);
      this.oa = null;
    }
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.qa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public OHa Mb()
  {
    return new OHa();
  }
  
  public void T()
  {
    RtlViewPager localRtlViewPager1 = (RtlViewPager)f(k.pagerView);
    oXa.a(localRtlViewPager1, "pagerView");
    RtlViewPager localRtlViewPager2 = (RtlViewPager)f(k.pagerView);
    oXa.a(localRtlViewPager2, "pagerView");
    localRtlViewPager1.setCurrentItem(localRtlViewPager2.getCurrentItem() - 1);
  }
  
  public void V()
  {
    RtlViewPager localRtlViewPager1 = (RtlViewPager)f(k.pagerView);
    oXa.a(localRtlViewPager1, "pagerView");
    RtlViewPager localRtlViewPager2 = (RtlViewPager)f(k.pagerView);
    oXa.a(localRtlViewPager2, "pagerView");
    localRtlViewPager1.setCurrentItem(localRtlViewPager2.getCurrentItem() + 1);
  }
  
  public int Zb()
  {
    return this.ma;
  }
  
  public void a(WHa.b paramb)
  {
    oXa.b(paramb, "model");
    Object localObject1 = new ArrayList();
    ((ArrayList)localObject1).addAll(paramb.b());
    Object localObject2 = paramb.a();
    if (localObject2 != null) {
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = (RtlViewPager)f(k.pagerView);
    oXa.a(localObject2, "pagerView");
    ((tHa.b)EPa.a((ViewPager)localObject2)).a((ArrayList)localObject1);
    fc();
    localObject1 = (TextView)f(k.startTrialBtnView);
    int i;
    if (paramb.c()) {
      i = 2131689775;
    } else {
      i = 2131689663;
    }
    ((TextView)localObject1).setText(i);
    if ((paramb instanceof WHa.b.b)) {
      dc();
    } else if ((paramb instanceof WHa.b.c)) {
      ec();
    } else if ((paramb instanceof WHa.b.a)) {
      B(paramb.c());
    }
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    Object localObject = (TextView)f(k.nextBtnView);
    oXa.a(localObject, "nextBtnView");
    ((View)localObject).setOnClickListener(new AHa(this));
    localObject = (TextView)f(k.startBtnView);
    oXa.a(localObject, "startBtnView");
    ((View)localObject).setOnClickListener(new BHa(this));
    localObject = (TextView)f(k.startTrialBtnView);
    oXa.a(localObject, "startTrialBtnView");
    ((View)localObject).setOnClickListener(new CHa(this));
    localObject = (TextView)f(k.declineTrialBtnView);
    oXa.a(localObject, "declineTrialBtnView");
    ((View)localObject).setOnClickListener(new DHa(this));
    localObject = (RtlViewPager)f(k.pagerView);
    oXa.a(localObject, "pagerView");
    ((RtlViewPager)localObject).setAdapter(new tHa.b());
    ((PageIndicatorView)f(k.pagerIndicatorView)).setViewPager((RtlViewPager)f(k.pagerView));
    this.pa = new jRa();
    super.a(paramView, paramBundle);
  }
  
  protected void bc()
  {
    getViewActions().a(WHa.a.c.a);
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
  
  public JVa<WHa.a> getViewActions()
  {
    return this.na;
  }
  
  public void i()
  {
    n localn = getRouter();
    if (localn != null) {
      m.a.a(localn, true, false, 2, null);
    }
  }
  
  public void j()
  {
    l.a locala = new l.a(Jb());
    locala.b(2131689764);
    locala.a(2131689762);
    locala.b(2131689504, EHa.a);
    locala.a(2131689763, new FHa(this));
    locala.a(true);
    locala.c();
  }
  
  public void sb()
  {
    fc();
    jRa localjRa = this.pa;
    if (localjRa != null)
    {
      localjRa.i();
      super.sb();
      Lb();
      return;
    }
    oXa.b("innerDisposable");
    throw null;
  }
  
  public void wb()
  {
    super.wb();
    FPa.a(this, 2131099684, true);
  }
  
  public void xb()
  {
    FPa.b(this);
    super.xb();
  }
  
  public static final class a
  {
    public final tHa a()
    {
      return new tHa();
    }
  }
  
  public final class b
    extends s
  {
    private final List<HHa> c = new ArrayList();
    
    private final void c(int paramInt)
    {
      Yoa.b.a(String.valueOf(paramInt));
    }
    
    public int a()
    {
      return this.c.size();
    }
    
    public int a(Object paramObject)
    {
      oXa.b(paramObject, "object");
      return -2;
    }
    
    public Object a(ViewGroup paramViewGroup, int paramInt)
    {
      oXa.b(paramViewGroup, "collection");
      HHa localHHa = (HHa)this.c.get(paramInt);
      Object localObject;
      if ((localHHa instanceof HHa.b))
      {
        localObject = TutorialPageView.u.a(paramViewGroup);
        ((TutorialPageView)localObject).a((HHa.b)localHHa);
      }
      else if ((localHHa instanceof HHa.a.b))
      {
        localObject = YearlyTrialPageView.u.a(paramViewGroup);
        ((YearlyTrialPageView)localObject).a((HHa.a.b)localHHa);
      }
      else
      {
        if (!(localHHa instanceof HHa.a.a)) {
          break label127;
        }
        localObject = YearlyPageView.u.a(paramViewGroup);
        ((YearlyPageView)localObject).a((HHa.a.a)localHHa);
      }
      ((View)localObject).setTag(localHHa);
      if (paramInt == 1) {
        tHa.a(this.d);
      }
      paramViewGroup.addView((View)localObject);
      return localHHa;
      label127:
      throw new UVa();
    }
    
    public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      oXa.b(paramViewGroup, "collection");
      oXa.b(paramObject, "page");
      Iterator localIterator = new WPa(paramViewGroup).iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        if (oXa.a(((View)localObject).getTag(), paramObject))
        {
          paramObject = localObject;
          break label69;
        }
      }
      paramObject = null;
      label69:
      paramObject = (View)paramObject;
      if (paramObject != null) {
        paramViewGroup.removeView((View)paramObject);
      }
    }
    
    public final void a(ArrayList<HHa> paramArrayList)
    {
      oXa.b(paramArrayList, "newPages");
      this.c.clear();
      this.c.addAll(paramArrayList);
      b();
    }
    
    public boolean a(View paramView, Object paramObject)
    {
      oXa.b(paramView, "view");
      oXa.b(paramObject, "object");
      return oXa.a(paramView.getTag(), paramObject);
    }
    
    public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      oXa.b(paramViewGroup, "container");
      oXa.b(paramObject, "object");
      super.b(paramViewGroup, paramInt, paramObject);
      c(paramInt);
      if ((this.c.get(paramInt) instanceof HHa.a)) {
        asa.d.e("trial page shown");
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tHa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */