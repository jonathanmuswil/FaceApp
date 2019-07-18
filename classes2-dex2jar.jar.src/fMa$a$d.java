import android.view.ViewGroup;
import io.faceapp.ui.updates.item.PollResultsItemView;
import io.faceapp.ui.updates.item.PollResultsItemView.a;

public final class fMa$a$d
  extends RGa<Xka, PollResultsItemView>
{
  private final VQa<zMa.b> a;
  
  public fMa$a$d(VQa<zMa.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof Xka;
  }
  
  protected PollResultsItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return PollResultsItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fMa$a$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */