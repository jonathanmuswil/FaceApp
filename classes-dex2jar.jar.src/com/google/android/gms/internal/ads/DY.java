package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class dy
  implements Ic<Object>
{
  private WeakReference<ay> a;
  
  private dy(ay paramay)
  {
    this.a = new WeakReference(paramay);
  }
  
  public final void a(Object paramObject, Map<String, String> paramMap)
  {
    paramObject = (ay)this.a.get();
    if (paramObject == null) {
      return;
    }
    ay.a((ay)paramObject).K();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */