package com.facebook.internal;

import _n;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import fo;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

final class z
  implements Runnable
{
  z(Context paramContext, String paramString1, String paramString2) {}
  
  public void run()
  {
    SharedPreferences localSharedPreferences = this.a.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
    Object localObject1 = this.b;
    Object localObject3 = null;
    String str = localSharedPreferences.getString((String)localObject1, null);
    localObject1 = localObject3;
    Object localObject2;
    if (!S.b(str))
    {
      try
      {
        localObject4 = new org/json/JSONObject;
        ((JSONObject)localObject4).<init>(str);
      }
      catch (JSONException localJSONException)
      {
        S.a("FacebookSDK", localJSONException);
        localObject4 = null;
      }
      localObject2 = localObject3;
      if (localObject4 != null) {
        localObject2 = C.a(this.c, (JSONObject)localObject4);
      }
    }
    Object localObject4 = C.a(this.c);
    if (localObject4 != null)
    {
      C.a(this.c, (JSONObject)localObject4);
      localSharedPreferences.edit().putString(this.b, ((JSONObject)localObject4).toString()).apply();
    }
    if (localObject2 != null)
    {
      localObject2 = ((y)localObject2).h();
      if ((!C.a()) && (localObject2 != null) && (((String)localObject2).length() > 0))
      {
        C.a(true);
        Log.w(C.b(), (String)localObject2);
      }
    }
    x.a(this.c, true);
    _n.b();
    fo.c();
    localObject4 = C.d();
    if (C.c().containsKey(this.c)) {
      localObject2 = C.a.c;
    } else {
      localObject2 = C.a.d;
    }
    ((AtomicReference)localObject4).set(localObject2);
    C.e();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/internal/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */