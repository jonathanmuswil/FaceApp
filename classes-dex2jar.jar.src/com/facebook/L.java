package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class l
  extends BroadcastReceiver
{
  l(CustomTabMainActivity paramCustomTabMainActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = new Intent(this.a, CustomTabMainActivity.class);
    paramContext.setAction(CustomTabMainActivity.d);
    String str = CustomTabMainActivity.c;
    paramContext.putExtra(str, paramIntent.getStringExtra(str));
    paramContext.addFlags(603979776);
    this.a.startActivity(paramContext);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */