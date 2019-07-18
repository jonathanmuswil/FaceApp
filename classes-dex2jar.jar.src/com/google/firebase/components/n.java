package com.google.firebase.components;

import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import lQ;
import mQ;
import oQ;

public class n
  extends a
{
  private static final oQ<Set<Object>> a = ;
  private final Map<e<?>, v<?>> b = new HashMap();
  private final Map<Class<?>, v<?>> c = new HashMap();
  private final Map<Class<?>, v<Set<?>>> d = new HashMap();
  private final u e;
  
  public n(Executor paramExecutor, Iterable<j> paramIterable, e<?>... paramVarArgs)
  {
    this.e = new u(paramExecutor);
    paramExecutor = new ArrayList();
    paramExecutor.add(e.a(this.e, u.class, new Class[] { mQ.class, lQ.class }));
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      paramExecutor.addAll(((j)paramIterable.next()).getComponents());
    }
    Collections.addAll(paramExecutor, paramVarArgs);
    p.a(paramExecutor);
    paramExecutor = paramExecutor.iterator();
    while (paramExecutor.hasNext())
    {
      paramIterable = (e)paramExecutor.next();
      paramVarArgs = new v(k.a(this, paramIterable));
      this.b.put(paramIterable, paramVarArgs);
    }
    a();
    b();
  }
  
  private void a()
  {
    Iterator localIterator1 = this.b.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Object localObject1 = (Map.Entry)localIterator1.next();
      Object localObject2 = (e)((Map.Entry)localObject1).getKey();
      if (((e)localObject2).g())
      {
        localObject1 = (v)((Map.Entry)localObject1).getValue();
        Iterator localIterator2 = ((e)localObject2).c().iterator();
        while (localIterator2.hasNext())
        {
          localObject2 = (Class)localIterator2.next();
          this.c.put(localObject2, localObject1);
        }
      }
    }
    c();
  }
  
  private void b()
  {
    Object localObject1 = new HashMap();
    Object localObject2 = this.b.entrySet().iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      Object localObject4 = (e)((Map.Entry)localObject3).getKey();
      if (!((e)localObject4).g())
      {
        localObject3 = (v)((Map.Entry)localObject3).getValue();
        Iterator localIterator = ((e)localObject4).c().iterator();
        while (localIterator.hasNext())
        {
          localObject4 = (Class)localIterator.next();
          if (!((Map)localObject1).containsKey(localObject4)) {
            ((Map)localObject1).put(localObject4, new HashSet());
          }
          ((Set)((Map)localObject1).get(localObject4)).add(localObject3);
        }
      }
    }
    localObject1 = ((Map)localObject1).entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject1).next();
      localObject2 = (Set)((Map.Entry)localObject3).getValue();
      this.d.put((Class)((Map.Entry)localObject3).getKey(), new v(l.a((Set)localObject2)));
    }
  }
  
  private void c()
  {
    e locale;
    q localq;
    do
    {
      Iterator localIterator1 = this.b.keySet().iterator();
      Iterator localIterator2;
      while (!localIterator2.hasNext())
      {
        if (!localIterator1.hasNext()) {
          break;
        }
        locale = (e)localIterator1.next();
        localIterator2 = locale.a().iterator();
      }
      localq = (q)localIterator2.next();
    } while ((!localq.c()) || (this.c.containsKey(localq.a())));
    throw new w(String.format("Unsatisfied dependency for component %s: %s", new Object[] { locale, localq.a() }));
  }
  
  public void a(boolean paramBoolean)
  {
    Iterator localIterator = this.b.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      e locale = (e)((Map.Entry)localObject).getKey();
      localObject = (v)((Map.Entry)localObject).getValue();
      if ((locale.e()) || ((locale.f()) && (paramBoolean))) {
        ((v)localObject).get();
      }
    }
    this.e.a();
  }
  
  public <T> oQ<T> b(Class<T> paramClass)
  {
    t.a(paramClass, "Null interface requested.");
    return (oQ)this.c.get(paramClass);
  }
  
  public <T> oQ<Set<T>> c(Class<T> paramClass)
  {
    paramClass = (v)this.d.get(paramClass);
    if (paramClass != null) {
      return paramClass;
    }
    return a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/components/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */