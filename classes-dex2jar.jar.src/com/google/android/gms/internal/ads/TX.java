package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;

public final class tx
  implements o
{
  private final wv a;
  private final xw b;
  
  public tx(wv paramwv, xw paramxw)
  {
    this.a = paramwv;
    this.b = paramxw;
  }
  
  public final void F()
  {
    this.a.F();
    this.b.K();
  }
  
  public final void G()
  {
    this.a.G();
    this.b.L();
  }
  
  public final void onPause()
  {
    this.a.onPause();
  }
  
  public final void onResume()
  {
    this.a.onResume();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */