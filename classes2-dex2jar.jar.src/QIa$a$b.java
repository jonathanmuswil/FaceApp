import android.view.ViewGroup;
import io.faceapp.ui.polls.item.PartCommentItemView;
import io.faceapp.ui.polls.item.PartCommentItemView.a;

public final class QIa$a$b
  extends RGa<LIa.b, PartCommentItemView>
{
  private final VQa<XIa.c> a;
  
  public QIa$a$b(VQa<XIa.c> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof LIa.b;
  }
  
  protected PartCommentItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return PartCommentItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/QIa$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */