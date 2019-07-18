import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

final class gm
{
  private static File a(File paramFile, String paramString)
  {
    for (paramFile : paramFile.listFiles()) {
      if (paramFile.getName().endsWith(paramString)) {
        return paramFile;
      }
    }
    return null;
  }
  
  private static byte[] a(Context paramContext, String paramString)
    throws IOException
  {
    return new Mk(paramContext, new um()).a(paramString);
  }
  
  static byte[] a(File paramFile)
  {
    paramFile = a(paramFile, ".device_info");
    if (paramFile == null) {
      paramFile = null;
    } else {
      paramFile = c(paramFile);
    }
    return paramFile;
  }
  
  static byte[] a(File paramFile, Context paramContext)
    throws IOException
  {
    File localFile = a(paramFile, ".maps");
    if (localFile != null) {
      return c(localFile, paramContext);
    }
    paramFile = a(paramFile, ".binary_libs");
    if (paramFile != null) {
      return b(paramFile, paramContext);
    }
    return null;
  }
  
  private static byte[] a(InputStream paramInputStream)
    throws IOException
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  static byte[] b(File paramFile)
  {
    paramFile = a(paramFile, ".dmp");
    if (paramFile == null) {
      paramFile = new byte[0];
    } else {
      paramFile = d(paramFile);
    }
    return paramFile;
  }
  
  private static byte[] b(File paramFile, Context paramContext)
    throws IOException
  {
    paramFile = c(paramFile);
    if ((paramFile != null) && (paramFile.length != 0)) {
      return a(paramContext, new String(paramFile));
    }
    return null;
  }
  
  /* Error */
  static byte[] c(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 91	java/io/FileInputStream
    //   5: astore_2
    //   6: aload_2
    //   7: aload_0
    //   8: invokespecial 94	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   11: aload_2
    //   12: invokestatic 96	gm:a	(Ljava/io/InputStream;)[B
    //   15: astore_0
    //   16: aload_2
    //   17: invokestatic 101	oba:a	(Ljava/io/Closeable;)V
    //   20: aload_0
    //   21: areturn
    //   22: astore_0
    //   23: goto +6 -> 29
    //   26: astore_0
    //   27: aload_1
    //   28: astore_2
    //   29: aload_2
    //   30: invokestatic 101	oba:a	(Ljava/io/Closeable;)V
    //   33: aload_0
    //   34: athrow
    //   35: astore_0
    //   36: aconst_null
    //   37: astore_2
    //   38: aload_2
    //   39: invokestatic 101	oba:a	(Ljava/io/Closeable;)V
    //   42: aconst_null
    //   43: areturn
    //   44: astore_0
    //   45: aconst_null
    //   46: astore_2
    //   47: aload_2
    //   48: invokestatic 101	oba:a	(Ljava/io/Closeable;)V
    //   51: aconst_null
    //   52: areturn
    //   53: astore_0
    //   54: goto -7 -> 47
    //   57: astore_0
    //   58: goto -20 -> 38
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	paramFile	File
    //   1	27	1	localObject1	Object
    //   5	43	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   11	16	22	finally
    //   2	11	26	finally
    //   2	11	35	java/io/IOException
    //   2	11	44	java/io/FileNotFoundException
    //   11	16	53	java/io/FileNotFoundException
    //   11	16	57	java/io/IOException
  }
  
  /* Error */
  private static byte[] c(File paramFile, Context paramContext)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 105	java/io/File:exists	()Z
    //   4: ifne +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 107	java/io/BufferedReader
    //   12: astore_2
    //   13: new 109	java/io/FileReader
    //   16: astore_3
    //   17: aload_3
    //   18: aload_0
    //   19: invokespecial 110	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   22: aload_2
    //   23: aload_3
    //   24: invokespecial 113	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   27: new 28	Mk
    //   30: astore_0
    //   31: new 30	um
    //   34: astore_3
    //   35: aload_3
    //   36: invokespecial 34	um:<init>	()V
    //   39: aload_0
    //   40: aload_1
    //   41: aload_3
    //   42: invokespecial 37	Mk:<init>	(Landroid/content/Context;LMk$a;)V
    //   45: aload_0
    //   46: aload_2
    //   47: invokevirtual 116	Mk:a	(Ljava/io/BufferedReader;)[B
    //   50: astore_0
    //   51: aload_2
    //   52: invokestatic 101	oba:a	(Ljava/io/Closeable;)V
    //   55: aload_0
    //   56: areturn
    //   57: astore_0
    //   58: aload_2
    //   59: astore_1
    //   60: goto +6 -> 66
    //   63: astore_0
    //   64: aconst_null
    //   65: astore_1
    //   66: aload_1
    //   67: invokestatic 101	oba:a	(Ljava/io/Closeable;)V
    //   70: aload_0
    //   71: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	paramFile	File
    //   0	72	1	paramContext	Context
    //   12	47	2	localBufferedReader	java.io.BufferedReader
    //   16	26	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   27	51	57	finally
    //   9	27	63	finally
  }
  
  private static byte[] d(File paramFile)
  {
    return c(paramFile);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */