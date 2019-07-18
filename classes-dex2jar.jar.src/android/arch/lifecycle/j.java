package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class j
{
  private static Map<Class, Integer> a = new HashMap();
  private static Map<Class, List<Constructor<? extends c>>> b = new HashMap();
  
  static GenericLifecycleObserver a(Object paramObject)
  {
    if ((paramObject instanceof FullLifecycleObserver)) {
      return new FullLifecycleObserverAdapter((FullLifecycleObserver)paramObject);
    }
    if ((paramObject instanceof GenericLifecycleObserver)) {
      return (GenericLifecycleObserver)paramObject;
    }
    Object localObject = paramObject.getClass();
    if (b((Class)localObject) == 2)
    {
      localObject = (List)b.get(localObject);
      int i = ((List)localObject).size();
      int j = 0;
      if (i == 1) {
        return new SingleGeneratedAdapterObserver(a((Constructor)((List)localObject).get(0), paramObject));
      }
      c[] arrayOfc = new c[((List)localObject).size()];
      while (j < ((List)localObject).size())
      {
        arrayOfc[j] = a((Constructor)((List)localObject).get(j), paramObject);
        j++;
      }
      return new CompositeGeneratedAdaptersObserver(arrayOfc);
    }
    return new ReflectiveGenericLifecycleObserver(paramObject);
  }
  
  private static c a(Constructor<? extends c> paramConstructor, Object paramObject)
  {
    try
    {
      paramConstructor = (c)paramConstructor.newInstance(new Object[] { paramObject });
      return paramConstructor;
    }
    catch (InvocationTargetException paramConstructor)
    {
      throw new RuntimeException(paramConstructor);
    }
    catch (InstantiationException paramConstructor)
    {
      throw new RuntimeException(paramConstructor);
    }
    catch (IllegalAccessException paramConstructor)
    {
      throw new RuntimeException(paramConstructor);
    }
  }
  
  public static String a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString.replace(".", "_"));
    localStringBuilder.append("_LifecycleAdapter");
    return localStringBuilder.toString();
  }
  
  private static Constructor<? extends c> a(Class<?> paramClass)
  {
    try
    {
      Object localObject = paramClass.getPackage();
      String str = paramClass.getCanonicalName();
      if (localObject != null) {
        localObject = ((Package)localObject).getName();
      } else {
        localObject = "";
      }
      if (!((String)localObject).isEmpty()) {
        str = str.substring(((String)localObject).length() + 1);
      }
      str = a(str);
      if (((String)localObject).isEmpty())
      {
        localObject = str;
      }
      else
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(".");
        localStringBuilder.append(str);
        localObject = localStringBuilder.toString();
      }
      paramClass = Class.forName((String)localObject).getDeclaredConstructor(new Class[] { paramClass });
      if (!paramClass.isAccessible()) {
        paramClass.setAccessible(true);
      }
      return paramClass;
    }
    catch (NoSuchMethodException paramClass)
    {
      throw new RuntimeException(paramClass);
    }
    catch (ClassNotFoundException paramClass) {}
    return null;
  }
  
  private static int b(Class<?> paramClass)
  {
    if (a.containsKey(paramClass)) {
      return ((Integer)a.get(paramClass)).intValue();
    }
    int i = d(paramClass);
    a.put(paramClass, Integer.valueOf(i));
    return i;
  }
  
  private static boolean c(Class<?> paramClass)
  {
    boolean bool;
    if ((paramClass != null) && (e.class.isAssignableFrom(paramClass))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static int d(Class<?> paramClass)
  {
    if (paramClass.getCanonicalName() == null) {
      return 1;
    }
    Object localObject1 = a(paramClass);
    if (localObject1 != null)
    {
      b.put(paramClass, Collections.singletonList(localObject1));
      return 2;
    }
    if (a.a.b(paramClass)) {
      return 1;
    }
    localObject1 = paramClass.getSuperclass();
    Object localObject2 = null;
    if (c((Class)localObject1))
    {
      if (b((Class)localObject1) == 1) {
        return 1;
      }
      localObject2 = new ArrayList((Collection)b.get(localObject1));
    }
    Class[] arrayOfClass = paramClass.getInterfaces();
    int i = arrayOfClass.length;
    int j = 0;
    while (j < i)
    {
      Class localClass = arrayOfClass[j];
      if (!c(localClass))
      {
        localObject1 = localObject2;
      }
      else
      {
        if (b(localClass) == 1) {
          return 1;
        }
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = new ArrayList();
        }
        ((List)localObject1).addAll((Collection)b.get(localClass));
      }
      j++;
      localObject2 = localObject1;
    }
    if (localObject2 != null)
    {
      b.put(paramClass, localObject2);
      return 2;
    }
    return 1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/arch/lifecycle/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */