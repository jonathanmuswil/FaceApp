package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.E;
import com.facebook.FacebookSdk;
import com.facebook.I;
import com.facebook.L;
import com.facebook.internal.C;
import com.facebook.internal.H;
import com.facebook.internal.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class n
{
  private static final String a = "com.facebook.appevents.n";
  private static volatile g b = new g();
  private static final ScheduledExecutorService c = Executors.newSingleThreadScheduledExecutor();
  private static ScheduledFuture d;
  private static final Runnable e = new h();
  
  private static E a(b paramb, w paramw, boolean paramBoolean, t paramt)
  {
    Object localObject1 = paramb.b();
    boolean bool = false;
    y localy = C.a((String)localObject1, false);
    E localE = E.a(null, String.format("%s/activities", new Object[] { localObject1 }), null, null);
    Object localObject2 = localE.i();
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new Bundle();
    }
    ((Bundle)localObject1).putString("access_token", paramb.a());
    localObject2 = AppEventsLogger.e();
    if (localObject2 != null) {
      ((Bundle)localObject1).putString("device_token", (String)localObject2);
    }
    localE.a((Bundle)localObject1);
    if (localy != null) {
      bool = localy.k();
    }
    int i = paramw.a(localE, FacebookSdk.d(), bool, paramBoolean);
    if (i == 0) {
      return null;
    }
    paramt.a += i;
    localE.a(new l(paramb, localE, paramw, paramt));
    return localE;
  }
  
  private static t a(r paramr, g paramg)
  {
    t localt = new t();
    boolean bool = FacebookSdk.a(FacebookSdk.d());
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramg.b().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (b)localIterator.next();
      localObject = a((b)localObject, paramg.a((b)localObject), bool, localt);
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    if (localArrayList.size() > 0)
    {
      H.a(L.e, a, "Flushing %d events due to %s.", new Object[] { Integer.valueOf(localt.a), paramr.toString() });
      paramr = localArrayList.iterator();
      while (paramr.hasNext()) {
        ((E)paramr.next()).b();
      }
      return localt;
    }
    return null;
  }
  
  public static void a(b paramb, f paramf)
  {
    c.execute(new k(paramb, paramf));
  }
  
  public static void a(r paramr)
  {
    c.execute(new j(paramr));
  }
  
  private static void b(b paramb, E paramE, I paramI, w paramw, t paramt)
  {
    com.facebook.t localt = paramI.a();
    Object localObject = s.a;
    boolean bool = true;
    String str2;
    if (localt != null)
    {
      if (localt.m() == -1)
      {
        paramI = s.c;
        str2 = "Failed: No Connectivity";
      }
      else
      {
        str2 = String.format("Failed:\n  Response: %s\n  Error %s", new Object[] { paramI.toString(), localt.toString() });
        paramI = s.b;
      }
    }
    else
    {
      str2 = "Success";
      paramI = (I)localObject;
    }
    if (FacebookSdk.a(L.e))
    {
      localObject = (String)paramE.k();
      String str1;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>((String)localObject);
        localObject = localJSONArray.toString(2);
      }
      catch (JSONException localJSONException)
      {
        str1 = "<Can't encode events for debug logging>";
      }
      H.a(L.e, a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", new Object[] { paramE.f().toString(), str2, str1 });
    }
    if (localt == null) {
      bool = false;
    }
    paramw.a(bool);
    if (paramI == s.c) {
      FacebookSdk.i().execute(new m(paramb, paramw));
    }
    if ((paramI != s.a) && (paramt.b != s.c)) {
      paramt.b = paramI;
    }
  }
  
  static void b(r paramr)
  {
    Object localObject = o.a();
    b.a((v)localObject);
    try
    {
      localObject = a(paramr, b);
      if (localObject != null)
      {
        paramr = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
        paramr.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", ((t)localObject).a);
        paramr.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", ((t)localObject).b);
        android.support.v4.content.g.a(FacebookSdk.d()).a(paramr);
      }
      return;
    }
    catch (Exception paramr)
    {
      Log.w(a, "Caught unexpected exception while flushing app events: ", paramr);
    }
  }
  
  public static Set<b> e()
  {
    return b.b();
  }
  
  public static void f()
  {
    c.execute(new i());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/appevents/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */