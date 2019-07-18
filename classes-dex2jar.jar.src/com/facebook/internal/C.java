package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.g;
import com.facebook.appevents.AppEventsLogger;
import java.util.Iterator;
import java.util.Set;

public class c
  extends BroadcastReceiver
{
  private static c a;
  private Context b;
  
  private c(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
  }
  
  public static c a(Context paramContext)
  {
    c localc = a;
    if (localc != null) {
      return localc;
    }
    a = new c(paramContext);
    a.b();
    return a;
  }
  
  private void a()
  {
    g.a(this.b).a(this);
  }
  
  private void b()
  {
    g.a(this.b).a(this, new IntentFilter("com.parse.bolts.measurement_event"));
  }
  
  protected void finalize()
    throws Throwable
  {
    try
    {
      a();
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = AppEventsLogger.newLogger(paramContext);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("bf_");
    ((StringBuilder)localObject).append(paramIntent.getStringExtra("event_name"));
    localObject = ((StringBuilder)localObject).toString();
    Bundle localBundle = paramIntent.getBundleExtra("event_args");
    paramIntent = new Bundle();
    Iterator localIterator = localBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramIntent.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String)localBundle.get(str));
    }
    paramContext.a((String)localObject, paramIntent);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */