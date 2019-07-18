package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.k;

@yh
public final class nk
  extends bN
{
  public nk(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  protected final void a(Message paramMessage)
  {
    try
    {
      super.a(paramMessage);
      return;
    }
    catch (Throwable paramMessage)
    {
      k.c();
      vk.a(k.g().a(), paramMessage);
      throw paramMessage;
    }
  }
  
  public final void handleMessage(Message paramMessage)
  {
    try
    {
      super.handleMessage(paramMessage);
      return;
    }
    catch (Exception paramMessage)
    {
      k.g().a(paramMessage, "AdMobHandler.handleMessage");
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */