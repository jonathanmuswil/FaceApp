package com.google.firebase.components;

import jQ;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kQ;
import lQ;
import mQ;

class u
  implements mQ, lQ
{
  private final Map<Class<?>, ConcurrentHashMap<kQ<Object>, Executor>> a = new HashMap();
  private Queue<jQ<?>> b = new ArrayDeque();
  private final Executor c;
  
  u(Executor paramExecutor)
  {
    this.c = paramExecutor;
  }
  
  private Set<Map.Entry<kQ<Object>, Executor>> b(jQ<?> paramjQ)
  {
    try
    {
      paramjQ = (Map)this.a.get(paramjQ.b());
      if (paramjQ == null) {
        paramjQ = Collections.emptySet();
      } else {
        paramjQ = paramjQ.entrySet();
      }
      return paramjQ;
    }
    finally {}
  }
  
  void a()
  {
    try
    {
      Object localObject1;
      if (this.b != null)
      {
        localObject1 = this.b;
        this.b = null;
      }
      else
      {
        localObject1 = null;
      }
      if (localObject1 != null)
      {
        localObject1 = ((Queue)localObject1).iterator();
        while (((Iterator)localObject1).hasNext()) {
          a((jQ)((Iterator)localObject1).next());
        }
      }
      return;
    }
    finally {}
  }
  
  public void a(jQ<?> paramjQ)
  {
    com.google.android.gms.common.internal.t.a(paramjQ);
    try
    {
      if (this.b != null)
      {
        this.b.add(paramjQ);
        return;
      }
      Iterator localIterator = b(paramjQ).iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        ((Executor)localEntry.getValue()).execute(t.a(localEntry, paramjQ));
      }
      return;
    }
    finally {}
  }
  
  public <T> void a(Class<T> paramClass, Executor paramExecutor, kQ<? super T> paramkQ)
  {
    try
    {
      com.google.android.gms.common.internal.t.a(paramClass);
      com.google.android.gms.common.internal.t.a(paramkQ);
      com.google.android.gms.common.internal.t.a(paramExecutor);
      if (!this.a.containsKey(paramClass))
      {
        Map localMap = this.a;
        ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
        localConcurrentHashMap.<init>();
        localMap.put(paramClass, localConcurrentHashMap);
      }
      ((ConcurrentHashMap)this.a.get(paramClass)).put(paramkQ, paramExecutor);
      return;
    }
    finally {}
  }
  
  public <T> void a(Class<T> paramClass, kQ<? super T> paramkQ)
  {
    a(paramClass, this.c, paramkQ);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/components/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */