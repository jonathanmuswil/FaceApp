import android.view.ViewGroup;
import io.faceapp.ui.photo_picker.item.RecentPhotoItemView;
import io.faceapp.ui.photo_picker.item.RecentPhotoItemView.a;

public final class tIa$a$f
  extends RGa<eoa.c, RecentPhotoItemView>
{
  private final VQa<KIa.d> a;
  
  public tIa$a$f(VQa<KIa.d> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof eoa.c;
  }
  
  protected RecentPhotoItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return RecentPhotoItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tIa$a$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */