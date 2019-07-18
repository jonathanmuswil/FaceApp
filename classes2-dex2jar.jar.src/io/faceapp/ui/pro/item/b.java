package io.faceapp.ui.pro.item;

import KOa;
import RJa.b.b;
import VQa;
import android.view.View;
import android.view.View.OnClickListener;
import oXa;

public final class b
  implements View.OnClickListener
{
  public b(ProItemView paramProItemView, a parama) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      paramView = this.a.getViewActions();
      if (paramView != null) {
        paramView.a(new RJa.b.b(this.b.e()));
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/pro/item/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */