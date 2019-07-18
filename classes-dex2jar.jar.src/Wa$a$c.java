import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Wa$a$c
  implements Wa.a.a
{
  private final Constructor<?> a;
  
  Wa$a$c(Class<?> paramClass)
    throws SecurityException, NoSuchMethodException
  {
    this.a = paramClass.getConstructor(new Class[] { File.class, File.class, DexFile.class });
    this.a.setAccessible(true);
  }
  
  public Object a(File paramFile, DexFile paramDexFile)
    throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException
  {
    return this.a.newInstance(new Object[] { paramFile, paramFile, paramDexFile });
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Wa$a$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */