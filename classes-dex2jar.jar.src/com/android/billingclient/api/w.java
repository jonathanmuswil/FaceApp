package com.android.billingclient.api;

import android.content.Context;
import com.android.vending.billing.IInAppBillingService;
import java.util.concurrent.Callable;
import ve;

class w
  implements Callable<Void>
{
  w(y.a parama) {}
  
  public Void call()
  {
    synchronized (y.a.a(this.a))
    {
      if (y.a.c(this.a)) {
        return null;
      }
      try
      {
        localObject2 = y.d(this.a.d).getPackageName();
        i = 9;
        j = 3;
      }
      catch (Exception localException1)
      {
        try
        {
          for (;;)
          {
            k = y.f(this.a.d).b(i, (String)localObject2, "subs");
            if (k == 0)
            {
              m = i;
              i = k;
              break;
            }
            i--;
            j = k;
          }
          int m = 0;
          int i = j;
          j = i;
          ??? = this.a.d;
          boolean bool1 = true;
          boolean bool2;
          if (m >= 5) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          j = i;
          y.a((y)???, bool2);
          j = i;
          ??? = this.a.d;
          if (m >= 3) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          j = i;
          y.b((y)???, bool2);
          if (m < 3)
          {
            j = i;
            ve.a("BillingClient", "In-app billing API does not support subscription on this device.");
          }
          int k = 9;
          j = i;
          i = k;
          while (i >= 3)
          {
            k = y.f(this.a.d).b(i, (String)localObject2, "inapp");
            if (k == 0)
            {
              m = i;
              i = k;
              break label259;
            }
            i--;
            j = k;
          }
          m = 0;
          i = j;
          j = i;
          Object localObject2 = this.a.d;
          if (m >= 9) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          j = i;
          y.c((y)localObject2, bool2);
          j = i;
          localObject2 = this.a.d;
          if (m >= 8) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          j = i;
          y.d((y)localObject2, bool2);
          j = i;
          localObject2 = this.a.d;
          if (m >= 6) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
          j = i;
          y.e((y)localObject2, bool2);
          if (m < 3)
          {
            j = i;
            ve.b("BillingClient", "In-app billing API version 3 is not supported on this device.");
          }
          if (i == 0)
          {
            j = i;
            y.a(this.a.d, 2);
            j = i;
          }
          else
          {
            j = i;
            y.a(this.a.d, 0);
            j = i;
            y.a(this.a.d, null);
            j = i;
          }
        }
        catch (Exception localException2)
        {
          int j;
          for (;;) {}
        }
        localException1 = localException1;
        j = 3;
      }
      if (i >= 3) {}
      label259:
      ve.b("BillingClient", "Exception while checking if billing is supported; try to reconnect");
      y.a(this.a.d, 0);
      y.a(this.a.d, null);
      if (j == 0) {
        y.a.a(this.a, E.o);
      } else {
        y.a.a(this.a, E.a);
      }
      return null;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/android/billingclient/api/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */