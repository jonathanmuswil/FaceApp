package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@yh
public final class vn
{
  public final boolean a;
  public final int b;
  public final int c;
  public final int d;
  public final String e;
  public final int f;
  public final int g;
  public final int h;
  public final int i;
  public final boolean j;
  
  public vn(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramString != null) {}
    try
    {
      localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>(paramString);
      this.a = a((JSONObject)localObject2, "aggressive_media_codec_release", ra.P);
      this.b = b((JSONObject)localObject2, "byte_buffer_precache_limit", ra.y);
      this.c = b((JSONObject)localObject2, "exo_cache_buffer_size", ra.D);
      this.d = b((JSONObject)localObject2, "exo_connect_timeout_millis", ra.u);
      this.e = c((JSONObject)localObject2, "exo_player_version", ra.t);
      this.f = b((JSONObject)localObject2, "exo_read_timeout_millis", ra.v);
      this.g = b((JSONObject)localObject2, "load_check_interval_bytes", ra.w);
      this.h = b((JSONObject)localObject2, "player_precache_limit", ra.x);
      this.i = b((JSONObject)localObject2, "socket_receive_buffer_size", ra.z);
      this.j = a((JSONObject)localObject2, "use_cache_data_source", ra.vd);
      return;
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        localObject2 = localObject1;
      }
    }
  }
  
  private static boolean a(JSONObject paramJSONObject, String paramString, ga<Boolean> paramga)
  {
    return a(paramJSONObject, paramString, ((Boolean)Kea.e().a(paramga)).booleanValue());
  }
  
  private static boolean a(JSONObject paramJSONObject, String paramString, boolean paramBoolean)
  {
    if (paramJSONObject != null) {}
    try
    {
      boolean bool = paramJSONObject.getBoolean(paramString);
      return bool;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;) {}
    }
    return paramBoolean;
  }
  
  private static int b(JSONObject paramJSONObject, String paramString, ga<Integer> paramga)
  {
    if (paramJSONObject != null) {}
    try
    {
      int k = paramJSONObject.getInt(paramString);
      return k;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;) {}
    }
    return ((Integer)Kea.e().a(paramga)).intValue();
  }
  
  private static String c(JSONObject paramJSONObject, String paramString, ga<String> paramga)
  {
    if (paramJSONObject != null) {}
    try
    {
      paramJSONObject = paramJSONObject.getString(paramString);
      return paramJSONObject;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;) {}
    }
    return (String)Kea.e().a(paramga);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */