package com.facebook.accountkit.internal;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class i
  implements Runnable
{
  i(j paramj) {}
  
  public void run()
  {
    int i = j.a(this.a) + 1;
    j localj = new j(null, j.b(this.a), j.c(this.a), i, null);
    va.b().schedule(new h(this, localj), i * 5, TimeUnit.SECONDS);
    if (j.b(this.a).h()) {
      j.d(localj);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */