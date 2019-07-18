package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;

final class ej
  implements Runnable
{
  ej(bj parambj, Bitmap paramBitmap) {}
  
  public final void run()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    this.a.compress(Bitmap.CompressFormat.PNG, 0, localByteArrayOutputStream);
    synchronized (bj.a(this.b))
    {
      rT localrT = bj.b(this.b);
      wT localwT = new com/google/android/gms/internal/ads/wT;
      localwT.<init>();
      localrT.k = localwT;
      bj.b(this.b).k.e = localByteArrayOutputStream.toByteArray();
      bj.b(this.b).k.d = "image/png";
      bj.b(this.b).k.c = Integer.valueOf(1);
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */