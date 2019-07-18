package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.g;

public class CustomTabActivity
  extends Activity
{
  public static final String a;
  public static final String b;
  private BroadcastReceiver c;
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(CustomTabActivity.class.getSimpleName());
    localStringBuilder.append(".action_customTabRedirect");
    a = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(CustomTabActivity.class.getSimpleName());
    localStringBuilder.append(".action_destroy");
    b = localStringBuilder.toString();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == 0)
    {
      paramIntent = new Intent(a);
      paramIntent.putExtra(CustomTabMainActivity.c, getIntent().getDataString());
      g.a(this).a(paramIntent);
      this.c = new k(this);
      g.a(this).a(this.c, new IntentFilter(b));
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new Intent(this, CustomTabMainActivity.class);
    paramBundle.setAction(a);
    paramBundle.putExtra(CustomTabMainActivity.c, getIntent().getDataString());
    paramBundle.addFlags(603979776);
    startActivityForResult(paramBundle, 2);
  }
  
  protected void onDestroy()
  {
    g.a(this).a(this.c);
    super.onDestroy();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/CustomTabActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */