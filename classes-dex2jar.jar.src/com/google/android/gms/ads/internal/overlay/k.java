package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.android.gms.ads.internal.h;
import com.google.android.gms.internal.ads.Bk;
import com.google.android.gms.internal.ads.hk;
import com.google.android.gms.internal.ads.vk;
import com.google.android.gms.internal.ads.vl;
import com.google.android.gms.internal.ads.yh;

@yh
final class k
  extends hk
{
  private k(d paramd) {}
  
  public final void a()
  {
    Bitmap localBitmap = com.google.android.gms.ads.internal.k.v().a(Integer.valueOf(this.d.c.o.f));
    if (localBitmap != null)
    {
      Bk localBk = com.google.android.gms.ads.internal.k.e();
      Object localObject1 = this.d;
      Object localObject2 = ((d)localObject1).b;
      localObject1 = ((d)localObject1).c.o;
      localObject2 = localBk.a((Context)localObject2, localBitmap, ((h)localObject1).d, ((h)localObject1).e);
      vk.a.post(new l(this, (Drawable)localObject2));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */