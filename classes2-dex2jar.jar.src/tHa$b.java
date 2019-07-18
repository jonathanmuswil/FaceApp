import android.support.v4.view.s;
import android.view.View;
import android.view.ViewGroup;
import io.faceapp.ui.onboarding.page.TutorialPageView;
import io.faceapp.ui.onboarding.page.TutorialPageView.a;
import io.faceapp.ui.onboarding.page.YearlyPageView;
import io.faceapp.ui.onboarding.page.YearlyPageView.a;
import io.faceapp.ui.onboarding.page.YearlyTrialPageView;
import io.faceapp.ui.onboarding.page.YearlyTrialPageView.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class tHa$b
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tHa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */