package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@yh
@TargetApi(14)
public abstract class en
  extends TextureView
  implements An
{
  protected final on a = new on();
  protected final zn b = new zn(paramContext, this);
  
  public en(Context paramContext)
  {
    super(paramContext);
  }
  
  public abstract void a();
  
  public abstract void a(float paramFloat1, float paramFloat2);
  
  public abstract void a(dn paramdn);
  
  public void a(String paramString, String[] paramArrayOfString)
  {
    setVideoPath(paramString);
  }
  
  public abstract void b();
  
  public abstract void b(int paramInt);
  
  public abstract void c();
  
  public void c(int paramInt) {}
  
  public abstract void d();
  
  public void d(int paramInt) {}
  
  public abstract String e();
  
  public void e(int paramInt) {}
  
  public void f(int paramInt) {}
  
  public void g(int paramInt) {}
  
  public abstract int getCurrentPosition();
  
  public abstract int getDuration();
  
  public abstract int getVideoHeight();
  
  public abstract int getVideoWidth();
  
  public abstract void setVideoPath(String paramString);
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/en.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */