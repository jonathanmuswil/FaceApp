package io.faceapp.ui.photo_picker.item;

import KIa.d.f;
import KOa;
import VQa;
import android.view.View;
import android.view.View.OnClickListener;
import eoa.c;
import oXa;

public final class g
  implements View.OnClickListener
{
  public g(RecentPhotoItemView paramRecentPhotoItemView, eoa.c paramc) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      RecentPhotoItemView.a(this.a).a(new KIa.d.f(this.b.a()));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/photo_picker/item/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */