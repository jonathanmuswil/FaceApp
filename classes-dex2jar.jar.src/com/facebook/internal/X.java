package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.facebook.E;
import com.facebook.FacebookSdk;
import com.facebook.I;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class x
{
  private static final Map<String, JSONObject> a = new ConcurrentHashMap();
  private static Long b = null;
  
  private static JSONObject a(String paramString)
  {
    Bundle localBundle = new Bundle();
    Object localObject = b.d();
    if ((localObject != null) && (((b)localObject).a() != null)) {
      localObject = ((b)localObject).a();
    } else {
      localObject = "";
    }
    String str = FacebookSdk.m();
    localBundle.putString("platform", "android");
    localBundle.putString("device_id", (String)localObject);
    localBundle.putString("sdk_version", str);
    localBundle.putString("fields", "gatekeepers");
    paramString = E.a(null, String.format("%s/%s", new Object[] { paramString, "mobile_sdk_gk" }), null);
    paramString.a(true);
    paramString.a(localBundle);
    return paramString.b().b();
  }
  
  private static JSONObject a(String paramString, JSONObject paramJSONObject)
  {
    try
    {
      JSONObject localJSONObject;
      if (a.containsKey(paramString)) {
        localJSONObject = (JSONObject)a.get(paramString);
      } else {
        localJSONObject = new JSONObject();
      }
      Object localObject = paramJSONObject.optJSONArray("data");
      paramJSONObject = null;
      int i = 0;
      if (localObject != null) {
        paramJSONObject = ((JSONArray)localObject).optJSONObject(0);
      }
      if ((paramJSONObject != null) && (paramJSONObject.optJSONArray("gatekeepers") != null))
      {
        paramJSONObject = paramJSONObject.optJSONArray("gatekeepers");
        for (;;)
        {
          int j = paramJSONObject.length();
          if (i >= j) {
            break;
          }
          try
          {
            localObject = paramJSONObject.getJSONObject(i);
            localJSONObject.put(((JSONObject)localObject).getString("key"), ((JSONObject)localObject).getBoolean("value"));
          }
          catch (JSONException localJSONException)
          {
            S.a("FacebookSDK", localJSONException);
          }
          i++;
        }
      }
      a.put(paramString, localJSONObject);
      return localJSONObject;
    }
    finally {}
  }
  
  public static JSONObject a(String paramString, boolean paramBoolean)
  {
    if ((!paramBoolean) && (a.containsKey(paramString))) {
      return (JSONObject)a.get(paramString);
    }
    JSONObject localJSONObject = a(paramString);
    if (localJSONObject == null) {
      return null;
    }
    Context localContext = FacebookSdk.d();
    String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[] { paramString });
    localContext.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str, localJSONObject.toString()).apply();
    return a(paramString, localJSONObject);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/internal/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */