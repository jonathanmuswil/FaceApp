package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@yh
public final class if
{
  public final List<hf> a;
  private final long b;
  private final List<String> c;
  private final List<String> d;
  private final List<String> e;
  private final List<String> f;
  private final List<String> g;
  private final boolean h;
  private final String i;
  private final long j;
  private final String k;
  private final int l;
  private final int m;
  private final long n;
  private final boolean o;
  private final boolean p;
  private final boolean q;
  private final boolean r;
  private int s;
  private int t;
  private boolean u;
  
  public if(JSONObject paramJSONObject)
    throws JSONException
  {
    if (Tl.a(2))
    {
      localObject1 = String.valueOf(paramJSONObject.toString(2));
      if (((String)localObject1).length() != 0) {
        localObject1 = "Mediation Response JSON: ".concat((String)localObject1);
      } else {
        localObject1 = new String("Mediation Response JSON: ");
      }
      mk.f((String)localObject1);
    }
    JSONArray localJSONArray = paramJSONObject.getJSONArray("ad_networks");
    Object localObject1 = new ArrayList(localJSONArray.length());
    int i1 = 0;
    for (i2 = -1; i1 < localJSONArray.length(); i2 = i4) {
      try
      {
        Object localObject2 = new com/google/android/gms/internal/ads/hf;
        ((hf)localObject2).<init>(localJSONArray.getJSONObject(i1));
        boolean bool = "banner".equalsIgnoreCase(((hf)localObject2).v);
        int i3 = 1;
        if (bool) {
          this.u = true;
        }
        ((List)localObject1).add(localObject2);
        i4 = i2;
        if (i2 < 0)
        {
          localObject2 = ((hf)localObject2).c.iterator();
          while (((Iterator)localObject2).hasNext()) {
            if (((String)((Iterator)localObject2).next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
              break label190;
            }
          }
          i3 = 0;
          label190:
          i4 = i2;
          if (i3 != 0) {
            i4 = i1;
          }
        }
        i1++;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          long l1;
          long l2;
          int i4 = i2;
        }
      }
    }
    this.s = i2;
    this.t = localJSONArray.length();
    this.a = Collections.unmodifiableList((List)localObject1);
    this.i = paramJSONObject.optString("qdata");
    this.m = paramJSONObject.optInt("fs_model_type", -1);
    l1 = -1L;
    this.n = paramJSONObject.optLong("timeout_ms", -1L);
    localObject1 = paramJSONObject.optJSONObject("settings");
    if (localObject1 != null)
    {
      this.b = ((JSONObject)localObject1).optLong("ad_network_timeout_millis", -1L);
      k.u();
      this.c = jf.a((JSONObject)localObject1, "click_urls");
      k.u();
      this.d = jf.a((JSONObject)localObject1, "imp_urls");
      k.u();
      this.e = jf.a((JSONObject)localObject1, "downloaded_imp_urls");
      k.u();
      this.f = jf.a((JSONObject)localObject1, "nofill_urls");
      k.u();
      this.g = jf.a((JSONObject)localObject1, "remote_ping_urls");
      this.h = ((JSONObject)localObject1).optBoolean("render_in_browser", false);
      l2 = ((JSONObject)localObject1).optLong("refresh", -1L);
      if (l2 > 0L) {
        l1 = 1000L * l2;
      }
      this.j = l1;
      paramJSONObject = Ki.a(((JSONObject)localObject1).optJSONArray("rewards"));
      if (paramJSONObject == null)
      {
        this.k = null;
        this.l = 0;
      }
      else
      {
        this.k = paramJSONObject.a;
        this.l = paramJSONObject.b;
      }
      this.o = ((JSONObject)localObject1).optBoolean("use_displayed_impression", false);
      this.p = ((JSONObject)localObject1).optBoolean("allow_pub_rendered_attribution", false);
      this.q = ((JSONObject)localObject1).optBoolean("allow_pub_owned_ad_view", false);
      this.r = ((JSONObject)localObject1).optBoolean("allow_custom_click_gesture", false);
      return;
    }
    this.b = -1L;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.j = -1L;
    this.k = null;
    this.l = 0;
    this.o = false;
    this.h = false;
    this.p = false;
    this.q = false;
    this.r = false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/if.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */