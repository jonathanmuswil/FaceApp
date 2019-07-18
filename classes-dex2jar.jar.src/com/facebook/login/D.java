package com.facebook.login;

import com.facebook.E.b;
import com.facebook.I;
import com.facebook.p;
import com.facebook.t;
import org.json.JSONException;
import org.json.JSONObject;

class d
  implements E.b
{
  d(l paraml) {}
  
  public void a(I paramI)
  {
    if (l.a(this.a)) {
      return;
    }
    if (paramI.a() != null)
    {
      this.a.a(paramI.a().p());
      return;
    }
    paramI = paramI.b();
    l.a locala = new l.a();
    try
    {
      locala.b(paramI.getString("user_code"));
      locala.a(paramI.getString("code"));
      locala.a(paramI.getLong("interval"));
      l.a(this.a, locala);
      return;
    }
    catch (JSONException paramI)
    {
      this.a.a(new p(paramI));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/login/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */