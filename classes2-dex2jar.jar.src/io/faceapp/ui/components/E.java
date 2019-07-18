package io.faceapp.ui.components;

import FRa;
import WVa;
import oXa;

final class e<T>
  implements FRa<WVa<? extends Integer, ? extends Integer>>
{
  public static final e a = new e();
  
  public final boolean a(WVa<Integer, Integer> paramWVa)
  {
    oXa.b(paramWVa, "it");
    boolean bool;
    if (((Number)paramWVa.c()).intValue() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */