import android.view.ViewGroup;
import io.faceapp.ui.layouts.stylist.selector.item.SelectedFilterItemView;
import io.faceapp.ui.layouts.stylist.selector.item.SelectedFilterItemView.a;

public final class BFa$a$b
  extends RGa<LFa, SelectedFilterItemView>
{
  private final VQa<KFa.b> a;
  
  public BFa$a$b(VQa<KFa.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof LFa;
  }
  
  protected SelectedFilterItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return SelectedFilterItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/BFa$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */