package com.facebook.appevents;

import android.content.Context;
import com.facebook.FacebookSdk;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class g
{
  private final HashMap<b, w> a = new HashMap();
  
  private w b(b paramb)
  {
    try
    {
      Object localObject1 = (w)this.a.get(paramb);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject1 = FacebookSdk.d();
        localObject2 = new com/facebook/appevents/w;
        ((w)localObject2).<init>(com.facebook.internal.b.a((Context)localObject1), AppEventsLogger.a((Context)localObject1));
      }
      this.a.put(paramb, localObject2);
      return (w)localObject2;
    }
    finally {}
  }
  
  public int a()
  {
    int i = 0;
    try
    {
      Iterator localIterator = this.a.values().iterator();
      while (localIterator.hasNext())
      {
        int j = ((w)localIterator.next()).a();
        i += j;
      }
      return i;
    }
    finally {}
  }
  
  public w a(b paramb)
  {
    try
    {
      paramb = (w)this.a.get(paramb);
      return paramb;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  public void a(b paramb, f paramf)
  {
    try
    {
      b(paramb).a(paramf);
      return;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  public void a(v paramv)
  {
    if (paramv == null) {
      return;
    }
    try
    {
      Iterator localIterator = paramv.a().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (b)localIterator.next();
        w localw = b((b)localObject);
        localObject = paramv.b((b)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          localw.a((f)((Iterator)localObject).next());
        }
      }
      return;
    }
    finally {}
  }
  
  public Set<b> b()
  {
    try
    {
      Set localSet = this.a.keySet();
      return localSet;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/appevents/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */