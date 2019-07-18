package io.faceapp.ui.photo_picker.item;

import KIa.d.b;
import KIa.d.c;
import KIa.d.d;
import KIa.d.e;
import KOa;
import UVa;
import VQa;
import android.view.View;
import android.view.View.OnClickListener;
import oXa;

public final class f
  implements View.OnClickListener
{
  public f(PhotosCollectionItemView paramPhotosCollectionItemView, d paramd) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      paramView = this.b.g();
      int i = e.a[paramView.ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i == 4) {
              paramView = KIa.d.e.a;
            } else {
              throw new UVa();
            }
          }
          else {
            paramView = KIa.d.c.a;
          }
        }
        else {
          paramView = KIa.d.b.a;
        }
      }
      else {
        paramView = KIa.d.d.a;
      }
      this.a.getViewActions().a(paramView);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/photo_picker/item/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */