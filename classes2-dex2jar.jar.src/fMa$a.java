import android.view.ViewGroup;
import io.faceapp.ui.updates.item.NewFriendPollItemView;
import io.faceapp.ui.updates.item.NewFriendPollItemView.a;
import io.faceapp.ui.updates.item.NewVotesItemView;
import io.faceapp.ui.updates.item.NewVotesItemView.a;
import io.faceapp.ui.updates.item.PollResultsItemView;
import io.faceapp.ui.updates.item.PollResultsItemView.a;
import io.faceapp.ui.updates.item.SingleNewVoteItemView;
import io.faceapp.ui.updates.item.SingleNewVoteItemView.a;
import io.faceapp.ui.updates.item.UpdatesLabelItemView;
import io.faceapp.ui.updates.item.UpdatesLabelItemView.a;

final class fMa$a
{
  public static final class a
    extends RGa<rHa, UpdatesLabelItemView>
  {
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof rHa;
    }
    
    protected UpdatesLabelItemView b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return UpdatesLabelItemView.d.a(paramViewGroup);
    }
  }
  
  public static final class b
    extends RGa<Vka, NewFriendPollItemView>
  {
    private final VQa<zMa.b> a;
    
    public b(VQa<zMa.b> paramVQa)
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
  
  public static final class c
    extends RGa<Wka, NewVotesItemView>
  {
    private final VQa<zMa.b> a;
    
    public c(VQa<zMa.b> paramVQa)
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
  
  public static final class d
    extends RGa<Xka, PollResultsItemView>
  {
    private final VQa<zMa.b> a;
    
    public d(VQa<zMa.b> paramVQa)
    {
      this.a = paramVQa;
    }
    
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof Xka;
    }
    
    protected PollResultsItemView b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return PollResultsItemView.u.a(paramViewGroup, this.a);
    }
  }
  
  public static final class e
    extends RGa<Wka, SingleNewVoteItemView>
  {
    private final VQa<zMa.b> a;
    
    public e(VQa<zMa.b> paramVQa)
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fMa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */