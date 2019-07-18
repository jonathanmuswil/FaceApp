import android.os.Bundle;
import android.support.v7.widget.RecyclerView.a;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class wya
  extends Hza<Fya.a, Fya.b>
{
  @Deprecated
  public static final wya.a f = new wya.a(null);
  
  public wya(VQa<Fya.c> paramVQa)
  {
    this.c.a(new wya.a.a(paramVQa));
  }
  
  private final int a(Bundle paramBundle, pya parampya)
  {
    int i;
    if ((parampya instanceof pya.j)) {
      i = ((Number)parampya.c().a(Float.valueOf(oya.a(oya.v(paramBundle), parampya) / 2.0F))).intValue();
    } else {
      i = ((Number)parampya.c().a(Float.valueOf(oya.a(oya.v(paramBundle), parampya)))).intValue() - ((Number)parampya.c().a(Float.valueOf(0.0F))).intValue();
    }
    return i;
  }
  
  protected Integer a(Fya.b paramb)
  {
    oXa.b(paramb, "selection");
    Object localObject1 = (List)this.d;
    Object localObject2 = null;
    if (localObject1 != null)
    {
      Iterator localIterator = ((Iterable)localObject1).iterator();
      localObject2 = null;
      int i = 0;
      while (localIterator.hasNext())
      {
        Object localObject3 = localIterator.next();
        if (i >= 0)
        {
          localObject1 = localObject3;
          if (!(localObject3 instanceof Gya)) {
            localObject1 = null;
          }
          localObject3 = (Gya)localObject1;
          localObject1 = localObject2;
          if (localObject3 != null)
          {
            localObject1 = Kya.a.a(((Gya)localObject3).a());
            boolean bool = oXa.a(((Gya)localObject3).a(), paramb.b());
            int j;
            if (localObject1 != null) {
              j = a(paramb.a(), (pya)localObject1);
            } else {
              j = 0;
            }
            if (bool) {
              localObject2 = Integer.valueOf(i);
            }
            if (((Gya)localObject3).b() == bool)
            {
              localObject1 = localObject2;
              if (((Gya)localObject3).d() == j) {}
            }
            else
            {
              ((List)this.d).set(i, ((Gya)localObject3).a(((Gya)localObject3).a(), bool, j, paramb.c()));
              c(i);
              localObject1 = localObject2;
            }
          }
          i++;
          localObject2 = localObject1;
        }
        else
        {
          mWa.c();
          throw null;
        }
      }
    }
    return (Integer)localObject2;
  }
  
  protected List<Object> a(Fya.a parama, Fya.b paramb)
  {
    oXa.b(parama, "content");
    oXa.b(paramb, "selection");
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = parama.a().a();
    parama = new ArrayList();
    Object localObject2 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = ((Iterator)localObject2).next();
      if ((localObject1 instanceof jka)) {
        parama.add(localObject1);
      }
    }
    localObject1 = parama.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (jka)((Iterator)localObject1).next();
      parama = Kya.a.a((jka)localObject2);
      if (parama != null) {
        localArrayList.add(new Gya((jka)localObject2, oXa.a(localObject2, paramb.b()), a(paramb.a(), parama), paramb.c()));
      }
    }
    return localArrayList;
  }
  
  protected boolean a(Object paramObject1, Object paramObject2)
  {
    oXa.b(paramObject1, "old");
    oXa.b(paramObject2, "new");
    if ((paramObject1 instanceof Gya))
    {
      boolean bool;
      if (((paramObject2 instanceof Gya)) && (oXa.a(((Gya)paramObject1).a(), ((Gya)paramObject2).a()))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    paramObject2 = new StringBuilder();
    ((StringBuilder)paramObject2).append("Unsupported model type: ");
    ((StringBuilder)paramObject2).append(paramObject1.getClass().getSimpleName());
    throw new IllegalArgumentException(((StringBuilder)paramObject2).toString());
  }
  
  private static final class a
  {
    public static final class a
      extends RGa<Gya, Hya>
    {
      private final VQa<Fya.c> a;
      
      public a(VQa<Fya.c> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        return paramObject instanceof Gya;
      }
      
      protected Hya b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        paramViewGroup = paramViewGroup.getContext();
        oXa.a(paramViewGroup, "parent.context");
        return new Hya(paramViewGroup, this.a);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */