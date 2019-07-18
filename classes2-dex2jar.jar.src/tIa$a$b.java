import android.view.ViewGroup;
import io.faceapp.ui.photo_picker.item.HeaderLabelItemView;
import io.faceapp.ui.photo_picker.item.HeaderLabelItemView.a;

public final class tIa$a$b
  extends RGa<rHa, HeaderLabelItemView>
{
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof rHa;
  }
  
  protected HeaderLabelItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return HeaderLabelItemView.d.a(paramViewGroup);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tIa$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */