package com.facebook.accountkit.internal;

import Vm;
import Vm.a;
import android.util.Pair;
import org.json.JSONException;
import org.json.JSONObject;

class w
  implements f.a
{
  w(A paramA) {}
  
  public void a(l paraml)
  {
    W localW = this.a.d();
    if (localW == null) {
      return;
    }
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
          ((C)this.a.d).a("privacy_policy", str);
        }
        str = paraml.optString("terms_of_service");
        if (!va.e(str)) {
          ((C)this.a.d).a("terms_of_service", str);
        }
      }
      finally
      {
        String str;
        boolean bool;
        long l;
        int i;
        this.a.b();
      }
      try
      {
        bool = paraml.getBoolean("can_attempt_seamless_login");
        l = Long.parseLong(paraml.getString("expires_at"));
        if ((bool) && (l * 1000L > System.currentTimeMillis())) {
          ((C)this.a.d).a(Y.c);
        }
      }
      catch (JSONException localJSONException)
      {
        continue;
      }
      try
      {
        str = paraml.getString("login_request_code");
        ((C)this.a.d).d(str);
        l = Long.parseLong(paraml.getString("expires_in_sec"));
        ((C)this.a.d).a(l);
        i = Integer.parseInt(paraml.getString("interval_sec"));
        ((C)this.a.d).a(i);
        ((C)this.a.d).a(Y.b);
        localW.a(this.a.d);
      }
      catch (JSONException|NumberFormatException paraml)
      {
        this.a.a(Vm.a.c, O.c);
      }
    }
    this.a.b();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */