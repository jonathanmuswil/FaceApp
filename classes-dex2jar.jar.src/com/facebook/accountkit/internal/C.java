package com.facebook.accountkit.internal;

import Rm;
import Sm.a;
import Zm;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.accountkit.ui.Db;
import com.facebook.accountkit.ui.Fb;
import com.facebook.accountkit.ui.Ia;
import com.facebook.accountkit.ui.Ja;
import com.facebook.accountkit.ui.L;
import com.facebook.accountkit.ui.O;
import com.facebook.accountkit.ui.ub;
import fn;
import jn;
import kn;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{
  private static final M a = new M();
  private static final H b = new H();
  
  public static Zm a(String paramString1, String paramString2, String paramString3)
  {
    if (k() != null) {
      q();
    }
    return a.h().a(paramString1, paramString2, paramString3);
  }
  
  public static fn a(jn paramjn, Ja paramJa, String paramString1, String paramString2)
  {
    if (k() != null) {
      q();
    }
    return a.h().a(paramjn, paramJa, paramString1, paramString2);
  }
  
  public static kn a(jn paramjn, String paramString)
  {
    return a.i().a(paramjn, paramString);
  }
  
  public static void a(Activity paramActivity)
  {
    a.h().a(paramActivity);
  }
  
  public static void a(Activity paramActivity, Bundle paramBundle)
  {
    a.h().a(paramActivity, paramBundle);
  }
  
  public static void a(Context paramContext, Sm.a parama)
  {
    a.a(paramContext, parama);
    b.a(paramContext);
  }
  
  public static void a(String paramString)
  {
    a.h().a(paramString);
  }
  
  public static void b()
  {
    a.h().a();
  }
  
  public static void b(Activity paramActivity)
  {
    a.i().a(paramActivity);
  }
  
  public static void b(Activity paramActivity, Bundle paramBundle)
  {
    a.h().b(paramActivity, paramBundle);
  }
  
  public static void b(String paramString)
  {
    a.i().a(paramString);
  }
  
  public static void c()
  {
    a.i().a();
  }
  
  public static void c(Activity paramActivity, Bundle paramBundle)
  {
    a.i().a(paramActivity, paramBundle);
  }
  
  public static void d()
  {
    a.h().c();
  }
  
  public static void d(Activity paramActivity, Bundle paramBundle)
  {
    a.i().b(paramActivity, paramBundle);
  }
  
  public static boolean e()
  {
    return a.b();
  }
  
  public static Context f()
  {
    return a.c();
  }
  
  public static String g()
  {
    return a.d();
  }
  
  public static String h()
  {
    return a.e();
  }
  
  public static String i()
  {
    return f().getSharedPreferences("com.facebook.accountkit.internal.AccountKitController.preferences", 0).getString("AccountHost", "graph.accountkit.com");
  }
  
  public static String j()
  {
    return a.f();
  }
  
  public static Rm k()
  {
    return a.a().a();
  }
  
  public static Zm l()
  {
    return a.h().d();
  }
  
  public static fn m()
  {
    return a.h().e();
  }
  
  public static D n()
  {
    return b.a();
  }
  
  public static void o()
  {
    a.h().k();
  }
  
  public static boolean p()
  {
    return a.j();
  }
  
  public static void q()
  {
    a.h().o();
  }
  
  public static class a
  {
    public static void a()
    {
      c("ak_ui_manager_invalid", null);
    }
    
    public static void a(Fb paramFb)
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        String str;
        if ((paramFb instanceof ub)) {
          str = "SkinManager";
        } else if ((paramFb instanceof L)) {
          str = "AdvancedUIManager";
        } else if ((paramFb instanceof Db)) {
          str = "ThemeUIManager";
        } else if ((paramFb instanceof O)) {
          str = "BaseUIManager";
        } else {
          str = "UIManager";
        }
        localJSONObject.put("ui_manager", str);
        if ((paramFb instanceof ub))
        {
          paramFb = (ub)paramFb;
          localJSONObject.put("skin_type", paramFb.o());
          localJSONObject.put("skin_manager_has_background_image", paramFb.t());
          localJSONObject.put("skin_manager_primary_color", paramFb.n());
          localJSONObject.put("skin_manager_tint", paramFb.q());
          localJSONObject.put("skin_manager_tint_intensity", paramFb.s());
        }
      }
      catch (JSONException paramFb)
      {
        for (;;) {}
      }
      c.a().g().a("ak_ui_manager_view", localJSONObject);
    }
    
    public static void a(Ia paramIa, String paramString, boolean paramBoolean)
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("view_type", paramString);
        localJSONObject.put("view_provided", paramBoolean);
        paramString = c.a().g();
        if (paramIa.equals(Ia.a)) {
          paramIa = "phone";
        } else {
          paramIa = "email";
        }
        paramString.b("ak_custom_view", paramIa, localJSONObject);
        return;
      }
      catch (JSONException paramString)
      {
        for (;;) {}
      }
    }
    
    public static void a(String paramString)
    {
      c("ak_confirm_account_verified_view", paramString);
    }
    
    public static void a(String paramString, Bundle paramBundle)
    {
      c.a().g().a(paramString, paramBundle);
    }
    
    public static void a(String paramString1, String paramString2)
    {
      JSONObject localJSONObject = new JSONObject();
      if (paramString2 != null) {}
      try
      {
        localJSONObject.put("link", paramString2);
        a("ak_confirmation_code_view", paramString1, localJSONObject);
        return;
      }
      catch (JSONException paramString2)
      {
        for (;;) {}
      }
    }
    
    public static void a(String paramString1, String paramString2, String paramString3)
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        boolean bool = va.e(paramString2);
        if (!bool)
        {
          if (!va.e(paramString3)) {
            if (paramString2.equals(paramString3)) {
              localJSONObject.put("confirmation_code", "equals");
            } else {
              localJSONObject.put("confirmation_code", "notEquals");
            }
          }
        }
        else {
          localJSONObject.put("confirmation_code", "notSupplied");
        }
      }
      catch (JSONException paramString2)
      {
        for (;;) {}
      }
      a("ak_confirmation_code_view", paramString1, localJSONObject);
    }
    
    public static void a(String paramString1, String paramString2, String paramString3, String paramString4)
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("submitted_email", paramString4);
        localJSONObject.put("email_app_supplied_use", paramString2);
        localJSONObject.put("email_selected_use", paramString3);
        a("ak_email_login_view", paramString1, localJSONObject);
        return;
      }
      catch (JSONException paramString2)
      {
        for (;;) {}
      }
    }
    
    public static void a(String paramString1, String paramString2, jn paramjn)
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("phone_number_source", paramString2);
        localJSONObject.put("submitted_phone_number", paramjn.toString());
        a("ak_phone_login_view", paramString1, localJSONObject);
        return;
      }
      catch (JSONException paramString2)
      {
        for (;;) {}
      }
    }
    
    private static void a(String paramString1, String paramString2, JSONObject paramJSONObject)
    {
      JSONObject localJSONObject = paramJSONObject;
      if (paramJSONObject == null) {
        localJSONObject = new JSONObject();
      }
      try
      {
        localJSONObject.put("button_type", paramString2);
        c.a().g().a(paramString1, "phone", localJSONObject);
        return;
      }
      catch (JSONException paramString2)
      {
        for (;;) {}
      }
    }
    
    public static void a(String paramString1, String paramString2, boolean paramBoolean)
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("country_code", paramString1);
        localJSONObject.put("country_code_source", paramString2);
        boolean bool = va.e(c.a().c());
        paramString2 = "true";
        if (bool) {
          paramString1 = "true";
        } else {
          paramString1 = "false";
        }
        localJSONObject.put("read_phone_number_permission", paramString1);
        if (va.f(c.a().c())) {
          paramString1 = "true";
        } else {
          paramString1 = "false";
        }
        localJSONObject.put("read_sms_permission", paramString1);
        localJSONObject.put("sim_locale", va.a(c.a().c()));
        if (paramBoolean) {
          paramString1 = paramString2;
        } else {
          paramString1 = "false";
        }
        localJSONObject.put("retry", paramString1);
      }
      catch (JSONException paramString1)
      {
        for (;;) {}
      }
      c.a().g().a("ak_phone_login_view", "phone", true, localJSONObject);
    }
    
    public static void a(boolean paramBoolean)
    {
      c.a().g().a("ak_account_verified_view", "phone", paramBoolean, null);
    }
    
    public static void a(boolean paramBoolean, Ia paramIa)
    {
      P localP = c.a().g();
      if (paramIa.equals(Ia.a)) {
        paramIa = "phone";
      } else {
        paramIa = "email";
      }
      localP.a("ak_error_view", paramIa, paramBoolean, null);
    }
    
    public static void a(boolean paramBoolean, String paramString)
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("country_code", paramString);
        c.a().g().a("ak_country_code_view", "phone", paramBoolean, localJSONObject);
        return;
      }
      catch (JSONException paramString)
      {
        for (;;) {}
      }
    }
    
    public static void b()
    {
      c.a().g().a("ak_confirmation_code_view", "phone", false, null);
    }
    
    public static void b(String paramString)
    {
      a("ak_email_sent_view", paramString, null);
    }
    
    public static void b(String paramString1, String paramString2)
    {
      JSONObject localJSONObject = new JSONObject();
      if (paramString2 != null) {}
      try
      {
        localJSONObject.put("link", paramString2);
        a("ak_phone_login_view", paramString1, localJSONObject);
        return;
      }
      catch (JSONException paramString2)
      {
        for (;;) {}
      }
    }
    
    public static void b(boolean paramBoolean)
    {
      c.a().g().a("ak_confirm_account_verified_view", "phone", paramBoolean, null);
    }
    
    public static void b(boolean paramBoolean, Ia paramIa)
    {
      P localP = c.a().g();
      if (paramIa.equals(Ia.a)) {
        paramIa = "phone";
      } else {
        paramIa = "email";
      }
      localP.a("ak_sending_code_view", paramIa, paramBoolean, null);
    }
    
    public static void c()
    {
      c.a().g().a("ak_email_login_view", "email", false, null);
    }
    
    public static void c(String paramString)
    {
      c("ak_error_view", paramString);
    }
    
    private static void c(String paramString1, String paramString2)
    {
      a(paramString1, paramString2, null);
    }
    
    public static void c(boolean paramBoolean)
    {
      JSONObject localJSONObject = new JSONObject();
      String str;
      if (paramBoolean) {
        str = "true";
      } else {
        str = "false";
      }
      try
      {
        localJSONObject.put("retry", str);
        c.a().g().a("ak_confirmation_code_view", "phone", true, localJSONObject);
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
    }
    
    public static void c(boolean paramBoolean, Ia paramIa)
    {
      P localP = c.a().g();
      if (paramIa.equals(Ia.a)) {
        paramIa = "phone";
      } else {
        paramIa = "email";
      }
      localP.a("ak_sent_code_view", paramIa, paramBoolean, null);
    }
    
    public static void d()
    {
      c.a().g().a("ak_phone_login_view", "phone", false, null);
    }
    
    public static void d(String paramString)
    {
      c("ak_resend_view", paramString);
    }
    
    public static void d(boolean paramBoolean)
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        boolean bool = va.c(c.a().c());
        String str1 = "true";
        String str2;
        if (bool) {
          str2 = "true";
        } else {
          str2 = "false";
        }
        localJSONObject.put("get_accounts_perm", str2);
        if (paramBoolean) {
          str2 = str1;
        } else {
          str2 = "false";
        }
        localJSONObject.put("retry", str2);
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
      c.a().g().a("ak_email_login_view", "email", true, localJSONObject);
    }
    
    public static void d(boolean paramBoolean, Ia paramIa)
    {
      P localP = c.a().g();
      if (paramIa.equals(Ia.a)) {
        paramIa = "phone";
      } else {
        paramIa = "email";
      }
      localP.a("ak_verified_code_view", paramIa, paramBoolean, null);
    }
    
    public static void e(boolean paramBoolean)
    {
      c.a().g().a("ak_email_sent_view", "email", paramBoolean, null);
    }
    
    public static void e(boolean paramBoolean, Ia paramIa)
    {
      P localP = c.a().g();
      if (paramIa.equals(Ia.a)) {
        paramIa = "phone";
      } else {
        paramIa = "email";
      }
      localP.a("ak_verifying_code_view", paramIa, paramBoolean, null);
    }
    
    public static void f(boolean paramBoolean)
    {
      c.a().g().a("ak_resend_view", "phone", paramBoolean, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */