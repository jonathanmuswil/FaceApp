package io.faceapp.ui.photo_picker.item;

import KIa.d.a;
import KOa;
import VQa;
import android.view.View;
import android.view.View.OnClickListener;
import oXa;

public final class b
  implements View.OnClickListener
{
  public b(CameraItemView paramCameraItemView) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      CameraItemView.a(this.a).a(KIa.d.a.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/photo_picker/item/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */