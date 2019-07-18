package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class o
{
  private static String a;
  private static int b;
  
  private static BufferedReader a(String paramString)
    throws IOException
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskReads();
    try
    {
      FileReader localFileReader = new java/io/FileReader;
      localFileReader.<init>(paramString);
      paramString = new BufferedReader(localFileReader);
      return paramString;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
  }
  
  public static String a()
  {
    if (a == null)
    {
      if (b == 0) {
        b = Process.myPid();
      }
      a = a(b);
    }
    return a;
  }
  
  /* Error */
  private static String a(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: iload_0
    //   5: ifgt +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: new 50	java/lang/StringBuilder
    //   13: astore_3
    //   14: aload_3
    //   15: bipush 25
    //   17: invokespecial 53	java/lang/StringBuilder:<init>	(I)V
    //   20: aload_3
    //   21: ldc 55
    //   23: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: pop
    //   27: aload_3
    //   28: iload_0
    //   29: invokevirtual 62	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   32: pop
    //   33: aload_3
    //   34: ldc 64
    //   36: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload_3
    //   41: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: invokestatic 69	com/google/android/gms/common/util/o:a	(Ljava/lang/String;)Ljava/io/BufferedReader;
    //   47: astore_3
    //   48: aload_3
    //   49: invokevirtual 72	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   52: invokevirtual 77	java/lang/String:trim	()Ljava/lang/String;
    //   55: astore_2
    //   56: aload_3
    //   57: invokestatic 82	com/google/android/gms/common/util/k:a	(Ljava/io/Closeable;)V
    //   60: aload_2
    //   61: astore_3
    //   62: goto +25 -> 87
    //   65: astore_1
    //   66: goto +6 -> 72
    //   69: astore_1
    //   70: aload_2
    //   71: astore_3
    //   72: aload_3
    //   73: invokestatic 82	com/google/android/gms/common/util/k:a	(Ljava/io/Closeable;)V
    //   76: aload_1
    //   77: athrow
    //   78: astore_3
    //   79: aconst_null
    //   80: astore_3
    //   81: aload_3
    //   82: invokestatic 82	com/google/android/gms/common/util/k:a	(Ljava/io/Closeable;)V
    //   85: aload_1
    //   86: astore_3
    //   87: aload_3
    //   88: areturn
    //   89: astore_2
    //   90: goto -9 -> 81
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	paramInt	int
    //   1	1	1	localObject1	Object
    //   65	1	1	localObject2	Object
    //   69	17	1	localObject3	Object
    //   3	68	2	str	String
    //   89	1	2	localIOException1	IOException
    //   13	60	3	localObject4	Object
    //   78	1	3	localIOException2	IOException
    //   80	8	3	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   48	56	65	finally
    //   10	48	69	finally
    //   10	48	78	java/io/IOException
    //   48	56	89	java/io/IOException
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/util/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */