import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.x;
import android.view.ViewGroup;
import io.faceapp.ui.layouts.stylist.selector.item.StylistSectionView;
import io.faceapp.ui.layouts.stylist.selector.item.StylistSectionView.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class zFa
  extends VV<List<Object>>
{
  @Deprecated
  public static final zFa.a e = new zFa.a(null);
  
  public zFa(VQa<KFa.b> paramVQa)
  {
    a(true);
    this.c.a(new zFa.a.a(paramVQa));
    this.c.a(new PGa());
  }
  
  private final ArrayList<Object> a(List<MFa> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new sHa(16, 0L));
    localArrayList.addAll(paramList);
    localArrayList.add(new sHa(8, 1L));
    return localArrayList;
  }
  
  private final void b(List<? extends Object> paramList)
  {
    he.b localb = he.a(new QGa((List)e(), paramList, AFa.b));
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
    if ((localObject instanceof sHa))
    {
      l = ((sHa)localObject).b();
    }
    else
    {
      if (!(localObject instanceof MFa)) {
        break label53;
      }
      l = ((MFa)localObject).b().hashCode();
    }
    return l;
    label53:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unsupported model type: ");
    localStringBuilder.append(localObject.getClass().getSimpleName());
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public final void a(KFa.c paramc)
  {
    oXa.b(paramc, "model");
    if ((paramc instanceof KFa.c.a))
    {
      b(a(((KFa.c.a)paramc).a()));
    }
    else
    {
      if (!(paramc instanceof KFa.c.b)) {
        break label122;
      }
      Object localObject = ((KFa.c.b)paramc).a();
      paramc = new ArrayList();
      Iterator localIterator = ((Iterable)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = localIterator.next();
        int i;
        if (((MFa)localObject).d() == null) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          paramc.add(localObject);
        }
      }
      b(a(paramc));
    }
    return;
    label122:
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zFa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */