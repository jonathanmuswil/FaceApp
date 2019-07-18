package com.android.billingclient.api;

import android.content.Context;
import android.os.Bundle;
import com.android.vending.billing.IInAppBillingService;
import java.util.concurrent.Callable;
import ve;

class m
  implements Callable<Void>
{
  m(y paramy, b paramb, c paramc) {}
  
  public Void call()
  {
    try
    {
      Object localObject = y.f(this.c).a(9, y.d(this.c).getPackageName(), this.a.b(), ve.a(this.a, y.b(this.c)));
      int i = ve.b((Bundle)localObject, "BillingClient");
      localObject = ve.a((Bundle)localObject, "BillingClient");
      y.a(this.c, new l(this, i, (String)localObject));
      return null;
    }
    catch (Exception localException)
    {
      y.a(this.c, new k(this, localException));
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/android/billingclient/api/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */