import android.view.ViewGroup;
import io.faceapp.ui.layouts.selector.item.SectionItemView;
import io.faceapp.ui.layouts.selector.item.SectionItemView.a;
import io.faceapp.ui.layouts.selector.item.n;

public final class vFa$a$a
  extends RGa<n, SectionItemView>
{
  private final VQa<sFa.b> a;
  
  public vFa$a$a(VQa<sFa.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof n;
  }
  
  protected SectionItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return SectionItemView.a.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vFa$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */