package io.faceapp;

import DRa;
import Ro;
import android.net.NetworkInfo.State;
import oXa;

final class g<T, R>
  implements DRa<T, R>
{
  public static final g a = new g();
  
  public final boolean a(Ro paramRo)
  {
    oXa.b(paramRo, "conn");
    boolean bool;
    if (paramRo.b() == NetworkInfo.State.CONNECTED) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/io/faceapp/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */