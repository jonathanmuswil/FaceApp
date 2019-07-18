import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class cBa
{
  private static String a = "";
  private static Bitmap b;
  private static final HashMap<String, Object> c = new HashMap();
  public static final cBa d = new cBa();
  
  private final Bitmap a(Bitmap paramBitmap)
  {
    return paramBitmap.copy(Bitmap.Config.ARGB_8888, true);
  }
  
  private final Object a(String paramString)
  {
    HashMap localHashMap = c;
    Object localObject1 = localHashMap.get(paramString);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new Object();
      localHashMap.put(paramString, localObject2);
    }
    return localObject2;
  }
  
  public final Bitmap a(File paramFile)
  {
    oXa.b(paramFile, "file");
    Object localObject1 = paramFile.getAbsolutePath();
    oXa.a(localObject1, "path");
    synchronized (a((String)localObject1))
    {
      Object localObject3 = b;
      if (localObject3 != null)
      {
        if (!oXa.a(a, localObject1)) {
          localObject3 = null;
        }
        if (localObject3 != null)
        {
          localObject3 = d.a((Bitmap)localObject3);
          if (localObject3 != null)
          {
            paramFile = (File)localObject3;
            break label152;
          }
        }
      }
      localObject3 = d;
      Object localObject4 = b;
      if (localObject4 != null) {
        ((Bitmap)localObject4).recycle();
      }
      a = (String)localObject1;
      localObject1 = WOa.e;
      localObject4 = new WOa$b;
      ((WOa.b)localObject4).<init>(paramFile);
      b = WOa.a((WOa)localObject1, (WOa.c)localObject4, 0, 0, true, 6, null);
      paramFile = b;
      if (paramFile != null)
      {
        paramFile = ((cBa)localObject3).a(paramFile);
        oXa.a(paramFile, "run {\n                //…mp!!.copy()\n            }");
        label152:
        return paramFile;
      }
      oXa.a();
      throw null;
    }
  }
  
  public final File a(Bitmap paramBitmap, File paramFile)
  {
    oXa.b(paramBitmap, "bitmap");
    oXa.b(paramFile, "file");
    paramBitmap = a(paramBitmap);
    nBa.b().a(new bBa(paramBitmap, paramFile));
    return paramFile;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/cBa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */