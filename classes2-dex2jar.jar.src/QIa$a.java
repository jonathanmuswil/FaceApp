import android.view.ViewGroup;
import io.faceapp.ui.polls.item.PartAuthorItemView;
import io.faceapp.ui.polls.item.PartAuthorItemView.a;
import io.faceapp.ui.polls.item.PartCommentItemView;
import io.faceapp.ui.polls.item.PartCommentItemView.a;
import io.faceapp.ui.polls.item.PartCommentWithAvatarItemView;
import io.faceapp.ui.polls.item.PartCommentWithAvatarItemView.a;
import io.faceapp.ui.polls.item.PartImageItemView;
import io.faceapp.ui.polls.item.PartImageItemView.a;
import io.faceapp.ui.polls.item.PartInviteBtnItemView;
import io.faceapp.ui.polls.item.PartInviteBtnItemView.a;
import io.faceapp.ui.polls.item.PartPollResultsItemView;
import io.faceapp.ui.polls.item.PartPollResultsItemView.a;
import io.faceapp.ui.polls.item.PartShowAllCommentsItemView;
import io.faceapp.ui.polls.item.PartShowAllCommentsItemView.a;
import io.faceapp.ui.polls.item.PartVoteBtnItemView;
import io.faceapp.ui.polls.item.PartVoteBtnItemView.a;
import io.faceapp.ui.polls.item.e;
import io.faceapp.ui.polls.item.e.a;

final class QIa$a
{
  public static final class a
    extends RGa<LIa.a, PartAuthorItemView>
  {
    private final cXa<LIa.a, cWa> a;
    
    public a(cXa<? super LIa.a, cWa> paramcXa)
    {
      this.a = paramcXa;
    }
    
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof LIa.a;
    }
    
    protected PartAuthorItemView b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return PartAuthorItemView.u.a(paramViewGroup, this.a);
    }
  }
  
  public static final class b
    extends RGa<LIa.b, PartCommentItemView>
  {
    private final VQa<XIa.c> a;
    
    public b(VQa<XIa.c> paramVQa)
    {
      this.a = paramVQa;
    }
    
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof LIa.b;
    }
    
    protected PartCommentItemView b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return PartCommentItemView.u.a(paramViewGroup, this.a);
    }
  }
  
  public static final class c
    extends RGa<LIa.c, PartCommentWithAvatarItemView>
  {
    private final VQa<XIa.c> a;
    
    public c(VQa<XIa.c> paramVQa)
    {
      this.a = paramVQa;
    }
    
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof LIa.c;
    }
    
    protected PartCommentWithAvatarItemView b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return PartCommentWithAvatarItemView.u.a(paramViewGroup, this.a);
    }
  }
  
  public static final class d
    extends RGa<LIa.d, PartImageItemView>
  {
    private final cXa<LIa.d, cWa> a;
    
    public d(cXa<? super LIa.d, cWa> paramcXa)
    {
      this.a = paramcXa;
    }
    
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof LIa.d;
    }
    
    protected PartImageItemView b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return PartImageItemView.u.a(paramViewGroup, this.a);
    }
  }
  
  public static final class e
    extends RGa<LIa.e, PartInviteBtnItemView>
  {
    private final VQa<XIa.c> a;
    
    public e(VQa<XIa.c> paramVQa)
    {
      this.a = paramVQa;
    }
    
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof LIa.e;
    }
    
    protected PartInviteBtnItemView b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return PartInviteBtnItemView.u.a(paramViewGroup, this.a);
    }
  }
  
  public static final class f
    extends RGa<LIa.f, PartPollResultsItemView>
  {
    private final VQa<XIa.c> a;
    
    public f(VQa<XIa.c> paramVQa)
    {
      this.a = paramVQa;
    }
    
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof LIa.f;
    }
    
    protected PartPollResultsItemView b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return PartPollResultsItemView.f.a(paramViewGroup, this.a);
    }
  }
  
  public static final class g
    extends RGa<LIa.g, e>
  {
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof LIa.g;
    }
    
    protected e b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return e.a.a(paramViewGroup);
    }
  }
  
  public static final class h
    extends RGa<LIa.h, PartShowAllCommentsItemView>
  {
    private final cXa<LIa.h, cWa> a;
    
    public h(cXa<? super LIa.h, cWa> paramcXa)
    {
      this.a = paramcXa;
    }
    
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof LIa.h;
    }
    
    protected PartShowAllCommentsItemView b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return PartShowAllCommentsItemView.a.a(paramViewGroup, this.a);
    }
  }
  
  public static final class i
    extends RGa<LIa.i, PartVoteBtnItemView>
  {
    private final cXa<LIa.i, cWa> a;
    
    public i(cXa<? super LIa.i, cWa> paramcXa)
    {
      this.a = paramcXa;
    }
    
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof LIa.i;
    }
    
    protected PartVoteBtnItemView b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return PartVoteBtnItemView.u.a(paramViewGroup, this.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/QIa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */