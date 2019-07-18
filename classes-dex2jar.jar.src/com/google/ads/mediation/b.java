package com.google.ads.mediation;

import Gp;
import android.os.Bundle;
import com.google.android.gms.ads.i;
import com.google.android.gms.ads.reward.mediation.a;

final class b
  extends Gp
{
  b(AbstractAdViewAdapter paramAbstractAdViewAdapter) {}
  
  public final void a()
  {
    if ((AbstractAdViewAdapter.zzb(this.a) != null) && (AbstractAdViewAdapter.zza(this.a) != null))
    {
      Bundle localBundle = AbstractAdViewAdapter.zzb(this.a).a();
      AbstractAdViewAdapter.zza(this.a).a(localBundle);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/ads/mediation/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */