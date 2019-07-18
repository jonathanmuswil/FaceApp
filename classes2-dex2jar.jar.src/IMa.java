import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.eb;
import android.view.View;
import android.view.ViewGroup;
import io.faceapp.k;
import io.faceapp.ui.components.o;
import io.faceapp.ui.misc.c.a;
import java.util.HashMap;

public final class iMa
  extends ala<zMa, yMa>
  implements zMa
{
  public static final iMa.a la = new iMa.a(null);
  private final int ma = 2131493017;
  private final GVa<zMa.c> na;
  private final GVa<zMa.b> oa;
  private final FVa<Boolean> pa;
  private HashMap qa;
  
  public iMa()
  {
    Object localObject = GVa.t();
    oXa.a(localObject, "PublishSubject.create()");
    this.na = ((GVa)localObject);
    localObject = GVa.t();
    oXa.a(localObject, "PublishSubject.create()");
    this.oa = ((GVa)localObject);
    localObject = FVa.f(Boolean.valueOf(false));
    oXa.a(localObject, "BehaviorSubject.createDefault(false)");
    this.pa = ((FVa)localObject);
  }
  
  public FVa<Boolean> K()
  {
    return this.pa;
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.qa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public yMa Mb()
  {
    return new yMa();
  }
  
  public int Zb()
  {
    return this.ma;
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    RecyclerView localRecyclerView = (RecyclerView)f(k.recyclerView);
    localRecyclerView.setHasFixedSize(false);
    localRecyclerView.setLayoutManager(new GridLayoutManager(localRecyclerView.getContext(), 1));
    Resources localResources = localRecyclerView.getResources();
    oXa.a(localResources, "resources");
    localRecyclerView.setAdapter(new fMa(localResources, getViewActions(), v()));
    ((SwipeRefreshLayout)f(k.swipeRefreshLayoutView)).setOnRefreshListener(new jMa(this));
    super.a(paramView, paramBundle);
  }
  
  public void a(c.a parama, Object paramObject)
  {
    oXa.b(parama, "model");
    zMa.a.a(this, parama, paramObject);
  }
  
  public void a(String paramString, Rka paramRka)
  {
    oXa.b(paramString, "pollId");
    oXa.b(paramRka, "newVote");
    getViewActions().a(new zMa.c.b(paramString, paramRka));
  }
  
  public void a(zMa.d paramd)
  {
    oXa.b(paramd, "model");
    boolean bool = paramd instanceof zMa.d.a;
    Object localObject1 = (RecyclerView)f(k.recyclerView);
    int i;
    if (bool)
    {
      if (((RecyclerView)localObject1).getItemDecorationCount() == 0) {
        ((RecyclerView)localObject1).a(new o(((ViewGroup)localObject1).getResources().getDimensionPixelSize(2131165577), 1));
      }
    }
    else
    {
      if (((RecyclerView)localObject1).getItemDecorationCount() > 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        localObject2 = localObject1;
      } else {
        localObject2 = null;
      }
      if (localObject2 != null) {
        ((RecyclerView)localObject1).j(0);
      }
    }
    if ((bool) && (((zMa.d.a)paramd).a())) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject2 = (RecyclerView)f(k.recyclerView);
    oXa.a(localObject2, "recyclerView");
    localObject1 = ((RecyclerView)localObject2).getItemAnimator();
    localObject2 = localObject1;
    if (!(localObject1 instanceof eb)) {
      localObject2 = null;
    }
    localObject2 = (eb)localObject2;
    if (localObject2 != null) {
      ((eb)localObject2).a(i ^ 0x1);
    }
    localObject2 = (RecyclerView)f(k.recyclerView);
    oXa.a(localObject2, "recyclerView");
    ((fMa)EPa.b((RecyclerView)localObject2)).a(paramd);
    paramd = (SwipeRefreshLayout)f(k.swipeRefreshLayoutView);
    oXa.a(paramd, "swipeRefreshLayoutView");
    paramd.setRefreshing(false);
  }
  
  public void b(String paramString)
  {
    oXa.b(paramString, "pollId");
    getViewActions().a(new zMa.c.a(paramString));
  }
  
  public void e(boolean paramBoolean)
  {
    K().a(Boolean.valueOf(paramBoolean));
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
  
  public GVa<zMa.c> getViewActions()
  {
    return this.na;
  }
  
  public void o()
  {
    getViewActions().a(zMa.c.d.a);
  }
  
  public GVa<zMa.b> v()
  {
    return this.oa;
  }
  
  public static final class a
  {
    public final iMa a()
    {
      return new iMa();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/iMa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */