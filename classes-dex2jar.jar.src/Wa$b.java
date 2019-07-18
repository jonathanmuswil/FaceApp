import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class Wa$b
{
  static void a(ClassLoader paramClassLoader, List<? extends File> paramList, File paramFile)
    throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException
  {
    Object localObject = Wa.a(paramClassLoader, "pathList").get(paramClassLoader);
    ArrayList localArrayList = new ArrayList();
    Wa.a(localObject, "dexElements", a(localObject, new ArrayList(paramList), paramFile, localArrayList));
    if (localArrayList.size() > 0)
    {
      paramClassLoader = localArrayList.iterator();
      while (paramClassLoader.hasNext()) {
        Log.w("MultiDex", "Exception in makeDexElement", (IOException)paramClassLoader.next());
      }
      paramList = Wa.a(localObject, "dexElementsSuppressedExceptions");
      paramFile = (IOException[])paramList.get(localObject);
      if (paramFile == null)
      {
        paramClassLoader = (IOException[])localArrayList.toArray(new IOException[localArrayList.size()]);
      }
      else
      {
        paramClassLoader = new IOException[localArrayList.size() + paramFile.length];
        localArrayList.toArray(paramClassLoader);
        System.arraycopy(paramFile, 0, paramClassLoader, localArrayList.size(), paramFile.length);
      }
      paramList.set(localObject, paramClassLoader);
      paramClassLoader = new IOException("I/O exception during makeDexElement");
      paramClassLoader.initCause((Throwable)localArrayList.get(0));
      throw paramClassLoader;
    }
  }
  
  private static Object[] a(Object paramObject, ArrayList<File> paramArrayList, File paramFile, ArrayList<IOException> paramArrayList1)
    throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
  {
    return (Object[])Wa.a(paramObject, "makeDexElements", new Class[] { ArrayList.class, File.class, ArrayList.class }).invoke(paramObject, new Object[] { paramArrayList, paramFile, paramArrayList1 });
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Wa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */