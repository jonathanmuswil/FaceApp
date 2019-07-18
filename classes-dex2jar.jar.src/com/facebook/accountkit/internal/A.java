package com.facebook.accountkit.internal;

import Rm;
import Vm.a;
import Wm;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

final class a
{
  private final SharedPreferences a;
  
  a(Context paramContext)
  {
    this(paramContext.getSharedPreferences("com.facebook.accountkit.AccessTokenManager.SharedPreferences", 0));
  }
  
  a(SharedPreferences paramSharedPreferences)
  {
    this.a = paramSharedPreferences;
  }
  
  static Rm a(JSONObject paramJSONObject)
    throws JSONException
  {
    if (paramJSONObject.getInt("version") <= 1) {
      return new Rm(paramJSONObject.getString("token"), paramJSONObject.getString("account_id"), paramJSONObject.getString("application_id"), paramJSONObject.getLong("tokenRefreshIntervalInSeconds"), new Date(paramJSONObject.getLong("last_refresh")));
    }
    throw new Wm(Vm.a.d, O.j);
  }
  
  static JSONObject b(Rm paramRm)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("version", 1);
    localJSONObject.put("account_id", paramRm.l());
    localJSONObject.put("application_id", paramRm.m());
    localJSONObject.put("tokenRefreshIntervalInSeconds", paramRm.p());
    localJSONObject.put("last_refresh", paramRm.n().getTime());
    localJSONObject.put("token", paramRm.o());
    return localJSONObject;
  }
  
  public void a()
  {
    this.a.edit().remove("com.facebook.accountkit.AccessTokenManager.CachedAccessToken").apply();
  }
  
  public void a(Rm paramRm)
  {
    try
    {
      paramRm = b(paramRm);
      this.a.edit().putString("com.facebook.accountkit.AccessTokenManager.CachedAccessToken", paramRm.toString()).apply();
      return;
    }
    catch (JSONException paramRm)
    {
      for (;;) {}
    }
  }
  
  public Rm b()
  {
    Object localObject = this.a.getString("com.facebook.accountkit.AccessTokenManager.CachedAccessToken", null);
    if (localObject != null) {}
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>((String)localObject);
      localObject = a(localJSONObject);
      return (Rm)localObject;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */