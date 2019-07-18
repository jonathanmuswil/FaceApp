package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.Hl;
import com.google.android.gms.internal.ads.Kea;
import com.google.android.gms.internal.ads.yh;

@yh
public final class p
  extends FrameLayout
  implements View.OnClickListener
{
  private final ImageButton a;
  private final x b;
  
  public p(Context paramContext, q paramq, x paramx)
  {
    super(paramContext);
    this.b = paramx;
    setOnClickListener(this);
    this.a = new ImageButton(paramContext);
    this.a.setImageResource(17301527);
    this.a.setBackgroundColor(0);
    this.a.setOnClickListener(this);
    paramx = this.a;
    Kea.a();
    int i = Hl.a(paramContext, paramq.a);
    Kea.a();
    int j = Hl.a(paramContext, 0);
    Kea.a();
    int k = Hl.a(paramContext, paramq.b);
    Kea.a();
    paramx.setPadding(i, j, k, Hl.a(paramContext, paramq.d));
    this.a.setContentDescription("Interstitial close button");
    paramx = this.a;
    Kea.a();
    j = Hl.a(paramContext, paramq.e + paramq.a + paramq.b);
    Kea.a();
    addView(paramx, new FrameLayout.LayoutParams(j, Hl.a(paramContext, paramq.e + paramq.d), 17));
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.a.setVisibility(8);
      return;
    }
    this.a.setVisibility(0);
  }
  
  public final void onClick(View paramView)
  {
    paramView = this.b;
    if (paramView != null) {
      paramView.Eb();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */