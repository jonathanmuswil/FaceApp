import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.x;
import android.view.ViewGroup;
import io.faceapp.ui.misc.c.a;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class fMa
  extends GGa
{
  @Deprecated
  public static final fMa.a e = new fMa.a(null);
  private final Resources f;
  private final VQa<zMa.c> g;
  
  public fMa(Resources paramResources, VQa<zMa.c> paramVQa, VQa<zMa.b> paramVQa1)
  {
    this.f = paramResources;
    this.g = paramVQa;
    a(true);
    this.c.a(new NGa());
    this.c.a(new HGa());
    this.c.a(new IGa());
    this.c.a(new OGa());
    this.c.a(new fMa.a.a());
    this.c.a(new fMa.a.e(paramVQa1));
    this.c.a(new fMa.a.c(paramVQa1));
    this.c.a(new fMa.a.b(paramVQa1));
    this.c.a(new fMa.a.d(paramVQa1));
  }
  
  private final ArrayList<Object> a(zMa.d.a parama)
  {
    ArrayList localArrayList = new ArrayList();
    String str;
    if ((parama.b().isEmpty() ^ true))
    {
      str = this.f.getString(2131689967);
      oXa.a(str, "resources.getString(R.string.Updates_LabelNew)");
      localArrayList.add(new rHa(str));
      localArrayList.addAll(parama.b());
      localArrayList.add(pHa.b.a());
    }
    if ((parama.c().isEmpty() ^ true))
    {
      str = this.f.getString(2131689966);
      oXa.a(str, "resources.getString(R.string.Updates_LabelEarlier)");
      localArrayList.add(new rHa(str));
      localArrayList.addAll(parama.c());
    }
    return localArrayList;
  }
  
  private final void a(List<? extends Object> paramList)
  {
    he.b localb = he.a(new QGa((List)e(), paramList, hMa.b));
    oXa.a(localb, "DiffUtil.calculateDiff(B…\n            }\n        })");
    if (paramList != null) {
      paramList = mWa.c(paramList);
    } else {
      paramList = null;
    }
    a(paramList);
    localb.a(this);
  }
  
  public long a(int paramInt)
  {
    Object localObject = ((List)e()).get(paramInt);
    long l;
    if (oXa.a(localObject, nHa.a))
    {
      l = 0L;
    }
    else if ((localObject instanceof iHa))
    {
      l = 1L;
    }
    else if ((localObject instanceof jHa))
    {
      l = ((jHa)localObject).k();
    }
    else
    {
      if ((localObject instanceof pHa)) {}
      for (paramInt = -1 - paramInt;; paramInt = ((rHa)localObject).a().hashCode())
      {
        l = paramInt;
        break label158;
        if (!(localObject instanceof rHa)) {
          break;
        }
      }
      if ((localObject instanceof Wka)) {
        paramInt = ((Wka)localObject).getId();
      }
      for (;;)
      {
        l = paramInt + 2L;
        break;
        if ((localObject instanceof Vka))
        {
          paramInt = ((Vka)localObject).getId();
        }
        else
        {
          if (!(localObject instanceof Xka)) {
            break label160;
          }
          paramInt = ((Xka)localObject).getId();
        }
      }
    }
    label158:
    return l;
    label160:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unsupported model type: ");
    localStringBuilder.append(localObject.getClass().getSimpleName());
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public final void a(zMa.d paramd)
  {
    oXa.b(paramd, "model");
    if (oXa.a(paramd, zMa.d.c.a))
    {
      a(mWa.a(nHa.a));
    }
    else if (oXa.a(paramd, zMa.d.b.a))
    {
      a(mWa.a(iHa.a(iHa.a.a(2131230991, 2131689630), 0, 0, null, 0, 0.1F, 15, null)));
    }
    else if ((paramd instanceof zMa.d.a))
    {
      a(a((zMa.d.a)paramd));
    }
    else
    {
      if (!(paramd instanceof zMa.d.d)) {
        break label128;
      }
      a(b(((zMa.d.d)paramd).a(), new gMa(this)));
    }
    return;
    label128:
    throw new UVa();
  }
  
  public boolean a(RecyclerView.x paramx)
  {
    oXa.b(paramx, "holder");
    return true;
  }
  
  public List<jHa> b(c.a parama, bXa<cWa> parambXa)
  {
    oXa.b(parama, "errorViewModel");
    oXa.b(parambXa, "retryAction");
    parambXa = super.b(parama, parambXa);
    parama = new ArrayList(mWa.a(parambXa, 10));
    parambXa = parambXa.iterator();
    while (parambXa.hasNext()) {
      parama.add(jHa.a((jHa)parambXa.next(), 0, null, 0, null, 0, 0.1F, 31, null));
    }
    return parama;
  }
  
  private static final class a
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fMa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */