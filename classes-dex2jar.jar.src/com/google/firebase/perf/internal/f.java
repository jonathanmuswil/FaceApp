package com.google.firebase.perf.internal;

import Tv;
import java.lang.ref.WeakReference;

public class f
  implements a.a
{
  private a zzce;
  private Tv zzcf = Tv.a;
  private boolean zzcg = false;
  private WeakReference<a.a> zzch;
  
  protected f()
  {
    this(a.a());
  }
  
  protected f(a parama)
  {
    this.zzce = parama;
    this.zzch = new WeakReference(this);
  }
  
  public final Tv zzal()
  {
    return this.zzcf;
  }
  
  protected final void zzao()
  {
    if (this.zzcg) {
      return;
    }
    this.zzcf = this.zzce.c();
    this.zzce.a(this.zzch);
    this.zzcg = true;
  }
  
  protected final void zzap()
  {
    if (!this.zzcg) {
      return;
    }
    this.zzce.b(this.zzch);
    this.zzcg = false;
  }
  
  public void zzb(Tv paramTv)
  {
    Tv localTv1 = this.zzcf;
    Tv localTv2 = Tv.a;
    if (localTv1 == localTv2)
    {
      this.zzcf = paramTv;
      return;
    }
    if ((localTv1 != paramTv) && (paramTv != localTv2)) {
      this.zzcf = Tv.d;
    }
  }
  
  protected final void zzc(int paramInt)
  {
    this.zzce.a(1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */