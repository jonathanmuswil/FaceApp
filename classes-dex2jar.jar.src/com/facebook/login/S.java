package com.facebook.login;

import android.os.Bundle;
import com.facebook.internal.S.a;
import com.facebook.p;
import org.json.JSONException;
import org.json.JSONObject;

class s
  implements S.a
{
  s(u paramu, Bundle paramBundle, z.c paramc) {}
  
  public void a(p paramp)
  {
    z localz = this.c.b;
    localz.a(z.d.a(localz.t(), "Caught exception", paramp.getMessage()));
  }
  
  public void a(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject = paramJSONObject.getString("id");
      this.a.putString("com.facebook.platform.extra.USER_ID", paramJSONObject);
      this.c.c(this.b, this.a);
    }
    catch (JSONException paramJSONObject)
    {
      z localz = this.c.b;
      localz.a(z.d.a(localz.t(), "Caught exception", paramJSONObject.getMessage()));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/login/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */