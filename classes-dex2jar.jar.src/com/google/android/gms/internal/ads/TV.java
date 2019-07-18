package com.google.android.gms.internal.ads;

import Gp;
import android.os.Bundle;
import java.util.Set;

public final class tv
  extends Uv<Gp>
  implements oc
{
  private Bundle b = new Bundle();
  
  public tv(Set<Bw<Gp>> paramSet)
  {
    super(paramSet);
  }
  
  public final Bundle K()
  {
    try
    {
      Bundle localBundle = new Bundle(this.b);
      return localBundle;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(String paramString, Bundle paramBundle)
  {
    try
    {
      this.b.putAll(paramBundle);
      a(uv.a);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */