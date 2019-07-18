package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.k;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@yh
public final class xca
{
  private final Object a = new Object();
  private int b;
  private List<wca> c = new LinkedList();
  
  public final wca a(boolean paramBoolean)
  {
    synchronized (this.a)
    {
      int i = this.c.size();
      Object localObject2 = null;
      if (i == 0)
      {
        Tl.a("Queue empty");
        return null;
      }
      i = this.c.size();
      int j = 0;
      if (i >= 2)
      {
        int k = Integer.MIN_VALUE;
        Iterator localIterator = this.c.iterator();
        i = 0;
        while (localIterator.hasNext())
        {
          wca localwca = (wca)localIterator.next();
          int m = localwca.a();
          int n = k;
          if (m > k)
          {
            j = i;
            localObject2 = localwca;
            n = m;
          }
          i++;
          k = n;
        }
        this.c.remove(j);
        return (wca)localObject2;
      }
      localObject2 = (wca)this.c.get(0);
      if (paramBoolean) {
        this.c.remove(0);
      } else {
        ((wca)localObject2).f();
      }
      return (wca)localObject2;
    }
  }
  
  public final boolean a(wca paramwca)
  {
    synchronized (this.a)
    {
      return this.c.contains(paramwca);
    }
  }
  
  public final boolean b(wca paramwca)
  {
    synchronized (this.a)
    {
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        wca localwca = (wca)localIterator.next();
        if (!k.g().i().f())
        {
          if ((paramwca != localwca) && (localwca.c().equals(paramwca.c())))
          {
            localIterator.remove();
            return true;
          }
        }
        else if ((!k.g().i().b()) && (paramwca != localwca) && (localwca.e().equals(paramwca.e())))
        {
          localIterator.remove();
          return true;
        }
      }
      return false;
    }
  }
  
  public final void c(wca paramwca)
  {
    synchronized (this.a)
    {
      if (this.c.size() >= 10)
      {
        i = this.c.size();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(41);
        localStringBuilder.append("Queue is full, current size = ");
        localStringBuilder.append(i);
        Tl.a(localStringBuilder.toString());
        this.c.remove(0);
      }
      int i = this.b;
      this.b = (i + 1);
      paramwca.a(i);
      paramwca.i();
      this.c.add(paramwca);
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */