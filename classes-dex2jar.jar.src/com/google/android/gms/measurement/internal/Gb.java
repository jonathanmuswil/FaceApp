package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.e;
import gd;
import java.util.Map;

public final class gb
  extends Db
{
  protected fb c;
  private volatile fb d;
  private fb e;
  private final Map<Activity, fb> f = new gd();
  private fb g;
  private String h;
  
  public gb(aa paramaa)
  {
    super(paramaa);
  }
  
  private static String a(String paramString)
  {
    paramString = paramString.split("\\.");
    if (paramString.length > 0) {
      paramString = paramString[(paramString.length - 1)];
    } else {
      paramString = "";
    }
    String str = paramString;
    if (paramString.length() > 100) {
      str = paramString.substring(0, 100);
    }
    return str;
  }
  
  private final void a(Activity paramActivity, fb paramfb, boolean paramBoolean)
  {
    fb localfb1;
    if (this.d == null) {
      localfb1 = this.e;
    } else {
      localfb1 = this.d;
    }
    fb localfb2 = paramfb;
    if (paramfb.b == null) {
      localfb2 = new fb(paramfb.a, a(paramActivity.getClass().getCanonicalName()), paramfb.c);
    }
    this.e = this.d;
    this.d = localfb2;
    n().a(new hb(this, paramBoolean, localfb1, localfb2));
  }
  
  public static void a(fb paramfb, Bundle paramBundle, boolean paramBoolean)
  {
    if ((paramBundle != null) && (paramfb != null) && ((!paramBundle.containsKey("_sc")) || (paramBoolean)))
    {
      String str = paramfb.a;
      if (str != null) {
        paramBundle.putString("_sn", str);
      } else {
        paramBundle.remove("_sn");
      }
      paramBundle.putString("_sc", paramfb.b);
      paramBundle.putLong("_si", paramfb.c);
      return;
    }
    if ((paramBundle != null) && (paramfb == null) && (paramBoolean))
    {
      paramBundle.remove("_sn");
      paramBundle.remove("_sc");
      paramBundle.remove("_si");
    }
  }
  
  private final void a(fb paramfb, boolean paramBoolean)
  {
    m().a(b().b());
    if (t().a(paramfb.d, paramBoolean)) {
      paramfb.d = false;
    }
  }
  
  private final fb d(Activity paramActivity)
  {
    t.a(paramActivity);
    fb localfb1 = (fb)this.f.get(paramActivity);
    fb localfb2 = localfb1;
    if (localfb1 == null)
    {
      localfb2 = new fb(null, a(paramActivity.getClass().getCanonicalName()), e().t());
      this.f.put(paramActivity, localfb2);
    }
    return localfb2;
  }
  
  public final fb A()
  {
    v();
    j();
    return this.c;
  }
  
  public final fb B()
  {
    h();
    return this.d;
  }
  
  public final void a(Activity paramActivity)
  {
    this.f.remove(paramActivity);
  }
  
  public final void a(Activity paramActivity, Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    paramBundle = paramBundle.getBundle("com.google.app_measurement.screen_service");
    if (paramBundle == null) {
      return;
    }
    paramBundle = new fb(paramBundle.getString("name"), paramBundle.getString("referrer_name"), paramBundle.getLong("id"));
    this.f.put(paramActivity, paramBundle);
  }
  
  public final void a(Activity paramActivity, String paramString1, String paramString2)
  {
    if (this.d == null)
    {
      c().v().a("setCurrentScreen cannot be called while no activity active");
      return;
    }
    if (this.f.get(paramActivity) == null)
    {
      c().v().a("setCurrentScreen must be called with an activity in the activity lifecycle");
      return;
    }
    String str = paramString2;
    if (paramString2 == null) {
      str = a(paramActivity.getClass().getCanonicalName());
    }
    boolean bool1 = this.d.b.equals(str);
    boolean bool2 = hc.d(this.d.a, paramString1);
    if ((bool1) && (bool2))
    {
      c().x().a("setCurrentScreen cannot be called with the same class and name");
      return;
    }
    if ((paramString1 != null) && ((paramString1.length() <= 0) || (paramString1.length() > 100)))
    {
      c().v().a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(paramString1.length()));
      return;
    }
    if ((str != null) && ((str.length() <= 0) || (str.length() > 100)))
    {
      c().v().a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
      return;
    }
    x localx = c().A();
    if (paramString1 == null) {
      paramString2 = "null";
    } else {
      paramString2 = paramString1;
    }
    localx.a("Setting current screen to name, class", paramString2, str);
    paramString1 = new fb(paramString1, str, e().t());
    this.f.put(paramActivity, paramString1);
    a(paramActivity, paramString1, true);
  }
  
  public final void a(String paramString, fb paramfb)
  {
    j();
    try
    {
      if ((this.h == null) || (this.h.equals(paramString)) || (paramfb != null))
      {
        this.h = paramString;
        this.g = paramfb;
      }
      return;
    }
    finally {}
  }
  
  public final void b(Activity paramActivity)
  {
    paramActivity = d(paramActivity);
    this.e = this.d;
    this.d = null;
    n().a(new ib(this, paramActivity));
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    paramActivity = (fb)this.f.get(paramActivity);
    if (paramActivity == null) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putLong("id", paramActivity.c);
    localBundle.putString("name", paramActivity.a);
    localBundle.putString("referrer_name", paramActivity.b);
    paramBundle.putBundle("com.google.app_measurement.screen_service", localBundle);
  }
  
  public final void c(Activity paramActivity)
  {
    a(paramActivity, d(paramActivity), false);
    paramActivity = m();
    long l = paramActivity.b().b();
    paramActivity.n().a(new Da(paramActivity, l));
  }
  
  protected final boolean y()
  {
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/gb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */