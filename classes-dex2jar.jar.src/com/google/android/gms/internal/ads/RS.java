package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class rs
  implements mca
{
  private sp a;
  private final Executor b;
  private final es c;
  private final e d;
  private boolean e = false;
  private boolean f = false;
  private is g = new is();
  
  public rs(Executor paramExecutor, es parames, e parame)
  {
    this.b = paramExecutor;
    this.c = parames;
    this.d = parame;
  }
  
  private final void l()
  {
    try
    {
      JSONObject localJSONObject = this.c.a(this.g);
      if (this.a != null)
      {
        Executor localExecutor = this.b;
        ss localss = new com/google/android/gms/internal/ads/ss;
        localss.<init>(this, localJSONObject);
        localExecutor.execute(localss);
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      mk.e("Failed to call video active view js", localJSONException);
    }
  }
  
  public final void a(lca paramlca)
  {
    is localis = this.g;
    boolean bool;
    if (this.f) {
      bool = false;
    } else {
      bool = paramlca.m;
    }
    localis.a = bool;
    this.g.d = this.d.b();
    this.g.f = paramlca;
    if (this.e) {
      l();
    }
  }
  
  public final void a(sp paramsp)
  {
    this.a = paramsp;
  }
  
  public final void f(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public final void h()
  {
    this.e = false;
  }
  
  public final void k()
  {
    this.e = true;
    l();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */