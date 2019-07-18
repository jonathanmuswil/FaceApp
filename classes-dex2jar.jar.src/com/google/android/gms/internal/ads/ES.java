package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.k;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class es
  implements Ie<is>
{
  private final Context a;
  private final fca b;
  private final PowerManager c;
  
  public es(Context paramContext, fca paramfca)
  {
    this.a = paramContext;
    this.b = paramfca;
    this.c = ((PowerManager)paramContext.getSystemService("power"));
  }
  
  public final JSONObject a(is paramis)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    JSONObject localJSONObject1 = new JSONObject();
    Object localObject1 = paramis.f;
    if (localObject1 == null)
    {
      paramis = new JSONObject();
    }
    else
    {
      if (this.b.c() == null) {
        break label872;
      }
      boolean bool1 = ((lca)localObject1).c;
      JSONObject localJSONObject2 = new JSONObject();
      Object localObject2 = localJSONObject2.put("afmaVersion", this.b.b()).put("activeViewJSON", this.b.c()).put("timestamp", paramis.d).put("adFormat", this.b.a()).put("hashCode", this.b.d());
      Object localObject3 = this.b;
      localObject2 = ((JSONObject)localObject2).put("isMraid", false).put("isStopped", false).put("isPaused", paramis.b).put("isNative", this.b.e());
      boolean bool2;
      if (Build.VERSION.SDK_INT >= 20) {
        bool2 = this.c.isInteractive();
      } else {
        bool2 = this.c.isScreenOn();
      }
      ((JSONObject)localObject2).put("isScreenOn", bool2).put("appMuted", k.h().b()).put("appVolume", k.h().a()).put("deviceVolume", Ok.a(this.a.getApplicationContext()));
      localObject3 = new Rect();
      localObject2 = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
      ((Rect)localObject3).right = ((Display)localObject2).getWidth();
      ((Rect)localObject3).bottom = ((Display)localObject2).getHeight();
      localObject2 = this.a.getResources().getDisplayMetrics();
      localJSONObject2.put("windowVisibility", ((lca)localObject1).d).put("isAttachedToWindow", bool1).put("viewBox", new JSONObject().put("top", ((lca)localObject1).e.top).put("bottom", ((lca)localObject1).e.bottom).put("left", ((lca)localObject1).e.left).put("right", ((lca)localObject1).e.right)).put("adBox", new JSONObject().put("top", ((lca)localObject1).f.top).put("bottom", ((lca)localObject1).f.bottom).put("left", ((lca)localObject1).f.left).put("right", ((lca)localObject1).f.right)).put("globalVisibleBox", new JSONObject().put("top", ((lca)localObject1).g.top).put("bottom", ((lca)localObject1).g.bottom).put("left", ((lca)localObject1).g.left).put("right", ((lca)localObject1).g.right)).put("globalVisibleBoxVisible", ((lca)localObject1).h).put("localVisibleBox", new JSONObject().put("top", ((lca)localObject1).i.top).put("bottom", ((lca)localObject1).i.bottom).put("left", ((lca)localObject1).i.left).put("right", ((lca)localObject1).i.right)).put("localVisibleBoxVisible", ((lca)localObject1).j).put("hitBox", new JSONObject().put("top", ((lca)localObject1).k.top).put("bottom", ((lca)localObject1).k.bottom).put("left", ((lca)localObject1).k.left).put("right", ((lca)localObject1).k.right)).put("screenDensity", ((DisplayMetrics)localObject2).density);
      localJSONObject2.put("isVisible", paramis.a);
      localObject2 = ra.Rb;
      if (((Boolean)Kea.e().a((ga)localObject2)).booleanValue())
      {
        localObject2 = new JSONArray();
        localObject1 = ((lca)localObject1).n;
        if (localObject1 != null)
        {
          localObject3 = ((List)localObject1).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject1 = (Rect)((Iterator)localObject3).next();
            ((JSONArray)localObject2).put(new JSONObject().put("top", ((Rect)localObject1).top).put("bottom", ((Rect)localObject1).bottom).put("left", ((Rect)localObject1).left).put("right", ((Rect)localObject1).right));
          }
        }
        localJSONObject2.put("scrollableContainerBoxes", localObject2);
      }
      if (!TextUtils.isEmpty(paramis.e)) {
        localJSONObject2.put("doneReasonCode", "u");
      }
      paramis = localJSONObject2;
    }
    localJSONArray.put(paramis);
    localJSONObject1.put("units", localJSONArray);
    return localJSONObject1;
    label872:
    throw new JSONException("Active view Info cannot be null.");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/es.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */