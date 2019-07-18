package io.faceapp;

import Bna;
import FVa;
import Hm;
import Il;
import Il.a;
import Kra;
import Loa;
import Mra;
import Naa;
import Naa.a;
import Nra;
import QQa;
import QVa;
import RVa;
import Rra;
import SOa;
import SX;
import Uaa;
import Uma;
import XPa;
import XXa;
import Xa;
import Zaa;
import Zma;
import _Pa;
import _ra;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.provider.Settings.Secure;
import asa;
import com.crashlytics.android.a.a;
import com.google.firebase.FirebaseApp;
import com.jakewharton.processphoenix.ProcessPhoenix;
import dsa;
import eoa;
import hda;
import icb;
import isa;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import msa;
import oXa;
import rXa;
import vXa;
import vda;
import vsa;
import zVa;
import zYa;
import zia;

public final class FaceApplication
  extends Xa
{
  public static Context a;
  private static final FVa<Boolean> b;
  private static final QVa c = RVa.a(c.b);
  public static final a d = new a(null);
  
  static
  {
    FVa localFVa = FVa.f(Boolean.valueOf(false));
    oXa.a(localFVa, "BehaviorSubject.createDefault(false)");
    b = localFVa;
  }
  
  private final void d()
  {
    hda.c.a(this);
  }
  
  private final void e()
  {
    Object localObject = Loa.a;
    String str = Settings.Secure.getString(getContentResolver(), "android_id");
    oXa.a(str, "Settings.Secure.getStrin…ttings.Secure.ANDROID_ID)");
    localObject = ((Loa)localObject).a(zYa.a(str, 16, '0'));
    long l = System.currentTimeMillis() / 'Ϩ';
    Uma.qa.m().set(localObject);
    Uma.qa.s().set(Long.valueOf(l));
    Uma.qa.t().set("3.4.8");
    Uma.qa.v().set("3.4.8");
    Uma.qa.a().set(Integer.valueOf(8));
  }
  
  private final void f()
  {
    Uma.qa.a(this);
  }
  
  private final void g()
  {
    Nra.c.a(this);
  }
  
  private final void h()
  {
    Object localObject1 = new Il.a();
    ((Il.a)localObject1).a(false);
    Object localObject2 = ((Il.a)localObject1).a();
    localObject1 = new a.a();
    ((a.a)localObject1).a((Il)localObject2);
    localObject1 = ((a.a)localObject1).a();
    localObject2 = new Naa.a(this);
    ((Naa.a)localObject2).a(new Zaa());
    ((Naa.a)localObject2).a(new Uaa[] { localObject1 });
    Naa.c(((Naa.a)localObject2).a());
  }
  
  private final void i() {}
  
  private final void j()
  {
    Thread.setDefaultUncaughtExceptionHandler(new SOa());
  }
  
  private final void k()
  {
    Rra.a.a(this);
  }
  
  private final void l()
  {
    eoa.j.a(this);
    Bna.e.a(this);
  }
  
  private final void m()
  {
    zia.l.a(this);
  }
  
  private final void n()
  {
    SX.a(this);
  }
  
  private final void o()
  {
    asa.d.a(this);
  }
  
  @SuppressLint({"CheckResult"})
  private final void p()
  {
    vda.b.a().c(d.a);
  }
  
  private final void q()
  {
    FirebaseApp.a(this);
    isa.d.c();
  }
  
  private final void r()
  {
    zVa.a(e.a);
  }
  
  private final void s()
  {
    msa.a.a(this);
  }
  
  private final void t()
  {
    icb.a(new _Pa(_ra.h.a(System.currentTimeMillis())));
    icb.a(new XPa());
  }
  
  private final void u()
  {
    if (!Uma.qa.a().a())
    {
      e();
      return;
    }
    Object localObject1 = Uma.qa.a().get();
    oXa.a(localObject1, "AppPreferences.appConfigVersion.get()");
    int i = ((Number)localObject1).intValue();
    Object localObject2;
    if (i < 1)
    {
      localObject1 = Loa.a;
      localObject2 = Settings.Secure.getString(getContentResolver(), "android_id");
      oXa.a(localObject2, "Settings.Secure.getStrin…ttings.Secure.ANDROID_ID)");
      localObject2 = ((Loa)localObject1).a((String)localObject2);
      localObject1 = d.b().b();
      long l;
      if (localObject1 != null) {
        l = ((Long)localObject1).longValue();
      } else {
        l = System.currentTimeMillis() / 'Ϩ';
      }
      Uma.qa.m().set(localObject2);
      Uma.qa.s().set(Long.valueOf(l));
      Uma.qa.t().set("3.4.8");
    }
    boolean bool1 = false;
    if (i < 2)
    {
      int j;
      if (((Number)Uma.qa.a("rate_us_last_show_date").get()).longValue() > 0L) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0) {
        dsa.a.a();
      }
    }
    if (i < 4)
    {
      localObject1 = Uma.qa.m().get();
      oXa.a(localObject1, "AppPreferences.deviceId.get()");
      localObject1 = (String)localObject1;
      if (((String)localObject1).length() < 16)
      {
        Kra.b.f();
        localObject1 = zYa.a((String)localObject1, 16, '0');
        Uma.qa.m().set(localObject1);
      }
    }
    if (i < 5)
    {
      localObject1 = Uma.qa.m().get();
      oXa.a(localObject1, "AppPreferences.deviceId.get()");
      if (zYa.a((String)localObject1, '0', false, 2, null))
      {
        Kra.b.f();
        vsa.a.a();
        Uma.qa.ha().c();
        localObject2 = Loa.a;
        localObject1 = Settings.Secure.getString(getContentResolver(), "android_id");
        oXa.a(localObject1, "Settings.Secure.getStrin…ttings.Secure.ANDROID_ID)");
        localObject1 = ((Loa)localObject2).a(zYa.a((String)localObject1, 16, '0'));
        Uma.qa.m().set(localObject1);
      }
    }
    if (i < 6) {
      vsa.a.a();
    }
    if (i < 7)
    {
      localObject1 = Uma.qa.a("show_watermark_fun", true).get();
      oXa.a(localObject1, "AppPreferences.getBoolea…termark_fun\", true).get()");
      boolean bool2 = ((Boolean)localObject1).booleanValue();
      localObject1 = Uma.qa.a("show_watermark_layouts", true).get();
      oXa.a(localObject1, "AppPreferences.getBoolea…ark_layouts\", true).get()");
      boolean bool3 = ((Boolean)localObject1).booleanValue();
      boolean bool4 = bool1;
      if (bool2)
      {
        bool4 = bool1;
        if (bool3) {
          bool4 = true;
        }
      }
      Uma.qa.la().set(Boolean.valueOf(bool4));
    }
    if (i < 8) {
      vsa.a.a();
    }
    Uma.qa.a().set(Integer.valueOf(8));
    if ((oXa.a("3.4.8", (String)Uma.qa.v().get()) ^ true))
    {
      localObject1 = Uma.qa.v().get();
      if (!(oXa.a((String)localObject1, "0.0.0") ^ true)) {
        localObject1 = null;
      }
      localObject1 = (String)localObject1;
      if (localObject1 == null) {
        localObject1 = "Unknown";
      }
      oXa.a(localObject1, "AppPreferences.lastLaunc…!= \"0.0.0\" } ?: \"Unknown\"");
      String str = new SimpleDateFormat("dd.MM HH:mm:ss.SSS", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
      Hm localHm = Uma.qa.u();
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("updated from v");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(", curVersion first launched ");
      ((StringBuilder)localObject2).append(str);
      localHm.set(((StringBuilder)localObject2).toString());
    }
    Uma.qa.v().set("3.4.8");
  }
  
  public void onCreate()
  {
    super.onCreate();
    if (SX.a(this)) {
      return;
    }
    if (ProcessPhoenix.a(this)) {
      return;
    }
    Context localContext = getApplicationContext();
    oXa.a(localContext, "applicationContext");
    a = localContext;
    n();
    h();
    f();
    _ra.h.a(this);
    t();
    o();
    u();
    Mra.c.a(this);
    r();
    j();
    q();
    k();
    p();
    g();
    d();
    m();
    l();
    s();
    b.a.a();
    b.a.a(this);
    i();
  }
  
  public static final class a
  {
    static
    {
      rXa localrXa = new rXa(vXa.a(a.class), "cacheDB", "getCacheDB()Lio/faceapp/repository/CacheDB;");
      vXa.a(localrXa);
      a = new XXa[] { localrXa };
    }
    
    public final Context a()
    {
      Context localContext = FaceApplication.a();
      if (localContext != null) {
        return localContext;
      }
      oXa.b("appContext");
      throw null;
    }
    
    public final Zma b()
    {
      QVa localQVa = FaceApplication.b();
      Object localObject = FaceApplication.d;
      localObject = a[0];
      return (Zma)localQVa.getValue();
    }
    
    public final FVa<Boolean> c()
    {
      return FaceApplication.c();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/io/faceapp/FaceApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */