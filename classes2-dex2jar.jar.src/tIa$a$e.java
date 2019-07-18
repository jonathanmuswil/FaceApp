import android.view.ViewGroup;
import io.faceapp.ui.photo_picker.item.NoPhotosItemView;
import io.faceapp.ui.photo_picker.item.NoPhotosItemView.a;

public final class tIa$a$e
  extends RGa<KIa.a.c, NoPhotosItemView>
{
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    boolean bool;
    if (paramObject == KIa.a.c.a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected NoPhotosItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return NoPhotosItemView.d.a(paramViewGroup);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tIa$a$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */