package io.faceapp.ui.layouts.selector.item;

import CWa;
import Ika;
import KOa;
import NXa;
import UPa;
import VQa;
import _Va;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Space;
import android.widget.TextView;
import io.faceapp.ui.misc.k.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jta;
import mWa;
import oXa;
import sFa.b;
import yka;
import zka;

public final class SectionItemView
  extends LinearLayout
  implements jta<n>
{
  public static final a a = new a(null);
  private VQa<sFa.b> b;
  private HashMap c;
  
  public SectionItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private final Space a()
  {
    Space localSpace = new Space(getContext());
    KOa localKOa = KOa.b;
    Context localContext = localSpace.getContext();
    oXa.a(localContext, "context");
    localSpace.setLayoutParams(new LinearLayout.LayoutParams((int)localKOa.a(localContext, 8), -1));
    return localSpace;
  }
  
  private final void a(List<Ika> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = (LinearLayout)b(io.faceapp.k.filtersContainer);
    oXa.a(localObject1, "filtersContainer");
    if (((LinearLayout)localObject1).getChildCount() == 0)
    {
      ((LinearLayout)b(io.faceapp.k.filtersContainer)).addView(a());
      ((LinearLayout)b(io.faceapp.k.filtersContainer)).addView(a());
    }
    c(paramList.size());
    int i = 0;
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      localObject1 = paramList.next();
      int j = i + 1;
      if (i >= 0)
      {
        localObject1 = (Ika)localObject1;
        Object localObject2 = ((LinearLayout)b(io.faceapp.k.filtersContainer)).getChildAt(j);
        if (localObject2 != null)
        {
          localObject2 = (FilterItemView)localObject2;
          ((FilterItemView)localObject2).a(new e((Ika)localObject1, io.faceapp.ui.misc.k.d.a(paramBoolean1, ((Ika)localObject1).a().d(), paramBoolean2)));
          UPa.e((View)localObject2);
          i = j;
        }
        else
        {
          throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.selector.item.FilterItemView");
        }
      }
      else
      {
        mWa.c();
        throw null;
      }
    }
  }
  
  private final void c(int paramInt)
  {
    Object localObject1 = (LinearLayout)b(io.faceapp.k.filtersContainer);
    oXa.a(localObject1, "filtersContainer");
    int i = ((LinearLayout)localObject1).getChildCount();
    int j = paramInt + 2;
    Object localObject2;
    Object localObject3;
    if (i < j)
    {
      localObject1 = (LinearLayout)b(io.faceapp.k.filtersContainer);
      oXa.a(localObject1, "filtersContainer");
      localObject1 = NXa.d(0, j - ((LinearLayout)localObject1).getChildCount()).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        ((CWa)localObject1).nextInt();
        localObject2 = FilterItemView.u;
        LinearLayout localLinearLayout = (LinearLayout)b(io.faceapp.k.filtersContainer);
        oXa.a(localLinearLayout, "filtersContainer");
        localObject3 = this.b;
        if (localObject3 != null)
        {
          localObject3 = ((FilterItemView.a)localObject2).a(localLinearLayout, (VQa)localObject3);
          ((LinearLayout)b(io.faceapp.k.filtersContainer)).addView((View)localObject3, 1);
        }
        else
        {
          oXa.b("screenActions");
          throw null;
        }
      }
    }
    localObject1 = (LinearLayout)b(io.faceapp.k.filtersContainer);
    oXa.a(localObject1, "filtersContainer");
    if (((LinearLayout)localObject1).getChildCount() > j)
    {
      localObject1 = (LinearLayout)b(io.faceapp.k.filtersContainer);
      oXa.a(localObject1, "filtersContainer");
      localObject1 = NXa.d(0, ((LinearLayout)localObject1).getChildCount() - 2 - paramInt).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramInt = ((CWa)localObject1).nextInt();
        localObject2 = (LinearLayout)b(io.faceapp.k.filtersContainer);
        localObject3 = (LinearLayout)b(io.faceapp.k.filtersContainer);
        oXa.a(localObject3, "filtersContainer");
        localObject3 = ((LinearLayout)localObject2).getChildAt(((LinearLayout)localObject3).getChildCount() - 2 - paramInt);
        oXa.a(localObject3, "filterView");
        UPa.a((View)localObject3);
      }
    }
  }
  
  public void a(n paramn)
  {
    oXa.b(paramn, "model");
    TextView localTextView = (TextView)b(io.faceapp.k.sectionName);
    oXa.a(localTextView, "sectionName");
    localTextView.setText(paramn.b().c());
    a(paramn.b().a(), paramn.c(), paramn.a());
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
    public final SectionItemView a(ViewGroup paramViewGroup, VQa<sFa.b> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "screenActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493120, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (SectionItemView)paramViewGroup;
        SectionItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.selector.item.SectionItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/selector/item/SectionItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */