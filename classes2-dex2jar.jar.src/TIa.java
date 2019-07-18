import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.x;
import android.view.ViewGroup;
import io.faceapp.ui.photo_picker.item.CameraItemView;
import io.faceapp.ui.photo_picker.item.CameraItemView.a;
import io.faceapp.ui.photo_picker.item.HeaderLabelItemView;
import io.faceapp.ui.photo_picker.item.HeaderLabelItemView.a;
import io.faceapp.ui.photo_picker.item.LoadingFirstFacesItemView;
import io.faceapp.ui.photo_picker.item.LoadingFirstFacesItemView.a;
import io.faceapp.ui.photo_picker.item.NoPermissionItemView;
import io.faceapp.ui.photo_picker.item.NoPermissionItemView.a;
import io.faceapp.ui.photo_picker.item.NoPhotosItemView;
import io.faceapp.ui.photo_picker.item.NoPhotosItemView.a;
import io.faceapp.ui.photo_picker.item.RecentPhotoItemView;
import io.faceapp.ui.photo_picker.item.RecentPhotoItemView.a;
import io.faceapp.ui.photo_picker.item.StableCollectionsItemView;
import io.faceapp.ui.photo_picker.item.StableCollectionsItemView.a;
import io.faceapp.ui.photo_picker.item.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class tIa
  extends VV<List<Object>>
{
  @Deprecated
  public static final tIa.a e = new tIa.a(null);
  private final Resources f;
  private final int g;
  
  public tIa(Resources paramResources, int paramInt, VQa<KIa.d> paramVQa)
  {
    this.f = paramResources;
    this.g = paramInt;
    a(true);
    this.c.a(new MGa());
    this.c.a(new tIa.a.b());
    this.c.a(new tIa.a.e());
    this.c.a(new tIa.a.d(paramVQa));
    this.c.a(new tIa.a.c());
    this.c.a(new tIa.a.g(paramVQa));
    this.c.a(new tIa.a.f(paramVQa));
    this.c.a(new tIa.a.a(paramVQa));
  }
  
  private final ArrayList<Object> a(KIa.e.a parama)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(a(parama.d()));
    localArrayList.add(a.a);
    localArrayList.addAll(parama.e());
    if (parama.c()) {
      localArrayList.add(mHa.a);
    }
    return localArrayList;
  }
  
  private final ArrayList<Object> a(KIa.e.b paramb)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(a(paramb.d()));
    localArrayList.add(a.a);
    localArrayList.addAll(paramb.e());
    localArrayList.add(paramb.c());
    return localArrayList;
  }
  
  private final List<Object> a(List<? extends KIa.c> paramList)
  {
    ArrayList localArrayList = new ArrayList(mWa.a(paramList, 10));
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (KIa.c)localIterator.next();
      if ((paramList instanceof KIa.c.a)) {
        paramList = a((KIa.c.a)paramList);
      } else {
        if (paramList == null) {
          break label74;
        }
      }
      localArrayList.add(paramList);
      continue;
      label74:
      throw new _Va("null cannot be cast to non-null type kotlin.Any");
    }
    return localArrayList;
  }
  
  private final rHa a(KIa.c.a parama)
  {
    Resources localResources = this.f;
    parama = parama.a();
    int i = uIa.a[parama.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          i = 2131689820;
        } else {
          throw new UVa();
        }
      }
      else {
        i = 2131689816;
      }
    }
    else {
      i = 2131689819;
    }
    parama = localResources.getString(i);
    oXa.a(parama, "resources.getString(when…oPicker_FacesLabel\n    })");
    return new rHa(parama);
  }
  
  private final void b(List<? extends Object> paramList)
  {
    he.b localb = he.a(new QGa((List)e(), paramList, vIa.b));
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
    if (oXa.a(localObject, mHa.a))
    {
      l = 0L;
    }
    else if (oXa.a(localObject, KIa.a.c.a))
    {
      l = 1L;
    }
    else if (oXa.a(localObject, KIa.a.b.a))
    {
      l = 2L;
    }
    else if (oXa.a(localObject, KIa.a.a.a))
    {
      l = 3L;
    }
    else if (oXa.a(localObject, a.a))
    {
      l = 4L;
    }
    else if ((localObject instanceof KIa.c.c))
    {
      l = 5L;
    }
    else if ((localObject instanceof KIa.c.b))
    {
      l = 6L;
    }
    else
    {
      if ((localObject instanceof rHa)) {}
      for (paramInt = ((rHa)localObject).a().hashCode();; paramInt = ((eoa.c)localObject).a().c().hashCode())
      {
        l = paramInt;
        break;
        if (!(localObject instanceof eoa.c)) {
          break label175;
        }
      }
    }
    return l;
    label175:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unsupported model type: ");
    localStringBuilder.append(localObject.getClass().getSimpleName());
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public final void a(KIa.e parame)
  {
    oXa.b(parame, "model");
    if ((parame instanceof KIa.e.b))
    {
      b(a((KIa.e.b)parame));
    }
    else
    {
      if (!(parame instanceof KIa.e.a)) {
        break label49;
      }
      b(a((KIa.e.a)parame));
    }
    return;
    label49:
    throw new UVa();
  }
  
  public boolean a(RecyclerView.x paramx)
  {
    oXa.b(paramx, "holder");
    return true;
  }
  
  public final int d(int paramInt)
  {
    Object localObject = ((List)e()).get(paramInt);
    if ((oXa.a(localObject, a.a)) || ((localObject instanceof eoa.c))) {
      paramInt = 1;
    } else {
      paramInt = this.g;
    }
    return paramInt;
  }
  
  private static final class a
  {
    public static final class a
      extends RGa<a, CameraItemView>
    {
      private final VQa<KIa.d> a;
      
      public a(VQa<KIa.d> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        boolean bool;
        if (paramObject == a.a) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      protected CameraItemView b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        return CameraItemView.c.a(paramViewGroup, this.a);
      }
    }
    
    public static final class b
      extends RGa<rHa, HeaderLabelItemView>
    {
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        return paramObject instanceof rHa;
      }
      
      protected HeaderLabelItemView b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        return HeaderLabelItemView.d.a(paramViewGroup);
      }
    }
    
    public static final class c
      extends RGa<KIa.a.a, LoadingFirstFacesItemView>
    {
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        boolean bool;
        if (paramObject == KIa.a.a.a) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      protected LoadingFirstFacesItemView b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        return LoadingFirstFacesItemView.u.a(paramViewGroup);
      }
    }
    
    public static final class d
      extends RGa<KIa.a.b, NoPermissionItemView>
    {
      private final VQa<KIa.d> a;
      
      public d(VQa<KIa.d> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        boolean bool;
        if (paramObject == KIa.a.b.a) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      protected NoPermissionItemView b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        return NoPermissionItemView.u.a(paramViewGroup, this.a);
      }
    }
    
    public static final class e
      extends RGa<KIa.a.c, NoPhotosItemView>
    {
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        boolean bool;
        if (paramObject == KIa.a.c.a) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      protected NoPhotosItemView b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        return NoPhotosItemView.d.a(paramViewGroup);
      }
    }
    
    public static final class f
      extends RGa<eoa.c, RecentPhotoItemView>
    {
      private final VQa<KIa.d> a;
      
      public f(VQa<KIa.d> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        return paramObject instanceof eoa.c;
      }
      
      protected RecentPhotoItemView b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        return RecentPhotoItemView.u.a(paramViewGroup, this.a);
      }
    }
    
    public static final class g
      extends RGa<KIa.c.c, StableCollectionsItemView>
    {
      private final VQa<KIa.d> a;
      
      public g(VQa<KIa.d> paramVQa)
      {
        this.a = paramVQa;
      }
      
      protected boolean a(Object paramObject)
      {
        oXa.b(paramObject, "item");
        return paramObject instanceof KIa.c.c;
      }
      
      protected StableCollectionsItemView b(ViewGroup paramViewGroup)
      {
        oXa.b(paramViewGroup, "parent");
        return StableCollectionsItemView.a.a(paramViewGroup, this.a);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tIa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */