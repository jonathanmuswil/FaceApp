package com.google.android.gms.internal.ads;

import Hq;
import Iq;
import Jq;
import Jq.a;
import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;

@yh
public final class bh
  extends Jq<fh>
{
  public bh()
  {
    super("com.google.android.gms.ads.AdOverlayCreatorImpl");
  }
  
  public final ch a(Activity paramActivity)
  {
    try
    {
      Object localObject = Iq.a(paramActivity);
      paramActivity = ((fh)a(paramActivity)).C((Hq)localObject);
      if (paramActivity == null) {
        return null;
      }
      localObject = paramActivity.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      if ((localObject instanceof ch)) {
        return (ch)localObject;
      }
      paramActivity = new eh(paramActivity);
      return paramActivity;
    }
    catch (Jq.a paramActivity)
    {
      Tl.c("Could not create remote AdOverlay.", paramActivity);
      return null;
    }
    catch (RemoteException paramActivity)
    {
      Tl.c("Could not create remote AdOverlay.", paramActivity);
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */