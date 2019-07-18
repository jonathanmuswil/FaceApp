package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.c.a;

final class gd
  implements c.a
{
  gd(cd paramcd, Hm paramHm) {}
  
  public final void onConnected(Bundle paramBundle)
  {
    try
    {
      this.a.b(cd.b(this.b).A());
      return;
    }
    catch (DeadObjectException paramBundle)
    {
      this.a.a(paramBundle);
    }
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    Hm localHm = this.a;
    StringBuilder localStringBuilder = new StringBuilder(34);
    localStringBuilder.append("onConnectionSuspended: ");
    localStringBuilder.append(paramInt);
    localHm.a(new RuntimeException(localStringBuilder.toString()));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */