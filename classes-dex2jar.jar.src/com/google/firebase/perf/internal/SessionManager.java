package com.google.firebase.perf.internal;

import Tv;
import android.annotation.SuppressLint;
import android.support.annotation.Keep;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Keep
public class SessionManager
  extends f
{
  @SuppressLint({"StaticFieldLeak"})
  private static final SessionManager zzfq = new SessionManager();
  private final GaugeManager zzbk;
  private final a zzcx;
  private final Set<WeakReference<e>> zzfr = new HashSet();
  private x zzfs;
  
  private SessionManager()
  {
    this(GaugeManager.zzbe(), x.m(), a.a());
  }
  
  private SessionManager(GaugeManager paramGaugeManager, x paramx, a parama)
  {
    this.zzbk = paramGaugeManager;
    this.zzfs = paramx;
    this.zzcx = parama;
    zzao();
  }
  
  public static SessionManager zzcl()
  {
    return zzfq;
  }
  
  private final void zzd(Tv paramTv)
  {
    if (this.zzfs.o())
    {
      this.zzbk.zza(this.zzfs.n(), paramTv);
      return;
    }
    this.zzbk.zzbf();
  }
  
  public final void zzb(Tv paramTv)
  {
    super.zzb(paramTv);
    if (this.zzcx.b()) {
      return;
    }
    if (paramTv == Tv.b)
    {
      zzc(paramTv);
      return;
    }
    if (!zzcn()) {
      zzd(paramTv);
    }
  }
  
  public final void zzc(Tv paramTv)
  {
    this.zzfs = x.m();
    synchronized (this.zzfr)
    {
      Iterator localIterator = this.zzfr.iterator();
      while (localIterator.hasNext())
      {
        e locale = (e)((WeakReference)localIterator.next()).get();
        if (locale != null) {
          locale.a(this.zzfs);
        } else {
          localIterator.remove();
        }
      }
      if (this.zzfs.o()) {
        this.zzbk.zzc(this.zzfs.n(), paramTv);
      }
      zzd(paramTv);
      return;
    }
  }
  
  public final void zzc(WeakReference<e> paramWeakReference)
  {
    synchronized (this.zzfr)
    {
      this.zzfr.add(paramWeakReference);
      return;
    }
  }
  
  public final x zzcm()
  {
    return this.zzfs;
  }
  
  final boolean zzcn()
  {
    if (this.zzfs.l())
    {
      zzc(this.zzcx.c());
      return true;
    }
    return false;
  }
  
  public final void zzd(WeakReference<e> paramWeakReference)
  {
    synchronized (this.zzfr)
    {
      this.zzfr.remove(paramWeakReference);
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/internal/SessionManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */