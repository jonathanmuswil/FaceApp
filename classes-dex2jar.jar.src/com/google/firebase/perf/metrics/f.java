package com.google.firebase.perf.metrics;

import Aw;
import Aw.a;
import Iv;
import com.google.firebase.perf.internal.x;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sx.a;

final class f
{
  private final Trace a;
  
  f(Trace paramTrace)
  {
    this.a = paramTrace;
  }
  
  final Aw a()
  {
    Aw.a locala = Aw.r();
    locala.a(this.a.l());
    locala.a(this.a.n().m());
    locala.b(this.a.n().a(this.a.o()));
    Iterator localIterator = this.a.m().values().iterator();
    while (localIterator.hasNext())
    {
      localObject = (a)localIterator.next();
      locala.a(((a)localObject).m(), ((a)localObject).l());
    }
    Object localObject = this.a.p();
    if (!((List)localObject).isEmpty())
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        locala.a(new f((Trace)((Iterator)localObject).next()).a());
      }
    }
    locala.b(this.a.getAttributes());
    localObject = x.a(this.a.q());
    if (localObject != null) {
      locala.b(Arrays.asList((Object[])localObject));
    }
    return (Aw)locala.O();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/metrics/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */