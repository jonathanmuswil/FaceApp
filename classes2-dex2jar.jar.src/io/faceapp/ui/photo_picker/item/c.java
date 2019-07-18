package io.faceapp.ui.photo_picker.item;

import KIa.d.g;
import KOa;
import VQa;
import android.view.View;
import android.view.View.OnClickListener;
import oXa;

public final class c
  implements View.OnClickListener
{
  public c(NoPermissionItemView paramNoPermissionItemView) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      NoPermissionItemView.a(this.a).a(KIa.d.g.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/photo_picker/item/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */