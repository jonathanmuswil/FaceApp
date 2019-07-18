import android.view.ViewGroup;
import io.faceapp.ui.updates.item.SingleNewVoteItemView;
import io.faceapp.ui.updates.item.SingleNewVoteItemView.a;

public final class fMa$a$e
  extends RGa<Wka, SingleNewVoteItemView>
{
  private final VQa<zMa.b> a;
  
  public fMa$a$e(VQa<zMa.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    boolean bool1 = paramObject instanceof Wka;
    boolean bool2 = true;
    if ((!bool1) || (((Wka)paramObject).g() != 1)) {
      bool2 = false;
    }
    return bool2;
  }
  
  protected SingleNewVoteItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return SingleNewVoteItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fMa$a$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */