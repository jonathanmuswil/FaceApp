import android.view.ViewGroup;
import io.faceapp.ui.polls.item.PartImageItemView;
import io.faceapp.ui.polls.item.PartImageItemView.a;

public final class QIa$a$d
  extends RGa<LIa.d, PartImageItemView>
{
  private final cXa<LIa.d, cWa> a;
  
  public QIa$a$d(cXa<? super LIa.d, cWa> paramcXa)
  {
    this.a = paramcXa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof LIa.d;
  }
  
  protected PartImageItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return PartImageItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/QIa$a$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */