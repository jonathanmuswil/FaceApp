package io.faceapp.ui.layouts.selector.item;

import KOa;
import VQa;
import android.view.View;
import android.view.View.OnClickListener;
import oXa;
import sFa.b.g;

public final class g
  implements View.OnClickListener
{
  public g(PhotoItemView paramPhotoItemView, m paramm) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      PhotoItemView.a(this.a).a(new sFa.b.g(this.b.a()));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/selector/item/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */