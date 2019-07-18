package com.facebook.accountkit.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class AccountKitEmailRedirectActivity
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new Intent(this, AccountKitActivity.class);
    paramBundle.putExtra("url", getIntent().getDataString());
    paramBundle.addFlags(335544320);
    startActivity(paramBundle);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/AccountKitEmailRedirectActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */