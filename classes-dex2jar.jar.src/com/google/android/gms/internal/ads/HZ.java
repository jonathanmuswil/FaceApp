package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Map;

public abstract interface hz
  extends View.OnClickListener, View.OnTouchListener
{
  public abstract View a();
  
  public abstract View a(String paramString);
  
  public abstract void a(String paramString, View paramView, boolean paramBoolean);
  
  public abstract FrameLayout b();
  
  public abstract hca c();
  
  public abstract Map<String, WeakReference<View>> d();
  
  public abstract Map<String, WeakReference<View>> e();
  
  public abstract Map<String, WeakReference<View>> f();
  
  public abstract String g();
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */