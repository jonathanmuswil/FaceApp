package com.facebook.appevents;

import android.os.Bundle;

final class p
  implements Runnable
{
  p(AppEventsLogger paramAppEventsLogger) {}
  
  public void run()
  {
    Bundle localBundle = new Bundle();
    try
    {
      Class.forName("com.facebook.core.Core");
      localBundle.putInt("core_lib_included", 1);
    }
    catch (ClassNotFoundException localClassNotFoundException9)
    {
      try
      {
        Class.forName("com.facebook.login.Login");
        localBundle.putInt("login_lib_included", 1);
      }
      catch (ClassNotFoundException localClassNotFoundException9)
      {
        try
        {
          Class.forName("com.facebook.share.Share");
          localBundle.putInt("share_lib_included", 1);
        }
        catch (ClassNotFoundException localClassNotFoundException9)
        {
          try
          {
            Class.forName("com.facebook.places.Places");
            localBundle.putInt("places_lib_included", 1);
          }
          catch (ClassNotFoundException localClassNotFoundException9)
          {
            try
            {
              Class.forName("com.facebook.messenger.Messenger");
              localBundle.putInt("messenger_lib_included", 1);
            }
            catch (ClassNotFoundException localClassNotFoundException9)
            {
              try
              {
                Class.forName("com.facebook.applinks.AppLinks");
                localBundle.putInt("applinks_lib_included", 1);
              }
              catch (ClassNotFoundException localClassNotFoundException9)
              {
                try
                {
                  Class.forName("com.facebook.marketing.Marketing");
                  localBundle.putInt("marketing_lib_included", 1);
                }
                catch (ClassNotFoundException localClassNotFoundException9)
                {
                  try
                  {
                    Class.forName("com.facebook.all.All");
                    localBundle.putInt("all_lib_included", 1);
                  }
                  catch (ClassNotFoundException localClassNotFoundException9)
                  {
                    try
                    {
                      Class.forName("com.android.billingclient.api.g");
                      localBundle.putInt("billing_client_lib_included", 1);
                    }
                    catch (ClassNotFoundException localClassNotFoundException9)
                    {
                      try
                      {
                        for (;;)
                        {
                          Class.forName("com.android.vending.billing.IInAppBillingService");
                          localBundle.putInt("billing_service_lib_included", 1);
                          this.a.logSdkEvent("fb_sdk_initialize", null, localBundle);
                          return;
                          localClassNotFoundException1 = localClassNotFoundException1;
                          continue;
                          localClassNotFoundException2 = localClassNotFoundException2;
                          continue;
                          localClassNotFoundException3 = localClassNotFoundException3;
                          continue;
                          localClassNotFoundException4 = localClassNotFoundException4;
                          continue;
                          localClassNotFoundException5 = localClassNotFoundException5;
                          continue;
                          localClassNotFoundException6 = localClassNotFoundException6;
                          continue;
                          localClassNotFoundException7 = localClassNotFoundException7;
                          continue;
                          localClassNotFoundException8 = localClassNotFoundException8;
                          continue;
                          localClassNotFoundException9 = localClassNotFoundException9;
                        }
                      }
                      catch (ClassNotFoundException localClassNotFoundException10)
                      {
                        for (;;) {}
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/appevents/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */