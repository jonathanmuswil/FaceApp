import android.support.v4.view.J;
import android.support.v4.view.y;
import android.support.v7.widget.RecyclerView.f;
import android.support.v7.widget.RecyclerView.x;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public class bHa
  extends aHa
{
  private static final AccelerateDecelerateInterpolator t = new AccelerateDecelerateInterpolator();
  public static final bHa.a u = new bHa.a(null);
  private final Interpolator v;
  
  public bHa(Interpolator paramInterpolator)
  {
    this.v = paramInterpolator;
  }
  
  protected void t(RecyclerView.x paramx)
  {
    oXa.b(paramx, "holder");
    Object localObject = paramx.b;
    oXa.a(localObject, "holder.itemView");
    localObject = y.a((View)localObject);
    oXa.a(localObject, "ViewCompat.animate(view)");
    this.o.add(paramx);
    ((J)localObject).b(1.0F);
    ((J)localObject).c(1.0F);
    ((J)localObject).a(1.0F);
    ((J)localObject).a(c());
    ((J)localObject).a(this.v);
    ((J)localObject).a(new cHa(this, (J)localObject, paramx, paramx));
    ((J)localObject).c();
  }
  
  protected void u(RecyclerView.x paramx)
  {
    oXa.b(paramx, "holder");
    Object localObject = paramx.b;
    oXa.a(localObject, "holder.itemView");
    localObject = y.a((View)localObject);
    oXa.a(localObject, "ViewCompat.animate(view)");
    this.q.add(paramx);
    ((J)localObject).a(f());
    ((J)localObject).a(0.0F);
    ((J)localObject).b(0.0F);
    ((J)localObject).c(0.0F);
    ((J)localObject).a(this.v);
    ((J)localObject).a(new dHa(this, (J)localObject, paramx, paramx));
    ((J)localObject).c();
  }
  
  protected void v(RecyclerView.x paramx)
  {
    oXa.b(paramx, "holder");
    View localView = paramx.b;
    oXa.a(localView, "holder.itemView");
    localView.setScaleX(0.0F);
    paramx = paramx.b;
    oXa.a(paramx, "holder.itemView");
    paramx.setScaleY(0.0F);
  }
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bHa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */