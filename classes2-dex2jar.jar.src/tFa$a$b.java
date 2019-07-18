import android.view.ViewGroup;
import io.faceapp.ui.layouts.selector.item.PhotoItemView;
import io.faceapp.ui.layouts.selector.item.PhotoItemView.a;
import io.faceapp.ui.layouts.selector.item.m;

public final class tFa$a$b
  extends RGa<m, PhotoItemView>
{
  private final VQa<sFa.b> a;
  
  public tFa$a$b(VQa<sFa.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof m;
  }
  
  protected PhotoItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return PhotoItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tFa$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */