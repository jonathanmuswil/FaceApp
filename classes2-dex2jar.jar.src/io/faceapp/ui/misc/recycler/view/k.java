package io.faceapp.ui.misc.recycler.view;

import KOa;
import android.content.Context;
import android.support.v4.widget.Space;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import jta;
import oXa;
import sHa;

public final class k
  extends Space
  implements jta<sHa>
{
  public static final a a = new a(null);
  
  public k(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(sHa paramsHa)
  {
    oXa.b(paramsHa, "model");
    KOa localKOa = KOa.b;
    Context localContext = getContext();
    oXa.a(localContext, "context");
    setLayoutParams(new ViewGroup.LayoutParams(-1, (int)localKOa.a(localContext, paramsHa.a())));
  }
  
  public static final class a
  {
    public final k a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = paramViewGroup.getContext();
      oXa.a(paramViewGroup, "parent.context");
      return new k(paramViewGroup, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */