package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class ft
  extends zs
{
  private final Xb f;
  private final Runnable g;
  private final Executor h;
  
  public ft(Xb paramXb, Runnable paramRunnable, Executor paramExecutor)
  {
    this.f = paramXb;
    this.g = paramRunnable;
    this.h = paramExecutor;
  }
  
  public final void a(ViewGroup paramViewGroup, xea paramxea) {}
  
  public final void c()
  {
    gt localgt = new gt(new AtomicReference(this.g));
    this.h.execute(new ht(this, localgt));
  }
  
  public final q f()
  {
    return null;
  }
  
  public final View g()
  {
    return null;
  }
  
  public final eL h()
  {
    return null;
  }
  
  public final int i()
  {
    return 0;
  }
  
  public final void j() {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */