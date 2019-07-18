package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@yh
public final class pk
  implements ok
{
  private final Object a = new Object();
  private boolean b;
  private final List<Runnable> c = new ArrayList();
  private xm<?> d;
  private Cca e = null;
  private SharedPreferences f;
  private SharedPreferences.Editor g;
  private boolean h = false;
  private boolean i = true;
  private String j;
  private String k;
  private boolean l = false;
  private String m = "";
  private long n = 0L;
  private long o = 0L;
  private long p = 0L;
  private int q = -1;
  private int r = 0;
  private Set<String> s = Collections.emptySet();
  private JSONObject t = new JSONObject();
  private boolean u = true;
  private boolean v = true;
  private String w = null;
  
  private final void a(Bundle paramBundle)
  {
    tk.a.execute(new rk(this));
  }
  
  private final void o()
  {
    xm localxm = this.d;
    if (localxm == null) {
      return;
    }
    if (localxm.isDone()) {
      return;
    }
    try
    {
      try
      {
        this.d.get(1L, TimeUnit.SECONDS);
        return;
      }
      catch (TimeoutException localTimeoutException) {}catch (ExecutionException localExecutionException) {}catch (CancellationException localCancellationException) {}
      Tl.b("Fail to initialize AdSharedPreferenceManager.", localCancellationException);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Thread.currentThread().interrupt();
      Tl.c("Interrupted while waiting for preferences loaded.", localInterruptedException);
    }
  }
  
  private final Bundle p()
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("listener_registration_bundle", true);
    synchronized (this.a)
    {
      localBundle.putBoolean("use_https", this.i);
      localBundle.putBoolean("content_url_opted_out", this.u);
      localBundle.putBoolean("content_vertical_opted_out", this.v);
      localBundle.putBoolean("auto_collect_location", this.l);
      localBundle.putInt("version_code", this.r);
      localBundle.putStringArray("never_pool_slots", (String[])this.s.toArray(new String[0]));
      localBundle.putString("app_settings_json", this.m);
      localBundle.putLong("app_settings_last_update_ms", this.n);
      localBundle.putLong("app_last_background_time_ms", this.o);
      localBundle.putInt("request_in_session_count", this.q);
      localBundle.putLong("first_ad_req_time_ms", this.p);
      localBundle.putString("native_advanced_settings", this.t.toString());
      localBundle.putString("display_cutout", this.w);
      if (this.j != null) {
        localBundle.putString("content_url_hashes", this.j);
      }
      if (this.k != null) {
        localBundle.putString("content_vertical_hashes", this.k);
      }
      return localBundle;
    }
  }
  
  public final JSONObject a()
  {
    o();
    synchronized (this.a)
    {
      JSONObject localJSONObject = this.t;
      return localJSONObject;
    }
  }
  
  public final void a(int paramInt)
  {
    o();
    synchronized (this.a)
    {
      if (this.r == paramInt) {
        return;
      }
      this.r = paramInt;
      if (this.g != null)
      {
        this.g.putInt("version_code", paramInt);
        this.g.apply();
      }
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putInt("version_code", paramInt);
      a(localBundle);
      return;
    }
  }
  
  public final void a(long paramLong)
  {
    o();
    synchronized (this.a)
    {
      if (this.o == paramLong) {
        return;
      }
      this.o = paramLong;
      if (this.g != null)
      {
        this.g.putLong("app_last_background_time_ms", paramLong);
        this.g.apply();
      }
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putLong("app_last_background_time_ms", paramLong);
      a(localBundle);
      return;
    }
  }
  
  public final void a(Context paramContext, String paramString, boolean paramBoolean)
  {
    if (paramString == null)
    {
      paramString = "admob";
    }
    else
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "admob__".concat(paramString);
      } else {
        paramString = new String("admob__");
      }
    }
    this.d = tk.a(new qk(this, paramContext, paramString));
    this.b = paramBoolean;
  }
  
  public final void a(Runnable paramRunnable)
  {
    this.c.add(paramRunnable);
  }
  
  public final void a(String paramString)
  {
    o();
    synchronized (this.a)
    {
      long l1 = k.j().a();
      this.n = l1;
      if ((paramString != null) && (!paramString.equals(this.m)))
      {
        this.m = paramString;
        if (this.g != null)
        {
          this.g.putString("app_settings_json", paramString);
          this.g.putLong("app_settings_last_update_ms", l1);
          this.g.apply();
        }
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putString("app_settings_json", paramString);
        localBundle.putLong("app_settings_last_update_ms", l1);
        a(localBundle);
        paramString = this.c.iterator();
        while (paramString.hasNext()) {
          ((Runnable)paramString.next()).run();
        }
        return;
      }
      return;
    }
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    o();
    synchronized (this.a)
    {
      Object localObject2 = this.t.optJSONArray(paramString1);
      Object localObject3 = localObject2;
      if (localObject2 == null)
      {
        localObject3 = new org/json/JSONArray;
        ((JSONArray)localObject3).<init>();
      }
      int i1 = ((JSONArray)localObject3).length();
      int i3;
      for (int i2 = 0;; i2++)
      {
        i3 = i1;
        if (i2 >= ((JSONArray)localObject3).length()) {
          break;
        }
        localObject2 = ((JSONArray)localObject3).optJSONObject(i2);
        if (localObject2 == null) {
          return;
        }
        if (paramString2.equals(((JSONObject)localObject2).optString("template_id")))
        {
          if ((paramBoolean) && (((JSONObject)localObject2).optBoolean("uses_media_view", false))) {
            return;
          }
          i3 = i2;
          break;
        }
      }
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>();
        ((JSONObject)localObject2).put("template_id", paramString2);
        ((JSONObject)localObject2).put("uses_media_view", paramBoolean);
        ((JSONObject)localObject2).put("timestamp_ms", k.j().a());
        ((JSONArray)localObject3).put(i3, localObject2);
        this.t.put(paramString1, localObject3);
      }
      catch (JSONException paramString1)
      {
        Tl.c("Could not update native advanced settings", paramString1);
      }
      if (this.g != null)
      {
        this.g.putString("native_advanced_settings", this.t.toString());
        this.g.apply();
      }
      paramString1 = new android/os/Bundle;
      paramString1.<init>();
      paramString1.putString("native_advanced_settings", this.t.toString());
      a(paramString1);
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    o();
    synchronized (this.a)
    {
      if (this.v == paramBoolean) {
        return;
      }
      this.v = paramBoolean;
      if (this.g != null)
      {
        this.g.putBoolean("content_vertical_opted_out", paramBoolean);
        this.g.apply();
      }
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putBoolean("content_url_opted_out", this.u);
      localBundle.putBoolean("content_vertical_opted_out", this.v);
      a(localBundle);
      return;
    }
  }
  
  public final void b(int paramInt)
  {
    o();
    synchronized (this.a)
    {
      if (this.q == paramInt) {
        return;
      }
      this.q = paramInt;
      if (this.g != null)
      {
        this.g.putInt("request_in_session_count", paramInt);
        this.g.apply();
      }
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putInt("request_in_session_count", paramInt);
      a(localBundle);
      return;
    }
  }
  
  public final void b(long paramLong)
  {
    o();
    synchronized (this.a)
    {
      if (this.p == paramLong) {
        return;
      }
      this.p = paramLong;
      if (this.g != null)
      {
        this.g.putLong("first_ad_req_time_ms", paramLong);
        this.g.apply();
      }
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putLong("first_ad_req_time_ms", paramLong);
      a(localBundle);
      return;
    }
  }
  
  public final void b(String paramString)
  {
    o();
    synchronized (this.a)
    {
      if (TextUtils.equals(this.w, paramString)) {
        return;
      }
      this.w = paramString;
      if (this.g != null)
      {
        this.g.putString("display_cutout", paramString);
        this.g.apply();
      }
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("display_cutout", paramString);
      a(localBundle);
      return;
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    o();
    synchronized (this.a)
    {
      if (this.l == paramBoolean) {
        return;
      }
      this.l = paramBoolean;
      if (this.g != null)
      {
        this.g.putBoolean("auto_collect_location", paramBoolean);
        this.g.apply();
      }
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putBoolean("auto_collect_location", paramBoolean);
      a(localBundle);
      return;
    }
  }
  
  public final boolean b()
  {
    o();
    synchronized (this.a)
    {
      boolean bool = this.v;
      return bool;
    }
  }
  
  public final long c()
  {
    o();
    synchronized (this.a)
    {
      long l1 = this.p;
      return l1;
    }
  }
  
  public final void c(String paramString)
  {
    o();
    Object localObject = this.a;
    if (paramString != null) {}
    try
    {
      if (!paramString.equals(this.j))
      {
        this.j = paramString;
        if (this.g != null)
        {
          this.g.putString("content_url_hashes", paramString);
          this.g.apply();
        }
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putString("content_url_hashes", paramString);
        a(localBundle);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void c(boolean paramBoolean)
  {
    o();
    synchronized (this.a)
    {
      if (this.u == paramBoolean) {
        return;
      }
      this.u = paramBoolean;
      if (this.g != null)
      {
        this.g.putBoolean("content_url_opted_out", paramBoolean);
        this.g.apply();
      }
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putBoolean("content_url_opted_out", this.u);
      localBundle.putBoolean("content_vertical_opted_out", this.v);
      a(localBundle);
      return;
    }
  }
  
  public final String d()
  {
    o();
    synchronized (this.a)
    {
      String str = this.j;
      return str;
    }
  }
  
  public final void d(String paramString)
  {
    o();
    Object localObject = this.a;
    if (paramString != null) {}
    try
    {
      if (!paramString.equals(this.k))
      {
        this.k = paramString;
        if (this.g != null)
        {
          this.g.putString("content_vertical_hashes", paramString);
          this.g.apply();
        }
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putString("content_vertical_hashes", paramString);
        a(localBundle);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final int e()
  {
    o();
    synchronized (this.a)
    {
      int i1 = this.q;
      return i1;
    }
  }
  
  public final boolean f()
  {
    o();
    synchronized (this.a)
    {
      boolean bool = this.u;
      return bool;
    }
  }
  
  public final long g()
  {
    o();
    synchronized (this.a)
    {
      long l1 = this.o;
      return l1;
    }
  }
  
  public final Cca h()
  {
    if (!this.b) {
      return null;
    }
    if (!m.a()) {
      return null;
    }
    if ((f()) && (b())) {
      return null;
    }
    ??? = ra.ha;
    if (!((Boolean)Kea.e().a((ga)???)).booleanValue()) {
      return null;
    }
    synchronized (this.a)
    {
      if (Looper.getMainLooper() == null) {
        return null;
      }
      if (this.e == null)
      {
        localCca = new com/google/android/gms/internal/ads/Cca;
        localCca.<init>();
        this.e = localCca;
      }
      this.e.b();
      Tl.c("start fetching content...");
      Cca localCca = this.e;
      return localCca;
    }
  }
  
  public final Yj i()
  {
    o();
    synchronized (this.a)
    {
      Yj localYj = new com/google/android/gms/internal/ads/Yj;
      localYj.<init>(this.m, this.n);
      return localYj;
    }
  }
  
  public final int j()
  {
    o();
    synchronized (this.a)
    {
      int i1 = this.r;
      return i1;
    }
  }
  
  public final String k()
  {
    o();
    synchronized (this.a)
    {
      String str = this.w;
      return str;
    }
  }
  
  public final boolean l()
  {
    o();
    synchronized (this.a)
    {
      boolean bool = this.l;
      return bool;
    }
  }
  
  public final void m()
  {
    o();
    synchronized (this.a)
    {
      Object localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>();
      this.t = ((JSONObject)localObject2);
      if (this.g != null)
      {
        this.g.remove("native_advanced_settings");
        this.g.apply();
      }
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
      ((Bundle)localObject2).putString("native_advanced_settings", "{}");
      a((Bundle)localObject2);
      return;
    }
  }
  
  public final String n()
  {
    o();
    synchronized (this.a)
    {
      String str = this.k;
      return str;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */