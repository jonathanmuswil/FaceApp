import android.view.ViewGroup;
import io.faceapp.ui.photo_picker.item.NoPermissionItemView;
import io.faceapp.ui.photo_picker.item.NoPermissionItemView.a;

public final class tIa$a$d
  extends RGa<KIa.a.b, NoPermissionItemView>
{
  private final VQa<KIa.d> a;
  
  public tIa$a$d(VQa<KIa.d> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    boolean bool;
    if (paramObject == KIa.a.b.a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected NoPermissionItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return NoPermissionItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tIa$a$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */