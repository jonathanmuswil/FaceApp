package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.g;
import com.facebook.internal.m;

public class CustomTabMainActivity
  extends Activity
{
  public static final String a;
  public static final String b;
  public static final String c;
  public static final String d;
  private boolean e = true;
  private BroadcastReceiver f;
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(CustomTabMainActivity.class.getSimpleName());
    localStringBuilder.append(".extra_params");
    a = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(CustomTabMainActivity.class.getSimpleName());
    localStringBuilder.append(".extra_chromePackage");
    b = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(CustomTabMainActivity.class.getSimpleName());
    localStringBuilder.append(".extra_url");
    c = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(CustomTabMainActivity.class.getSimpleName());
    localStringBuilder.append(".action_refresh");
    d = localStringBuilder.toString();
  }
  
  public static final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("fb");
    localStringBuilder.append(FacebookSdk.e());
    localStringBuilder.append("://authorize");
    return localStringBuilder.toString();
  }
  
  private void a(int paramInt, Intent paramIntent)
  {
    g.a(this).a(this.f);
    if (paramIntent != null) {
      setResult(paramInt, paramIntent);
    } else {
      setResult(paramInt);
    }
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (CustomTabActivity.a.equals(getIntent().getAction()))
    {
      setResult(0);
      finish();
      return;
    }
    if (paramBundle == null)
    {
      Bundle localBundle = getIntent().getBundleExtra(a);
      paramBundle = getIntent().getStringExtra(b);
      new m("oauth", localBundle).a(this, paramBundle);
      this.e = false;
      this.f = new l(this);
      g.a(this).a(this.f, new IntentFilter(CustomTabActivity.a));
    }
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    if (d.equals(paramIntent.getAction()))
    {
      Intent localIntent = new Intent(CustomTabActivity.b);
      g.a(this).a(localIntent);
      a(-1, paramIntent);
    }
    else if (CustomTabActivity.a.equals(paramIntent.getAction()))
    {
      a(-1, paramIntent);
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.e) {
      a(0, null);
    }
    this.e = true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/CustomTabMainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */