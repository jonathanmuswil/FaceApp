package io.faceapp.ui.photo_picker.item;

import KIa.c.c;
import KIa.d;
import VQa;
import _Va;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import io.faceapp.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jta;
import mWa;
import oXa;

public final class StableCollectionsItemView
  extends LinearLayout
  implements jta<KIa.c.c>
{
  public static final a a = new a(null);
  private VQa<KIa.d> b;
  private HashMap c;
  
  public StableCollectionsItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(KIa.c.c paramc)
  {
    oXa.b(paramc, "model");
    Object localObject1 = (PhotosCollectionItemView)b(k.collection0);
    int i = 0;
    Object localObject2 = mWa.b(new PhotosCollectionItemView[] { localObject1, (PhotosCollectionItemView)b(k.collection1), (PhotosCollectionItemView)b(k.collection2) });
    localObject1 = new ArrayList(mWa.a((Iterable)localObject2, 10));
    Object localObject3 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (PhotosCollectionItemView)((Iterator)localObject3).next();
      if (localObject2 != null) {
        ((Collection)localObject1).add(localObject2);
      } else {
        throw new _Va("null cannot be cast to non-null type io.faceapp.ui.photo_picker.item.PhotosCollectionItemView");
      }
    }
    Iterator localIterator = ((Iterable)localObject1).iterator();
    while (localIterator.hasNext())
    {
      localObject3 = (PhotosCollectionItemView)localIterator.next();
      localObject2 = this.b;
      if (localObject2 != null)
      {
        ((PhotosCollectionItemView)localObject3).setViewActions((VQa)localObject2);
      }
      else
      {
        oXa.b("viewActions");
        throw null;
      }
    }
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      if (i >= 0)
      {
        ((PhotosCollectionItemView)localObject2).a((d)paramc.a().get(i));
        i++;
      }
      else
      {
        mWa.c();
        throw null;
      }
    }
  }
  
  public View b(int paramInt)
  {
    if (this.c == null) {
      this.c = new HashMap();
    }
    View localView1 = (View)this.c.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.c.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static final class a
  {
    public final StableCollectionsItemView a(ViewGroup paramViewGroup, VQa<KIa.d> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "viewActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493114, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (StableCollectionsItemView)paramViewGroup;
        StableCollectionsItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.photo_picker.item.StableCollectionsItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/photo_picker/item/StableCollectionsItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */