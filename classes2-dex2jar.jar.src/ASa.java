import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.android.billingclient.api.I;
import com.crashlytics.android.a;
import com.facebook.appevents.AppEventsLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class asa
{
  private static final boolean a = true;
  private static FirebaseAnalytics b;
  private static AppEventsLogger c;
  public static final asa d = new asa();
  
  private final void a(asa.a parama, String paramString1, String paramString2)
  {
    icb.a locala;
    StringBuilder localStringBuilder;
    if (bsa.a[parama.ordinal()] != 1)
    {
      locala = icb.a("Metrica");
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("event ");
      localStringBuilder.append(parama);
      localStringBuilder.append(", ");
      localStringBuilder.append(paramString1);
      localStringBuilder.append(", ");
      localStringBuilder.append(paramString2);
      locala.d(localStringBuilder.toString(), new Object[0]);
    }
    else
    {
      locala = icb.a("Metrica");
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Error: event ");
      localStringBuilder.append(parama);
      localStringBuilder.append(", ");
      localStringBuilder.append(paramString1);
      localStringBuilder.append(", ");
      localStringBuilder.append(paramString2);
      locala.b(localStringBuilder.toString(), new Object[0]);
    }
    if (a)
    {
      paramString1 = g(paramString1, paramString2);
      b(parama.name(), paramString1);
      a(parama.name(), paramString1);
    }
  }
  
  private final void a(asa.a parama, Map<String, String> paramMap)
  {
    String str;
    if (paramMap != null) {
      str = paramMap.toString();
    } else {
      str = null;
    }
    Object localObject1;
    Object localObject2;
    if (bsa.b[parama.ordinal()] != 1)
    {
      localObject1 = icb.a("Metrica");
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("event ");
      ((StringBuilder)localObject2).append(parama);
      ((StringBuilder)localObject2).append(", params=");
      ((StringBuilder)localObject2).append(str);
      ((icb.a)localObject1).d(((StringBuilder)localObject2).toString(), new Object[0]);
    }
    else
    {
      localObject2 = icb.a("Metrica");
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Error: event ");
      ((StringBuilder)localObject1).append(parama);
      ((StringBuilder)localObject1).append(", params=");
      ((StringBuilder)localObject1).append(str);
      ((icb.a)localObject2).b(((StringBuilder)localObject1).toString(), new Object[0]);
    }
    if (a)
    {
      paramMap = b(paramMap);
      b(parama.name(), paramMap);
      a(parama.name(), paramMap);
    }
  }
  
  private final void a(I paramI)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("fb_currency", paramI.b());
    localBundle.putString("fb_content_type", paramI.e());
    localBundle.putString("fb_content_id", paramI.c());
    localBundle.putInt("fb_num_items", 1);
    localBundle.putInt("fb_payment_info_available", 0);
    AppEventsLogger localAppEventsLogger = c;
    if (localAppEventsLogger != null)
    {
      localAppEventsLogger.a("fb_mobile_initiated_checkout", paramI.a() / 1000000, localBundle);
      return;
    }
    oXa.b("facebookAnalytics");
    throw null;
  }
  
  private final void a(String paramString, Bundle paramBundle)
  {
    AppEventsLogger localAppEventsLogger = c;
    if (localAppEventsLogger != null)
    {
      localAppEventsLogger.a(paramString, paramBundle);
      return;
    }
    oXa.b("facebookAnalytics");
    throw null;
  }
  
  private final Bundle b(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    Bundle localBundle = new Bundle(paramMap.size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      localBundle.putString((String)paramMap.getKey(), (String)paramMap.getValue());
    }
    return localBundle;
  }
  
  private final void b(I paramI)
  {
    Object localObject = paramI.c();
    int i;
    if (oXa.a(localObject, qja.a.f()))
    {
      i = 10;
    }
    else if (oXa.a(localObject, qja.b.f()))
    {
      i = 25;
    }
    else
    {
      if (!oXa.a(localObject, qja.e.f())) {
        return;
      }
      i = 40;
    }
    localObject = new Bundle();
    ((Bundle)localObject).putInt("fb_num_items", 1);
    ((Bundle)localObject).putString("fb_currency", "USD");
    ((Bundle)localObject).putString("fb_content_id", paramI.c());
    ((Bundle)localObject).putString("fb_content_type", paramI.e());
    paramI = Currency.getInstance("USD");
    AppEventsLogger localAppEventsLogger = c;
    if (localAppEventsLogger != null)
    {
      localAppEventsLogger.a(new BigDecimal(i), paramI, (Bundle)localObject);
      return;
    }
    oXa.b("facebookAnalytics");
    throw null;
  }
  
  private final void b(String paramString, Bundle paramBundle)
  {
    FirebaseAnalytics localFirebaseAnalytics = b;
    if (localFirebaseAnalytics != null)
    {
      localFirebaseAnalytics.a(paramString, paramBundle);
      return;
    }
    oXa.b("firebaseAnalytics");
    throw null;
  }
  
  private final void c(I paramI)
  {
    paramI = paramI.c();
    if (oXa.a(paramI, qja.a.f())) {
      paramI = "fb_mobile_level_achieved";
    } else if (oXa.a(paramI, qja.b.f())) {
      paramI = "fb_mobile_add_to_cart";
    } else if (oXa.a(paramI, qja.e.f())) {
      paramI = "fb_mobile_add_to_wishlist";
    } else if (oXa.a(paramI, qja.d.f())) {
      paramI = "fb_mobile_add_payment_info";
    } else {
      paramI = null;
    }
    if (paramI != null)
    {
      AppEventsLogger localAppEventsLogger = c;
      if (localAppEventsLogger != null)
      {
        localAppEventsLogger.a(paramI);
      }
      else
      {
        oXa.b("facebookAnalytics");
        throw null;
      }
    }
  }
  
  private final void d(I paramI)
  {
    csa localcsa = csa.b;
    String str = paramI.c();
    if (oXa.a(str, qja.a.f()))
    {
      localcsa.a(paramI, 10.0D);
    }
    else if (oXa.a(str, qja.b.f()))
    {
      localcsa.a(paramI, 12.5D);
      localcsa.a(paramI, 12.5D);
    }
    else if (oXa.a(str, qja.e.f()))
    {
      localcsa.a(paramI, 13.33D);
      localcsa.a(paramI, 13.33D);
      localcsa.a(paramI, 13.33D);
    }
  }
  
  private final void e(I paramI)
  {
    Object localObject = paramI.c();
    double d1;
    if (oXa.a(localObject, qja.a.f()))
    {
      d1 = 10.0D;
    }
    else if (oXa.a(localObject, qja.b.f()))
    {
      d1 = 25.0D;
    }
    else
    {
      if (!oXa.a(localObject, qja.e.f())) {
        return;
      }
      d1 = 40.0D;
    }
    localObject = new Bundle();
    ((Bundle)localObject).putString("item_id", paramI.c());
    ((Bundle)localObject).putDouble("value", d1);
    ((Bundle)localObject).putString("currency", "USD");
    paramI = b;
    if (paramI != null)
    {
      paramI.a("add_to_wishlist", (Bundle)localObject);
      return;
    }
    oXa.b("firebaseAnalytics");
    throw null;
  }
  
  private final Bundle g(String paramString1, String paramString2)
  {
    if ((paramString1 == null) && (paramString2 == null)) {
      return null;
    }
    Bundle localBundle = new Bundle(2);
    if (paramString1 != null) {
      localBundle.putString("action", paramString1);
    }
    if (paramString2 != null) {
      localBundle.putString("label", paramString2);
    }
    return localBundle;
  }
  
  public final void a()
  {
    if (a) {
      a(this, "fb_mobile_rate", null, 2, null);
    }
  }
  
  public final void a(Rja paramRja, boolean paramBoolean)
  {
    oXa.b(paramRja, "imageDesc");
    if ((paramRja instanceof Vja)) {
      paramRja = "asset";
    } else if ((paramRja instanceof Uja)) {
      paramRja = "social";
    } else if ((paramRja instanceof Sja)) {
      paramRja = "camera";
    } else if ((paramRja instanceof Wja)) {
      paramRja = "celebs";
    } else if ((paramRja instanceof Tja)) {
      paramRja = "demo";
    } else if ((paramRja instanceof Xja)) {
      paramRja = "shared";
    } else {
      paramRja = null;
    }
    if (paramRja != null)
    {
      paramRja = DWa.b(new WVa[] { ZVa.a("type", paramRja), ZVa.a("collage", String.valueOf(paramBoolean)) });
      d.a(asa.a.s, paramRja);
    }
  }
  
  public final void a(Activity paramActivity, String paramString)
  {
    oXa.b(paramActivity, "activity");
    oXa.b(paramString, "screenName");
    if (a)
    {
      FirebaseAnalytics localFirebaseAnalytics = b;
      if (localFirebaseAnalytics != null)
      {
        localFirebaseAnalytics.setCurrentScreen(paramActivity, null, paramString);
      }
      else
      {
        oXa.b("firebaseAnalytics");
        throw null;
      }
    }
  }
  
  public final void a(Context paramContext)
  {
    oXa.b(paramContext, "context");
    FirebaseAnalytics localFirebaseAnalytics = FirebaseAnalytics.getInstance(paramContext);
    oXa.a(localFirebaseAnalytics, "FirebaseAnalytics.getInstance(context)");
    b = localFirebaseAnalytics;
    paramContext = AppEventsLogger.newLogger(paramContext);
    oXa.a(paramContext, "AppEventsLogger.newLogger(context)");
    c = paramContext;
  }
  
  public final void a(I paramI, String paramString)
  {
    oXa.b(paramI, "skuDetails");
    oXa.b(paramString, "from");
    if (a)
    {
      a(paramI);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[item]: ");
      localStringBuilder.append(paramI.c());
      localStringBuilder.append(" [from]: ");
      localStringBuilder.append(paramString);
      c("buy_button_clicked", localStringBuilder.toString());
    }
  }
  
  public final void a(String paramString)
  {
    oXa.b(paramString, "event");
    a(this, asa.a.o, paramString, null, 4, null);
  }
  
  public final void a(String paramString, int paramInt)
  {
    oXa.b(paramString, "propertyName");
    icb.a locala = icb.a("UserProperty");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(" = ");
    ((StringBuilder)localObject).append(paramInt);
    locala.a(((StringBuilder)localObject).toString(), new Object[0]);
    a.a(paramString, paramInt);
    if (a)
    {
      localObject = b;
      if (localObject != null)
      {
        ((FirebaseAnalytics)localObject).a(paramString, String.valueOf(paramInt));
      }
      else
      {
        oXa.b("firebaseAnalytics");
        throw null;
      }
    }
  }
  
  public final void a(String paramString, long paramLong)
  {
    oXa.b(paramString, "propertyName");
    icb.a locala = icb.a("UserProperty");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(" = ");
    ((StringBuilder)localObject).append(paramLong);
    locala.a(((StringBuilder)localObject).toString(), new Object[0]);
    a.a(paramString, paramLong);
    if (a)
    {
      localObject = b;
      if (localObject != null)
      {
        ((FirebaseAnalytics)localObject).a(paramString, String.valueOf(paramLong));
      }
      else
      {
        oXa.b("firebaseAnalytics");
        throw null;
      }
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "experimentName");
    oXa.b(paramString2, "groupName");
    a(asa.a.c, paramString1, paramString2);
  }
  
  public final void a(String paramString, Throwable paramThrowable)
  {
    oXa.b(paramString, "message");
    asa.a locala = asa.a.a;
    if (paramThrowable != null)
    {
      String str = paramThrowable.getMessage();
      if (str != null)
      {
        paramThrowable = str;
        break label55;
      }
    }
    if (paramThrowable != null)
    {
      paramThrowable = paramThrowable.getClass();
      if (paramThrowable != null)
      {
        paramThrowable = paramThrowable.getSimpleName();
        break label55;
      }
    }
    paramThrowable = null;
    label55:
    a(locala, paramString, paramThrowable);
  }
  
  public final void a(Throwable paramThrowable)
  {
    oXa.b(paramThrowable, "e");
    asa.a locala = asa.a.a;
    String str = paramThrowable.getMessage();
    if (str != null)
    {
      paramThrowable = str;
    }
    else
    {
      paramThrowable = paramThrowable.getClass().getSimpleName();
      oXa.a(paramThrowable, "e.javaClass.simpleName");
    }
    a(this, locala, paramThrowable, null, 4, null);
  }
  
  public final void a(Map<String, String> paramMap)
  {
    oXa.b(paramMap, "params");
    a(asa.a.r, paramMap);
  }
  
  public final void b()
  {
    if (a) {
      a(this, "fb_mobile_achievement_unlocked", null, 2, null);
    }
  }
  
  public final void b(I paramI, String paramString)
  {
    oXa.b(paramI, "skuDetails");
    oXa.b(paramString, "from");
    b(paramI);
    c(paramI);
    e(paramI);
    d(paramI);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("[item]: ");
    ((StringBuilder)localObject).append(paramI.c());
    ((StringBuilder)localObject).append(", [from]: ");
    ((StringBuilder)localObject).append(paramString);
    c("buy_success", ((StringBuilder)localObject).toString());
    localObject = asa.a.g;
    paramI = paramI.c();
    oXa.a(paramI, "skuDetails.sku");
    a((asa.a)localObject, paramI, paramString);
  }
  
  public final void b(String paramString)
  {
    oXa.b(paramString, "eventName");
    a(this, asa.a.b, paramString, null, 4, null);
  }
  
  public final void b(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "paramName");
    oXa.b(paramString2, "value");
    a(asa.a.p, paramString1, paramString2);
  }
  
  public final void c(String paramString)
  {
    oXa.b(paramString, "responseCode");
    a(this, asa.a.e, paramString, null, 4, null);
  }
  
  public final void c(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "eventName");
    a(asa.a.d, paramString1, paramString2);
  }
  
  public final void d(String paramString)
  {
    oXa.b(paramString, "market");
    a(this, asa.a.n, paramString, null, 4, null);
  }
  
  public final void d(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "eventName");
    a(asa.a.k, paramString1, paramString2);
  }
  
  public final void e(String paramString)
  {
    oXa.b(paramString, "action");
    a(this, asa.a.m, paramString, null, 4, null);
  }
  
  public final void e(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "shareWith");
    oXa.b(paramString2, "shareFrom");
    a(asa.a.i, paramString1, paramString2);
  }
  
  public final void f(String paramString)
  {
    oXa.b(paramString, "from");
    a(this, asa.a.l, paramString, null, 4, null);
  }
  
  public final void f(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "propertyName");
    oXa.b(paramString2, "propertyValue");
    Object localObject = icb.a("UserProperty");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" = ");
    localStringBuilder.append(paramString2);
    ((icb.a)localObject).a(localStringBuilder.toString(), new Object[0]);
    a.a(paramString1, paramString2);
    if (a)
    {
      localObject = b;
      if (localObject != null)
      {
        ((FirebaseAnalytics)localObject).a(paramString1, paramString2);
      }
      else
      {
        oXa.b("firebaseAnalytics");
        throw null;
      }
    }
  }
  
  public final void g(String paramString)
  {
    oXa.b(paramString, "uploadStage");
    a(this, asa.a.h, paramString, null, 4, null);
  }
  
  public final void h(String paramString)
  {
    oXa.b(paramString, "availabilityStatus");
    a(this, asa.a.f, paramString, null, 4, null);
  }
  
  public final void i(String paramString)
  {
    oXa.b(paramString, "event");
    a(this, asa.a.j, paramString, null, 4, null);
  }
  
  public final void j(String paramString)
  {
    oXa.b(paramString, "event");
    a(this, asa.a.q, paramString, null, 4, null);
  }
  
  public final void k(String paramString)
  {
    oXa.b(paramString, "message");
    icb.a locala = icb.a("Metrica");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Wtf: ");
    localStringBuilder.append(paramString);
    locala.b(localStringBuilder.toString(), new Object[0]);
    a.a(new IllegalStateException(paramString));
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("ERROR", 0);
      a = locala1;
      a locala2 = new a("ERROR_429", 1);
      b = locala2;
      a locala3 = new a("AB_TEST", 2);
      c = locala3;
      a locala4 = new a("IN_APP_PURCHASE", 3);
      d = locala4;
      a locala5 = new a("IAB_SUBSCRIPTIONS_SUPPORTED", 4);
      e = locala5;
      a locala6 = new a("PLAY_SERVICES_AVAILABILITY", 5);
      f = locala6;
      a locala7 = new a("PURCHASE_SUCCESS", 6);
      g = locala7;
      a locala8 = new a("DEFAULT_PHOTO_UPLOAD", 7);
      h = locala8;
      a locala9 = new a("SHARE", 8);
      i = locala9;
      a locala10 = new a("RATE_V2", 9);
      j = locala10;
      a locala11 = new a("PRO_USERS", 10);
      k = locala11;
      a locala12 = new a("OPEN_PRO_SCREEN", 11);
      l = locala12;
      a locala13 = new a("ONBOARDING", 12);
      m = locala13;
      a locala14 = new a("INSTALL_MARKET", 13);
      n = locala14;
      a locala15 = new a("ADS", 14);
      o = locala15;
      a locala16 = new a("ADS_TRACKING", 15);
      p = locala16;
      a locala17 = new a("SAFETY_NET", 16);
      q = locala17;
      a locala18 = new a("IMAGE_EDITOR_SAVED_INFO", 17);
      r = locala18;
      a locala19 = new a("UPM_START", 18);
      s = locala19;
      t = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7, locala8, locala9, locala10, locala11, locala12, locala13, locala14, locala15, locala16, locala17, locala18, locala19 };
    }
    
    private a() {}
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/asa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */