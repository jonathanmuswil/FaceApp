package com.facebook.login;

import com.facebook.E.b;
import com.facebook.FacebookSdk;
import com.facebook.I;
import com.facebook.internal.C;
import com.facebook.internal.O;
import com.facebook.internal.S;
import com.facebook.internal.y;
import com.facebook.p;
import com.facebook.t;
import java.util.Date;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;
import oo;
import org.json.JSONException;
import org.json.JSONObject;

class j
  implements E.b
{
  j(l paraml, String paramString, Date paramDate1, Date paramDate2) {}
  
  public void a(I paramI)
  {
    if (l.d(this.d).get()) {
      return;
    }
    if (paramI.a() != null)
    {
      this.d.a(paramI.a().p());
      return;
    }
    try
    {
      Object localObject = paramI.b();
      String str = ((JSONObject)localObject).getString("id");
      paramI = S.a((JSONObject)localObject);
      localObject = ((JSONObject)localObject).getString("name");
      oo.a(l.f(this.d).o());
      if ((C.b(FacebookSdk.e()).j().contains(O.c)) && (!l.b(this.d)))
      {
        l.a(this.d, true);
        l.a(this.d, str, paramI, this.a, (String)localObject, this.b, this.c);
        return;
      }
      l.a(this.d, str, paramI, this.a, this.b, this.c);
      return;
    }
    catch (JSONException paramI)
    {
      this.d.a(new p(paramI));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/login/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */