import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.C;
import com.facebook.internal.T;
import com.facebook.internal.y;
import java.math.BigDecimal;
import java.util.Currency;
import org.json.JSONException;
import org.json.JSONObject;

public class _n
{
  private static final String a = "_n";
  private static final ho b = new ho(FacebookSdk.d());
  
  public static void a(String paramString, long paramLong)
  {
    Object localObject1 = FacebookSdk.d();
    Object localObject2 = FacebookSdk.e();
    T.a(localObject1, "context");
    localObject2 = C.a((String)localObject2, false);
    if ((localObject2 != null) && (((y)localObject2).a()) && (paramLong > 0L))
    {
      localObject2 = AppEventsLogger.newLogger((Context)localObject1);
      localObject1 = new Bundle(1);
      ((Bundle)localObject1).putCharSequence("fb_aa_time_spent_view_name", paramString);
      ((AppEventsLogger)localObject2).a("fb_aa_time_spent_on_view", paramLong, (Bundle)localObject1);
    }
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if (!a()) {
      return;
    }
    paramString1 = b(paramString1, paramString2);
    if (paramString1 != null) {
      b.b(paramString1.a, paramString1.b, paramString1.c);
    }
  }
  
  public static void a(mo parammo, String paramString1, String paramString2)
  {
    if (!a()) {
      return;
    }
    FacebookSdk.e();
    int i = Zn.a[parammo.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i == 5) {
              a(paramString1, paramString2);
            }
            return;
          }
          parammo = "SubscriptionExpire";
        }
        else
        {
          parammo = "SubscriptionHeartbeat";
        }
      }
      else {
        parammo = "SubscriptionCancel";
      }
    }
    else {
      parammo = "SubscriptionRestore";
    }
    paramString1 = b(paramString1, paramString2);
    if (paramString1 != null) {
      b.a(parammo, paramString1.a, paramString1.b, paramString1.c);
    }
  }
  
  public static boolean a()
  {
    y localy = C.b(FacebookSdk.e());
    boolean bool;
    if ((localy != null) && (FacebookSdk.f()) && (localy.g())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static _n.a b(String paramString1, String paramString2)
  {
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString1);
      paramString1 = new org/json/JSONObject;
      paramString1.<init>(paramString2);
      paramString2 = new android/os/Bundle;
      paramString2.<init>(1);
      paramString2.putCharSequence("fb_iap_product_id", ((JSONObject)localObject).getString("productId"));
      paramString2.putCharSequence("fb_iap_purchase_time", ((JSONObject)localObject).getString("purchaseTime"));
      paramString2.putCharSequence("fb_iap_purchase_token", ((JSONObject)localObject).getString("purchaseToken"));
      paramString2.putCharSequence("fb_iap_package_name", ((JSONObject)localObject).optString("packageName"));
      paramString2.putCharSequence("fb_iap_product_title", paramString1.optString("title"));
      paramString2.putCharSequence("fb_iap_product_description", paramString1.optString("description"));
      String str = paramString1.optString("type");
      paramString2.putCharSequence("fb_iap_product_type", str);
      if (str.equals("subs"))
      {
        paramString2.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(((JSONObject)localObject).optBoolean("autoRenewing", false)));
        paramString2.putCharSequence("fb_iap_subs_period", paramString1.optString("subscriptionPeriod"));
        paramString2.putCharSequence("fb_free_trial_period", paramString1.optString("freeTrialPeriod"));
        localObject = paramString1.optString("introductoryPriceCycles");
        if (!((String)localObject).isEmpty())
        {
          paramString2.putCharSequence("fb_intro_price_amount_micros", paramString1.optString("introductoryPriceAmountMicros"));
          paramString2.putCharSequence("fb_intro_price_cycles", (CharSequence)localObject);
        }
      }
      localObject = new java/math/BigDecimal;
      ((BigDecimal)localObject).<init>(paramString1.getLong("price_amount_micros") / 1000000.0D);
      paramString1 = new _n.a((BigDecimal)localObject, Currency.getInstance(paramString1.getString("price_currency_code")), paramString2);
      return paramString1;
    }
    catch (JSONException paramString1)
    {
      Log.e(a, "Error parsing in-app subscription data.", paramString1);
    }
    return null;
  }
  
  public static void b()
  {
    Context localContext = FacebookSdk.d();
    String str = FacebookSdk.e();
    boolean bool = FacebookSdk.f();
    T.a(localContext, "context");
    if (bool) {
      if ((localContext instanceof Application)) {
        AppEventsLogger.a((Application)localContext, str);
      } else {
        Log.w(a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
      }
    }
  }
  
  private static class a
  {
    BigDecimal a;
    Currency b;
    Bundle c;
    
    a(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
    {
      this.a = paramBigDecimal;
      this.b = paramCurrency;
      this.c = paramBundle;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */