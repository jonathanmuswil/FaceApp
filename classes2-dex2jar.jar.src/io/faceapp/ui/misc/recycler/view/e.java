package io.faceapp.ui.misc.recycler.view;

import KOa;
import Rja;
import android.view.View;
import android.view.View.OnClickListener;
import cXa;
import oXa;

public final class e
  implements View.OnClickListener
{
  public e(ImageDescItemView paramImageDescItemView, Rja paramRja) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      ImageDescItemView.a(this.a).a(this.b);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */