import android.view.ViewGroup;
import io.faceapp.ui.layouts.stylist.selector.item.SelectedFilterItemView;
import io.faceapp.ui.layouts.stylist.selector.item.SelectedFilterItemView.a;
import io.faceapp.ui.layouts.stylist.selector.item.b;
import io.faceapp.ui.layouts.stylist.selector.item.b.a;
import io.faceapp.ui.misc.recycler.view.FullscreenLabelView;

final class BFa$a
{
  public static final class a
    extends RGa<rHa, FullscreenLabelView>
  {
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof rHa;
    }
    
    protected FullscreenLabelView b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return b.e.a(paramViewGroup);
    }
  }
  
  public static final class b
    extends RGa<LFa, SelectedFilterItemView>
  {
    private final VQa<KFa.b> a;
    
    public b(VQa<KFa.b> paramVQa)
    {
      this.a = paramVQa;
    }
    
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof LFa;
    }
    
    protected SelectedFilterItemView b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return SelectedFilterItemView.u.a(paramViewGroup, this.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/BFa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */