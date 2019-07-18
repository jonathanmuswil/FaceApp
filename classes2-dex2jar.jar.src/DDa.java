import android.graphics.Bitmap;
import android.view.ViewGroup;
import io.faceapp.ui.misc.k;
import io.faceapp.ui.misc.k.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class dDa
  extends Hza<pDa.a, String>
{
  @Deprecated
  public static final dDa.a f = new dDa.a(null);
  
  public dDa(VQa<pDa.b> paramVQa)
  {
    this.c.a(new dDa.a.b(paramVQa));
    this.c.a(new dDa.a.a(paramVQa));
  }
  
  protected List<Object> a(pDa.a parama, String paramString)
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
    localObject2 = parama.b().a();
    localObject3 = new ArrayList();
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = ((Iterator)localObject2).next();
      if ((localObject1 instanceof Kka)) {
        ((Collection)localObject3).add(localObject1);
      }
    }
    localObject3 = ((Iterable)localObject3).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (Kka)((Iterator)localObject3).next();
      localArrayList.add(new SCa((Kka)localObject2, oXa.a(((Kka)localObject2).b(), paramString), k.d.a(parama.d(), ((Kka)localObject2).g(), parama.a())));
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
      if (!(paramObject1 instanceof SCa)) {
        break label70;
      }
      if (((paramObject2 instanceof SCa)) && (oXa.a(((SCa)paramObject1).b(), ((SCa)paramObject2).b()))) {
        bool = true;
      } else {
        bool = false;
      }
    }
    return bool;
    label70:
    paramObject2 = new StringBuilder();
    ((StringBuilder)paramObject2).append("Unsupported model type: ");
    ((StringBuilder)paramObject2).append(paramObject1.getClass().getSimpleName());
    throw new IllegalArgumentException(((StringBuilder)paramObject2).toString());
  }
  
  private static final class a
  {
    public static final class a
      extends RGa<SCa, VCa>
    {
      private final VQa<pDa.b> a;
      
      public a(VQa<pDa.b> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        return paramObject instanceof SCa;
      }
      
      protected VCa b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        paramViewGroup = paramViewGroup.getContext();
        oXa.a(paramViewGroup, "parent.context");
        return new VCa(paramViewGroup, this.a);
      }
    }
    
    public static final class b
      extends RGa<Dza, Fza<pDa.b>>
    {
      private final VQa<pDa.b> a;
      
      public b(VQa<pDa.b> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        return paramObject instanceof Dza;
      }
      
      protected Fza<pDa.b> b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        paramViewGroup = paramViewGroup.getContext();
        oXa.a(paramViewGroup, "parent.context");
        return new Fza(paramViewGroup, this.a, pDa.b.b.a);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dDa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */