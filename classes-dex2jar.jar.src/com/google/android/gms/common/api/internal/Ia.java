package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.l;

public final class ia<O extends a.d>
  extends x
{
  private final e<O> c;
  
  public ia(e<O> parame)
  {
    super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    this.c = parame;
  }
  
  public final <A extends a.b, R extends l, T extends c<R, A>> T a(T paramT)
  {
    this.c.b(paramT);
    return paramT;
  }
  
  public final void a(va paramva) {}
  
  public final <A extends a.b, T extends c<? extends l, A>> T b(T paramT)
  {
    this.c.c(paramT);
    return paramT;
  }
  
  public final Context f()
  {
    return this.c.d();
  }
  
  public final Looper g()
  {
    return this.c.f();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/ia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */