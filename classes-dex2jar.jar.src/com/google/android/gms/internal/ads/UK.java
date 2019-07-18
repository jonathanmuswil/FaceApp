package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class uk
  implements ThreadFactory
{
  private final AtomicInteger a = new AtomicInteger(1);
  
  uk(String paramString) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    String str = this.b;
    int i = this.a.getAndIncrement();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
    localStringBuilder.append("AdWorker(");
    localStringBuilder.append(str);
    localStringBuilder.append(") #");
    localStringBuilder.append(i);
    return new Thread(paramRunnable, localStringBuilder.toString());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/uk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */