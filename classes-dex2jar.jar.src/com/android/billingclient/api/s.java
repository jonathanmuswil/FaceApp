package com.android.billingclient.api;

import android.content.Context;
import android.os.Bundle;
import com.android.vending.billing.IInAppBillingService;
import java.util.Arrays;
import java.util.concurrent.Callable;

class s
  implements Callable<Bundle>
{
  s(y paramy, B paramB, String paramString) {}
  
  public Bundle call()
    throws Exception
  {
    return y.f(this.c).a(5, y.d(this.c).getPackageName(), Arrays.asList(new String[] { this.a.c() }), this.b, "subs", null);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/android/billingclient/api/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */