package com.android.billingclient.api;

import ve;

class k
  implements Runnable
{
  k(m paramm, Exception paramException) {}
  
  public void run()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Error acknowledge purchase; ex: ");
    localStringBuilder.append(this.a);
    ve.b("BillingClient", localStringBuilder.toString());
    this.b.b.a(E.p);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/android/billingclient/api/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */