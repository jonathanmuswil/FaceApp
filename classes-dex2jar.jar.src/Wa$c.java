import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.ZipFile;

final class Wa$c
{
  static void a(ClassLoader paramClassLoader, List<? extends File> paramList)
    throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException
  {
    int i = paramList.size();
    Field localField = Wa.a(paramClassLoader, "path");
    StringBuilder localStringBuilder = new StringBuilder((String)localField.get(paramClassLoader));
    String[] arrayOfString = new String[i];
    File[] arrayOfFile = new File[i];
    ZipFile[] arrayOfZipFile = new ZipFile[i];
    DexFile[] arrayOfDexFile = new DexFile[i];
    paramList = paramList.listIterator();
    while (paramList.hasNext())
    {
      Object localObject = (File)paramList.next();
      String str = ((File)localObject).getAbsolutePath();
      localStringBuilder.append(':');
      localStringBuilder.append(str);
      i = paramList.previousIndex();
      arrayOfString[i] = str;
      arrayOfFile[i] = localObject;
      arrayOfZipFile[i] = new ZipFile((File)localObject);
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(".dex");
      arrayOfDexFile[i] = DexFile.loadDex(str, ((StringBuilder)localObject).toString(), 0);
    }
    localField.set(paramClassLoader, localStringBuilder.toString());
    Wa.a(paramClassLoader, "mPaths", arrayOfString);
    Wa.a(paramClassLoader, "mFiles", arrayOfFile);
    Wa.a(paramClassLoader, "mZips", arrayOfZipFile);
    Wa.a(paramClassLoader, "mDexs", arrayOfDexFile);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Wa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */