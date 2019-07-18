package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.ResultReceiver;
import ve;

public class ProxyBillingActivity
  extends Activity
{
  private ResultReceiver a;
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 100)
    {
      paramInt1 = ve.b(paramIntent, "ProxyBillingActivity");
      if ((paramInt2 != -1) || (paramInt1 != 0))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Activity finished with resultCode ");
        ((StringBuilder)localObject).append(paramInt2);
        ((StringBuilder)localObject).append(" and billing's responseCode: ");
        ((StringBuilder)localObject).append(paramInt1);
        ve.b("ProxyBillingActivity", ((StringBuilder)localObject).toString());
      }
      Object localObject = this.a;
      if (paramIntent == null) {
        paramIntent = null;
      } else {
        paramIntent = paramIntent.getExtras();
      }
      ((ResultReceiver)localObject).send(paramInt1, paramIntent);
    }
    else
    {
      paramIntent = new StringBuilder();
      paramIntent.append("Got onActivityResult with wrong requestCode: ");
      paramIntent.append(paramInt1);
      paramIntent.append("; skipping...");
      ve.b("ProxyBillingActivity", paramIntent.toString());
    }
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      ve.a("ProxyBillingActivity", "Launching Play Store billing flow");
      this.a = ((ResultReceiver)getIntent().getParcelableExtra("result_receiver"));
      if (getIntent().hasExtra("BUY_INTENT")) {
        paramBundle = (PendingIntent)getIntent().getParcelableExtra("BUY_INTENT");
      } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
        paramBundle = (PendingIntent)getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
      } else {
        paramBundle = null;
      }
      try
      {
        localObject = paramBundle.getIntentSender();
        paramBundle = new android/content/Intent;
        paramBundle.<init>();
        startIntentSenderForResult((IntentSender)localObject, 100, paramBundle, 0, 0, 0);
      }
      catch (IntentSender.SendIntentException paramBundle)
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Got exception while trying to start a purchase flow: ");
        ((StringBuilder)localObject).append(paramBundle);
        ve.b("ProxyBillingActivity", ((StringBuilder)localObject).toString());
        this.a.send(6, null);
        finish();
      }
    }
    else
    {
      ve.a("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
      this.a = ((ResultReceiver)paramBundle.getParcelable("result_receiver"));
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putParcelable("result_receiver", this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/android/billingclient/api/ProxyBillingActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */