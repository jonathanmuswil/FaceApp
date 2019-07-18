import android.view.ViewGroup;
import io.faceapp.ui.photo_picker.item.LoadingFirstFacesItemView;
import io.faceapp.ui.photo_picker.item.LoadingFirstFacesItemView.a;

public final class tIa$a$c
  extends RGa<KIa.a.a, LoadingFirstFacesItemView>
{
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    boolean bool;
    if (paramObject == KIa.a.a.a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected LoadingFirstFacesItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return LoadingFirstFacesItemView.u.a(paramViewGroup);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tIa$a$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */