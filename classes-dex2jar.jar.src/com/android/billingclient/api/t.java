package com.android.billingclient.api;

import android.content.Context;
import android.os.Bundle;
import com.android.vending.billing.IInAppBillingService;
import java.util.concurrent.Callable;

class t
  implements Callable<Bundle>
{
  t(y paramy, String paramString1, String paramString2) {}
  
  public Bundle call()
    throws Exception
  {
    return y.f(this.c).a(3, y.d(this.c).getPackageName(), this.a, this.b, null);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/android/billingclient/api/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */