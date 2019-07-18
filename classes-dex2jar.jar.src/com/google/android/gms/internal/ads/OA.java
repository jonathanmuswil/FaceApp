package com.google.android.gms.internal.ads;

import Fq;
import Gq;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.i;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

@yh
public final class oa
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  private final Object a = new Object();
  private final ConditionVariable b = new ConditionVariable();
  private volatile boolean c = false;
  private volatile boolean d = false;
  private SharedPreferences e = null;
  private Bundle f = new Bundle();
  private Context g;
  private JSONObject h = new JSONObject();
  
  private final void b()
  {
    if (this.e == null) {
      return;
    }
    try
    {
      Object localObject1 = this.g;
      Object localObject2 = new com/google/android/gms/internal/ads/pa;
      ((pa)localObject2).<init>(this);
      localObject2 = (String)zl.a((Context)localObject1, (Callable)localObject2);
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>((String)localObject2);
      this.h = ((JSONObject)localObject1);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public final <T> T a(ga<T> paramga)
  {
    if (!this.b.block(5000L)) {
      synchronized (this.a)
      {
        if (!this.d)
        {
          paramga = new java/lang/IllegalStateException;
          paramga.<init>("Flags.initialize() was not called!");
          throw paramga;
        }
      }
    }
    if ((!this.c) || (this.e == null)) {}
    synchronized (this.a)
    {
      if ((this.c) && (this.e != null))
      {
        if (paramga.b() == 2)
        {
          ??? = this.f;
          if (??? == null) {
            return (T)paramga.c();
          }
          return (T)paramga.a((Bundle)???);
        }
        if ((paramga.b() == 1) && (this.h.has(paramga.a()))) {
          return (T)paramga.a(this.h);
        }
        return (T)zl.a(this.g, new qa(this, paramga));
      }
      paramga = paramga.c();
      return paramga;
    }
  }
  
  public final void a(Context paramContext)
  {
    if (this.c) {
      return;
    }
    Object localObject2;
    synchronized (this.a)
    {
      if (this.c) {
        return;
      }
      if (!this.d) {
        this.d = true;
      }
      if (paramContext.getApplicationContext() == null) {
        localObject2 = paramContext;
      } else {
        localObject2 = paramContext.getApplicationContext();
      }
      this.g = ((Context)localObject2);
    }
    try
    {
      this.f = Gq.a(this.g).a(this.g.getPackageName(), 128).metaData;
      try
      {
        Context localContext = i.getRemoteContext(paramContext);
        localObject2 = localContext;
        if (localContext == null)
        {
          localObject2 = localContext;
          if (paramContext != null)
          {
            localContext = paramContext.getApplicationContext();
            localObject2 = localContext;
            if (localContext == null) {
              localObject2 = paramContext;
            }
          }
        }
        if (localObject2 == null)
        {
          this.d = false;
          this.b.open();
          return;
        }
        Kea.c();
        this.e = ((Context)localObject2).getSharedPreferences("google_ads_flags", 0);
        if (this.e != null) {
          this.e.registerOnSharedPreferenceChangeListener(this);
        }
        b();
        this.c = true;
        this.d = false;
        this.b.open();
        return;
      }
      finally
      {
        this.d = false;
        this.b.open();
      }
      paramContext = finally;
      throw paramContext;
    }
    catch (PackageManager.NameNotFoundException|NullPointerException localNameNotFoundException)
    {
      for (;;) {}
    }
  }
  
  public final void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    if ("flag_configuration".equals(paramString)) {
      b();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */