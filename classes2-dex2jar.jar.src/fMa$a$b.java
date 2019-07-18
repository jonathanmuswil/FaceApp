import android.view.ViewGroup;
import io.faceapp.ui.updates.item.NewFriendPollItemView;
import io.faceapp.ui.updates.item.NewFriendPollItemView.a;

public final class fMa$a$b
  extends RGa<Vka, NewFriendPollItemView>
{
  private final VQa<zMa.b> a;
  
  public fMa$a$b(VQa<zMa.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof Vka;
  }
  
  protected NewFriendPollItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return NewFriendPollItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fMa$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */