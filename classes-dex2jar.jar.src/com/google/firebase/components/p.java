package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class p
{
  private static Set<a> a(Set<a> paramSet)
  {
    HashSet localHashSet = new HashSet();
    paramSet = paramSet.iterator();
    while (paramSet.hasNext())
    {
      a locala = (a)paramSet.next();
      if (locala.d()) {
        localHashSet.add(locala);
      }
    }
    return localHashSet;
  }
  
  static void a(List<e<?>> paramList)
  {
    Object localObject1 = b(paramList);
    Set localSet = a((Set)localObject1);
    int i = 0;
    if (!localSet.isEmpty())
    {
      localObject2 = (a)localSet.iterator().next();
      localSet.remove(localObject2);
      int j = i + 1;
      Iterator localIterator = ((a)localObject2).b().iterator();
      for (;;)
      {
        i = j;
        if (!localIterator.hasNext()) {
          break;
        }
        a locala = (a)localIterator.next();
        locala.c((a)localObject2);
        if (locala.d()) {
          localSet.add(locala);
        }
      }
    }
    if (i == paramList.size()) {
      return;
    }
    paramList = new ArrayList();
    Object localObject2 = ((Set)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (a)((Iterator)localObject2).next();
      if ((!((a)localObject1).d()) && (!((a)localObject1).c())) {
        paramList.add(((a)localObject1).a());
      }
    }
    throw new r(paramList);
  }
  
  private static Set<a> b(List<e<?>> paramList)
  {
    Object localObject1 = new HashMap(paramList.size());
    Iterator localIterator = paramList.iterator();
    Object localObject2;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    while (localIterator.hasNext())
    {
      localObject2 = (e)localIterator.next();
      localObject3 = new a((e)localObject2);
      localObject4 = ((e)localObject2).c().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject5 = (Class)((Iterator)localObject4).next();
        paramList = new b((Class)localObject5, ((e)localObject2).g() ^ true, null);
        if (!((Map)localObject1).containsKey(paramList)) {
          ((Map)localObject1).put(paramList, new HashSet());
        }
        localObject6 = (Set)((Map)localObject1).get(paramList);
        if ((!((Set)localObject6).isEmpty()) && (!b.a(paramList))) {
          throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[] { localObject5 }));
        }
        ((Set)localObject6).add(localObject3);
      }
    }
    Object localObject3 = ((Map)localObject1).values().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject6 = ((Set)((Iterator)localObject3).next()).iterator();
      label231:
      if (((Iterator)localObject6).hasNext())
      {
        localObject4 = (a)((Iterator)localObject6).next();
        paramList = ((a)localObject4).a().a().iterator();
        while (paramList.hasNext())
        {
          localObject2 = (q)paramList.next();
          if (!((q)localObject2).b()) {
            break label231;
          }
          localObject2 = (Set)((Map)localObject1).get(new b(((q)localObject2).a(), ((q)localObject2).d(), null));
          if (localObject2 == null) {
            break label231;
          }
          localObject2 = ((Set)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject5 = (a)((Iterator)localObject2).next();
            ((a)localObject4).a((a)localObject5);
            ((a)localObject5).b((a)localObject4);
          }
        }
      }
    }
    paramList = new HashSet();
    localObject1 = ((Map)localObject1).values().iterator();
    while (((Iterator)localObject1).hasNext()) {
      paramList.addAll((Set)((Iterator)localObject1).next());
    }
    return paramList;
  }
  
  private static class a
  {
    private final e<?> a;
    private final Set<a> b = new HashSet();
    private final Set<a> c = new HashSet();
    
    a(e<?> parame)
    {
      this.a = parame;
    }
    
    e<?> a()
    {
      return this.a;
    }
    
    void a(a parama)
    {
      this.b.add(parama);
    }
    
    Set<a> b()
    {
      return this.b;
    }
    
    void b(a parama)
    {
      this.c.add(parama);
    }
    
    void c(a parama)
    {
      this.c.remove(parama);
    }
    
    boolean c()
    {
      return this.b.isEmpty();
    }
    
    boolean d()
    {
      return this.c.isEmpty();
    }
  }
  
  private static class b
  {
    private final Class<?> a;
    private final boolean b;
    
    private b(Class<?> paramClass, boolean paramBoolean)
    {
      this.a = paramClass;
      this.b = paramBoolean;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof b;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        paramObject = (b)paramObject;
        bool3 = bool2;
        if (((b)paramObject).a.equals(this.a))
        {
          bool3 = bool2;
          if (((b)paramObject).b == this.b) {
            bool3 = true;
          }
        }
      }
      return bool3;
    }
    
    public int hashCode()
    {
      return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Boolean.valueOf(this.b).hashCode();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/components/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */