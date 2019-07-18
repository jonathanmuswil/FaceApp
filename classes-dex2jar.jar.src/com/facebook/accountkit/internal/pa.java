package com.facebook.accountkit.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

final class pa
  implements ServiceConnection
{
  private final Context a;
  private final Handler b;
  private final String c;
  private final P d;
  private a e;
  private boolean f;
  private Messenger g;
  
  public pa(Context paramContext, String paramString, P paramP)
  {
    this.a = paramContext;
    this.c = paramString;
    this.d = paramP;
    this.b = new oa(this);
  }
  
  private void a(Bundle paramBundle)
  {
    if (!this.f) {
      return;
    }
    this.f = false;
    a locala = this.e;
    if (locala != null) {
      locala.a(paramBundle);
    }
  }
  
  private void a(Message paramMessage)
  {
    if (paramMessage.what == 65545)
    {
      paramMessage = paramMessage.getData();
      if (paramMessage.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
        a(null);
      } else {
        a(paramMessage);
      }
    }
    try
    {
      this.a.unbindService(this);
      return;
    }
    catch (IllegalArgumentException paramMessage)
    {
      for (;;) {}
    }
  }
  
  private void c()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.c);
    Message localMessage = Message.obtain(null, 65544);
    localMessage.arg1 = 20161017;
    localMessage.setData(localBundle);
    localMessage.replyTo = new Messenger(this.b);
    try
    {
      this.g.send(localMessage);
    }
    catch (RemoteException localRemoteException)
    {
      a(null);
    }
  }
  
  public void a(a parama)
  {
    this.e = parama;
  }
  
  public boolean a()
  {
    return this.f;
  }
  
  public boolean b()
  {
    if (this.f) {
      return false;
    }
    if (!ba.d())
    {
      this.d.a("ak_fetch_seamless_login_token", O.C);
      return false;
    }
    if (!ba.a(20161017))
    {
      this.d.a("ak_fetch_seamless_login_token", O.D);
      return false;
    }
    Intent localIntent = ba.a(this.a);
    if (localIntent == null) {
      return false;
    }
    this.f = true;
    this.a.bindService(localIntent, this, 1);
    return true;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.g = new Messenger(paramIBinder);
    c();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.g = null;
    try
    {
      this.a.unbindService(this);
      a(null);
      return;
    }
    catch (IllegalArgumentException paramComponentName)
    {
      for (;;) {}
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(Bundle paramBundle);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/pa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */