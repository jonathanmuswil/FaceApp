package io.faceapp.ui.image_editor.common.view;

import ARa;
import UPa;
import _Va;
import oXa;

final class n<T>
  implements ARa<Object>
{
  n(ResultingBitmapView paramResultingBitmapView) {}
  
  public final void accept(Object paramObject)
  {
    Object localObject = ResultingBitmapView.b(this.a);
    if (localObject != null)
    {
      localObject = (ResultingBitmapView.c)localObject;
      oXa.a(paramObject, "it");
      ((ResultingBitmapView.c)localObject).a(paramObject);
      UPa.c(ResultingBitmapView.b(this.a), 0L, 1, null);
      return;
    }
    throw new _Va("null cannot be cast to non-null type io.faceapp.ui.image_editor.common.view.ResultingBitmapView.ContentView");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */