package com.facebook.internal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.l;
import com.facebook.FacebookSdk;

public class p
  extends h
{
  private Dialog ha;
  
  private void a(Bundle paramBundle, com.facebook.p paramp)
  {
    android.support.v4.app.o localo = Ea();
    paramBundle = J.a(localo.getIntent(), paramBundle, paramp);
    int i;
    if (paramp == null) {
      i = -1;
    } else {
      i = 0;
    }
    localo.setResult(i, paramBundle);
    localo.finish();
  }
  
  private void o(Bundle paramBundle)
  {
    android.support.v4.app.o localo = Ea();
    Intent localIntent = new Intent();
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localIntent.putExtras(localBundle);
    localo.setResult(-1, localIntent);
    localo.finish();
  }
  
  public void a(Dialog paramDialog)
  {
    this.ha = paramDialog;
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    if (this.ha == null)
    {
      paramBundle = Ea();
      Bundle localBundle = J.b(paramBundle.getIntent());
      String str;
      if (!localBundle.getBoolean("is_fallback", false))
      {
        str = localBundle.getString("action");
        localBundle = localBundle.getBundle("params");
        if (S.b(str))
        {
          S.a("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
          paramBundle.finish();
          return;
        }
        paramBundle = new Y.a(paramBundle, str, localBundle);
        paramBundle.a(new n(this));
        paramBundle = paramBundle.a();
      }
      else
      {
        str = localBundle.getString("url");
        if (S.b(str))
        {
          S.a("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
          paramBundle.finish();
          return;
        }
        paramBundle = w.a(paramBundle, str, String.format("fb%s://bridge/", new Object[] { FacebookSdk.e() }));
        paramBundle.a(new o(this));
      }
      this.ha = paramBundle;
    }
  }
  
  public Dialog n(Bundle paramBundle)
  {
    if (this.ha == null)
    {
      a(null, null);
      B(false);
    }
    return this.ha;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (((this.ha instanceof Y)) && (nb())) {
      ((Y)this.ha).e();
    }
  }
  
  public void sb()
  {
    if ((Mb() != null) && (Xa())) {
      Mb().setDismissMessage(null);
    }
    super.sb();
  }
  
  public void vb()
  {
    super.vb();
    Dialog localDialog = this.ha;
    if ((localDialog instanceof Y)) {
      ((Y)localDialog).e();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/internal/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */