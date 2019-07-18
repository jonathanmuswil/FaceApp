package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.t;
import gd;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class a
  extends cb
{
  private final Map<String, Long> b = new gd();
  private final Map<String, Integer> c = new gd();
  private long d;
  
  public a(aa paramaa)
  {
    super(paramaa);
  }
  
  private final void a(long paramLong, fb paramfb)
  {
    if (paramfb == null)
    {
      c().A().a("Not logging ad exposure. No active activity");
      return;
    }
    if (paramLong < 1000L)
    {
      c().A().a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(paramLong));
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putLong("_xt", paramLong);
    gb.a(paramfb, localBundle, true);
    o().b("am", "_xa", localBundle);
  }
  
  private final void a(String paramString, long paramLong, fb paramfb)
  {
    if (paramfb == null)
    {
      c().A().a("Not logging ad unit exposure. No active activity");
      return;
    }
    if (paramLong < 1000L)
    {
      c().A().a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(paramLong));
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("_ai", paramString);
    localBundle.putLong("_xt", paramLong);
    gb.a(paramfb, localBundle, true);
    o().b("am", "_xu", localBundle);
  }
  
  private final void b(long paramLong)
  {
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.b.put(str, Long.valueOf(paramLong));
    }
    if (!this.b.isEmpty()) {
      this.d = paramLong;
    }
  }
  
  private final void c(String paramString, long paramLong)
  {
    h();
    j();
    t.b(paramString);
    if (this.c.isEmpty()) {
      this.d = paramLong;
    }
    Integer localInteger = (Integer)this.c.get(paramString);
    if (localInteger != null)
    {
      this.c.put(paramString, Integer.valueOf(localInteger.intValue() + 1));
      return;
    }
    if (this.c.size() >= 100)
    {
      c().v().a("Too many ads visible");
      return;
    }
    this.c.put(paramString, Integer.valueOf(1));
    this.b.put(paramString, Long.valueOf(paramLong));
  }
  
  private final void d(String paramString, long paramLong)
  {
    h();
    j();
    t.b(paramString);
    Object localObject = (Integer)this.c.get(paramString);
    if (localObject != null)
    {
      fb localfb = r().A();
      int i = ((Integer)localObject).intValue() - 1;
      if (i == 0)
      {
        this.c.remove(paramString);
        localObject = (Long)this.b.get(paramString);
        long l;
        if (localObject == null)
        {
          c().s().a("First ad unit exposure time was never set");
        }
        else
        {
          l = ((Long)localObject).longValue();
          this.b.remove(paramString);
          a(paramString, paramLong - l, localfb);
        }
        if (this.c.isEmpty())
        {
          l = this.d;
          if (l == 0L)
          {
            c().s().a("First ad exposure time was never set");
            return;
          }
          a(paramLong - l, localfb);
          this.d = 0L;
        }
        return;
      }
      this.c.put(paramString, Integer.valueOf(i));
      return;
    }
    c().s().a("Call to endAdUnitExposure for unknown ad unit id", paramString);
  }
  
  public final void a(long paramLong)
  {
    fb localfb = r().A();
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a(str, paramLong - ((Long)this.b.get(str)).longValue(), localfb);
    }
    if (!this.b.isEmpty()) {
      a(paramLong - this.d, localfb);
    }
    b(paramLong);
  }
  
  public final void a(String paramString, long paramLong)
  {
    if ((paramString != null) && (paramString.length() != 0))
    {
      n().a(new B(this, paramString, paramLong));
      return;
    }
    c().s().a("Ad unit id must be a non-empty string");
  }
  
  public final void b(String paramString, long paramLong)
  {
    if ((paramString != null) && (paramString.length() != 0))
    {
      n().a(new ca(this, paramString, paramLong));
      return;
    }
    c().s().a("Ad unit id must be a non-empty string");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */