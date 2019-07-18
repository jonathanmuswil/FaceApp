package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public abstract interface f
  extends j
{
  public abstract void onDestroy();
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public static final class a
  {
    private int a;
    
    public final Bundle a()
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("capabilities", this.a);
      return localBundle;
    }
    
    public final a a(int paramInt)
    {
      this.a = 1;
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/mediation/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */