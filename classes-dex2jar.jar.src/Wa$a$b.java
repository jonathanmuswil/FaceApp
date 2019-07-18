import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.ZipFile;

class Wa$a$b
  implements Wa.a.a
{
  private final Constructor<?> a;
  
  Wa$a$b(Class<?> paramClass)
    throws SecurityException, NoSuchMethodException
  {
    this.a = paramClass.getConstructor(new Class[] { File.class, ZipFile.class, DexFile.class });
    this.a.setAccessible(true);
  }
  
  public Object a(File paramFile, DexFile paramDexFile)
    throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException
  {
    return this.a.newInstance(new Object[] { paramFile, new ZipFile(paramFile), paramDexFile });
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Wa$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */