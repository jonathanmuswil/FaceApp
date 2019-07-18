import android.view.ViewGroup;
import io.faceapp.ui.updates.item.NewVotesItemView;
import io.faceapp.ui.updates.item.NewVotesItemView.a;

public final class fMa$a$c
  extends RGa<Wka, NewVotesItemView>
{
  private final VQa<zMa.b> a;
  
  public fMa$a$c(VQa<zMa.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    boolean bool1 = paramObject instanceof Wka;
    boolean bool2 = true;
    if ((!bool1) || (((Wka)paramObject).g() <= 1)) {
      bool2 = false;
    }
    return bool2;
  }
  
  protected NewVotesItemView b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    return NewVotesItemView.u.a(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fMa$a$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */