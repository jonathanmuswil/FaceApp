package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.e;
import com.google.android.gms.dynamite.DynamiteModule;
import org.json.JSONException;
import org.json.JSONObject;

@yh
public final class ei
  extends gi
{
  private final Object a = new Object();
  private final Context b;
  private SharedPreferences c;
  private final Fe<JSONObject, JSONObject> d;
  
  public ei(Context paramContext, Fe<JSONObject, JSONObject> paramFe)
  {
    this.b = paramContext.getApplicationContext();
    this.d = paramFe;
  }
  
  public static JSONObject a(Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("js", Yl.y().a);
      ga localga = ra.Cc;
      localJSONObject.put("mf", Kea.e().a(localga));
      localJSONObject.put("cl", "237950021");
      localJSONObject.put("rapid_rc", "dev");
      localJSONObject.put("rapid_rollup", "HEAD");
      localJSONObject.put("admob_module_version", 11140);
      localJSONObject.put("dynamite_local_version", 11140);
      localJSONObject.put("dynamite_version", DynamiteModule.b(paramContext, "com.google.android.gms.ads.dynamite"));
      localJSONObject.put("container_version", 12451009);
      return localJSONObject;
    }
    catch (JSONException paramContext)
    {
      for (;;) {}
    }
  }
  
  public final xm<Void> a()
  {
    synchronized (this.a)
    {
      if (this.c == null) {
        this.c = this.b.getSharedPreferences("google_ads_flags_meta", 0);
      }
      long l1 = this.c.getLong("js_last_update", 0L);
      long l2 = k.j().a();
      ??? = ra.Bc;
      if (l2 - l1 < ((Long)Kea.e().a((ga)???)).longValue()) {
        return gm.a(null);
      }
      ??? = a(this.b);
      return gm.a(this.d.a(???), new fi(this), Cm.b);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */