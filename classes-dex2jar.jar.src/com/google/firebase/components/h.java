package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class h<T>
{
  private final T a;
  private final b<T> b;
  
  h(T paramT, b<T> paramb)
  {
    this.a = paramT;
    this.b = paramb;
  }
  
  public static h<Context> a(Context paramContext)
  {
    return new h(paramContext, new a(null));
  }
  
  private static List<j> a(List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      try
      {
        Class localClass = Class.forName(str);
        if (!j.class.isAssignableFrom(localClass)) {
          Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", new Object[] { str, "com.google.firebase.components.ComponentRegistrar" }));
        } else {
          localArrayList.add((j)localClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        Log.w("ComponentDiscovery", String.format("Could not instantiate %s", new Object[] { str }), localInvocationTargetException);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Log.w("ComponentDiscovery", String.format("Could not instantiate %s", new Object[] { str }), localNoSuchMethodException);
      }
      catch (InstantiationException localInstantiationException)
      {
        Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", new Object[] { str }), localInstantiationException);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", new Object[] { str }), localIllegalAccessException);
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[] { str }), localClassNotFoundException);
      }
    }
    return localArrayList;
  }
  
  public List<j> a()
  {
    return a(this.b.a(this.a));
  }
  
  private static class a
    implements h.b<Context>
  {
    private static Bundle b(Context paramContext)
    {
      try
      {
        PackageManager localPackageManager = paramContext.getPackageManager();
        if (localPackageManager == null)
        {
          Log.w("ComponentDiscovery", "Context has no PackageManager.");
          return null;
        }
        ComponentName localComponentName = new android/content/ComponentName;
        localComponentName.<init>(paramContext, ComponentDiscoveryService.class);
        paramContext = localPackageManager.getServiceInfo(localComponentName, 128);
        if (paramContext == null)
        {
          Log.w("ComponentDiscovery", "ComponentDiscoveryService has no service info.");
          return null;
        }
        paramContext = paramContext.metaData;
        return paramContext;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.w("ComponentDiscovery", "Application info not found.");
      }
      return null;
    }
    
    public List<String> a(Context paramContext)
    {
      Bundle localBundle = b(paramContext);
      if (localBundle == null)
      {
        Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
        return Collections.emptyList();
      }
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        paramContext = (String)localIterator.next();
        if (("com.google.firebase.components.ComponentRegistrar".equals(localBundle.get(paramContext))) && (paramContext.startsWith("com.google.firebase.components:"))) {
          localArrayList.add(paramContext.substring(31));
        }
      }
      return localArrayList;
    }
  }
  
  static abstract interface b<T>
  {
    public abstract List<String> a(T paramT);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/components/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */