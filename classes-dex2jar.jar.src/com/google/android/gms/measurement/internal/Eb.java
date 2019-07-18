package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.t;

public final class eb
{
  /* Error */
  public static Object a(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 12	java/io/ByteArrayOutputStream
    //   9: astore_1
    //   10: aload_1
    //   11: invokespecial 16	java/io/ByteArrayOutputStream:<init>	()V
    //   14: new 18	java/io/ObjectOutputStream
    //   17: astore_2
    //   18: aload_2
    //   19: aload_1
    //   20: invokespecial 21	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   23: aload_2
    //   24: aload_0
    //   25: invokevirtual 25	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   28: aload_2
    //   29: invokevirtual 28	java/io/ObjectOutputStream:flush	()V
    //   32: new 30	java/io/ObjectInputStream
    //   35: astore_3
    //   36: new 32	java/io/ByteArrayInputStream
    //   39: astore_0
    //   40: aload_0
    //   41: aload_1
    //   42: invokevirtual 36	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   45: invokespecial 39	java/io/ByteArrayInputStream:<init>	([B)V
    //   48: aload_3
    //   49: aload_0
    //   50: invokespecial 42	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   53: aload_3
    //   54: invokevirtual 46	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   57: astore_0
    //   58: aload_2
    //   59: invokevirtual 49	java/io/ObjectOutputStream:close	()V
    //   62: aload_3
    //   63: invokevirtual 50	java/io/ObjectInputStream:close	()V
    //   66: aload_0
    //   67: areturn
    //   68: astore_0
    //   69: goto +14 -> 83
    //   72: astore_0
    //   73: aconst_null
    //   74: astore_3
    //   75: goto +8 -> 83
    //   78: astore_0
    //   79: aconst_null
    //   80: astore_3
    //   81: aload_3
    //   82: astore_2
    //   83: aload_2
    //   84: ifnull +7 -> 91
    //   87: aload_2
    //   88: invokevirtual 49	java/io/ObjectOutputStream:close	()V
    //   91: aload_3
    //   92: ifnull +7 -> 99
    //   95: aload_3
    //   96: invokevirtual 50	java/io/ObjectInputStream:close	()V
    //   99: aload_0
    //   100: athrow
    //   101: astore_0
    //   102: aconst_null
    //   103: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	paramObject	Object
    //   9	33	1	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   17	71	2	localObject	Object
    //   35	61	3	localObjectInputStream	java.io.ObjectInputStream
    // Exception table:
    //   from	to	target	type
    //   53	58	68	finally
    //   23	53	72	finally
    //   6	23	78	finally
    //   58	66	101	java/io/IOException
    //   58	66	101	java/lang/ClassNotFoundException
    //   87	91	101	java/io/IOException
    //   87	91	101	java/lang/ClassNotFoundException
    //   95	99	101	java/io/IOException
    //   95	99	101	java/lang/ClassNotFoundException
    //   99	101	101	java/io/IOException
    //   99	101	101	java/lang/ClassNotFoundException
  }
  
  public static String a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    t.a(paramArrayOfString1);
    t.a(paramArrayOfString2);
    int i = Math.min(paramArrayOfString1.length, paramArrayOfString2.length);
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString1[j];
      boolean bool;
      if ((paramString == null) && (str == null)) {
        bool = true;
      } else if (paramString == null) {
        bool = false;
      } else {
        bool = paramString.equals(str);
      }
      if (bool) {
        return paramArrayOfString2[j];
      }
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */