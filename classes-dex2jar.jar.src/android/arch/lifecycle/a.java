package android.arch.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class a
{
  static a a = new a();
  private final Map<Class, a> b = new HashMap();
  private final Map<Class, Boolean> c = new HashMap();
  
  private a a(Class paramClass, Method[] paramArrayOfMethod)
  {
    Object localObject1 = paramClass.getSuperclass();
    HashMap localHashMap = new HashMap();
    if (localObject1 != null)
    {
      localObject1 = a((Class)localObject1);
      if (localObject1 != null) {
        localHashMap.putAll(((a)localObject1).b);
      }
    }
    Class[] arrayOfClass = paramClass.getInterfaces();
    int i = arrayOfClass.length;
    Object localObject2;
    for (int j = 0; j < i; j++)
    {
      localObject1 = a(arrayOfClass[j]).b.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        a(localHashMap, (b)((Map.Entry)localObject2).getKey(), (d.a)((Map.Entry)localObject2).getValue(), paramClass);
      }
    }
    if (paramArrayOfMethod == null) {
      paramArrayOfMethod = c(paramClass);
    }
    int k = paramArrayOfMethod.length;
    i = 0;
    boolean bool = false;
    while (i < k)
    {
      localObject1 = paramArrayOfMethod[i];
      localObject2 = (o)((Method)localObject1).getAnnotation(o.class);
      if (localObject2 != null)
      {
        arrayOfClass = ((Method)localObject1).getParameterTypes();
        if (arrayOfClass.length > 0)
        {
          if (arrayOfClass[0].isAssignableFrom(f.class)) {
            j = 1;
          } else {
            throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
          }
        }
        else {
          j = 0;
        }
        localObject2 = ((o)localObject2).value();
        if (arrayOfClass.length > 1) {
          if (arrayOfClass[1].isAssignableFrom(d.a.class))
          {
            if (localObject2 == d.a.ON_ANY) {
              j = 2;
            } else {
              throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
            }
          }
          else {
            throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
          }
        }
        if (arrayOfClass.length <= 2)
        {
          a(localHashMap, new b(j, (Method)localObject1), (d.a)localObject2, paramClass);
          bool = true;
        }
      }
      else
      {
        i++;
        continue;
      }
      throw new IllegalArgumentException("cannot have more than 2 params");
    }
    paramArrayOfMethod = new a(localHashMap);
    this.b.put(paramClass, paramArrayOfMethod);
    this.c.put(paramClass, Boolean.valueOf(bool));
    return paramArrayOfMethod;
  }
  
  private void a(Map<b, d.a> paramMap, b paramb, d.a parama, Class paramClass)
  {
    d.a locala = (d.a)paramMap.get(paramb);
    if ((locala != null) && (parama != locala))
    {
      paramb = paramb.b;
      paramMap = new StringBuilder();
      paramMap.append("Method ");
      paramMap.append(paramb.getName());
      paramMap.append(" in ");
      paramMap.append(paramClass.getName());
      paramMap.append(" already declared with different @OnLifecycleEvent value: previous value ");
      paramMap.append(locala);
      paramMap.append(", new value ");
      paramMap.append(parama);
      throw new IllegalArgumentException(paramMap.toString());
    }
    if (locala == null) {
      paramMap.put(paramb, parama);
    }
  }
  
  private Method[] c(Class paramClass)
  {
    try
    {
      paramClass = paramClass.getDeclaredMethods();
      return paramClass;
    }
    catch (NoClassDefFoundError paramClass)
    {
      throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", paramClass);
    }
  }
  
  a a(Class paramClass)
  {
    a locala = (a)this.b.get(paramClass);
    if (locala != null) {
      return locala;
    }
    return a(paramClass, null);
  }
  
  boolean b(Class paramClass)
  {
    if (this.c.containsKey(paramClass)) {
      return ((Boolean)this.c.get(paramClass)).booleanValue();
    }
    Method[] arrayOfMethod = c(paramClass);
    int i = arrayOfMethod.length;
    for (int j = 0; j < i; j++) {
      if ((o)arrayOfMethod[j].getAnnotation(o.class) != null)
      {
        a(paramClass, arrayOfMethod);
        return true;
      }
    }
    this.c.put(paramClass, Boolean.valueOf(false));
    return false;
  }
  
  static class a
  {
    final Map<d.a, List<a.b>> a;
    final Map<a.b, d.a> b;
    
    a(Map<a.b, d.a> paramMap)
    {
      this.b = paramMap;
      this.a = new HashMap();
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        d.a locala = (d.a)localEntry.getValue();
        List localList = (List)this.a.get(locala);
        paramMap = localList;
        if (localList == null)
        {
          paramMap = new ArrayList();
          this.a.put(locala, paramMap);
        }
        paramMap.add(localEntry.getKey());
      }
    }
    
    private static void a(List<a.b> paramList, f paramf, d.a parama, Object paramObject)
    {
      if (paramList != null) {
        for (int i = paramList.size() - 1; i >= 0; i--) {
          ((a.b)paramList.get(i)).a(paramf, parama, paramObject);
        }
      }
    }
    
    void a(f paramf, d.a parama, Object paramObject)
    {
      a((List)this.a.get(parama), paramf, parama, paramObject);
      a((List)this.a.get(d.a.ON_ANY), paramf, parama, paramObject);
    }
  }
  
  static class b
  {
    final int a;
    final Method b;
    
    b(int paramInt, Method paramMethod)
    {
      this.a = paramInt;
      this.b = paramMethod;
      this.b.setAccessible(true);
    }
    
    void a(f paramf, d.a parama, Object paramObject)
    {
      try
      {
        int i = this.a;
        if (i != 0)
        {
          if (i != 1)
          {
            if (i == 2) {
              this.b.invoke(paramObject, new Object[] { paramf, parama });
            }
          }
          else {
            this.b.invoke(paramObject, new Object[] { paramf });
          }
        }
        else {
          this.b.invoke(paramObject, new Object[0]);
        }
        return;
      }
      catch (IllegalAccessException paramf)
      {
        throw new RuntimeException(paramf);
      }
      catch (InvocationTargetException paramf)
      {
        throw new RuntimeException("Failed to call observer method", paramf.getCause());
      }
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (b.class == paramObject.getClass()))
      {
        paramObject = (b)paramObject;
        if ((this.a != ((b)paramObject).a) || (!this.b.getName().equals(((b)paramObject).b.getName()))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      return this.a * 31 + this.b.getName().hashCode();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/arch/lifecycle/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */