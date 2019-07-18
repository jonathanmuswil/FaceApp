import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

class qbb$b
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qbb$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */