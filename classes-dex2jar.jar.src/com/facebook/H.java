package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.S;
import com.facebook.internal.T;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

public final class h
{
  private static volatile h a;
  private final android.support.v4.content.g b;
  private final c c;
  private b d;
  private AtomicBoolean e = new AtomicBoolean(false);
  private Date f = new Date(0L);
  
  h(android.support.v4.content.g paramg, c paramc)
  {
    T.a(paramg, "localBroadcastManager");
    T.a(paramc, "accessTokenCache");
    this.b = paramg;
    this.c = paramc;
  }
  
  private static E a(b paramb, E.b paramb1)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("grant_type", "fb_extend_sso_token");
    return new E(paramb, "oauth/access_token", localBundle, J.a, paramb1);
  }
  
  private void a(b paramb1, b paramb2)
  {
    Intent localIntent = new Intent(FacebookSdk.d(), CurrentAccessTokenExpirationBroadcastReceiver.class);
    localIntent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
    localIntent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", paramb1);
    localIntent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", paramb2);
    this.b.a(localIntent);
  }
  
  private void a(b paramb, boolean paramBoolean)
  {
    b localb = this.d;
    this.d = paramb;
    this.e.set(false);
    this.f = new Date(0L);
    if (paramBoolean) {
      if (paramb != null)
      {
        this.c.a(paramb);
      }
      else
      {
        this.c.a();
        S.a(FacebookSdk.d());
      }
    }
    if (!S.a(localb, paramb))
    {
      a(localb, paramb);
      f();
    }
  }
  
  private static E b(b paramb, E.b paramb1)
  {
    return new E(paramb, "me/permissions", new Bundle(), J.a, paramb1);
  }
  
  private void b(b.a parama)
  {
    b localb = this.d;
    if (localb == null)
    {
      if (parama != null) {
        parama.a(new p("No current access token to refresh"));
      }
      return;
    }
    if (!this.e.compareAndSet(false, true))
    {
      if (parama != null) {
        parama.a(new p("Refresh already in progress"));
      }
      return;
    }
    this.f = new Date();
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
    a locala = new a(null);
    H localH = new H(new E[] { b(localb, new e(this, localAtomicBoolean, localHashSet1, localHashSet2)), a(localb, new f(this, locala)) });
    localH.a(new g(this, localb, parama, localAtomicBoolean, locala, localHashSet1, localHashSet2));
    localH.o();
  }
  
  static h d()
  {
    if (a == null) {
      try
      {
        if (a == null)
        {
          android.support.v4.content.g localg = android.support.v4.content.g.a(FacebookSdk.d());
          c localc = new com/facebook/c;
          localc.<init>();
          h localh = new com/facebook/h;
          localh.<init>(localg, localc);
          a = localh;
        }
      }
      finally {}
    }
    return a;
  }
  
  private void f()
  {
    Object localObject = FacebookSdk.d();
    b localb = b.n();
    AlarmManager localAlarmManager = (AlarmManager)((Context)localObject).getSystemService("alarm");
    if ((b.w()) && (localb.q() != null) && (localAlarmManager != null))
    {
      Intent localIntent = new Intent((Context)localObject, CurrentAccessTokenExpirationBroadcastReceiver.class);
      localIntent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
      localObject = PendingIntent.getBroadcast((Context)localObject, 0, localIntent, 0);
      localAlarmManager.set(1, localb.q().getTime(), (PendingIntent)localObject);
    }
  }
  
  private boolean g()
  {
    Object localObject = this.d;
    boolean bool1 = false;
    if (localObject == null) {
      return false;
    }
    localObject = Long.valueOf(new Date().getTime());
    boolean bool2 = bool1;
    if (this.d.t().a())
    {
      bool2 = bool1;
      if (((Long)localObject).longValue() - this.f.getTime() > 3600000L)
      {
        bool2 = bool1;
        if (((Long)localObject).longValue() - this.d.r().getTime() > 86400000L) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  void a()
  {
    b localb = this.d;
    a(localb, localb);
  }
  
  void a(b.a parama)
  {
    if (Looper.getMainLooper().equals(Looper.myLooper())) {
      b(parama);
    } else {
      new Handler(Looper.getMainLooper()).post(new d(this, parama));
    }
  }
  
  void a(b paramb)
  {
    a(paramb, true);
  }
  
  void b()
  {
    if (!g()) {
      return;
    }
    a(null);
  }
  
  b c()
  {
    return this.d;
  }
  
  boolean e()
  {
    b localb = this.c.b();
    if (localb != null)
    {
      a(localb, false);
      return true;
    }
    return false;
  }
  
  private static class a
  {
    public String a;
    public int b;
    public Long c;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */