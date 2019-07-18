package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.os.Looper;
import com.google.android.gms.common.util.e;
import java.util.concurrent.Executor;

public final class tz
{
  private final hl a;
  private final e b;
  private final Executor c;
  
  public tz(hl paramhl, e parame, Executor paramExecutor)
  {
    this.a = paramhl;
    this.b = parame;
    this.c = paramExecutor;
  }
  
  private final Bitmap a(byte[] paramArrayOfByte, double paramDouble, boolean paramBoolean)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inDensity = ((int)(paramDouble * 160.0D));
    if (!paramBoolean) {
      localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
    }
    ga localga = ra.Qe;
    if (((Boolean)Kea.e().a(localga)).booleanValue())
    {
      localOptions.inJustDecodeBounds = true;
      a(paramArrayOfByte, localOptions);
      localOptions.inJustDecodeBounds = false;
      int i = localOptions.outWidth * localOptions.outHeight;
      if (i > 0)
      {
        localga = ra.Re;
        localOptions.inSampleSize = (1 << (33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer)Kea.e().a(localga)).intValue())) / 2);
      }
    }
    return a(paramArrayOfByte, localOptions);
  }
  
  private final Bitmap a(byte[] paramArrayOfByte, BitmapFactory.Options paramOptions)
  {
    long l1 = this.b.b();
    int i = paramArrayOfByte.length;
    boolean bool = false;
    paramOptions = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, i, paramOptions);
    long l2 = this.b.b();
    if ((Build.VERSION.SDK_INT >= 19) && (paramOptions != null))
    {
      int j = paramOptions.getWidth();
      int k = paramOptions.getHeight();
      i = paramOptions.getAllocationByteCount();
      if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        bool = true;
      }
      paramArrayOfByte = new StringBuilder(108);
      paramArrayOfByte.append("Decoded image w: ");
      paramArrayOfByte.append(j);
      paramArrayOfByte.append(" h:");
      paramArrayOfByte.append(k);
      paramArrayOfByte.append(" bytes: ");
      paramArrayOfByte.append(i);
      paramArrayOfByte.append(" time: ");
      paramArrayOfByte.append(l2 - l1);
      paramArrayOfByte.append(" on ui thread: ");
      paramArrayOfByte.append(bool);
      mk.f(paramArrayOfByte.toString());
    }
    return paramOptions;
  }
  
  public final xm<Bitmap> a(String paramString, double paramDouble, boolean paramBoolean)
  {
    return gm.a(hl.a(paramString), new uz(this, paramDouble, paramBoolean), this.c);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */