package io.faceapp.ui.layouts.stylist.selector.item;

import CWa;
import KFa.b;
import KOa;
import LFa;
import MFa;
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
import io.faceapp.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jta;
import mWa;
import oXa;

public final class StylistSectionView
  extends LinearLayout
  implements jta<MFa>
{
  public static final a a = new a(null);
  private VQa<KFa.b> b;
  private HashMap c;
  
  public StylistSectionView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private final Space b()
  {
    Space localSpace = new Space(getContext());
    KOa localKOa = KOa.b;
    Context localContext = localSpace.getContext();
    oXa.a(localContext, "context");
    localSpace.setLayoutParams(new LinearLayout.LayoutParams((int)localKOa.a(localContext, 8), -1));
    return localSpace;
  }
  
  private final void b(List<LFa> paramList)
  {
    Object localObject1 = (LinearLayout)b(k.filtersContainer);
    oXa.a(localObject1, "filtersContainer");
    if (((LinearLayout)localObject1).getChildCount() == 0)
    {
      ((LinearLayout)b(k.filtersContainer)).addView(b());
      ((LinearLayout)b(k.filtersContainer)).addView(b());
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
        localObject1 = (LFa)localObject1;
        Object localObject2 = ((LinearLayout)b(k.filtersContainer)).getChildAt(j);
        if (localObject2 != null)
        {
          localObject2 = (AvailableFilterItemView)localObject2;
          ((AvailableFilterItemView)localObject2).a((LFa)localObject1);
          UPa.e((View)localObject2);
          i = j;
        }
        else
        {
          throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.stylist.selector.item.AvailableFilterItemView");
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
    Object localObject1 = (LinearLayout)b(k.filtersContainer);
    oXa.a(localObject1, "filtersContainer");
    int i = ((LinearLayout)localObject1).getChildCount();
    int j = paramInt + 2;
    Object localObject2;
    Object localObject3;
    if (i < j)
    {
      localObject1 = (LinearLayout)b(k.filtersContainer);
      oXa.a(localObject1, "filtersContainer");
      localObject1 = NXa.d(0, j - ((LinearLayout)localObject1).getChildCount()).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        ((CWa)localObject1).nextInt();
        localObject2 = AvailableFilterItemView.u;
        LinearLayout localLinearLayout = (LinearLayout)b(k.filtersContainer);
        oXa.a(localLinearLayout, "filtersContainer");
        localObject3 = this.b;
        if (localObject3 != null)
        {
          localObject2 = ((AvailableFilterItemView.a)localObject2).a(localLinearLayout, (VQa)localObject3);
          ((LinearLayout)b(k.filtersContainer)).addView((View)localObject2, 1);
        }
        else
        {
          oXa.b("screenActions");
          throw null;
        }
      }
    }
    localObject1 = (LinearLayout)b(k.filtersContainer);
    oXa.a(localObject1, "filtersContainer");
    if (((LinearLayout)localObject1).getChildCount() > j)
    {
      localObject1 = (LinearLayout)b(k.filtersContainer);
      oXa.a(localObject1, "filtersContainer");
      localObject1 = NXa.d(0, ((LinearLayout)localObject1).getChildCount() - 2 - paramInt).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramInt = ((CWa)localObject1).nextInt();
        localObject2 = (LinearLayout)b(k.filtersContainer);
        localObject3 = (LinearLayout)b(k.filtersContainer);
        oXa.a(localObject3, "filtersContainer");
        localObject2 = ((LinearLayout)localObject2).getChildAt(((LinearLayout)localObject3).getChildCount() - 2 - paramInt);
        oXa.a(localObject2, "filterView");
        UPa.a((View)localObject2);
      }
    }
  }
  
  public final List<View> a()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add((TextView)b(k.sectionName));
    Object localObject1 = (LinearLayout)b(k.filtersContainer);
    oXa.a(localObject1, "filtersContainer");
    Object localObject2 = NXa.d(1, ((LinearLayout)localObject1).getChildCount() - 1);
    localObject1 = new ArrayList(mWa.a((Iterable)localObject2, 10));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      int i = ((CWa)localObject2).nextInt();
      ((Collection)localObject1).add(((LinearLayout)b(k.filtersContainer)).getChildAt(i));
    }
    localArrayList.addAll((Collection)localObject1);
    return localArrayList;
  }
  
  public void a(MFa paramMFa)
  {
    oXa.b(paramMFa, "model");
    TextView localTextView = (TextView)b(k.sectionName);
    oXa.a(localTextView, "sectionName");
    localTextView.setText(paramMFa.c());
    b(paramMFa.a());
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
    public final StylistSectionView a(ViewGroup paramViewGroup, VQa<KFa.b> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "screenActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493152, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (StylistSectionView)paramViewGroup;
        StylistSectionView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.stylist.selector.item.StylistSectionView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/stylist/selector/item/StylistSectionView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */