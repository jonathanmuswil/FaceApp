package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.sp;
import com.google.android.gms.internal.ads.yh;

@yh
public final class j
{
  public final int a;
  public final ViewGroup.LayoutParams b;
  public final ViewGroup c;
  public final Context d;
  
  public j(sp paramsp)
    throws h
  {
    this.b = paramsp.getLayoutParams();
    ViewParent localViewParent = paramsp.getParent();
    this.d = paramsp.s();
    if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
    {
      this.c = ((ViewGroup)localViewParent);
      this.a = this.c.indexOfChild(paramsp.getView());
      this.c.removeView(paramsp.getView());
      paramsp.d(true);
      return;
    }
    throw new h("Could not get the parent of the WebView for an overlay.");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */