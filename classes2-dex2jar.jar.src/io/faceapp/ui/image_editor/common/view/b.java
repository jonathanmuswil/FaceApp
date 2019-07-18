package io.faceapp.ui.image_editor.common.view;

import DRa;
import android.view.MotionEvent;
import oXa;

final class b<T, R>
  implements DRa<T, R>
{
  public static final b a = new b();
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    oXa.b(paramMotionEvent, "it");
    boolean bool;
    if ((paramMotionEvent.getAction() != 0) && (paramMotionEvent.getAction() != 2)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */