package com.facebook.accountkit.internal;

import Pp;
import Rp;
import android.content.Context;
import android.os.Bundle;
import jn;

final class ga
  extends S<ia>
{
  private static final String e = "com.facebook.accountkit.internal.ga";
  
  ga(b paramb, W paramW, ia paramia)
  {
    super(paramb, paramW, paramia);
  }
  
  private static String a(Context paramContext)
  {
    if (va.d(paramContext))
    {
      String str = ca.a(paramContext, paramContext.getPackageName()).substring(0, 11);
      Pp.a(paramContext).h();
      paramContext = str;
    }
    else
    {
      paramContext = null;
    }
    return paramContext;
  }
  
  public void a(String paramString)
  {
    da localda = new da(this);
    Object localObject = ((ia)this.d).h().toString();
    Bundle localBundle = new Bundle();
    va.a(localBundle, "phone_number", (String)localObject);
    va.a(localBundle, "state", paramString);
    va.a(localBundle, "response_type", ((ia)this.d).k());
    va.a(localBundle, "fields", "terms_of_service,privacy_policy");
    int i = fa.a[((ia)this.d).i().ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        va.a(localBundle, "notif_medium", "voice");
      }
    }
    else {
      va.a(localBundle, "notif_medium", "facebook");
    }
    localObject = a(c.f());
    if (localObject != null) {
      va.a(localBundle, "sms_token", (String)localObject);
    }
    localObject = d();
    if (localObject != null) {
      if (((W)localObject).n()) {
        ((W)localObject).g().a("ak_fetch_seamless_login_token", "not_completed");
      } else {
        va.a(localBundle, "fb_user_token", ((W)localObject).i());
      }
    }
    ((ia)this.d).c(paramString);
    paramString = a("start_login", localBundle);
    j.a();
    j.d(f.a(paramString, localda));
  }
  
  protected String c()
  {
    return "phone_number";
  }
  
  protected String f()
  {
    return "com.facebook.accountkit.sdk.ACTION_PHONE_LOGIN_STATE_CHANGED";
  }
  
  public void g()
  {
    wa.a(this.d);
    Object localObject = d();
    if (localObject == null) {
      return;
    }
    ((W)localObject).d(this.d);
    S.a locala = new S.a(this, (W)localObject);
    Bundle localBundle = new Bundle();
    va.a(localBundle, "fb_user_token", ((W)localObject).j());
    va.a(localBundle, "phone_number", ((ia)this.d).h().toString());
    va.a(localBundle, "response_type", ((ia)this.d).k());
    va.a(localBundle, "state", ((ia)this.d).c());
    localObject = a("instant_verification_login", localBundle);
    j.a();
    j.d(f.a((f)localObject, locala));
  }
  
  public void h()
  {
    ((ia)this.d).a(Y.e);
    b();
    j.a();
  }
  
  public void i()
  {
    if (va.e(((ia)this.d).m())) {
      return;
    }
    wa.a(this.d);
    Object localObject1 = d();
    if (localObject1 == null) {
      return;
    }
    ((W)localObject1).c(this.d);
    localObject1 = new ea(this, (W)localObject1);
    Object localObject2 = new Bundle();
    va.a((Bundle)localObject2, "confirmation_code", ((ia)this.d).m());
    va.a((Bundle)localObject2, "phone_number", ((ia)this.d).h().toString());
    localObject2 = a("confirm_login", (Bundle)localObject2);
    j.a();
    j.d(f.a((f)localObject2, (f.a)localObject1));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/ga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */