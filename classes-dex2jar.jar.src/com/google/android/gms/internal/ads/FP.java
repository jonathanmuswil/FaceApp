package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@yh
final class fp
{
  private final ArrayList<jba> a = new ArrayList();
  private long b;
  
  final long a()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = ((jba)localIterator.next()).a();
      if (localObject != null)
      {
        localObject = ((Map)localObject).entrySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
          try
          {
            if ("content-length".equalsIgnoreCase((String)localEntry.getKey()))
            {
              long l = Long.parseLong((String)((List)localEntry.getValue()).get(0));
              this.b = Math.max(this.b, l);
            }
          }
          catch (RuntimeException localRuntimeException) {}
        }
        localIterator.remove();
      }
    }
    return this.b;
  }
  
  final void a(jba paramjba)
  {
    this.a.add(paramjba);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */