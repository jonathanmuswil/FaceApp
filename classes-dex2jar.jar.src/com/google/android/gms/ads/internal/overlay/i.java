package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.Pk;
import com.google.android.gms.internal.ads.yh;

@yh
final class i
  extends RelativeLayout
{
  private Pk a;
  boolean b;
  
  public i(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext);
    this.a = new Pk(paramContext, paramString1);
    this.a.d(paramString2);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.b) {
      this.a.a(paramMotionEvent);
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */