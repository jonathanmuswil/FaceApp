package io.faceapp.ui.misc;

import cWa;
import cXa;
import io.faceapp.m;
import nsa.b;
import oXa;
import pXa;
import sla;

final class h
  extends pXa
  implements cXa<nsa.b, cWa>
{
  h(e parame, j paramj, boolean paramBoolean)
  {
    super(1);
  }
  
  public final void a(nsa.b paramb)
  {
    oXa.b(paramb, "it");
    m localm = this.c.getRouter();
    if (localm != null) {
      localm.a(paramb, this.b.h(), this.d);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */