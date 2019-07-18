package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@yh
final class ym
{
  private final Object a = new Object();
  private final List<Runnable> b = new ArrayList();
  private boolean c = false;
  
  public final void a()
  {
    ArrayList localArrayList = new ArrayList();
    synchronized (this.a)
    {
      if (this.c) {
        return;
      }
      localArrayList.addAll(this.b);
      this.b.clear();
      this.c = true;
      int i = localArrayList.size();
      int j = 0;
      while (j < i)
      {
        ??? = localArrayList.get(j);
        j++;
        ((Runnable)???).run();
      }
      return;
    }
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor)
  {
    synchronized (this.a)
    {
      if (this.c)
      {
        paramExecutor.execute(paramRunnable);
      }
      else
      {
        List localList = this.b;
        zm localzm = new com/google/android/gms/internal/ads/zm;
        localzm.<init>(paramExecutor, paramRunnable);
        localList.add(localzm);
      }
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ym.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */