package io.faceapp.ui.layouts.selector.item;

import KOa;
import VQa;
import android.view.View;
import android.view.View.OnClickListener;
import oXa;
import sFa.b.b;
import sFa.b.e;
import yka;

public final class d
  implements View.OnClickListener
{
  public d(FilterItemView paramFilterItemView, e parame, yka paramyka) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      VQa localVQa = FilterItemView.a(this.a);
      paramView = this.b.b();
      if (c.b[paramView.ordinal()] != 1) {
        paramView = new sFa.b.b(this.c);
      } else {
        paramView = new sFa.b.e(this.c);
      }
      localVQa.a(paramView);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/selector/item/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */