import android.view.ViewGroup;
import io.faceapp.ui.photo_picker.item.CameraItemView;
import io.faceapp.ui.photo_picker.item.CameraItemView.a;
import io.faceapp.ui.photo_picker.item.HeaderLabelItemView;
import io.faceapp.ui.photo_picker.item.HeaderLabelItemView.a;
import io.faceapp.ui.photo_picker.item.LoadingFirstFacesItemView;
import io.faceapp.ui.photo_picker.item.LoadingFirstFacesItemView.a;
import io.faceapp.ui.photo_picker.item.NoPermissionItemView;
import io.faceapp.ui.photo_picker.item.NoPermissionItemView.a;
import io.faceapp.ui.photo_picker.item.NoPhotosItemView;
import io.faceapp.ui.photo_picker.item.NoPhotosItemView.a;
import io.faceapp.ui.photo_picker.item.RecentPhotoItemView;
import io.faceapp.ui.photo_picker.item.RecentPhotoItemView.a;
import io.faceapp.ui.photo_picker.item.StableCollectionsItemView;
import io.faceapp.ui.photo_picker.item.StableCollectionsItemView.a;
import io.faceapp.ui.photo_picker.item.a;

final class tIa$a
{
  public static final class a
    extends RGa<a, CameraItemView>
  {
    private final VQa<KIa.d> a;
    
    public a(VQa<KIa.d> paramVQa)
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
  
  public static final class b
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
  
  public static final class c
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
  
  public static final class d
    extends RGa<KIa.a.b, NoPermissionItemView>
  {
    private final VQa<KIa.d> a;
    
    public d(VQa<KIa.d> paramVQa)
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
  
  public static final class e
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
  
  public static final class f
    extends RGa<eoa.c, RecentPhotoItemView>
  {
    private final VQa<KIa.d> a;
    
    public f(VQa<KIa.d> paramVQa)
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
  
  public static final class g
    extends RGa<KIa.c.c, StableCollectionsItemView>
  {
    private final VQa<KIa.d> a;
    
    public g(VQa<KIa.d> paramVQa)
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tIa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */