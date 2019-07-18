import android.view.ViewGroup;
import io.faceapp.ui.polls.item.PartPollResultsItemView;
import io.faceapp.ui.polls.item.PartPollResultsItemView.a;

public final class QIa$a$f
  extends RGa<LIa.f, PartPollResultsItemView>
{
  private final VQa<XIa.c> a;
  
  public QIa$a$f(VQa<XIa.c> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof LIa.f;
  }
  
  protected PartPollResultsItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return PartPollResultsItemView.f.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/QIa$a$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */