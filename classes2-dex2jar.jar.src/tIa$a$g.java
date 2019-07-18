import android.view.ViewGroup;
import io.faceapp.ui.photo_picker.item.StableCollectionsItemView;
import io.faceapp.ui.photo_picker.item.StableCollectionsItemView.a;

public final class tIa$a$g
  extends RGa<KIa.c.c, StableCollectionsItemView>
{
  private final VQa<KIa.d> a;
  
  public tIa$a$g(VQa<KIa.d> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof KIa.c.c;
  }
  
  protected StableCollectionsItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return StableCollectionsItemView.a.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tIa$a$g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */