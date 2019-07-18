package com.facebook;

import org.json.JSONObject;

class f
  implements E.b
{
  f(h paramh, h.a parama) {}
  
  public void a(I paramI)
  {
    paramI = paramI.b();
    if (paramI == null) {
      return;
    }
    this.a.a = paramI.optString("access_token");
    this.a.b = paramI.optInt("expires_at");
    this.a.c = Long.valueOf(paramI.optLong("data_access_expiration_time"));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */