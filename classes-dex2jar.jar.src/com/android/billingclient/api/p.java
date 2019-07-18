package com.android.billingclient.api;

import java.util.concurrent.Future;
import ve;

class p
  implements Runnable
{
  p(y paramy, Future paramFuture, Runnable paramRunnable) {}
  
  public void run()
  {
    if ((!this.a.isDone()) && (!this.a.isCancelled()))
    {
      this.a.cancel(true);
      ve.b("BillingClient", "Async task is taking too long, cancel it!");
      Runnable localRunnable = this.b;
      if (localRunnable != null) {
        localRunnable.run();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/android/billingclient/api/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */