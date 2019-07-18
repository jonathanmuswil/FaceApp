package io.faceapp.ui.misc;

import cWa;
import cXa;
import oXa;
import pXa;

final class g
  extends pXa
  implements cXa<Boolean, cWa>
{
  g(e parame, boolean paramBoolean)
  {
    super(1);
  }
  
  public final void a(Boolean paramBoolean)
  {
    oXa.a(paramBoolean, "isGranted");
    if (paramBoolean.booleanValue()) {
      e.a(this.b, this.c);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */