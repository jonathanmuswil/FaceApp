import android.graphics.Bitmap;
import android.view.ViewGroup;
import io.faceapp.ui.misc.k;
import io.faceapp.ui.misc.k.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class zAa
  extends Hza<KAa.a, String>
{
  @Deprecated
  public static final zAa.a f = new zAa.a(null);
  
  public zAa(VQa<KAa.b> paramVQa)
  {
    this.c.a(new zAa.a.b(paramVQa));
    this.c.a(new zAa.a.a(paramVQa));
  }
  
  protected List<Object> a(KAa.a parama, String paramString)
  {
    oXa.b(parama, "content");
    oXa.b(paramString, "selection");
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = Dza.a;
    Object localObject2 = parama.b();
    Object localObject3 = parama.c();
    boolean bool;
    if (paramString.length() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    localArrayList.add(((Dza.a)localObject1).a((rka)localObject2, (Bitmap)localObject3, bool));
    localObject3 = parama.b().a();
    localObject1 = new ArrayList();
    localObject2 = ((Iterable)localObject3).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = ((Iterator)localObject2).next();
      if ((localObject3 instanceof Gka)) {
        ((Collection)localObject1).add(localObject3);
      }
    }
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (Gka)((Iterator)localObject1).next();
      localObject2 = k.d.a(parama.d(), ((Gka)localObject3).i(), parama.a());
      localArrayList.add(new vAa((Gka)localObject3, oXa.a(((Gka)localObject3).b(), paramString), parama.c(), (k)localObject2));
    }
    return localArrayList;
  }
  
  protected boolean a(Object paramObject1, Object paramObject2)
  {
    oXa.b(paramObject1, "old");
    oXa.b(paramObject2, "new");
    boolean bool;
    if ((paramObject1 instanceof Dza))
    {
      bool = paramObject2 instanceof Dza;
    }
    else
    {
      if (!(paramObject1 instanceof vAa)) {
        break label89;
      }
      if ((paramObject2 instanceof vAa))
      {
        paramObject1 = (vAa)paramObject1;
        Gka localGka = ((vAa)paramObject1).b();
        paramObject2 = (vAa)paramObject2;
        if ((oXa.a(localGka, ((vAa)paramObject2).b())) && (((vAa)paramObject1).c() == ((vAa)paramObject2).c()))
        {
          bool = true;
          break label87;
        }
      }
      bool = false;
    }
    label87:
    return bool;
    label89:
    paramObject2 = new StringBuilder();
    ((StringBuilder)paramObject2).append("Unsupported model type: ");
    ((StringBuilder)paramObject2).append(paramObject1.getClass().getSimpleName());
    throw new IllegalArgumentException(((StringBuilder)paramObject2).toString());
  }
  
  private static final class a
  {
    public static final class a
      extends RGa<vAa, yAa>
    {
      private final VQa<KAa.b> a;
      
      public a(VQa<KAa.b> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        return paramObject instanceof vAa;
      }
      
      protected yAa b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        paramViewGroup = paramViewGroup.getContext();
        oXa.a(paramViewGroup, "parent.context");
        return new yAa(paramViewGroup, this.a);
      }
    }
    
    public static final class b
      extends RGa<Dza, Fza<KAa.b>>
    {
      private final VQa<KAa.b> a;
      
      public b(VQa<KAa.b> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        return paramObject instanceof Dza;
      }
      
      protected Fza<KAa.b> b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        paramViewGroup = paramViewGroup.getContext();
        oXa.a(paramViewGroup, "parent.context");
        return new Fza(paramViewGroup, this.a, KAa.b.c.a);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zAa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */