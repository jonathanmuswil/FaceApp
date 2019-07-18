package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class os
  implements RT<Set<Bw<Yu>>>
{
  private final bU<gs> a;
  private final bU<Executor> b;
  private final bU<JSONObject> c;
  
  private os(bU<gs> parambU, bU<Executor> parambU1, bU<JSONObject> parambU2)
  {
    this.a = parambU;
    this.b = parambU1;
    this.c = parambU2;
  }
  
  public static os a(bU<gs> parambU, bU<Executor> parambU1, bU<JSONObject> parambU2)
  {
    return new os(parambU, parambU1, parambU2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/os.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */