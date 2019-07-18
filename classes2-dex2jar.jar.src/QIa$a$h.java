import android.view.ViewGroup;
import io.faceapp.ui.polls.item.PartShowAllCommentsItemView;
import io.faceapp.ui.polls.item.PartShowAllCommentsItemView.a;

public final class QIa$a$h
  extends RGa<LIa.h, PartShowAllCommentsItemView>
{
  private final cXa<LIa.h, cWa> a;
  
  public QIa$a$h(cXa<? super LIa.h, cWa> paramcXa)
  {
    this.a = paramcXa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof LIa.h;
  }
  
  protected PartShowAllCommentsItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return PartShowAllCommentsItemView.a.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/QIa$a$h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */