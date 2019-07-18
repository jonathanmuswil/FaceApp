package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lQ;
import oQ;

final class x
  extends a
{
  private final Set<Class<?>> a;
  private final Set<Class<?>> b;
  private final Set<Class<?>> c;
  private final Set<Class<?>> d;
  private final Set<Class<?>> e;
  private final f f;
  
  x(e<?> parame, f paramf)
  {
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    HashSet localHashSet3 = new HashSet();
    HashSet localHashSet4 = new HashSet();
    Iterator localIterator = parame.a().iterator();
    while (localIterator.hasNext())
    {
      q localq = (q)localIterator.next();
      if (localq.b())
      {
        if (localq.d()) {
          localHashSet3.add(localq.a());
        } else {
          localHashSet1.add(localq.a());
        }
      }
      else if (localq.d()) {
        localHashSet4.add(localq.a());
      } else {
        localHashSet2.add(localq.a());
      }
    }
    if (!parame.d().isEmpty()) {
      localHashSet1.add(lQ.class);
    }
    this.a = Collections.unmodifiableSet(localHashSet1);
    this.b = Collections.unmodifiableSet(localHashSet2);
    this.c = Collections.unmodifiableSet(localHashSet3);
    this.d = Collections.unmodifiableSet(localHashSet4);
    this.e = parame.d();
    this.f = paramf;
  }
  
  public <T> T a(Class<T> paramClass)
  {
    if (this.a.contains(paramClass))
    {
      Object localObject = this.f.a(paramClass);
      if (!paramClass.equals(lQ.class)) {
        return (T)localObject;
      }
      return new a(this.e, (lQ)localObject);
    }
    throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[] { paramClass }));
  }
  
  public <T> oQ<T> b(Class<T> paramClass)
  {
    if (this.b.contains(paramClass)) {
      return this.f.b(paramClass);
    }
    throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[] { paramClass }));
  }
  
  public <T> oQ<Set<T>> c(Class<T> paramClass)
  {
    if (this.d.contains(paramClass)) {
      return this.f.c(paramClass);
    }
    throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[] { paramClass }));
  }
  
  public <T> Set<T> d(Class<T> paramClass)
  {
    if (this.c.contains(paramClass)) {
      return this.f.d(paramClass);
    }
    throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[] { paramClass }));
  }
  
  private static class a
    implements lQ
  {
    private final Set<Class<?>> a;
    private final lQ b;
    
    public a(Set<Class<?>> paramSet, lQ paramlQ)
    {
      this.a = paramSet;
      this.b = paramlQ;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/components/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */