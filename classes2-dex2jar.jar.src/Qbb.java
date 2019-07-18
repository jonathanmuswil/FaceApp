import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

class qbb
{
  private static final qbb a = ;
  
  static qbb d()
  {
    return a;
  }
  
  private static qbb e()
  {
    for (;;)
    {
      try
      {
        Class.forName("android.os.Build");
        if (Build.VERSION.SDK_INT != 0)
        {
          localObject = new qbb.a();
          return (qbb)localObject;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException2)
      {
        Object localObject;
        continue;
      }
      try
      {
        Class.forName("java.util.Optional");
        localObject = new qbb.b();
        return (qbb)localObject;
      }
      catch (ClassNotFoundException localClassNotFoundException1)
      {
        return new qbb();
      }
    }
  }
  
  Object a(Method paramMethod, Class<?> paramClass, Object paramObject, Object... paramVarArgs)
    throws Throwable
  {
    throw new UnsupportedOperationException();
  }
  
  List<? extends Sab.a> a(Executor paramExecutor)
  {
    if (paramExecutor != null) {
      return Collections.singletonList(new fbb(paramExecutor));
    }
    return Collections.singletonList(abb.a);
  }
  
  Executor a()
  {
    return null;
  }
  
  boolean a(Method paramMethod)
  {
    return false;
  }
  
  List<? extends Zab.a> b()
  {
    return Collections.emptyList();
  }
  
  int c()
  {
    return 0;
  }
  
  static class a
    extends qbb
  {
    List<? extends Sab.a> a(Executor paramExecutor)
    {
      if (paramExecutor != null)
      {
        paramExecutor = new fbb(paramExecutor);
        if (Build.VERSION.SDK_INT >= 24) {
          paramExecutor = Arrays.asList(new Sab.a[] { Wab.a, paramExecutor });
        } else {
          paramExecutor = Collections.singletonList(paramExecutor);
        }
        return paramExecutor;
      }
      throw new AssertionError();
    }
    
    public Executor a()
    {
      return new qbb.a.a();
    }
    
    boolean a(Method paramMethod)
    {
      if (Build.VERSION.SDK_INT < 24) {
        return false;
      }
      return paramMethod.isDefault();
    }
    
    List<? extends Zab.a> b()
    {
      List localList;
      if (Build.VERSION.SDK_INT >= 24) {
        localList = Collections.singletonList(mbb.a);
      } else {
        localList = Collections.emptyList();
      }
      return localList;
    }
    
    int c()
    {
      int i;
      if (Build.VERSION.SDK_INT >= 24) {
        i = 1;
      } else {
        i = 0;
      }
      return i;
    }
    
    static class a
      implements Executor
    {
      private final Handler a = new Handler(Looper.getMainLooper());
      
      public void execute(Runnable paramRunnable)
      {
        this.a.post(paramRunnable);
      }
    }
  }
  
  static class b
    extends qbb
  {
    Object a(Method paramMethod, Class<?> paramClass, Object paramObject, Object... paramVarArgs)
      throws Throwable
    {
      Constructor localConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[] { Class.class, Integer.TYPE });
      localConstructor.setAccessible(true);
      return ((MethodHandles.Lookup)localConstructor.newInstance(new Object[] { paramClass, Integer.valueOf(-1) })).unreflectSpecial(paramMethod, paramClass).bindTo(paramObject).invokeWithArguments(paramVarArgs);
    }
    
    List<? extends Sab.a> a(Executor paramExecutor)
    {
      ArrayList localArrayList = new ArrayList(2);
      localArrayList.add(Wab.a);
      if (paramExecutor != null) {
        localArrayList.add(new fbb(paramExecutor));
      } else {
        localArrayList.add(abb.a);
      }
      return Collections.unmodifiableList(localArrayList);
    }
    
    boolean a(Method paramMethod)
    {
      return paramMethod.isDefault();
    }
    
    List<? extends Zab.a> b()
    {
      return Collections.singletonList(mbb.a);
    }
    
    int c()
    {
      return 1;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */