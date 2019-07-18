package io.faceapp.ui.image_editor.common.view;

import _Va;
import android.view.View;
import android.view.View.OnClickListener;
import cXa;
import oXa;
import oxa;

final class e
  implements View.OnClickListener
{
  e(CropTypeView paramCropTypeView) {}
  
  public final void onClick(View paramView)
  {
    cXa localcXa = CropTypeView.a(this.a);
    oXa.a(paramView, "view");
    paramView = paramView.getTag();
    if (paramView != null)
    {
      localcXa.a((oxa)paramView);
      return;
    }
    throw new _Va("null cannot be cast to non-null type io.faceapp.ui.image_editor.CropType");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */