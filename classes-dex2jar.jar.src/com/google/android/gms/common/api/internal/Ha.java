package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.b;
import java.util.Collections;
import java.util.Map;

final class ha
  implements Runnable
{
  ha(e.c paramc, b paramb) {}
  
  public final void run()
  {
    if (this.a.C())
    {
      e.c.a(this.b, true);
      if (e.c.a(this.b).j())
      {
        e.c.b(this.b);
        return;
      }
      try
      {
        e.c.a(this.b).a(null, Collections.emptySet());
        return;
      }
      catch (SecurityException localSecurityException)
      {
        ((e.a)e.j(this.b.f).get(e.c.c(this.b))).onConnectionFailed(new b(10));
        return;
      }
    }
    ((e.a)e.j(this.b.f).get(e.c.c(this.b))).onConnectionFailed(this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/ha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */