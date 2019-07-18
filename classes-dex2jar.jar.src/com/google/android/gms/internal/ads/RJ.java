package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.k;

@yh
public final class rj
  implements mca
{
  private final Context a;
  private final Object b;
  private String c;
  private boolean d;
  
  public rj(Context paramContext, String paramString)
  {
    Context localContext = paramContext;
    if (paramContext.getApplicationContext() != null) {
      localContext = paramContext.getApplicationContext();
    }
    this.a = localContext;
    this.c = paramString;
    this.d = false;
    this.b = new Object();
  }
  
  public final void a(lca paramlca)
  {
    f(paramlca.m);
  }
  
  public final void f(boolean paramBoolean)
  {
    if (!k.A().f(this.a)) {
      return;
    }
    synchronized (this.b)
    {
      if (this.d == paramBoolean) {
        return;
      }
      this.d = paramBoolean;
      if (TextUtils.isEmpty(this.c)) {
        return;
      }
      if (this.d) {
        k.A().a(this.a, this.c);
      } else {
        k.A().b(this.a, this.c);
      }
      return;
    }
  }
  
  public final String h()
  {
    return this.c;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */