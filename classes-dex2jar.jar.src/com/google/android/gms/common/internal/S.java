package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import nP;
import oP;

public class s
{
  private static final b a = new C();
  
  public static <R extends l, T extends k<R>> nP<T> a(g<R> paramg, T paramT)
  {
    return a(paramg, new E(paramT));
  }
  
  public static <R extends l, T> nP<T> a(g<R> paramg, a<R, T> parama)
  {
    b localb = a;
    oP localoP = new oP();
    paramg.a(new D(paramg, localoP, parama, localb));
    return localoP.a();
  }
  
  public static abstract interface a<R extends l, T>
  {
    public abstract T a(R paramR);
  }
  
  public static abstract interface b
  {
    public abstract b a(Status paramStatus);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */