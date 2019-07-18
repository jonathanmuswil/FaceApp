package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.facebook.internal.T;
import org.json.JSONException;
import org.json.JSONObject;

class c
{
  private final SharedPreferences a;
  private final a b;
  private K c;
  
  public c()
  {
    this(FacebookSdk.d().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new a());
  }
  
  c(SharedPreferences paramSharedPreferences, a parama)
  {
    this.a = paramSharedPreferences;
    this.b = parama;
  }
  
  private b c()
  {
    Object localObject = this.a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
    if (localObject != null) {}
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>((String)localObject);
      localObject = b.a(localJSONObject);
      return (b)localObject;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    return null;
  }
  
  private b d()
  {
    Object localObject = e().b();
    if ((localObject != null) && (K.d((Bundle)localObject))) {
      localObject = b.a((Bundle)localObject);
    } else {
      localObject = null;
    }
    return (b)localObject;
  }
  
  private K e()
  {
    if (this.c == null) {
      try
      {
        if (this.c == null) {
          this.c = this.b.a();
        }
      }
      finally {}
    }
    return this.c;
  }
  
  private boolean f()
  {
    return this.a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
  }
  
  private boolean g()
  {
    return FacebookSdk.o();
  }
  
  public void a()
  {
    this.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
    if (g()) {
      e().a();
    }
  }
  
  public void a(b paramb)
  {
    T.a(paramb, "accessToken");
    try
    {
      paramb = paramb.y();
      this.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", paramb.toString()).apply();
      return;
    }
    catch (JSONException paramb)
    {
      for (;;) {}
    }
  }
  
  public b b()
  {
    Object localObject;
    if (f())
    {
      localObject = c();
    }
    else if (g())
    {
      b localb = d();
      localObject = localb;
      if (localb != null)
      {
        a(localb);
        e().a();
        localObject = localb;
      }
    }
    else
    {
      localObject = null;
    }
    return (b)localObject;
  }
  
  static class a
  {
    public K a()
    {
      return new K(FacebookSdk.d());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */