import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.l;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.faceapp.k;
import io.faceapp.ui.misc.CenterLayoutManager;
import io.faceapp.ui.misc.c.a;
import java.util.HashMap;

public final class lFa
  extends mla<sFa, rFa>
  implements sFa
{
  public static final lFa.a ma = new lFa.a(null);
  private final int na = 2131492984;
  private final GVa<sFa.b> oa;
  private sFa.a pa;
  private kRa qa;
  private int ra;
  private HashMap sa;
  
  public lFa()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.oa = localGVa;
  }
  
  public void Ob()
  {
    HashMap localHashMap = this.sa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public int Tb()
  {
    return this.na;
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    oXa.b(paramLayoutInflater, "inflater");
    paramLayoutInflater = paramLayoutInflater.cloneInContext(new me(Ea(), this.ra));
    oXa.a(paramLayoutInflater, "wrappedInflater");
    return super.a(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    RecyclerView localRecyclerView = (RecyclerView)e(k.photosRecyclerView);
    localRecyclerView.setHasFixedSize(true);
    Object localObject = Jb();
    oXa.a(localObject, "requireContext()");
    localRecyclerView.setLayoutManager(new CenterLayoutManager((Context)localObject));
    localRecyclerView.setAdapter(new tFa(getViewActions()));
    localObject = (RecyclerView)e(k.filterSectionsRecyclerView);
    ((RecyclerView)localObject).setHasFixedSize(false);
    ((RecyclerView)localObject).setLayoutManager(new GridLayoutManager(((ViewGroup)localObject).getContext(), 1));
    ((RecyclerView)localObject).setAdapter(new vFa(getViewActions()));
    super.a(paramView, paramBundle);
  }
  
  public void a(c.a parama, Object paramObject)
  {
    oXa.b(parama, "model");
    getViewActions().a(new sFa.b.d(parama));
  }
  
  public void a(sFa.c paramc)
  {
    oXa.b(paramc, "model");
    RecyclerView localRecyclerView = (RecyclerView)e(k.photosRecyclerView);
    oXa.a(localRecyclerView, "photosRecyclerView");
    if (UPa.d(localRecyclerView))
    {
      localRecyclerView = (RecyclerView)e(k.photosRecyclerView);
      oXa.a(localRecyclerView, "photosRecyclerView");
      ((tFa)EPa.b(localRecyclerView)).a(paramc);
    }
    localRecyclerView = (RecyclerView)e(k.filterSectionsRecyclerView);
    oXa.a(localRecyclerView, "filterSectionsRecyclerView");
    ((vFa)EPa.b(localRecyclerView)).a(paramc);
  }
  
  public void a(yka paramyka)
  {
    oXa.b(paramyka, "filter");
    Object localObject = this.qa;
    if (localObject != null) {
      ((kRa)localObject).i();
    }
    Sva localSva = Sva.a;
    localObject = La();
    if (localObject != null)
    {
      this.qa = localSva.a((Context)localObject, paramyka).d(new mFa(this));
      return;
    }
    throw new IllegalStateException("Required value was null.");
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    try
    {
      paramBundle = cb();
      if (paramBundle != null)
      {
        paramBundle = (sFa.a)paramBundle;
        this.pa = paramBundle;
        rFa localrFa = (rFa)Rb();
        if (localrFa != null)
        {
          paramBundle = this.pa;
          if (paramBundle != null)
          {
            localrFa.a(paramBundle);
          }
          else
          {
            oXa.b("resultListener");
            throw null;
          }
        }
        paramBundle = Ja();
        if (paramBundle != null)
        {
          oXa.a(paramBundle, "it");
          boolean bool = paramBundle.getBoolean("is_light_theme");
          int i;
          if (bool == true)
          {
            i = 2131755258;
          }
          else
          {
            if (bool) {
              break label124;
            }
            i = 2131755259;
          }
          this.ra = i;
          if (paramBundle != null)
          {
            oXa.a(paramBundle, "arguments?.also {\n      … necessary params\")\n    }");
            return;
            label124:
            throw new UVa();
          }
        }
        throw new IllegalArgumentException("Fragment created without necessary params");
      }
      paramBundle = new _Va;
      paramBundle.<init>("null cannot be cast to non-null type io.faceapp.ui.layouts.selector.FilterSelectorView.FilterSelectorListener");
      throw paramBundle;
    }
    catch (ClassCastException paramBundle)
    {
      throw new IllegalStateException("No result listener defined for FilterSelector screen");
    }
  }
  
  public void c(boolean paramBoolean)
  {
    Object localObject = (RecyclerView)e(k.photosRecyclerView);
    if (paramBoolean) {
      UPa.e((View)localObject);
    } else {
      UPa.a((View)localObject);
    }
    localObject = e(k.photosCarouselDividerView);
    if (paramBoolean) {
      UPa.e((View)localObject);
    } else {
      UPa.a((View)localObject);
    }
  }
  
  public View e(int paramInt)
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
  
  public GVa<sFa.b> getViewActions()
  {
    return this.oa;
  }
  
  public void sb()
  {
    kRa localkRa = this.qa;
    if (localkRa != null) {
      localkRa.i();
    }
    this.qa = null;
    super.sb();
    Ob();
  }
  
  public static final class a
  {
    public final lFa a(JDa paramJDa, boolean paramBoolean)
    {
      oXa.b(paramJDa, "request");
      lFa locallFa = new lFa();
      Object localObject = new Bundle();
      ((Bundle)localObject).putBoolean("is_light_theme", paramBoolean);
      locallFa.m((Bundle)localObject);
      localObject = new rFa(paramJDa.c(), paramJDa.b(), paramJDa.a());
      ((rFa)localObject).a(paramJDa.d());
      locallFa.a((rla)localObject);
      return locallFa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lFa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */