package com.facebook.applinks;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.E;
import com.facebook.FacebookSdk;
import com.facebook.I;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.S;
import com.facebook.internal.T;
import com.facebook.p;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b
{
  private static final String a = "com.facebook.applinks.b";
  private String b;
  private Uri c;
  private JSONObject d;
  private Bundle e;
  private String f;
  
  private static Bundle a(JSONObject paramJSONObject)
    throws JSONException
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramJSONObject.get(str);
      if ((localObject1 instanceof JSONObject))
      {
        localBundle.putBundle(str, a((JSONObject)localObject1));
      }
      else if ((localObject1 instanceof JSONArray))
      {
        localObject1 = (JSONArray)localObject1;
        int i = ((JSONArray)localObject1).length();
        int j = 0;
        int k = 0;
        if (i == 0)
        {
          localBundle.putStringArray(str, new String[0]);
        }
        else
        {
          Object localObject2 = ((JSONArray)localObject1).get(0);
          if ((localObject2 instanceof JSONObject))
          {
            localObject2 = new Bundle[((JSONArray)localObject1).length()];
            while (k < ((JSONArray)localObject1).length())
            {
              localObject2[k] = a(((JSONArray)localObject1).getJSONObject(k));
              k++;
            }
            localBundle.putParcelableArray(str, (Parcelable[])localObject2);
          }
          else if (!(localObject2 instanceof JSONArray))
          {
            localObject2 = new String[((JSONArray)localObject1).length()];
            for (k = j; k < ((JSONArray)localObject1).length(); k++) {
              localObject2[k] = ((JSONArray)localObject1).get(k).toString();
            }
            localBundle.putStringArray(str, (String[])localObject2);
          }
          else
          {
            throw new p("Nested arrays are not supported.");
          }
        }
      }
      else
      {
        localBundle.putString(str, localObject1.toString());
      }
    }
    return localBundle;
  }
  
  private static b a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = localJSONObject.getString("version");
      if ((localJSONObject.getJSONObject("bridge_args").getString("method").equals("applink")) && (paramString.equals("2")))
      {
        paramString = new com/facebook/applinks/b;
        paramString.<init>();
        paramString.d = localJSONObject.getJSONObject("method_args");
        if (paramString.d.has("ref"))
        {
          paramString.b = paramString.d.getString("ref");
        }
        else if (paramString.d.has("referer_data"))
        {
          localJSONObject = paramString.d.getJSONObject("referer_data");
          if (localJSONObject.has("fb_ref")) {
            paramString.b = localJSONObject.getString("fb_ref");
          }
        }
        if (paramString.d.has("target_url")) {
          paramString.c = Uri.parse(paramString.d.getString("target_url"));
        }
        if (paramString.d.has("extras"))
        {
          localJSONObject = paramString.d.getJSONObject("extras");
          if (localJSONObject.has("deeplink_context"))
          {
            localJSONObject = localJSONObject.getJSONObject("deeplink_context");
            if (localJSONObject.has("promo_code")) {
              paramString.f = localJSONObject.getString("promo_code");
            }
          }
        }
        paramString.e = a(paramString.d);
        return paramString;
      }
    }
    catch (p paramString)
    {
      S.a(a, "Unable to parse AppLink JSON", paramString);
    }
    catch (JSONException paramString)
    {
      S.a(a, "Unable to parse AppLink JSON", paramString);
    }
    return null;
  }
  
  public static void a(Context paramContext, a parama)
  {
    b(paramContext, null, parama);
  }
  
  public static void b(Context paramContext, String paramString, a parama)
  {
    T.a(paramContext, "context");
    T.a(parama, "completionHandler");
    String str = paramString;
    if (paramString == null) {
      str = S.c(paramContext);
    }
    T.a(str, "applicationId");
    paramContext = paramContext.getApplicationContext();
    FacebookSdk.i().execute(new a(paramContext, str, parama));
  }
  
  private static void c(Context paramContext, String paramString, a parama)
  {
    Object localObject1 = new JSONObject();
    try
    {
      ((JSONObject)localObject1).put("event", "DEFERRED_APP_LINK");
      S.a((JSONObject)localObject1, com.facebook.internal.b.a(paramContext), AppEventsLogger.a(paramContext), FacebookSdk.a(paramContext));
      S.a((JSONObject)localObject1, FacebookSdk.d());
      ((JSONObject)localObject1).put("application_package_name", paramContext.getPackageName());
      paramString = String.format("%s/activities", new Object[] { paramString });
      Object localObject2 = null;
      b localb = null;
      paramContext = localb;
      try
      {
        localObject1 = E.a(null, paramString, (JSONObject)localObject1, null).b().b();
        paramString = (String)localObject2;
        if (localObject1 != null)
        {
          paramContext = localb;
          String str1 = ((JSONObject)localObject1).optString("applink_args");
          paramContext = localb;
          long l = ((JSONObject)localObject1).optLong("click_time", -1L);
          paramContext = localb;
          String str2 = ((JSONObject)localObject1).optString("applink_class");
          paramContext = localb;
          localObject1 = ((JSONObject)localObject1).optString("applink_url");
          paramContext = localb;
          paramString = (String)localObject2;
          if (!TextUtils.isEmpty(str1))
          {
            paramContext = localb;
            localb = a(str1);
            if (l != -1L)
            {
              paramContext = localb;
              try
              {
                paramString = localb.d;
                if (paramString != null)
                {
                  paramContext = localb;
                  localb.d.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", l);
                }
                paramContext = localb;
                if (localb.e != null)
                {
                  paramContext = localb;
                  localb.e.putString("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(l));
                }
              }
              catch (JSONException paramContext)
              {
                paramContext = localb;
                S.a(a, "Unable to put tap time in AppLinkData.arguments");
              }
            }
            if (str2 != null)
            {
              paramContext = localb;
              try
              {
                paramString = localb.d;
                if (paramString != null)
                {
                  paramContext = localb;
                  localb.d.put("com.facebook.platform.APPLINK_NATIVE_CLASS", str2);
                }
                paramContext = localb;
                if (localb.e != null)
                {
                  paramContext = localb;
                  localb.e.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", str2);
                }
              }
              catch (JSONException paramContext)
              {
                paramContext = localb;
                S.a(a, "Unable to put tap time in AppLinkData.arguments");
              }
            }
            paramString = localb;
            if (localObject1 != null)
            {
              paramContext = localb;
              try
              {
                paramString = localb.d;
                if (paramString != null)
                {
                  paramContext = localb;
                  localb.d.put("com.facebook.platform.APPLINK_NATIVE_URL", localObject1);
                }
                paramContext = localb;
                paramString = localb;
                if (localb.e != null)
                {
                  paramContext = localb;
                  localb.e.putString("com.facebook.platform.APPLINK_NATIVE_URL", (String)localObject1);
                  paramString = localb;
                }
              }
              catch (JSONException paramContext)
              {
                paramContext = localb;
                S.a(a, "Unable to put tap time in AppLinkData.arguments");
                paramString = localb;
              }
            }
          }
        }
        parama.a(paramString);
      }
      catch (Exception paramString)
      {
        S.a(a, "Unable to fetch deferred applink from server");
        paramString = paramContext;
      }
      return;
    }
    catch (JSONException paramContext)
    {
      throw new p("An error occurred while preparing deferred app link", paramContext);
    }
  }
  
  public Uri a()
  {
    return this.c;
  }
  
  public static abstract interface a
  {
    public abstract void a(b paramb);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/applinks/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */