package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class ja
  extends BroadcastReceiver
{
  private Context a;
  private final ka b;
  
  public ja(ka paramka)
  {
    this.b = paramka;
  }
  
  public final void a()
  {
    try
    {
      if (this.a != null) {
        this.a.unregisterReceiver(this);
      }
      this.a = null;
      return;
    }
    finally {}
  }
  
  public final void a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getData();
    if (paramContext != null) {
      paramContext = paramContext.getSchemeSpecificPart();
    } else {
      paramContext = null;
    }
    if ("com.google.android.gms".equals(paramContext))
    {
      this.b.a();
      a();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/ja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */