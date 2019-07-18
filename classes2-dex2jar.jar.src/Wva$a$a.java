import android.view.ViewGroup;
import io.faceapp.ui.facebook.item.FacebookAuthItemView;
import io.faceapp.ui.facebook.item.FacebookAuthItemView.a;
import io.faceapp.ui.facebook.item.b;

public final class Wva$a$a
  extends RGa<b, FacebookAuthItemView>
{
  private final VQa<pwa.b> a;
  
  public Wva$a$a(VQa<pwa.b> paramVQa)
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
  
  protected FacebookAuthItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return FacebookAuthItemView.a.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Wva$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */