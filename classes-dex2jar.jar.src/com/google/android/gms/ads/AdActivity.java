package com.google.android.gms.ads;

import Iq;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.internal.ads.Bea;
import com.google.android.gms.internal.ads.Kea;
import com.google.android.gms.internal.ads.Tl;
import com.google.android.gms.internal.ads.ch;

public class AdActivity
  extends Activity
{
  private ch a;
  
  private final void a()
  {
    ch localch = this.a;
    if (localch != null) {
      try
      {
        localch.Wa();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        Tl.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      this.a.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    catch (Exception localException)
    {
      Tl.d("#007 Could not call remote method.", localException);
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    try
    {
      if (this.a != null) {
        bool2 = this.a.Ja();
      }
    }
    catch (RemoteException localRemoteException)
    {
      Tl.d("#007 Could not call remote method.", localRemoteException);
      bool2 = bool1;
    }
    if (bool2) {
      super.onBackPressed();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    try
    {
      this.a.y(Iq.a(paramConfiguration));
      return;
    }
    catch (RemoteException paramConfiguration)
    {
      Tl.d("#007 Could not call remote method.", paramConfiguration);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = Kea.b().a(this);
    ch localch = this.a;
    if (localch == null)
    {
      Tl.d("#007 Could not call remote method.", null);
      finish();
      return;
    }
    try
    {
      localch.k(paramBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      Tl.d("#007 Could not call remote method.", paramBundle);
      finish();
    }
  }
  
  protected void onDestroy()
  {
    try
    {
      if (this.a != null) {
        this.a.onDestroy();
      }
    }
    catch (RemoteException localRemoteException)
    {
      Tl.d("#007 Could not call remote method.", localRemoteException);
    }
    super.onDestroy();
  }
  
  protected void onPause()
  {
    try
    {
      if (this.a != null) {
        this.a.onPause();
      }
    }
    catch (RemoteException localRemoteException)
    {
      Tl.d("#007 Could not call remote method.", localRemoteException);
      finish();
    }
    super.onPause();
  }
  
  protected void onRestart()
  {
    super.onRestart();
    try
    {
      if (this.a != null) {
        this.a.kb();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.d("#007 Could not call remote method.", localRemoteException);
      finish();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    try
    {
      if (this.a != null) {
        this.a.onResume();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.d("#007 Could not call remote method.", localRemoteException);
      finish();
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      if (this.a != null) {
        this.a.i(paramBundle);
      }
    }
    catch (RemoteException localRemoteException)
    {
      Tl.d("#007 Could not call remote method.", localRemoteException);
      finish();
    }
    super.onSaveInstanceState(paramBundle);
  }
  
  protected void onStart()
  {
    super.onStart();
    try
    {
      if (this.a != null) {
        this.a.i();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.d("#007 Could not call remote method.", localRemoteException);
      finish();
    }
  }
  
  protected void onStop()
  {
    try
    {
      if (this.a != null) {
        this.a.j();
      }
    }
    catch (RemoteException localRemoteException)
    {
      Tl.d("#007 Could not call remote method.", localRemoteException);
      finish();
    }
    super.onStop();
  }
  
  public void setContentView(int paramInt)
  {
    super.setContentView(paramInt);
    a();
  }
  
  public void setContentView(View paramView)
  {
    super.setContentView(paramView);
    a();
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setContentView(paramView, paramLayoutParams);
    a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/AdActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */