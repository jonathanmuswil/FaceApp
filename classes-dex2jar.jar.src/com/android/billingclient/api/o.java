package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.List;
import ve;

class o
  extends ResultReceiver
{
  o(y paramy, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    H localH = y.a(this.a).b();
    if (localH == null)
    {
      ve.b("BillingClient", "PurchasesUpdatedListener is null - no way to return the response.");
      return;
    }
    List localList = ve.a(paramBundle);
    D.a locala = D.c();
    locala.a(paramInt);
    locala.a(ve.a(paramBundle, "BillingClient"));
    localH.a(locala.a(), localList);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/android/billingclient/api/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */