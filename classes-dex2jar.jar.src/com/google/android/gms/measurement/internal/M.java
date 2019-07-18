package com.google.android.gms.measurement.internal;

import YG;
import android.content.Context;
import com.google.android.gms.common.f;
import hH;
import iH;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oH;

public final class m
{
  public static a<Integer> A;
  public static a<Boolean> Aa = a.a("measurement.upload.disable_is_uploader", false, false);
  public static a<Integer> B;
  public static a<Boolean> Ba = a.a("measurement.experiment.enable_experiment_reporting", false, false);
  public static a<Integer> C;
  public static a<Boolean> Ca = a.a("measurement.collection.log_event_and_bundle_v2", true, true);
  public static a<Integer> D;
  public static a<Boolean> Da = a.a("measurement.collection.null_empty_event_name_fix", true, true);
  public static a<String> E;
  public static a<Boolean> Ea = a.a("measurement.audience.sequence_filters", false, false);
  public static a<Long> F;
  public static a<Boolean> Fa = a.a("measurement.quality.checksum", false, false);
  public static a<Long> G;
  public static a<Boolean> Ga = a.a("measurement.module.collection.conditionally_omit_admob_app_id", true, true);
  public static a<Long> H;
  public static a<Boolean> Ha = a.a("measurement.sdk.dynamite.use_dynamite", false, false);
  public static a<Long> I;
  public static a<Boolean> Ia = a.a("measurement.sdk.dynamite.allow_remote_dynamite", false, false);
  public static a<Long> J;
  public static a<Boolean> Ja = a.a("measurement.sdk.collection.validate_param_names_alphabetical", false, false);
  public static a<Long> K;
  private static a<Boolean> Ka = a.a("measurement.collection.event_safelist", false, false);
  public static a<Long> L;
  private static a<Boolean> La = a.a("measurement.service.audience.scoped_filters", false, false);
  public static a<Long> M;
  public static a<Long> N;
  public static a<Long> O;
  public static a<Long> P;
  public static a<Integer> Q;
  public static a<Long> R;
  public static a<Integer> S;
  public static a<Integer> T;
  public static a<Long> U;
  public static a<Boolean> V;
  public static a<String> W;
  public static a<Long> X;
  public static a<Integer> Y;
  public static a<Double> Z;
  static tc a;
  public static a<Integer> aa;
  static List<a<Integer>> b = new ArrayList();
  public static a<Boolean> ba;
  static List<a<Long>> c = new ArrayList();
  public static a<Boolean> ca;
  static List<a<Boolean>> d = new ArrayList();
  public static a<Boolean> da;
  static List<a<String>> e = new ArrayList();
  public static a<Boolean> ea;
  static List<a<Double>> f = new ArrayList();
  public static a<Boolean> fa;
  private static final oH g = new oH(hH.a("com.google.android.gms.measurement"));
  public static a<Boolean> ga;
  private static volatile aa h;
  public static a<Boolean> ha;
  private static Boolean i;
  public static a<Boolean> ia;
  private static a<Boolean> j = a.a("measurement.log_third_party_store_events_enabled", false, false);
  public static a<Boolean> ja;
  private static a<Boolean> k = a.a("measurement.log_installs_enabled", false, false);
  public static a<Boolean> ka;
  private static a<Boolean> l = a.a("measurement.log_upgrades_enabled", false, false);
  public static a<Boolean> la;
  public static a<Boolean> m = a.a("measurement.log_androidId_enabled", false, false);
  public static a<Boolean> ma;
  public static a<Boolean> n = a.a("measurement.upload_dsid_enabled", false, false);
  public static a<Boolean> na;
  public static a<String> o = a.a("measurement.log_tag", "FA", "FA-SVC");
  public static a<Boolean> oa;
  public static a<Long> p = a.a("measurement.ad_id_cache_time", 10000L, 10000L);
  public static a<Boolean> pa;
  public static a<Long> q = a.a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L);
  public static a<Boolean> qa;
  public static a<Long> r = a.a("measurement.config.cache_time", 86400000L, 3600000L);
  public static a<Boolean> ra;
  public static a<String> s = a.a("measurement.config.url_scheme", "https", "https");
  public static a<Boolean> sa;
  public static a<String> t = a.a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com");
  public static a<Boolean> ta;
  public static a<Integer> u = a.a("measurement.upload.max_bundles", 100, 100);
  public static a<Boolean> ua;
  public static a<Integer> v = a.a("measurement.upload.max_batch_size", 65536, 65536);
  public static a<Boolean> va;
  public static a<Integer> w = a.a("measurement.upload.max_bundle_size", 65536, 65536);
  public static a<Boolean> wa;
  public static a<Integer> x = a.a("measurement.upload.max_events_per_bundle", 1000, 1000);
  public static a<Boolean> xa;
  public static a<Integer> y = a.a("measurement.upload.max_events_per_day", 100000, 100000);
  public static a<Boolean> ya;
  public static a<Integer> z = a.a("measurement.upload.max_error_events_per_day", 1000, 1000);
  public static a<Boolean> za;
  
  static
  {
    A = a.a("measurement.upload.max_public_events_per_day", 50000, 50000);
    B = a.a("measurement.upload.max_conversions_per_day", 500, 500);
    C = a.a("measurement.upload.max_realtime_events_per_day", 10, 10);
    D = a.a("measurement.store.max_stored_events_per_app", 100000, 100000);
    E = a.a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a");
    F = a.a("measurement.upload.backoff_period", 43200000L, 43200000L);
    G = a.a("measurement.upload.window_interval", 3600000L, 3600000L);
    H = a.a("measurement.upload.interval", 3600000L, 3600000L);
    I = a.a("measurement.upload.realtime_upload_interval", 10000L, 10000L);
    J = a.a("measurement.upload.debug_upload_interval", 1000L, 1000L);
    K = a.a("measurement.upload.minimum_delay", 500L, 500L);
    L = a.a("measurement.alarm_manager.minimum_interval", 60000L, 60000L);
    M = a.a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L);
    N = a.a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L);
    O = a.a("measurement.upload.initial_upload_delay_time", 15000L, 15000L);
    P = a.a("measurement.upload.retry_time", 1800000L, 1800000L);
    Q = a.a("measurement.upload.retry_count", 6, 6);
    R = a.a("measurement.upload.max_queue_time", 2419200000L, 2419200000L);
    S = a.a("measurement.lifetimevalue.max_currency_tracked", 4, 4);
    T = a.a("measurement.audience.filter_result_max_count", 200, 200);
    U = a.a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L);
    V = a.a("measurement.test.boolean_flag", false, false);
    W = a.a("measurement.test.string_flag", "---", "---");
    X = a.a("measurement.test.long_flag", -1L, -1L);
    Y = a.a("measurement.test.int_flag", -2, -2);
    Z = a.a("measurement.test.double_flag", -3.0D, -3.0D);
    aa = a.a("measurement.experiment.max_ids", 50, 50);
    ba = a.a("measurement.lifetimevalue.user_engagement_tracking_enabled", true, true);
    ca = a.a("measurement.audience.complex_param_evaluation", true, true);
    da = a.a("measurement.validation.internal_limits_internal_event_params", false, false);
    ea = a.a("measurement.quality.unsuccessful_update_retry_counter", true, true);
    fa = a.a("measurement.iid.disable_on_collection_disabled", true, true);
    ga = a.a("measurement.app_launch.call_only_when_enabled", true, true);
    ha = a.a("measurement.run_on_worker_inline", true, true);
    ia = a.a("measurement.audience.dynamic_filters", true, true);
    ja = a.a("measurement.reset_analytics.persist_time", false, false);
    ka = a.a("measurement.validation.value_and_currency_params", false, false);
    la = a.a("measurement.sampling.time_zone_offset_enabled", false, false);
    ma = a.a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", false, false);
    na = a.a("measurement.fetch_config_with_admob_app_id", true, true);
    oa = a.a("measurement.client.sessions.session_id_enabled", false, false);
    pa = a.a("measurement.service.sessions.session_number_enabled", false, false);
    qa = a.a("measurement.client.sessions.immediate_start_enabled", false, false);
    ra = a.a("measurement.client.sessions.background_sessions_enabled", false, false);
    sa = a.a("measurement.client.sessions.remove_expired_session_properties_enabled", false, false);
    ta = a.a("measurement.service.sessions.session_number_backfill_enabled", false, false);
    ua = a.a("measurement.service.sessions.remove_disabled_session_number", false, false);
    va = a.a("measurement.collection.firebase_global_collection_flag_enabled", true, true);
    wa = a.a("measurement.collection.efficient_engagement_reporting_enabled", false, false);
    xa = a.a("measurement.collection.redundant_engagement_removal_enabled", false, false);
    ya = a.a("measurement.personalized_ads_signals_collection_enabled", false, false);
    za = a.a("measurement.collection.init_params_control_enabled", true, true);
  }
  
  public static Map<String, String> a(Context paramContext)
  {
    return YG.a(paramContext.getContentResolver(), hH.a("com.google.android.gms.measurement")).a();
  }
  
  static void a(aa paramaa)
  {
    h = paramaa;
  }
  
  static void a(tc paramtc)
  {
    a = paramtc;
    a.b();
  }
  
  static void a(Exception paramException)
  {
    if (h == null) {
      return;
    }
    Context localContext = h.getContext();
    if (i == null)
    {
      boolean bool;
      if (f.a().a(localContext, 12451000) == 0) {
        bool = true;
      } else {
        bool = false;
      }
      i = Boolean.valueOf(bool);
    }
    if (i.booleanValue()) {
      h.c().s().a("Got Exception on PhenotypeFlag.get on Play device", paramException);
    }
  }
  
  public static final class a<V>
  {
    private iH<V> a;
    private final V b;
    private final V c;
    private volatile V d;
    private final String e;
    
    private a(String paramString, V paramV1, V paramV2)
    {
      this.e = paramString;
      this.c = paramV1;
      this.b = paramV2;
    }
    
    static a<Double> a(String paramString, double paramDouble1, double paramDouble2)
    {
      Double localDouble = Double.valueOf(-3.0D);
      paramString = new a(paramString, localDouble, localDouble);
      m.f.add(paramString);
      return paramString;
    }
    
    static a<Integer> a(String paramString, int paramInt1, int paramInt2)
    {
      paramString = new a(paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
      m.b.add(paramString);
      return paramString;
    }
    
    static a<Long> a(String paramString, long paramLong1, long paramLong2)
    {
      paramString = new a(paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2));
      m.c.add(paramString);
      return paramString;
    }
    
    static a<String> a(String paramString1, String paramString2, String paramString3)
    {
      paramString1 = new a(paramString1, paramString2, paramString3);
      m.e.add(paramString1);
      return paramString1;
    }
    
    static a<Boolean> a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    {
      paramString = new a(paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2));
      m.d.add(paramString);
      return paramString;
    }
    
    private static void c()
    {
      try
      {
        Object localObject1 = m.d.iterator();
        Object localObject2;
        Object localObject6;
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (a)((Iterator)localObject1).next();
          localObject4 = m.a();
          localObject5 = ((a)localObject2).e;
          localObject6 = m.a;
          ((a)localObject2).a = ((oH)localObject4).a((String)localObject5, ((Boolean)((a)localObject2).c).booleanValue());
        }
        Object localObject5 = m.e.iterator();
        while (((Iterator)localObject5).hasNext())
        {
          localObject4 = (a)((Iterator)localObject5).next();
          localObject2 = m.a();
          localObject6 = ((a)localObject4).e;
          localObject1 = m.a;
          ((a)localObject4).a = ((oH)localObject2).a((String)localObject6, (String)((a)localObject4).c);
        }
        Object localObject4 = m.c.iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject1 = (a)((Iterator)localObject4).next();
          localObject5 = m.a();
          localObject6 = ((a)localObject1).e;
          localObject2 = m.a;
          ((a)localObject1).a = ((oH)localObject5).a((String)localObject6, ((Long)((a)localObject1).c).longValue());
        }
        localObject1 = m.b.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (a)((Iterator)localObject1).next();
          localObject4 = m.a();
          localObject6 = ((a)localObject2).e;
          localObject5 = m.a;
          ((a)localObject2).a = ((oH)localObject4).a((String)localObject6, ((Integer)((a)localObject2).c).intValue());
        }
        localObject5 = m.f.iterator();
        while (((Iterator)localObject5).hasNext())
        {
          localObject4 = (a)((Iterator)localObject5).next();
          localObject1 = m.a();
          localObject6 = ((a)localObject4).e;
          localObject2 = m.a;
          ((a)localObject4).a = ((oH)localObject1).a((String)localObject6, ((Double)((a)localObject4).c).doubleValue());
        }
        return;
      }
      finally {}
    }
    
    public final V a(V paramV)
    {
      if (paramV != null) {
        return paramV;
      }
      if (m.a == null) {
        return (V)this.c;
      }
      if (tc.a())
      {
        if (this.d == null) {
          return (V)this.c;
        }
        return (V)this.d;
      }
      try
      {
        if (!tc.a())
        {
          paramV = m.a;
          try
          {
            Object localObject = m.d.iterator();
            while (((Iterator)localObject).hasNext())
            {
              paramV = (a)((Iterator)localObject).next();
              paramV.d = paramV.a.a();
            }
            paramV = m.e.iterator();
            while (paramV.hasNext())
            {
              localObject = (a)paramV.next();
              ((a)localObject).d = ((a)localObject).a.a();
            }
            localObject = m.c.iterator();
            while (((Iterator)localObject).hasNext())
            {
              paramV = (a)((Iterator)localObject).next();
              paramV.d = paramV.a.a();
            }
            paramV = m.b.iterator();
            while (paramV.hasNext())
            {
              localObject = (a)paramV.next();
              ((a)localObject).d = ((a)localObject).a.a();
            }
            localObject = m.f.iterator();
            while (((Iterator)localObject).hasNext())
            {
              paramV = (a)((Iterator)localObject).next();
              paramV.d = paramV.a.a();
            }
            paramV = new java/lang/IllegalStateException;
          }
          catch (SecurityException paramV)
          {
            m.a(paramV);
            try
            {
              paramV = this.a.a();
              return paramV;
            }
            catch (SecurityException paramV)
            {
              m.a(paramV);
              return (V)this.a.b();
            }
          }
        }
        paramV.<init>("Tried to refresh flag cache on main thread or on package side.");
        throw paramV;
      }
      finally {}
    }
    
    public final String a()
    {
      return this.e;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */