import java.io.File;
import java.io.IOException;

class um
  implements Mk.a
{
  /* Error */
  private static String a(String paramString)
    throws IOException
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 17	java/io/BufferedInputStream
    //   5: astore_2
    //   6: new 19	java/io/FileInputStream
    //   9: astore_3
    //   10: aload_3
    //   11: aload_0
    //   12: invokespecial 22	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   15: aload_2
    //   16: aload_3
    //   17: invokespecial 25	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   20: aload_2
    //   21: invokestatic 30	oba:a	(Ljava/io/InputStream;)Ljava/lang/String;
    //   24: astore_0
    //   25: aload_2
    //   26: invokestatic 33	oba:a	(Ljava/io/Closeable;)V
    //   29: aload_0
    //   30: areturn
    //   31: astore_0
    //   32: goto +6 -> 38
    //   35: astore_0
    //   36: aload_1
    //   37: astore_2
    //   38: aload_2
    //   39: invokestatic 33	oba:a	(Ljava/io/Closeable;)V
    //   42: aload_0
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	paramString	String
    //   1	36	1	localObject1	Object
    //   5	34	2	localObject2	Object
    //   9	8	3	localFileInputStream	java.io.FileInputStream
    // Exception table:
    //   from	to	target	type
    //   20	25	31	finally
    //   2	20	35	finally
  }
  
  public String a(File paramFile)
    throws IOException
  {
    return a(paramFile.getPath());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/um.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */