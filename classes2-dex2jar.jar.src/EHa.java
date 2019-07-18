import android.support.v4.view.J;
import android.support.v4.view.y;
import android.support.v7.widget.RecyclerView.f;
import android.support.v7.widget.RecyclerView.x;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import io.faceapp.ui.layouts.stylist.selector.item.StylistSectionView;
import java.util.ArrayList;
import java.util.Iterator;

public class eHa
  extends aHa
{
  private static final AccelerateDecelerateInterpolator t = new AccelerateDecelerateInterpolator();
  public static final eHa.a u = new eHa.a(null);
  private final Interpolator v;
  
  public eHa(Interpolator paramInterpolator)
  {
    this.v = paramInterpolator;
  }
  
  protected void t(RecyclerView.x paramx)
  {
    oXa.b(paramx, "holder");
    Object localObject1 = paramx.b;
    Object localObject2 = localObject1;
    if (!(localObject1 instanceof StylistSectionView)) {
      localObject2 = null;
    }
    localObject2 = (StylistSectionView)localObject2;
    if (localObject2 != null)
    {
      Iterator localIterator = ((StylistSectionView)localObject2).a().iterator();
      while (localIterator.hasNext())
      {
        localObject1 = y.a((View)localIterator.next());
        oXa.a(localObject1, "ViewCompat.animate(it)");
        ((J)localObject1).a(c());
        ((J)localObject1).a(1.0F);
        ((J)localObject1).b(1.0F);
        ((J)localObject1).c(1.0F);
        ((J)localObject1).a(this.v);
        ((J)localObject1).c();
      }
      localObject2 = y.a((View)localObject2);
      oXa.a(localObject2, "ViewCompat.animate(view)");
      this.o.add(paramx);
      ((J)localObject2).a(c());
      ((J)localObject2).a(this.v);
      ((J)localObject2).a(new fHa(this, (J)localObject2, paramx, paramx));
      ((J)localObject2).c();
    }
  }
  
  protected void u(RecyclerView.x paramx)
  {
    oXa.b(paramx, "holder");
    Object localObject1 = paramx.b;
    Object localObject2 = localObject1;
    if (!(localObject1 instanceof StylistSectionView)) {
      localObject2 = null;
    }
    localObject2 = (StylistSectionView)localObject2;
    if (localObject2 != null)
    {
      localObject1 = ((StylistSectionView)localObject2).a().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        J localJ = y.a((View)((Iterator)localObject1).next());
        oXa.a(localJ, "ViewCompat.animate(it)");
        localJ.a(f());
        localJ.a(0.0F);
        localJ.b(0.0F);
        localJ.c(0.0F);
        localJ.a(this.v);
        localJ.c();
      }
      localObject2 = y.a((View)localObject2);
      oXa.a(localObject2, "ViewCompat.animate(view)");
      this.q.add(paramx);
      ((J)localObject2).a(f());
      ((J)localObject2).a(this.v);
      ((J)localObject2).a(new gHa(this, (J)localObject2, paramx, paramx));
      ((J)localObject2).c();
    }
  }
  
  protected void v(RecyclerView.x paramx)
  {
    oXa.b(paramx, "holder");
    View localView = paramx.b;
    paramx = localView;
    if (!(localView instanceof StylistSectionView)) {
      paramx = null;
    }
    paramx = (StylistSectionView)paramx;
    if (paramx != null)
    {
      paramx = paramx.a().iterator();
      while (paramx.hasNext())
      {
        localView = (View)paramx.next();
        localView.setScaleX(0.0F);
        localView.setScaleY(0.0F);
        localView.setAlpha(0.0F);
      }
    }
  }
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/eHa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */