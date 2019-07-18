package io.faceapp.ui.misc;

import WVa;
import cWa;
import cXa;
import nsa;
import nsa.a;
import nsa.c;
import oXa;
import pXa;

final class i
  extends pXa
  implements cXa<WVa<? extends nsa.a, ? extends nsa.c>, cWa>
{
  i(e parame, nsa.a parama, j paramj)
  {
    super(1);
  }
  
  public final void a(WVa<? extends nsa.a, ? extends nsa.c> paramWVa)
  {
    oXa.b(paramWVa, "<name for destructuring parameter 0>");
    nsa.a locala = (nsa.a)paramWVa.a();
    paramWVa = (nsa.c)paramWVa.b();
    int i = f.a[paramWVa.ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        this.b.a(locala);
      }
    }
    else
    {
      paramWVa = this.d.h();
      if (paramWVa != null) {
        nsa.b.b(paramWVa, locala);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */