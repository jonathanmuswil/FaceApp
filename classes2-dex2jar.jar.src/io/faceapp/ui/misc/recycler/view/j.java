package io.faceapp.ui.misc.recycler.view;

import KOa;
import android.view.View;
import android.view.View.OnClickListener;
import bXa;
import oXa;

public final class j
  implements View.OnClickListener
{
  public j(ServerContractFailedView paramServerContractFailedView) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      ServerContractFailedView.a(this.a).b();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */