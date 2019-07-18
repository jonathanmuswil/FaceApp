package com.android.billingclient.api;

import android.content.Context;
import android.os.Bundle;
import com.android.vending.billing.IInAppBillingService;
import java.util.concurrent.Callable;

class r
  implements Callable<Bundle>
{
  r(y paramy, int paramInt, String paramString1, String paramString2, Bundle paramBundle) {}
  
  public Bundle call()
    throws Exception
  {
    return y.f(this.e).a(this.a, y.d(this.e).getPackageName(), this.b, this.c, null, this.d);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/android/billingclient/api/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */