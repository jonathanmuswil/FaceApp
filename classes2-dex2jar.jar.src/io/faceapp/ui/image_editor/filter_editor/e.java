package io.faceapp.ui.image_editor.filter_editor;

import Dza;
import Dza.a;
import Fza;
import Hza;
import RGa;
import RV;
import UV;
import VQa;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import io.faceapp.ui.misc.k;
import io.faceapp.ui.misc.k.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lka;
import mka;
import oXa;

public final class e
  extends Hza<s.a, String>
{
  @Deprecated
  public static final a f = new a(null);
  
  public e(VQa<s.b> paramVQa)
  {
    this.c.a(new e.a.b(paramVQa));
    this.c.a(new e.a.a(paramVQa));
  }
  
  protected List<Object> a(s.a parama, String paramString)
  {
    oXa.b(parama, "content");
    oXa.b(paramString, "selection");
    ArrayList localArrayList = new ArrayList();
    Dza.a locala = Dza.a;
    Object localObject1 = parama.b();
    Object localObject2 = parama.c();
    boolean bool;
    if (paramString.length() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    localArrayList.add(locala.a((mka)localObject1, (Bitmap)localObject2, bool));
    localObject2 = parama.b().a().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (lka)((Iterator)localObject2).next();
      localArrayList.add(new a((lka)localObject1, oXa.a(paramString, ((lka)localObject1).m()), k.d.a(parama.d(), ((lka)localObject1).s(), parama.a())));
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
      if (!(paramObject1 instanceof a)) {
        break label70;
      }
      if (((paramObject2 instanceof a)) && (oXa.a(((a)paramObject1).b(), ((a)paramObject2).b()))) {
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
      extends RGa<a, d>
    {
      private final VQa<s.b> a;
      
      public a(VQa<s.b> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        return paramObject instanceof a;
      }
      
      protected d b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        paramViewGroup = paramViewGroup.getContext();
        oXa.a(paramViewGroup, "parent.context");
        return new d(paramViewGroup, this.a);
      }
    }
    
    public static final class b
      extends RGa<Dza, Fza<s.b>>
    {
      private final VQa<s.b> a;
      
      public b(VQa<s.b> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        return paramObject instanceof Dza;
      }
      
      protected Fza<s.b> b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        paramViewGroup = paramViewGroup.getContext();
        oXa.a(paramViewGroup, "parent.context");
        return new Fza(paramViewGroup, this.a, s.b.c.a);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */