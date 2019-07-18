package io.faceapp.ui.image_editor.filter_editor;

import ARa;
import io.faceapp.k;
import io.faceapp.ui.image_editor.common.view.g;
import oXa;

final class h<T>
  implements ARa<Boolean>
{
  h(f paramf) {}
  
  public final void a(Boolean paramBoolean)
  {
    FilterStrengthView localFilterStrengthView = (FilterStrengthView)this.a.f(k.strengthView);
    oXa.a(localFilterStrengthView, "strengthView");
    g.a(localFilterStrengthView, paramBoolean.booleanValue() ^ true);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */