import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.x;
import android.view.ViewGroup;
import io.faceapp.ui.layouts.selector.item.AddPhotoItemView;
import io.faceapp.ui.layouts.selector.item.AddPhotoItemView.a;
import io.faceapp.ui.layouts.selector.item.PhotoItemView;
import io.faceapp.ui.layouts.selector.item.PhotoItemView.a;
import io.faceapp.ui.layouts.selector.item.b;
import io.faceapp.ui.layouts.selector.item.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class tFa
  extends VV<List<Object>>
{
  @Deprecated
  public static final tFa.a e = new tFa.a(null);
  
  public tFa(VQa<sFa.b> paramVQa)
  {
    a(true);
    this.c.a(new JGa());
    this.c.a(new tFa.a.b(paramVQa));
    this.c.a(new tFa.a.a(paramVQa));
  }
  
  private final void a(List<? extends Object> paramList)
  {
    he.b localb = he.a(new QGa((List)e(), paramList, uFa.b));
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
    if (oXa.a(localObject, b.a))
    {
      l = 0L;
    }
    else if ((localObject instanceof kHa))
    {
      l = 1L + ((kHa)localObject).b();
    }
    else
    {
      if (!(localObject instanceof m)) {
        break label70;
      }
      l = ((m)localObject).a().hashCode();
    }
    return l;
    label70:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unsupported model type: ");
    localStringBuilder.append(localObject.getClass().getSimpleName());
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public final void a(sFa.c paramc)
  {
    oXa.b(paramc, "model");
    ArrayList localArrayList1 = new ArrayList();
    localArrayList1.add(new kHa(8, 0L));
    Object localObject = paramc.a();
    ArrayList localArrayList2 = new ArrayList(mWa.a((Iterable)localObject, 10));
    Iterator localIterator = ((Iterable)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (Eda)localIterator.next();
      localArrayList2.add(new m((Eda)localObject, oXa.a(localObject, paramc.b()), paramc.c()));
    }
    localArrayList1.addAll(localArrayList2);
    localArrayList1.add(b.a);
    localArrayList1.add(new kHa(8, 1L));
    a(localArrayList1);
  }
  
  public boolean a(RecyclerView.x paramx)
  {
    oXa.b(paramx, "holder");
    return true;
  }
  
  private static final class a
  {
    public static final class a
      extends RGa<b, AddPhotoItemView>
    {
      private final VQa<sFa.b> a;
      
      public a(VQa<sFa.b> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        boolean bool;
        if (paramObject == b.a) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      protected AddPhotoItemView b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        return AddPhotoItemView.c.a(paramViewGroup, this.a);
      }
    }
    
    public static final class b
      extends RGa<m, PhotoItemView>
    {
      private final VQa<sFa.b> a;
      
      public b(VQa<sFa.b> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        return paramObject instanceof m;
      }
      
      protected PhotoItemView b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        return PhotoItemView.u.a(paramViewGroup, this.a);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tFa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */