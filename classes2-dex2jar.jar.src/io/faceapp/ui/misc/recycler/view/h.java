package io.faceapp.ui.misc.recycler.view;

import KOa;
import android.view.View;
import android.view.View.OnClickListener;
import bXa;
import oXa;

public final class h
  implements View.OnClickListener
{
  public h(LoadingMoreErrorView paramLoadingMoreErrorView) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      LoadingMoreErrorView.a(this.a).b();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */