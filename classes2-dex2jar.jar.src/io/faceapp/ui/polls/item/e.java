package io.faceapp.ui.polls.item;

import KOa;
import LIa.g;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import jta;
import oXa;

public final class e
  extends View
  implements jta<LIa.g>
{
  public static final a a = new a(null);
  
  public e(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(LIa.g paramg)
  {
    oXa.b(paramg, "model");
    Object localObject = KOa.b;
    paramg = getContext();
    oXa.a(paramg, "context");
    ViewGroup.MarginLayoutParams localMarginLayoutParams = new ViewGroup.MarginLayoutParams(-1, (int)((KOa)localObject).a(paramg, 1));
    paramg = KOa.b;
    localObject = getContext();
    oXa.a(localObject, "context");
    localMarginLayoutParams.bottomMargin = ((int)paramg.a((Context)localObject, 20));
    setLayoutParams(localMarginLayoutParams);
    setBackgroundColor(getResources().getColor(2131099846));
  }
  
  public static final class a
  {
    public final e a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = paramViewGroup.getContext();
      oXa.a(paramViewGroup, "parent.context");
      return new e(paramViewGroup, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/polls/item/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */