package io.faceapp.ui.image_editor.filter_editor;

import ARa;
import io.faceapp.k;
import io.faceapp.ui.image_editor.common.view.ValueRangeView;
import oXa;

final class g<T>
  implements ARa<Boolean>
{
  g(f paramf) {}
  
  public final void a(Boolean paramBoolean)
  {
    ValueRangeView localValueRangeView = (ValueRangeView)this.a.f(k.intensityView);
    oXa.a(localValueRangeView, "intensityView");
    io.faceapp.ui.image_editor.common.view.g.a(localValueRangeView, paramBoolean.booleanValue() ^ true);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */