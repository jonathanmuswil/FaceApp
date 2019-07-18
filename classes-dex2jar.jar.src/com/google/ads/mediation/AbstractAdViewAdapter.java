package com.google.ads.mediation;

import Ap;
import Jp;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.d.a;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.i;
import com.google.android.gms.ads.mediation.A;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.f.a;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.ads.mediation.r;
import com.google.android.gms.ads.mediation.s;
import com.google.android.gms.ads.mediation.t;
import com.google.android.gms.ads.mediation.u;
import com.google.android.gms.ads.mediation.x;
import com.google.android.gms.ads.mediation.y;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.Hl;
import com.google.android.gms.internal.ads.Kea;
import com.google.android.gms.internal.ads.Tl;
import com.google.android.gms.internal.ads.kea;
import com.google.android.gms.internal.ads.q;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.zzbjm;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kp;
import tp;
import up;
import vp;
import vp.a;
import wp;
import wp.a;
import xp;
import xp.a;
import xp.b;
import zp;
import zp.a;

@yh
public abstract class AbstractAdViewAdapter
  implements MediationBannerAdapter, MediationNativeAdapter, x, A, MediationRewardedVideoAdAdapter, zzbjm
{
  public static final String AD_UNIT_ID_PARAMETER = "pubid";
  private f zzmd;
  private i zzme;
  private c zzmf;
  private Context zzmg;
  private i zzmh;
  private com.google.android.gms.ads.reward.mediation.a zzmi;
  private final Jp zzmj = new a(this);
  
  private final d zza(Context paramContext, com.google.android.gms.ads.mediation.e parame, Bundle paramBundle1, Bundle paramBundle2)
  {
    d.a locala = new d.a();
    Object localObject = parame.g();
    if (localObject != null) {
      locala.a((Date)localObject);
    }
    int i = parame.l();
    if (i != 0) {
      locala.a(i);
    }
    localObject = parame.i();
    if (localObject != null)
    {
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        locala.a((String)((Iterator)localObject).next());
      }
    }
    localObject = parame.getLocation();
    if (localObject != null) {
      locala.a((Location)localObject);
    }
    if (parame.h())
    {
      Kea.a();
      locala.b(Hl.a(paramContext));
    }
    if (parame.c() != -1)
    {
      i = parame.c();
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      locala.b(bool);
    }
    locala.a(parame.e());
    locala.a(AdMobAdapter.class, zza(paramBundle1, paramBundle2));
    return locala.a();
  }
  
  public String getAdUnitId(Bundle paramBundle)
  {
    return paramBundle.getString("pubid");
  }
  
  public View getBannerView()
  {
    return this.zzmd;
  }
  
  public Bundle getInterstitialAdapterInfo()
  {
    f.a locala = new f.a();
    locala.a(1);
    return locala.a();
  }
  
  public q getVideoController()
  {
    Object localObject = this.zzmd;
    if (localObject != null)
    {
      localObject = ((f)localObject).getVideoController();
      if (localObject != null) {
        return ((com.google.android.gms.ads.m)localObject).a();
      }
    }
    return null;
  }
  
  public void initialize(Context paramContext, com.google.android.gms.ads.mediation.e parame, String paramString, com.google.android.gms.ads.reward.mediation.a parama, Bundle paramBundle1, Bundle paramBundle2)
  {
    this.zzmg = paramContext.getApplicationContext();
    this.zzmi = parama;
    this.zzmi.f(this);
  }
  
  public boolean isInitialized()
  {
    return this.zzmi != null;
  }
  
  public void loadAd(com.google.android.gms.ads.mediation.e parame, Bundle paramBundle1, Bundle paramBundle2)
  {
    Context localContext = this.zzmg;
    if ((localContext != null) && (this.zzmi != null))
    {
      this.zzmh = new i(localContext);
      this.zzmh.b(true);
      this.zzmh.a(getAdUnitId(paramBundle1));
      this.zzmh.a(this.zzmj);
      this.zzmh.a(new b(this));
      this.zzmh.a(zza(this.zzmg, parame, paramBundle2, paramBundle1));
      return;
    }
    Tl.b("AdMobAdapter.loadAd called before initialize.");
  }
  
  public void onDestroy()
  {
    f localf = this.zzmd;
    if (localf != null)
    {
      localf.a();
      this.zzmd = null;
    }
    if (this.zzme != null) {
      this.zzme = null;
    }
    if (this.zzmf != null) {
      this.zzmf = null;
    }
    if (this.zzmh != null) {
      this.zzmh = null;
    }
  }
  
  public void onImmersiveModeUpdated(boolean paramBoolean)
  {
    i locali = this.zzme;
    if (locali != null) {
      locali.a(paramBoolean);
    }
    locali = this.zzmh;
    if (locali != null) {
      locali.a(paramBoolean);
    }
  }
  
  public void onPause()
  {
    f localf = this.zzmd;
    if (localf != null) {
      localf.b();
    }
  }
  
  public void onResume()
  {
    f localf = this.zzmd;
    if (localf != null) {
      localf.c();
    }
  }
  
  public void requestBannerAd(Context paramContext, h paramh, Bundle paramBundle1, com.google.android.gms.ads.e parame, com.google.android.gms.ads.mediation.e parame1, Bundle paramBundle2)
  {
    this.zzmd = new f(paramContext);
    this.zzmd.setAdSize(new com.google.android.gms.ads.e(parame.b(), parame.a()));
    this.zzmd.setAdUnitId(getAdUnitId(paramBundle1));
    this.zzmd.setAdListener(new d(this, paramh));
    this.zzmd.a(zza(paramContext, parame1, paramBundle2, paramBundle1));
  }
  
  public void requestInterstitialAd(Context paramContext, com.google.android.gms.ads.mediation.m paramm, Bundle paramBundle1, com.google.android.gms.ads.mediation.e parame, Bundle paramBundle2)
  {
    this.zzme = new i(paramContext);
    this.zzme.a(getAdUnitId(paramBundle1));
    this.zzme.a(new e(this, paramm));
    this.zzme.a(zza(paramContext, parame, paramBundle2, paramBundle1));
  }
  
  public void requestNativeAd(Context paramContext, o paramo, Bundle paramBundle1, u paramu, Bundle paramBundle2)
  {
    f localf = new f(this, paramo);
    c.a locala = new c.a(paramContext, paramBundle1.getString("pubid"));
    locala.a(localf);
    paramo = paramu.j();
    if (paramo != null) {
      locala.a(paramo);
    }
    if (paramu.d()) {
      locala.a(localf);
    }
    if (paramu.f()) {
      locala.a(localf);
    }
    if (paramu.k()) {
      locala.a(localf);
    }
    if (paramu.b())
    {
      Iterator localIterator = paramu.a().keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (((Boolean)paramu.a().get(str)).booleanValue()) {
          paramo = localf;
        } else {
          paramo = null;
        }
        locala.a(str, localf, paramo);
      }
    }
    this.zzmf = locala.a();
    this.zzmf.a(zza(paramContext, paramu, paramBundle2, paramBundle1));
  }
  
  public void showInterstitial()
  {
    this.zzme.b();
  }
  
  public void showVideo()
  {
    this.zzmh.b();
  }
  
  protected abstract Bundle zza(Bundle paramBundle1, Bundle paramBundle2);
  
  static final class a
    extends s
  {
    private final vp p;
    
    public a(vp paramvp)
    {
      this.p = paramvp;
      c(paramvp.d().toString());
      a(paramvp.f());
      a(paramvp.b().toString());
      a(paramvp.e());
      b(paramvp.c().toString());
      if (paramvp.h() != null) {
        a(paramvp.h().doubleValue());
      }
      if (paramvp.i() != null) {
        e(paramvp.i().toString());
      }
      if (paramvp.g() != null) {
        d(paramvp.g().toString());
      }
      b(true);
      a(true);
      a(paramvp.j());
    }
    
    public final void b(View paramView)
    {
      if ((paramView instanceof tp)) {
        ((tp)paramView).setNativeAd(this.p);
      }
      paramView = (up)up.a.get(paramView);
      if (paramView != null) {
        paramView.a(this.p);
      }
    }
  }
  
  static final class b
    extends t
  {
    private final wp n;
    
    public b(wp paramwp)
    {
      this.n = paramwp;
      d(paramwp.e().toString());
      a(paramwp.f());
      b(paramwp.c().toString());
      if (paramwp.g() != null) {
        a(paramwp.g());
      }
      c(paramwp.d().toString());
      a(paramwp.b().toString());
      b(true);
      a(true);
      a(paramwp.h());
    }
    
    public final void b(View paramView)
    {
      if ((paramView instanceof tp)) {
        ((tp)paramView).setNativeAd(this.n);
      }
      paramView = (up)up.a.get(paramView);
      if (paramView != null) {
        paramView.a(this.n);
      }
    }
  }
  
  static final class c
    extends y
  {
    private final zp r;
    
    public c(zp paramzp)
    {
      this.r = paramzp;
      d(paramzp.d());
      a(paramzp.f());
      b(paramzp.b());
      a(paramzp.e());
      c(paramzp.c());
      a(paramzp.a());
      a(paramzp.h());
      f(paramzp.i());
      e(paramzp.g());
      a(paramzp.l());
      b(true);
      a(true);
      a(paramzp.j());
    }
    
    public final void a(View paramView, Map<String, View> paramMap1, Map<String, View> paramMap2)
    {
      if ((paramView instanceof Ap))
      {
        ((Ap)paramView).setNativeAd(this.r);
        return;
      }
      paramView = (up)up.a.get(paramView);
      if (paramView != null) {
        paramView.a(this.r);
      }
    }
  }
  
  static final class d
    extends com.google.android.gms.ads.b
    implements kp, kea
  {
    private final AbstractAdViewAdapter a;
    private final h b;
    
    public d(AbstractAdViewAdapter paramAbstractAdViewAdapter, h paramh)
    {
      this.a = paramAbstractAdViewAdapter;
      this.b = paramh;
    }
    
    public final void a()
    {
      this.b.a(this.a);
    }
    
    public final void a(int paramInt)
    {
      this.b.a(this.a, paramInt);
    }
    
    public final void a(String paramString1, String paramString2)
    {
      this.b.a(this.a, paramString1, paramString2);
    }
    
    public final void c()
    {
      this.b.d(this.a);
    }
    
    public final void d()
    {
      this.b.c(this.a);
    }
    
    public final void e()
    {
      this.b.e(this.a);
    }
    
    public final void l()
    {
      this.b.b(this.a);
    }
  }
  
  static final class e
    extends com.google.android.gms.ads.b
    implements kea
  {
    private final AbstractAdViewAdapter a;
    private final com.google.android.gms.ads.mediation.m b;
    
    public e(AbstractAdViewAdapter paramAbstractAdViewAdapter, com.google.android.gms.ads.mediation.m paramm)
    {
      this.a = paramAbstractAdViewAdapter;
      this.b = paramm;
    }
    
    public final void a()
    {
      this.b.d(this.a);
    }
    
    public final void a(int paramInt)
    {
      this.b.a(this.a, paramInt);
    }
    
    public final void c()
    {
      this.b.a(this.a);
    }
    
    public final void d()
    {
      this.b.c(this.a);
    }
    
    public final void e()
    {
      this.b.e(this.a);
    }
    
    public final void l()
    {
      this.b.b(this.a);
    }
  }
  
  static final class f
    extends com.google.android.gms.ads.b
    implements vp.a, wp.a, xp.a, xp.b, zp.a
  {
    private final AbstractAdViewAdapter a;
    private final o b;
    
    public f(AbstractAdViewAdapter paramAbstractAdViewAdapter, o paramo)
    {
      this.a = paramAbstractAdViewAdapter;
      this.b = paramo;
    }
    
    public final void a()
    {
      this.b.b(this.a);
    }
    
    public final void a(int paramInt)
    {
      this.b.a(this.a, paramInt);
    }
    
    public final void a(vp paramvp)
    {
      this.b.a(this.a, new AbstractAdViewAdapter.a(paramvp));
    }
    
    public final void a(wp paramwp)
    {
      this.b.a(this.a, new AbstractAdViewAdapter.b(paramwp));
    }
    
    public final void a(xp paramxp)
    {
      this.b.a(this.a, paramxp);
    }
    
    public final void a(xp paramxp, String paramString)
    {
      this.b.a(this.a, paramxp, paramString);
    }
    
    public final void a(zp paramzp)
    {
      this.b.a(this.a, new AbstractAdViewAdapter.c(paramzp));
    }
    
    public final void b()
    {
      this.b.e(this.a);
    }
    
    public final void c()
    {
      this.b.d(this.a);
    }
    
    public final void d() {}
    
    public final void e()
    {
      this.b.a(this.a);
    }
    
    public final void l()
    {
      this.b.c(this.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/ads/mediation/AbstractAdViewAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */