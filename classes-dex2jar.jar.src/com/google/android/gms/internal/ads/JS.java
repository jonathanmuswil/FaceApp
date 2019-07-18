package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import java.util.concurrent.Executor;

public final class js
  implements RT<gs>
{
  private final bU<Ue> a;
  private final bU<es> b;
  private final bU<Executor> c;
  private final bU<bs> d;
  private final bU<e> e;
  
  private js(bU<Ue> parambU, bU<es> parambU1, bU<Executor> parambU2, bU<bs> parambU3, bU<e> parambU4)
  {
    this.a = parambU;
    this.b = parambU1;
    this.c = parambU2;
    this.d = parambU3;
    this.e = parambU4;
  }
  
  public static js a(bU<Ue> parambU, bU<es> parambU1, bU<Executor> parambU2, bU<bs> parambU3, bU<e> parambU4)
  {
    return new js(parambU, parambU1, parambU2, parambU3, parambU4);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/js.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */