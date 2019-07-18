package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class cy
  implements Ic<Object>
{
  private WeakReference<ay> a;
  
  private cy(ay paramay)
  {
    this.a = new WeakReference(paramay);
  }
  
  public final void a(Object paramObject, Map<String, String> paramMap)
  {
    paramObject = (ay)this.a.get();
    if (paramObject == null) {
      return;
    }
    if ("_ac".equals((String)paramMap.get("eventName"))) {
      ay.b((ay)paramObject).l();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */