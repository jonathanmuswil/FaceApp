package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONObject;

public final class wz
{
  private final Bm a;
  private final Az b;
  private final Kz c;
  
  public wz(Bm paramBm, Az paramAz, Kz paramKz)
  {
    this.a = paramBm;
    this.b = paramAz;
    this.c = paramKz;
  }
  
  public final xm<xy> a(lL paramlL, dL paramdL, JSONObject paramJSONObject)
  {
    xm localxm1 = this.a.a(new xz(this, paramlL, paramdL, paramJSONObject));
    paramdL = this.b.b(paramJSONObject, "images");
    xm localxm2 = this.b.a(paramJSONObject, "secondary_image");
    xm localxm3 = this.b.a(paramJSONObject, "app_icon");
    xm localxm4 = this.b.c(paramJSONObject, "attribution");
    xm localxm5 = this.b.c(paramJSONObject);
    paramlL = this.b;
    if (!paramJSONObject.optBoolean("enable_omid")) {
      paramlL = gm.a(null);
    }
    for (;;)
    {
      break;
      localObject = paramJSONObject.optJSONObject("omid_settings");
      if (localObject == null)
      {
        paramlL = gm.a(null);
      }
      else
      {
        localObject = ((JSONObject)localObject).optString("omid_html");
        if (TextUtils.isEmpty((CharSequence)localObject)) {
          paramlL = gm.a(null);
        } else {
          paramlL = gm.a(gm.a(null), new Ez(paramlL, (String)localObject), Cm.a);
        }
      }
    }
    Object localObject = this.c.a(paramJSONObject, "custom_assets");
    return gm.a(new xm[] { localxm1, paramdL, localxm2, localxm3, localxm4, localxm5, paramlL, localObject }).a(new yz(this, localxm1, paramdL, localxm3, localxm2, localxm4, paramJSONObject, localxm5, paramlL, (xm)localObject), this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */