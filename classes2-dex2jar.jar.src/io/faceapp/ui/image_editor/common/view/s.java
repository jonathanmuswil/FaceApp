package io.faceapp.ui.image_editor.common.view;

import ARa;
import cXa;
import dXa;
import oXa;
import pya;

final class s<T>
  implements ARa<Integer>
{
  s(ValueRangeView paramValueRangeView) {}
  
  public final void a(Integer paramInteger)
  {
    pya localpya = ValueRangeView.d(this.a);
    if (localpya != null)
    {
      dXa localdXa = ValueRangeView.c(this.a);
      cXa localcXa = localpya.e();
      oXa.a(paramInteger, "progress");
      localdXa.a(localpya, localcXa.a(paramInteger));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */