package io.faceapp.ui.layouts.stylist.selector.item;

import KFa.b.b;
import KOa;
import LFa;
import VQa;
import android.view.View;
import android.view.View.OnClickListener;
import oXa;

public final class c
  implements View.OnClickListener
{
  public c(SelectedFilterItemView paramSelectedFilterItemView, LFa paramLFa) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      SelectedFilterItemView.a(this.a).a(new KFa.b.b(this.b.c(), this.b.a()));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/stylist/selector/item/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */