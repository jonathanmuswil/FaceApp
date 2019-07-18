package com.facebook.accountkit.internal;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

final class aa
  implements Runnable
{
  public void run()
  {
    try
    {
      Iterator localIterator = ba.a().iterator();
      while (localIterator.hasNext()) {
        ((Z)localIterator.next()).a(true);
      }
      return;
    }
    finally
    {
      ba.b().set(false);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */