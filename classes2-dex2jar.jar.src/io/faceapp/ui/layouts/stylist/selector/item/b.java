package io.faceapp.ui.layouts.stylist.selector.item;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import io.faceapp.ui.misc.recycler.view.FullscreenLabelView;
import io.faceapp.ui.misc.recycler.view.FullscreenLabelView.a;
import oXa;

public final class b
  extends FullscreenLabelView
{
  public static final a e = new a(null);
  
  public void ha()
  {
    super.ha();
    setTextSize(15.0F);
    setTextColor(getResources().getColor(2131099842));
  }
  
  public static final class a
  {
    public final FullscreenLabelView a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      return FullscreenLabelView.d.a(paramViewGroup);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/stylist/selector/item/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */