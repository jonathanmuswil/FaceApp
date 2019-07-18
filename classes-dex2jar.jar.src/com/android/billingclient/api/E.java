package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ve;

class e
{
  private final Context a;
  private final a b;
  
  e(Context paramContext, H paramH)
  {
    this.a = paramContext;
    this.b = new a(paramH, null);
  }
  
  void a()
  {
    this.b.a(this.a);
  }
  
  H b()
  {
    return a.a(this.b);
  }
  
  void c()
  {
    this.b.a(this.a, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
  }
  
  private class a
    extends BroadcastReceiver
  {
    private final H a;
    private boolean b;
    
    private a(H paramH)
    {
      this.a = paramH;
    }
    
    public void a(Context paramContext)
    {
      if (this.b)
      {
        paramContext.unregisterReceiver(e.a(e.this));
        this.b = false;
      }
      else
      {
        ve.b("BillingBroadcastManager", "Receiver is not registered.");
      }
    }
    
    public void a(Context paramContext, IntentFilter paramIntentFilter)
    {
      if (!this.b)
      {
        paramContext.registerReceiver(e.a(e.this), paramIntentFilter);
        this.b = true;
      }
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      paramContext = ve.a(paramIntent, "BillingBroadcastManager");
      paramIntent = ve.a(paramIntent.getExtras());
      this.a.a(paramContext, paramIntent);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/android/billingclient/api/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */