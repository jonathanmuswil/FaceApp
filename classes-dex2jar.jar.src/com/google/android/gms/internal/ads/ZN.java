package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

@yh
@TargetApi(14)
public final class zn
  implements AudioManager.OnAudioFocusChangeListener
{
  private final AudioManager a;
  private final An b;
  private boolean c;
  private boolean d;
  private boolean e;
  private float f = 1.0F;
  
  public zn(Context paramContext, An paramAn)
  {
    this.a = ((AudioManager)paramContext.getSystemService("audio"));
    this.b = paramAn;
  }
  
  private final void d()
  {
    boolean bool1 = this.d;
    boolean bool2 = false;
    boolean bool3 = false;
    int i;
    if ((bool1) && (!this.e) && (this.f > 0.0F)) {
      i = 1;
    } else {
      i = 0;
    }
    AudioManager localAudioManager;
    if (i != 0)
    {
      bool1 = this.c;
      if (!bool1)
      {
        localAudioManager = this.a;
        if ((localAudioManager != null) && (!bool1))
        {
          bool2 = bool3;
          if (localAudioManager.requestAudioFocus(this, 3, 2) == 1) {
            bool2 = true;
          }
          this.c = bool2;
        }
        this.b.a();
        return;
      }
    }
    if (i == 0)
    {
      bool3 = this.c;
      if (bool3)
      {
        localAudioManager = this.a;
        if ((localAudioManager != null) && (bool3))
        {
          if (localAudioManager.abandonAudioFocus(this) == 0) {
            bool2 = true;
          }
          this.c = bool2;
        }
        this.b.a();
      }
    }
  }
  
  public final float a()
  {
    float f1;
    if (this.e) {
      f1 = 0.0F;
    } else {
      f1 = this.f;
    }
    if (this.c) {
      return f1;
    }
    return 0.0F;
  }
  
  public final void a(float paramFloat)
  {
    this.f = paramFloat;
    d();
  }
  
  public final void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
    d();
  }
  
  public final void b()
  {
    this.d = true;
    d();
  }
  
  public final void c()
  {
    this.d = false;
    d();
  }
  
  public final void onAudioFocusChange(int paramInt)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    this.c = bool;
    this.b.a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */