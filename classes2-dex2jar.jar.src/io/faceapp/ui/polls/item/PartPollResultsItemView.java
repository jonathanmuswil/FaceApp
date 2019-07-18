package io.faceapp.ui.polls.item;

import LIa.f;
import VQa;
import Vd;
import WIa;
import WIa.a;
import WOa;
import XIa.c;
import _Va;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.I;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jta;
import mWa;
import oXa;
import zYa;

public final class PartPollResultsItemView
  extends I
  implements jta<LIa.f>
{
  private static final int[] d = { 2131689838, 2131689839, 2131689840, 2131689841 };
  private static final int[] e = { 0, 2131231026, 2131231027, 2131231028 };
  public static final a f = new a(null);
  private VQa<XIa.c> g;
  
  public PartPollResultsItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private final CharSequence a(String paramString, int paramInt)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("  ");
    ((StringBuilder)localObject).append(paramString);
    localObject = new SpannableStringBuilder(((StringBuilder)localObject).toString());
    if (Build.VERSION.SDK_INT >= 21)
    {
      ((SpannableStringBuilder)localObject).setSpan(new ImageSpan(getContext(), e[paramInt]), 0, 1, 18);
    }
    else
    {
      paramString = Vd.b(getContext(), e[paramInt]);
      if (paramString != null) {
        paramString = WOa.e.a(paramString);
      } else {
        paramString = null;
      }
      ((SpannableStringBuilder)localObject).setSpan(new ImageSpan(getContext(), paramString), 0, 1, 18);
    }
    return (CharSequence)localObject;
  }
  
  private final String a(int paramInt, List<String> paramList)
  {
    int i = paramList.size();
    String str = getContext().getString(d[i]);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append('%');
    localObject = ((StringBuilder)localObject).toString();
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            oXa.a(str, "label");
            paramList = zYa.a(zYa.a(zYa.a(zYa.a(str, "{style_1}", (String)paramList.get(0), false, 4, null), "{style_2}", (String)paramList.get(1), false, 4, null), "{style_3}", (String)paramList.get(2), false, 4, null), "{percent_with_sign}", (String)localObject, false, 4, null);
          }
          else
          {
            throw new IllegalStateException("Too big number of winners");
          }
        }
        else
        {
          oXa.a(str, "label");
          paramList = zYa.a(zYa.a(zYa.a(str, "{style_1}", (String)paramList.get(0), false, 4, null), "{style_2}", (String)paramList.get(1), false, 4, null), "{percent_with_sign}", (String)localObject, false, 4, null);
        }
      }
      else
      {
        oXa.a(str, "label");
        paramList = zYa.a(zYa.a(str, "{style_1}", (String)paramList.get(0), false, 4, null), "{percent_with_sign}", (String)localObject, false, 4, null);
      }
    }
    else
    {
      oXa.a(str, "label");
      paramList = str;
    }
    return paramList;
  }
  
  public void a(LIa.f paramf)
  {
    oXa.b(paramf, "model");
    paramf = WIa.b.a(paramf.a());
    int i = paramf.b();
    Object localObject1 = paramf.c();
    Object localObject2 = new ArrayList(mWa.a((Iterable)localObject1, 10));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      int j = ((Number)((Iterator)localObject1).next()).intValue();
      ((Collection)localObject2).add(getContext().getString(WIa.b.a(j)));
    }
    localObject2 = a(i, (List)localObject2);
    if (paramf.c().size() == 0) {
      setText((CharSequence)localObject2);
    } else {
      setText(a((String)localObject2, paramf.c().size()), TextView.BufferType.SPANNABLE);
    }
  }
  
  public static final class a
  {
    public final PartPollResultsItemView a(ViewGroup paramViewGroup, VQa<XIa.c> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "viewActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493050, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (PartPollResultsItemView)paramViewGroup;
        PartPollResultsItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.polls.item.PartPollResultsItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/polls/item/PartPollResultsItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */