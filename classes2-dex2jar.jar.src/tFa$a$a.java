import android.view.ViewGroup;
import io.faceapp.ui.layouts.selector.item.AddPhotoItemView;
import io.faceapp.ui.layouts.selector.item.AddPhotoItemView.a;
import io.faceapp.ui.layouts.selector.item.b;

public final class tFa$a$a
  extends RGa<b, AddPhotoItemView>
{
  private final VQa<sFa.b> a;
  
  public tFa$a$a(VQa<sFa.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    boolean bool;
    if (paramObject == b.a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected AddPhotoItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return AddPhotoItemView.c.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tFa$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */