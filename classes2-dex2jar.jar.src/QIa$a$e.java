import android.view.ViewGroup;
import io.faceapp.ui.polls.item.PartInviteBtnItemView;
import io.faceapp.ui.polls.item.PartInviteBtnItemView.a;

public final class QIa$a$e
  extends RGa<LIa.e, PartInviteBtnItemView>
{
  private final VQa<XIa.c> a;
  
  public QIa$a$e(VQa<XIa.c> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof LIa.e;
  }
  
  protected PartInviteBtnItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return PartInviteBtnItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/QIa$a$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */