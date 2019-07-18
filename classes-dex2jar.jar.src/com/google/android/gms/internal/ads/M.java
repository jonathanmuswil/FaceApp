package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.k;

@yh
public final class m
  implements k
{
  private final String a;
  private j b;
  
  public m(j paramj)
  {
    this.b = paramj;
    try
    {
      paramj = paramj.eb();
    }
    catch (RemoteException paramj)
    {
      Tl.b("", paramj);
      paramj = null;
    }
    this.a = paramj;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */