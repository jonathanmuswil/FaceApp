import android.view.ViewGroup;
import io.faceapp.ui.layouts.selector.item.AddPhotoItemView;
import io.faceapp.ui.layouts.selector.item.AddPhotoItemView.a;
import io.faceapp.ui.layouts.selector.item.PhotoItemView;
import io.faceapp.ui.layouts.selector.item.PhotoItemView.a;
import io.faceapp.ui.layouts.selector.item.b;
import io.faceapp.ui.layouts.selector.item.m;

final class tFa$a
{
  public static final class a
    extends RGa<b, AddPhotoItemView>
  {
    private final VQa<sFa.b> a;
    
    public a(VQa<sFa.b> paramVQa)
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
  
  public static final class b
    extends RGa<m, PhotoItemView>
  {
    private final VQa<sFa.b> a;
    
    public b(VQa<sFa.b> paramVQa)
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tFa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */