package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.common.internal.t;

@yh
public final class mn
{
  private final Context a;
  private final wn b;
  private final ViewGroup c;
  private gn d;
  
  public mn(Context paramContext, ViewGroup paramViewGroup, sp paramsp)
  {
    this(paramContext, paramViewGroup, paramsp, null);
  }
  
  private mn(Context paramContext, ViewGroup paramViewGroup, wn paramwn, gn paramgn)
  {
    paramgn = paramContext;
    if (paramContext.getApplicationContext() != null) {
      paramgn = paramContext.getApplicationContext();
    }
    this.a = paramgn;
    this.c = paramViewGroup;
    this.b = paramwn;
    this.d = null;
  }
  
  public final void a()
  {
    t.a("onDestroy must be called from the UI thread.");
    gn localgn = this.d;
    if (localgn != null)
    {
      localgn.a();
      this.c.removeView(this.d);
      this.d = null;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    t.a("The underlay may only be modified from the UI thread.");
    gn localgn = this.d;
    if (localgn != null) {
      localgn.a(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, vn paramvn)
  {
    if (this.d != null) {
      return;
    }
    za.a(this.b.D().a(), this.b.I(), new String[] { "vpr2" });
    Context localContext = this.a;
    wn localwn = this.b;
    this.d = new gn(localContext, localwn, paramInt5, paramBoolean, localwn.D().a(), paramvn);
    this.c.addView(this.d, 0, new ViewGroup.LayoutParams(-1, -1));
    this.d.a(paramInt1, paramInt2, paramInt3, paramInt4);
    this.b.f(false);
  }
  
  public final void b()
  {
    t.a("onPause must be called from the UI thread.");
    gn localgn = this.d;
    if (localgn != null) {
      localgn.b();
    }
  }
  
  public final gn c()
  {
    t.a("getAdVideoUnderlay must be called from the UI thread.");
    return this.d;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */