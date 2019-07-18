import android.support.v4.app.F;
import android.support.v4.app.l;
import android.support.v4.app.s;
import android.view.ViewGroup;
import io.faceapp.ui.profile.item.ProfileTabView;
import io.faceapp.ui.profile.item.ProfileTabView.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class SJa$b
  extends F
{
  private final l[] h;
  
  public SJa$b(s params)
  {
    super((s)localObject);
    int j = a();
    params = new l[j];
    for (int k = 0; k < j; k++) {
      params[k] = null;
    }
    this.h = params;
  }
  
  public int a()
  {
    return hKa.a.values().length;
  }
  
  public String a(int paramInt)
  {
    Object localObject = hKa.a.values()[paramInt];
    paramInt = TJa.b[localObject.ordinal()];
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt == 3)
        {
          localObject = this.i.b(2131689848);
          oXa.a(localObject, "getString(R.string.Profile_TabUpdates)");
        }
        else
        {
          throw new UVa();
        }
      }
      else
      {
        localObject = this.i.b(2131689847);
        oXa.a(localObject, "getString(R.string.Profile_TabMyStyles)");
      }
    }
    else
    {
      localObject = this.i.b(2131689846);
      oXa.a(localObject, "getString(R.string.Profile_TabFeed)");
    }
    return (String)localObject;
  }
  
  public final ProfileTabView b(ViewGroup paramViewGroup, int paramInt)
  {
    oXa.b(paramViewGroup, "parentView");
    return ProfileTabView.u.a(paramViewGroup, a(paramInt));
  }
  
  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    oXa.b(paramViewGroup, "container");
    oXa.b(paramObject, "object");
    Object localObject1 = SJa.c(this.i);
    if (localObject1 != null) {
      ((kRa)localObject1).i();
    }
    boolean bool = paramObject instanceof dJa;
    Object localObject2 = null;
    if (!bool) {
      localObject1 = null;
    } else {
      localObject1 = paramObject;
    }
    localObject1 = (dJa)localObject1;
    if (localObject1 != null) {
      SJa.a(this.i, ((dJa)localObject1).v().c(new UJa(this)));
    }
    if (!(paramObject instanceof iMa)) {
      localObject1 = localObject2;
    } else {
      localObject1 = paramObject;
    }
    localObject1 = (iMa)localObject1;
    if (localObject1 != null)
    {
      ((iMa)localObject1).e(true);
      SJa.a(this.i, ((iMa)localObject1).v().c(new VJa(this)));
    }
    else
    {
      localObject1 = f();
      if (localObject1 != null) {
        ((zMa)localObject1).e(false);
      }
    }
    super.b(paramViewGroup, paramInt, paramObject);
  }
  
  public l c(int paramInt)
  {
    Object localObject = hKa.a.values()[paramInt];
    int j = TJa.a[localObject.ordinal()];
    if (j != 1)
    {
      if (j != 2)
      {
        if (j == 3) {
          localObject = iMa.la.a();
        } else {
          throw new UVa();
        }
      }
      else {
        localObject = dJa.ma.a(pJa.a);
      }
    }
    else {
      localObject = dJa.ma.a(pJa.b);
    }
    this.h[paramInt] = localObject;
    return (l)localObject;
  }
  
  public final void d()
  {
    gWa.a(this.h, null, 0, 0, 6, null);
  }
  
  public final List<qJa> e()
  {
    Object localObject1 = this.h;
    Object localObject2 = new ArrayList();
    int j = localObject1.length;
    for (int k = 0; k < j; k++)
    {
      localObject3 = localObject1[k];
      if ((localObject3 instanceof qJa)) {
        ((Collection)localObject2).add(localObject3);
      }
    }
    Object localObject3 = new ArrayList(mWa.a((Iterable)localObject2, 10));
    localObject1 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (l)((Iterator)localObject1).next();
      if (localObject2 != null) {
        ((Collection)localObject3).add((qJa)localObject2);
      } else {
        throw new _Va("null cannot be cast to non-null type io.faceapp.ui.polls.feed.PollsFeedView");
      }
    }
    return (List<qJa>)localObject3;
  }
  
  public final zMa f()
  {
    l[] arrayOfl = this.h;
    int j = arrayOfl.length;
    Object localObject1;
    for (int k = 0;; k++)
    {
      localObject1 = null;
      if (k >= j) {
        break;
      }
      localObject2 = arrayOfl[k];
      if ((localObject2 instanceof zMa)) {
        break label43;
      }
    }
    Object localObject2 = null;
    label43:
    if (!(localObject2 instanceof zMa)) {
      localObject2 = localObject1;
    }
    return (zMa)localObject2;
  }
  
  public final int g()
  {
    return hKa.a.c.ordinal();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/SJa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */