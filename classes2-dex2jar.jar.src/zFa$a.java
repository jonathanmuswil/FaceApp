import android.view.ViewGroup;
import io.faceapp.ui.layouts.stylist.selector.item.StylistSectionView;
import io.faceapp.ui.layouts.stylist.selector.item.StylistSectionView.a;

final class zFa$a
{
  public static final class a
    extends RGa<MFa, StylistSectionView>
  {
    private final VQa<KFa.b> a;
    
    public a(VQa<KFa.b> paramVQa)
    {
      this.a = paramVQa;
    }
    
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof MFa;
    }
    
    protected StylistSectionView b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return StylistSectionView.a.a(paramViewGroup, this.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zFa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */