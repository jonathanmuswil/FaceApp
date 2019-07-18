package com.google.android.gms.internal.ads;

final class ep
  implements Fn
{
  ep(dp paramdp) {}
  
  public final void a(String paramString1, String paramString2)
  {
    dp localdp = this.a;
    Object localObject = String.valueOf(paramString1);
    if (((String)localObject).length() != 0) {
      localObject = "ExoPlayer caching failed. Type: ".concat((String)localObject);
    } else {
      localObject = new String("ExoPlayer caching failed. Type: ");
    }
    dp.a(localdp, (String)localObject);
    localObject = new StringBuilder(String.valueOf(paramString1).length() + 46 + String.valueOf(paramString2).length());
    ((StringBuilder)localObject).append("ExoPlayer failed during precache: ");
    ((StringBuilder)localObject).append(paramString1);
    ((StringBuilder)localObject).append(" Exception: ");
    ((StringBuilder)localObject).append(paramString2);
    Tl.d(((StringBuilder)localObject).toString());
    this.a.b();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */