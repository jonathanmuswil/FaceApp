import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.x;
import android.view.ViewGroup;
import io.faceapp.ui.layouts.selector.item.SectionItemView;
import io.faceapp.ui.layouts.selector.item.SectionItemView.a;
import io.faceapp.ui.layouts.selector.item.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class vFa
  extends GGa
{
  @Deprecated
  public static final vFa.a e = new vFa.a(null);
  private final VQa<sFa.b> f;
  
  public vFa(VQa<sFa.b> paramVQa)
  {
    this.f = paramVQa;
    a(true);
    this.c.a(new NGa());
    this.c.a(new PGa());
    this.c.a(new IGa());
    this.c.a(new vFa.a.a(this.f));
  }
  
  private final ArrayList<Object> a(List<zka> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    ArrayList localArrayList1 = new ArrayList();
    localArrayList1.add(new sHa(16, 0L));
    ArrayList localArrayList2 = new ArrayList(mWa.a(paramList, 10));
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList2.add(new n((zka)paramList.next(), paramBoolean1, paramBoolean2));
    }
    localArrayList1.addAll(localArrayList2);
    localArrayList1.add(new sHa(8, 1L));
    return localArrayList1;
  }
  
  private final void a(List<? extends Object> paramList)
  {
    he.b localb = he.a(new QGa((List)e(), paramList, xFa.b));
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
    else if ((localObject instanceof sHa))
    {
      l = 1L + ((sHa)localObject).b();
    }
    else if ((localObject instanceof jHa))
    {
      l = ((jHa)localObject).k();
    }
    else
    {
      if (!(localObject instanceof n)) {
        break label91;
      }
      l = ((n)localObject).b().b().hashCode();
    }
    return l;
    label91:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unsupported model type: ");
    localStringBuilder.append(localObject.getClass().getSimpleName());
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public final void a(sFa.c paramc)
  {
    oXa.b(paramc, "model");
    if ((paramc instanceof sFa.c.b))
    {
      a(a(((sFa.c.b)paramc).d(), new wFa(this)));
    }
    else
    {
      if (!(paramc instanceof sFa.c.a)) {
        break label72;
      }
      paramc = (sFa.c.a)paramc;
      a(a(paramc.e(), paramc.f(), paramc.d()));
    }
    return;
    label72:
    throw new UVa();
  }
  
  public boolean a(RecyclerView.x paramx)
  {
    oXa.b(paramx, "holder");
    return true;
  }
  
  private static final class a
  {
    public static final class a
      extends RGa<n, SectionItemView>
    {
      private final VQa<sFa.b> a;
      
      public a(VQa<sFa.b> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        return paramObject instanceof n;
      }
      
      protected SectionItemView b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        return SectionItemView.a.a(paramViewGroup, this.a);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vFa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */