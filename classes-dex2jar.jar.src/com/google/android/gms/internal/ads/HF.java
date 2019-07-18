package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@yh
public final class hf
{
  private final String a;
  private final String b;
  public final List<String> c;
  private final String d;
  private final String e;
  private final List<String> f;
  private final List<String> g;
  private final List<String> h;
  private final List<String> i;
  private final List<String> j;
  public final String k;
  private final List<String> l;
  private final List<String> m;
  private final List<String> n;
  private final String o;
  private final String p;
  private final String q;
  private final String r;
  private final String s;
  private final List<String> t;
  private final String u;
  public final String v;
  private final long w;
  
  public hf(JSONObject paramJSONObject)
    throws JSONException
  {
    this.b = paramJSONObject.optString("id");
    Object localObject1 = paramJSONObject.getJSONArray("adapters");
    Object localObject2 = new ArrayList(((JSONArray)localObject1).length());
    for (int i1 = 0; i1 < ((JSONArray)localObject1).length(); i1++) {
      ((List)localObject2).add(((JSONArray)localObject1).getString(i1));
    }
    this.c = Collections.unmodifiableList((List)localObject2);
    this.d = paramJSONObject.optString("allocation_id", null);
    k.u();
    this.f = jf.a(paramJSONObject, "clickurl");
    k.u();
    this.g = jf.a(paramJSONObject, "imp_urls");
    k.u();
    this.h = jf.a(paramJSONObject, "downloaded_imp_urls");
    k.u();
    this.j = jf.a(paramJSONObject, "fill_urls");
    k.u();
    this.l = jf.a(paramJSONObject, "video_start_urls");
    k.u();
    this.n = jf.a(paramJSONObject, "video_complete_urls");
    k.u();
    this.m = jf.a(paramJSONObject, "video_reward_urls");
    this.o = paramJSONObject.optString("transaction_id");
    this.p = paramJSONObject.optString("valid_from_timestamp");
    localObject1 = paramJSONObject.optJSONObject("ad");
    if (localObject1 != null)
    {
      k.u();
      localObject2 = jf.a((JSONObject)localObject1, "manual_impression_urls");
    }
    else
    {
      localObject2 = null;
    }
    this.i = ((List)localObject2);
    if (localObject1 != null) {
      localObject2 = ((JSONObject)localObject1).toString();
    } else {
      localObject2 = null;
    }
    this.a = ((String)localObject2);
    localObject1 = paramJSONObject.optJSONObject("data");
    if (localObject1 != null) {
      localObject2 = ((JSONObject)localObject1).toString();
    } else {
      localObject2 = null;
    }
    this.k = ((String)localObject2);
    if (localObject1 != null) {
      localObject2 = ((JSONObject)localObject1).optString("class_name");
    } else {
      localObject2 = null;
    }
    this.e = ((String)localObject2);
    this.q = paramJSONObject.optString("html_template", null);
    this.r = paramJSONObject.optString("ad_base_url", null);
    localObject2 = paramJSONObject.optJSONObject("assets");
    if (localObject2 != null) {
      localObject2 = ((JSONObject)localObject2).toString();
    } else {
      localObject2 = null;
    }
    this.s = ((String)localObject2);
    k.u();
    this.t = jf.a(paramJSONObject, "template_ids");
    localObject2 = paramJSONObject.optJSONObject("ad_loader_options");
    if (localObject2 != null) {
      localObject2 = ((JSONObject)localObject2).toString();
    } else {
      localObject2 = null;
    }
    this.u = ((String)localObject2);
    this.v = paramJSONObject.optString("response_type", null);
    this.w = paramJSONObject.optLong("ad_network_timeout_millis", -1L);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */