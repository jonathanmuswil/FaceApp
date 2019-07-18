package io.faceapp.ui.misc.recycler.view;

import KOa;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import jta;
import oXa;
import pHa;

public final class i
  extends View
  implements jta<pHa>
{
  public static final a a = new a(null);
  
  public i(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(pHa parampHa)
  {
    oXa.b(parampHa, "model");
    KOa localKOa = KOa.b;
    Context localContext = getContext();
    oXa.a(localContext, "context");
    setLayoutParams(new ViewGroup.MarginLayoutParams(-1, (int)localKOa.a(localContext, parampHa.c())));
    setBackgroundColor(getResources().getColor(parampHa.b()));
  }
  
  public static final class a
  {
    public final i a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = paramViewGroup.getContext();
      oXa.a(paramViewGroup, "parent.context");
      return new i(paramViewGroup, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */