import android.view.ViewGroup;
import io.faceapp.ui.photo_picker.item.CameraItemView;
import io.faceapp.ui.photo_picker.item.CameraItemView.a;
import io.faceapp.ui.photo_picker.item.a;

public final class tIa$a$a
  extends RGa<a, CameraItemView>
{
  private final VQa<KIa.d> a;
  
  public tIa$a$a(VQa<KIa.d> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    boolean bool;
    if (paramObject == a.a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected CameraItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return CameraItemView.c.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tIa$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */