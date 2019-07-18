package io.faceapp.ui.image_editor.filter_editor;

import GVa;
import cWa;
import dXa;
import oXa;
import pXa;
import wza;

final class j
  extends pXa
  implements dXa<String, String, cWa>
{
  j(f paramf)
  {
    super(2);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "id");
    oXa.b(paramString2, "subId");
    this.b.getViewActions().a(new s.b.d(paramString1, paramString2));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */