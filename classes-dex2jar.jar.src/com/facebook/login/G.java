package com.facebook.login;

import com.facebook.E.b;
import com.facebook.I;
import com.facebook.p;
import com.facebook.t;
import java.util.concurrent.atomic.AtomicBoolean;
import oo;
import org.json.JSONException;
import org.json.JSONObject;

class g
  implements E.b
{
  g(l paraml) {}
  
  public void a(I paramI)
  {
    if (l.d(this.a).get()) {
      return;
    }
    t localt = paramI.a();
    if (localt != null)
    {
      int i = localt.r();
      if (i != 1349152)
      {
        switch (i)
        {
        default: 
          this.a.a(paramI.a().p());
          break;
        case 1349173: 
          this.a.Ob();
          break;
        case 1349172: 
        case 1349174: 
          l.e(this.a);
          break;
        }
      }
      else
      {
        if (l.f(this.a) != null) {
          oo.a(l.f(this.a).o());
        }
        if (l.g(this.a) != null)
        {
          paramI = this.a;
          paramI.a(l.g(paramI));
        }
        else
        {
          this.a.Ob();
        }
      }
      return;
    }
    try
    {
      paramI = paramI.b();
      l.a(this.a, paramI.getString("access_token"), Long.valueOf(paramI.getLong("expires_in")), Long.valueOf(paramI.optLong("data_access_expiration_time")));
    }
    catch (JSONException paramI)
    {
      this.a.a(new p(paramI));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/login/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */