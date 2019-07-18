package com.facebook.appevents;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class k
  implements Runnable
{
  k(b paramb, f paramf) {}
  
  public void run()
  {
    n.b().a(this.a, this.b);
    if ((AppEventsLogger.d() != AppEventsLogger.a.b) && (n.b().a() > 100)) {
      n.b(r.e);
    } else if (n.a() == null) {
      n.a(n.d().schedule(n.c(), 15L, TimeUnit.SECONDS));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/appevents/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */