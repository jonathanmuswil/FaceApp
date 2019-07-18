package com.facebook.accountkit.internal;

import Vm;
import Vm.a;
import android.util.Pair;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class da
  implements f.a
{
  da(ga paramga) {}
  
  public void a(l paraml)
  {
    if ((this.a.d() != null) && (paraml != null))
    {
      for (;;)
      {
        try
        {
          if (paraml.a() != null)
          {
            paraml = va.a(paraml.a());
            this.a.a((Vm)paraml.first);
            return;
          }
          paraml = paraml.b();
          if (paraml == null)
          {
            this.a.a(Vm.a.c, O.b);
            continue;
          }
          str = paraml.optString("privacy_policy");
          if (!va.e(str)) {
            ((ia)this.a.d).a("privacy_policy", str);
          }
          str = paraml.optString("terms_of_service");
          if (!va.e(str)) {
            ((ia)this.a.d).a("terms_of_service", str);
          }
        }
        finally
        {
          String str;
          boolean bool;
          long l;
          this.a.b();
        }
        try
        {
          bool = paraml.getBoolean("can_attempt_seamless_login");
          l = Long.parseLong(paraml.getString("expires_at"));
          if ((bool) && (l * 1000L > System.currentTimeMillis())) {
            ((ia)this.a.d).a(Y.c);
          }
        }
        catch (JSONException localJSONException)
        {
          continue;
        }
        try
        {
          str = paraml.getString("login_request_code");
          l = Long.parseLong(paraml.getString("expires_in_sec"));
          ((ia)this.a.d).a(l);
          paraml = paraml.optString("min_resend_interval_sec");
          if (!va.e(paraml))
          {
            l = Long.parseLong(paraml);
            ((ia)this.a.d).b(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(l));
          }
          else
          {
            ((ia)this.a.d).b(System.currentTimeMillis());
          }
          ((ia)this.a.d).a(Y.b);
          ((ia)this.a.d).d(str);
        }
        catch (JSONException|NumberFormatException paraml)
        {
          this.a.a(Vm.a.c, O.c);
        }
      }
      this.a.b();
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */