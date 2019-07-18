package io.faceapp.ui.misc.recycler.view;

import KOa;
import android.content.Context;
import android.support.v4.widget.Space;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import jta;
import kHa;
import oXa;

public final class d
  extends Space
  implements jta<kHa>
{
  public static final a a = new a(null);
  
  public d(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(kHa paramkHa)
  {
    oXa.b(paramkHa, "model");
    KOa localKOa = KOa.b;
    Context localContext = getContext();
    oXa.a(localContext, "context");
    setLayoutParams(new ViewGroup.LayoutParams((int)localKOa.a(localContext, paramkHa.a()), -1));
  }
  
  public static final class a
  {
    public final d a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = paramViewGroup.getContext();
      oXa.a(paramViewGroup, "parent.context");
      return new d(paramViewGroup, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */