package io.faceapp.ui.misc.recycler.view;

import _Va;
import android.content.Context;
import android.support.v7.widget.I;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import jta;
import oXa;
import rHa;

public class FullscreenLabelView
  extends I
  implements jta<rHa>
{
  public static final a d = new a(null);
  
  public FullscreenLabelView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(rHa paramrHa)
  {
    oXa.b(paramrHa, "model");
    setText(paramrHa.a());
  }
  
  public void ha() {}
  
  public static final class a
  {
    public final FullscreenLabelView a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493122, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (FullscreenLabelView)paramViewGroup;
        paramViewGroup.ha();
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.misc.recycler.view.FullscreenLabelView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/FullscreenLabelView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */