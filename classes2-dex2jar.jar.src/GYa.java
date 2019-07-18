import android.view.ViewGroup;
import io.faceapp.ui.misc.k;
import io.faceapp.ui.misc.k.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class gya
  extends Hza<fya.a, Set<? extends String>>
{
  @Deprecated
  public static final gya.a f = new gya.a(null);
  
  public gya(VQa<fya.b> paramVQa)
  {
    this.c.a(new gya.a.a(paramVQa));
    this.c.a(new gya.a.b(paramVQa));
  }
  
  private final boolean a(mka parammka)
  {
    parammka = parammka.a();
    boolean bool1 = parammka instanceof Collection;
    boolean bool2 = true;
    if ((bool1) && (parammka.isEmpty()))
    {
      bool1 = bool2;
    }
    else
    {
      parammka = parammka.iterator();
      do
      {
        bool1 = bool2;
        if (!parammka.hasNext()) {
          break;
        }
      } while (((lka)parammka.next()).s());
      bool1 = false;
    }
    return bool1;
  }
  
  protected List<Object> a(fya.a parama, Set<String> paramSet)
  {
    oXa.b(parama, "content");
    oXa.b(paramSet, "selection");
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = parama.b().m().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (pka)localIterator.next();
      Object localObject2;
      if ((localObject1 instanceof mka))
      {
        localObject2 = (mka)localObject1;
        localArrayList.add(new qxa((mka)localObject2, paramSet.contains(((mka)localObject2).c()), k.d.a(parama.c(), a((mka)localObject2), parama.a())));
      }
      else if ((localObject1 instanceof rka))
      {
        localObject2 = lya.a;
        localObject1 = (rka)localObject1;
        localObject2 = ((lya.c)localObject2).a((rka)localObject1);
        if (localObject2 != null) {
          localArrayList.add(new hya((lya)localObject2, paramSet.contains(((rka)localObject1).c())));
        }
      }
    }
    return localArrayList;
  }
  
  protected boolean a(Object paramObject1, Object paramObject2)
  {
    oXa.b(paramObject1, "old");
    oXa.b(paramObject2, "new");
    boolean bool1 = paramObject1 instanceof qxa;
    boolean bool2 = true;
    if (bool1)
    {
      if (((paramObject2 instanceof qxa)) && (oXa.a(((qxa)paramObject1).b(), ((qxa)paramObject2).b()))) {}
    }
    else {
      do
      {
        bool2 = false;
        break;
        if (!(paramObject1 instanceof hya)) {
          break label97;
        }
      } while ((!(paramObject2 instanceof hya)) || (!oXa.a(((hya)paramObject1).b(), ((hya)paramObject2).b())));
    }
    return bool2;
    label97:
    paramObject2 = new StringBuilder();
    ((StringBuilder)paramObject2).append("Unsupported model type: ");
    ((StringBuilder)paramObject2).append(paramObject1.getClass().getSimpleName());
    throw new IllegalArgumentException(((StringBuilder)paramObject2).toString());
  }
  
  private static final class a
  {
    public static final class a
      extends RGa<qxa, txa>
    {
      private final VQa<fya.b> a;
      
      public a(VQa<fya.b> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        return paramObject instanceof qxa;
      }
      
      protected txa b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        paramViewGroup = paramViewGroup.getContext();
        oXa.a(paramViewGroup, "parent.context");
        return new txa(paramViewGroup, this.a);
      }
    }
    
    public static final class b
      extends RGa<hya, jya>
    {
      private final VQa<fya.b> a;
      
      public b(VQa<fya.b> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        return paramObject instanceof hya;
      }
      
      protected jya b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        paramViewGroup = paramViewGroup.getContext();
        oXa.a(paramViewGroup, "parent.context");
        return new jya(paramViewGroup, this.a);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */