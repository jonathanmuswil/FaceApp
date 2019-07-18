import android.view.ViewGroup;
import io.faceapp.ui.polls.item.PartVoteBtnItemView;
import io.faceapp.ui.polls.item.PartVoteBtnItemView.a;

public final class QIa$a$i
  extends RGa<LIa.i, PartVoteBtnItemView>
{
  private final cXa<LIa.i, cWa> a;
  
  public QIa$a$i(cXa<? super LIa.i, cWa> paramcXa)
  {
    this.a = paramcXa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof LIa.i;
  }
  
  protected PartVoteBtnItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return PartVoteBtnItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/QIa$a$i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */