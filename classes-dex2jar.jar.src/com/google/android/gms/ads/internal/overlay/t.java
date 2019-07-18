package com.google.android.gms.ads.internal.overlay;

import Hq;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.internal.ads.dh;
import com.google.android.gms.internal.ads.kea;
import com.google.android.gms.internal.ads.yh;

@yh
public final class t
  extends dh
{
  private AdOverlayInfoParcel a;
  private Activity b;
  private boolean c = false;
  private boolean d = false;
  
  public t(Activity paramActivity, AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    this.a = paramAdOverlayInfoParcel;
    this.b = paramActivity;
  }
  
  private final void Gb()
  {
    try
    {
      if (!this.d)
      {
        if (this.a.c != null) {
          this.a.c.F();
        }
        this.d = true;
      }
      return;
    }
    finally {}
  }
  
  public final boolean Ja()
    throws RemoteException
  {
    return false;
  }
  
  public final void Wa()
    throws RemoteException
  {}
  
  public final void fa()
    throws RemoteException
  {}
  
  public final void i()
    throws RemoteException
  {}
  
  public final void i(Bundle paramBundle)
    throws RemoteException
  {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.c);
  }
  
  public final void j()
    throws RemoteException
  {
    if (this.b.isFinishing()) {
      Gb();
    }
  }
  
  public final void k(Bundle paramBundle)
  {
    int i = 0;
    int j = i;
    if (paramBundle != null)
    {
      j = i;
      if (paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
        j = 1;
      }
    }
    Object localObject = this.a;
    if (localObject == null)
    {
      this.b.finish();
      return;
    }
    if (j != 0)
    {
      this.b.finish();
      return;
    }
    if (paramBundle == null)
    {
      paramBundle = ((AdOverlayInfoParcel)localObject).b;
      if (paramBundle != null) {
        paramBundle.l();
      }
      if ((this.b.getIntent() != null) && (this.b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true)))
      {
        paramBundle = this.a.c;
        if (paramBundle != null) {
          paramBundle.G();
        }
      }
    }
    k.a();
    localObject = this.b;
    paramBundle = this.a;
    if (!a.a((Context)localObject, paramBundle.a, paramBundle.i)) {
      this.b.finish();
    }
  }
  
  public final void kb()
    throws RemoteException
  {}
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    throws RemoteException
  {}
  
  public final void onDestroy()
    throws RemoteException
  {
    if (this.b.isFinishing()) {
      Gb();
    }
  }
  
  public final void onPause()
    throws RemoteException
  {
    o localo = this.a.c;
    if (localo != null) {
      localo.onPause();
    }
    if (this.b.isFinishing()) {
      Gb();
    }
  }
  
  public final void onResume()
    throws RemoteException
  {
    if (this.c)
    {
      this.b.finish();
      return;
    }
    this.c = true;
    o localo = this.a.c;
    if (localo != null) {
      localo.onResume();
    }
  }
  
  public final void y(Hq paramHq)
    throws RemoteException
  {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */