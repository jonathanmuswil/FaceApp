import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.x;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import java.util.List;

public final class _Ka
  extends RecyclerView.a<_Ka.a>
{
  private List<? extends hLa> c;
  private final Context d;
  
  public _Ka(Context paramContext)
  {
    this.d = paramContext;
    this.c = mWa.a();
  }
  
  public int a()
  {
    return this.c.size();
  }
  
  public void a(_Ka.a parama, int paramInt)
  {
    oXa.b(parama, "holder");
    View localView = parama.b;
    if (localView != null)
    {
      ((FrameLayout)localView).removeAllViews();
      ((FrameLayout)parama.b).addView(((hLa)this.c.get(paramInt)).a(this.d));
      return;
    }
    throw new _Va("null cannot be cast to non-null type android.widget.FrameLayout");
  }
  
  public final void a(List<? extends hLa> paramList)
  {
    oXa.b(paramList, "value");
    this.c = paramList;
    d();
  }
  
  public _Ka.a b(ViewGroup paramViewGroup, int paramInt)
  {
    oXa.b(paramViewGroup, "parent");
    paramViewGroup = new FrameLayout(this.d);
    paramViewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    return new _Ka.a(paramViewGroup);
  }
  
  public static final class a
    extends RecyclerView.x
  {
    public a(View paramView)
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_Ka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */