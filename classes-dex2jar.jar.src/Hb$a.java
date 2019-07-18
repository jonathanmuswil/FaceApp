import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Iterator;

class Hb$a
  implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener
{
  Eb a;
  ViewGroup b;
  
  Hb$a(Eb paramEb, ViewGroup paramViewGroup)
  {
    this.a = paramEb;
    this.b = paramViewGroup;
  }
  
  private void a()
  {
    this.b.getViewTreeObserver().removeOnPreDrawListener(this);
    this.b.removeOnAttachStateChangeListener(this);
  }
  
  public boolean onPreDraw()
  {
    a();
    if (!Hb.c.remove(this.b)) {
      return true;
    }
    gd localgd = Hb.a();
    ArrayList localArrayList1 = (ArrayList)localgd.get(this.b);
    ArrayList localArrayList2 = null;
    Object localObject;
    if (localArrayList1 == null)
    {
      localObject = new ArrayList();
      localgd.put(this.b, localObject);
    }
    else
    {
      localObject = localArrayList1;
      if (localArrayList1.size() > 0)
      {
        localArrayList2 = new ArrayList(localArrayList1);
        localObject = localArrayList1;
      }
    }
    ((ArrayList)localObject).add(this.a);
    this.a.a(new Gb(this, localgd));
    this.a.a(this.b, false);
    if (localArrayList2 != null)
    {
      localObject = localArrayList2.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((Eb)((Iterator)localObject).next()).e(this.b);
      }
    }
    this.a.a(this.b);
    return true;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    a();
    Hb.c.remove(this.b);
    paramView = (ArrayList)Hb.a().get(this.b);
    if ((paramView != null) && (paramView.size() > 0))
    {
      paramView = paramView.iterator();
      while (paramView.hasNext()) {
        ((Eb)paramView.next()).e(this.b);
      }
    }
    this.a.a(true);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Hb$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */