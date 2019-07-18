import android.view.ViewGroup;
import io.faceapp.ui.polls.item.PartCommentWithAvatarItemView;
import io.faceapp.ui.polls.item.PartCommentWithAvatarItemView.a;

public final class QIa$a$c
  extends RGa<LIa.c, PartCommentWithAvatarItemView>
{
  private final VQa<XIa.c> a;
  
  public QIa$a$c(VQa<XIa.c> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof LIa.c;
  }
  
  protected PartCommentWithAvatarItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return PartCommentWithAvatarItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/QIa$a$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */