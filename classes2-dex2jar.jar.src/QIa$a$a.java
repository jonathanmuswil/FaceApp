import android.view.ViewGroup;
import io.faceapp.ui.polls.item.PartAuthorItemView;
import io.faceapp.ui.polls.item.PartAuthorItemView.a;

public final class QIa$a$a
  extends RGa<LIa.a, PartAuthorItemView>
{
  private final cXa<LIa.a, cWa> a;
  
  public QIa$a$a(cXa<? super LIa.a, cWa> paramcXa)
  {
    this.a = paramcXa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof LIa.a;
  }
  
  protected PartAuthorItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return PartAuthorItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/QIa$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */