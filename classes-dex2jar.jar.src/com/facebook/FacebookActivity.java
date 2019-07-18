package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.G;
import android.support.v4.app.h;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.support.v4.app.s;
import com.facebook.common.b;
import com.facebook.common.c;
import com.facebook.internal.J;
import com.facebook.internal.S;
import com.facebook.login.E;
import uo;
import zo;

public class FacebookActivity
  extends o
{
  public static String n = "PassThrough";
  private static String o = "SingleFragment";
  private static final String p = "com.facebook.FacebookActivity";
  private l q;
  
  private void l()
  {
    p localp = J.a(J.b(getIntent()));
    setResult(0, J.a(getIntent(), null, localp));
    finish();
  }
  
  public l j()
  {
    return this.q;
  }
  
  protected l k()
  {
    Intent localIntent = getIntent();
    s locals = e();
    Object localObject1 = locals.a(o);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      if ("FacebookDialogFragment".equals(localIntent.getAction()))
      {
        localObject2 = new com.facebook.internal.p();
        ((l)localObject2).x(true);
        ((h)localObject2).a(locals, o);
      }
      else if ("DeviceShareDialogFragment".equals(localIntent.getAction()))
      {
        localObject2 = new uo();
        ((l)localObject2).x(true);
        ((uo)localObject2).a((zo)localIntent.getParcelableExtra("content"));
        ((h)localObject2).a(locals, o);
      }
      else
      {
        localObject2 = new E();
        ((l)localObject2).x(true);
        localObject1 = locals.a();
        ((G)localObject1).a(b.com_facebook_fragment_container, (l)localObject2, o);
        ((G)localObject1).a();
      }
    }
    return (l)localObject2;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    l locall = this.q;
    if (locall != null) {
      locall.onConfigurationChanged(paramConfiguration);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if (!FacebookSdk.isInitialized())
    {
      S.a(p, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
      FacebookSdk.c(getApplicationContext());
    }
    setContentView(c.com_facebook_activity_layout);
    if (n.equals(paramBundle.getAction()))
    {
      l();
      return;
    }
    this.q = k();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/FacebookActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */