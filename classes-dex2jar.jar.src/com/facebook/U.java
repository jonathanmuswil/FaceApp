package com.facebook;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class u
  implements ThreadFactory
{
  private final AtomicInteger a = new AtomicInteger(0);
  
  public Thread newThread(Runnable paramRunnable)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FacebookSdk #");
    localStringBuilder.append(this.a.incrementAndGet());
    return new Thread(paramRunnable, localStringBuilder.toString());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */