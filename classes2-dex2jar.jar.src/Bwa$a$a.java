import android.view.ViewGroup;
import io.faceapp.ui.fun.item.FunItemView;
import io.faceapp.ui.fun.item.FunItemView.a;
import io.faceapp.ui.fun.item.a;

public final class Bwa$a$a
  extends RGa<a, FunItemView>
{
  private final VQa<lxa.e> a;
  
  public Bwa$a$a(VQa<lxa.e> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof a;
  }
  
  protected FunItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return FunItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Bwa$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */