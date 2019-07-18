import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.l;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.ui.components.CollagePartView;
import io.faceapp.ui.components.CollagePartView.b.a;
import io.faceapp.ui.components.CollagePartView.b.b;
import io.faceapp.ui.components.CollagePartView.b.c;
import io.faceapp.ui.misc.c.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class eGa
  extends ZDa<FGa, lGa>
  implements FGa
{
  public static final eGa.a pa = new eGa.a(null);
  private final int qa = 2131493014;
  private final boolean ra = true;
  private final GVa<FGa.c> sa;
  private List<CollagePartView> ta;
  private final FGa.b[] ua;
  private kRa va;
  private HashMap wa;
  
  public eGa()
  {
    Object localObject = GVa.t();
    oXa.a(localObject, "PublishSubject.create()");
    this.sa = ((GVa)localObject);
    localObject = new FGa.b[4];
    for (int i = 0; i < 4; i++) {
      localObject[i] = null;
    }
    this.ua = ((FGa.b[])localObject);
  }
  
  private final void a(FGa.d.a parama)
  {
    d(parama.b());
    Object localObject1 = this.va;
    if (localObject1 != null) {
      ((kRa)localObject1).i();
    }
    Object localObject2 = this.ta;
    if (localObject2 != null)
    {
      localObject1 = new ArrayList(mWa.a((Iterable)localObject2, 10));
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((Collection)localObject1).add(((CollagePartView)((Iterator)localObject2).next()).a());
      }
      this.va = xQa.a((Iterable)localObject1).b(new fGa(this, parama));
      return;
    }
    oXa.b("partViews");
    throw null;
  }
  
  private final void a(FGa.d.b paramb)
  {
    d(paramb.a());
    paramb = (LinearLayout)g(k.primaryContainerView);
    oXa.a(paramb, "primaryContainerView");
    UPa.e(paramb);
    paramb = g(k.containerChooseStylesView);
    oXa.a(paramb, "containerChooseStylesView");
    UPa.e(paramb);
    paramb = g(k.containerCreatePollView);
    oXa.a(paramb, "containerCreatePollView");
    UPa.c(paramb);
    paramb = g(k.containerPollCreatedJustNowView);
    oXa.a(paramb, "containerPollCreatedJustNowView");
    UPa.c(paramb);
    paramb = g(k.containerPollCreatedEarlierView);
    oXa.a(paramb, "containerPollCreatedEarlierView");
    UPa.c(paramb);
  }
  
  private final void d(List<? extends FGa.b> paramList)
  {
    Iterator localIterator = NXa.d(0, 4).iterator();
    while (localIterator.hasNext())
    {
      int i = ((CWa)localIterator).nextInt();
      FGa.b localb = (FGa.b)paramList.get(i);
      Object localObject = this.ua;
      if (localObject[i] != localb)
      {
        localObject[i] = localb;
        localObject = this.ta;
        if (localObject != null)
        {
          localObject = (CollagePartView)((List)localObject).get(i);
          if (oXa.a(localb, FGa.b.b.a))
          {
            ((CollagePartView)localObject).a(CollagePartView.b.b.a);
          }
          else if ((localb instanceof FGa.b.a))
          {
            ((CollagePartView)localObject).a(new CollagePartView.b.c(((FGa.b.a)localb).a()));
          }
          else if ((localb instanceof FGa.b.c))
          {
            if (i != 0)
            {
              if (i != 1)
              {
                if (i != 2)
                {
                  if (i == 3) {
                    i = 2131689947;
                  } else {
                    throw new IllegalStateException("Impossible case");
                  }
                }
                else {
                  i = 2131689946;
                }
              }
              else {
                i = 2131689945;
              }
            }
            else {
              i = 2131689944;
            }
            ((CollagePartView)localObject).a(new CollagePartView.b.a(((FGa.b.c)localb).a(), b(i)));
          }
        }
        else
        {
          oXa.b("partViews");
          throw null;
        }
      }
    }
  }
  
  private final void dc()
  {
    Context localContext = La();
    if (localContext != null)
    {
      oXa.a(localContext, "context ?: return");
      xra.l.a(localContext);
    }
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.wa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public int Zb()
  {
    return this.qa;
  }
  
  public boolean _b()
  {
    return this.ra;
  }
  
  public void a(float paramFloat)
  {
    ConstraintLayout localConstraintLayout = (ConstraintLayout)g(k.partsContainerView);
    localConstraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new jGa(localConstraintLayout, this, paramFloat));
    localConstraintLayout = (ConstraintLayout)g(k.partsOuterContainerView);
    localConstraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new kGa(localConstraintLayout, this));
  }
  
  public void a(FGa.d paramd)
  {
    oXa.b(paramd, "model");
    if ((paramd instanceof FGa.d.b))
    {
      a((FGa.d.b)paramd);
    }
    else
    {
      if (!(paramd instanceof FGa.d.a)) {
        break label41;
      }
      a((FGa.d.a)paramd);
    }
    return;
    label41:
    throw new UVa();
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    Object localObject1 = (CollagePartView)g(k.part1View);
    oXa.a(localObject1, "part1View");
    int i = 0;
    CollagePartView localCollagePartView1 = (CollagePartView)g(k.part2View);
    oXa.a(localCollagePartView1, "part2View");
    Object localObject2 = (CollagePartView)g(k.part3View);
    oXa.a(localObject2, "part3View");
    CollagePartView localCollagePartView2 = (CollagePartView)g(k.part4View);
    oXa.a(localCollagePartView2, "part4View");
    this.ta = mWa.c(new CollagePartView[] { localObject1, localCollagePartView1, localObject2, localCollagePartView2 });
    localObject2 = this.ta;
    if (localObject2 != null)
    {
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((CollagePartView)((Iterator)localObject2).next()).setScaleType(ImageView.ScaleType.FIT_CENTER);
      }
      localObject2 = g(k.containerPollCreatedJustNowView).findViewById(2131296622);
      oXa.a(localObject2, "containerPollCreatedJust…TextView>(R.id.labelView)");
      UPa.a((TextView)localObject2, 2131231050, null, 2, null);
      localObject2 = g(k.containerPollCreatedEarlierView).findViewById(2131296622);
      oXa.a(localObject2, "containerPollCreatedEarl…TextView>(R.id.labelView)");
      UPa.a((TextView)localObject2, 2131231057, null, 2, null);
      localObject2 = this.ta;
      if (localObject2 != null)
      {
        localObject2 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = ((Iterator)localObject2).next();
          if (i >= 0)
          {
            localObject1 = (CollagePartView)localObject1;
            if (i > 0) {
              ((View)localObject1).setOnClickListener(new gGa(i, this));
            }
            i++;
          }
          else
          {
            mWa.c();
            throw null;
          }
        }
        localObject2 = g(k.containerCreatePollView).findViewById(2131296459);
        oXa.a(localObject2, "containerCreatePollView.…d<View>(R.id.create_poll)");
        ((View)localObject2).setOnClickListener(new hGa(this));
        dc();
        super.a(paramView, paramBundle);
        return;
      }
      oXa.b("partViews");
      throw null;
    }
    oXa.b("partViews");
    throw null;
  }
  
  public void a(c.a parama)
  {
    oXa.b(parama, "errorModel");
    f(ePa.a.a(parama));
  }
  
  public void a(c.a parama, Object paramObject)
  {
    oXa.b(parama, "model");
    FGa.a.a(this, parama, paramObject);
  }
  
  public int d()
  {
    return 2131689540;
  }
  
  public View g(int paramInt)
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
  
  public GVa<FGa.c> getViewActions()
  {
    return this.sa;
  }
  
  public void r()
  {
    f(2131689620);
  }
  
  public void sb()
  {
    gWa.a(this.ua, null, 0, 0, 6, null);
    Object localObject = this.va;
    if (localObject != null) {
      ((kRa)localObject).i();
    }
    this.va = null;
    localObject = this.ta;
    if (localObject != null)
    {
      ((List)localObject).clear();
      super.sb();
      Lb();
      return;
    }
    oXa.b("partViews");
    throw null;
  }
  
  public static final class a
  {
    public final eGa a(lGa paramlGa)
    {
      oXa.b(paramlGa, "presenter");
      eGa localeGa = new eGa();
      localeGa.a(paramlGa);
      return localeGa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/eGa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */