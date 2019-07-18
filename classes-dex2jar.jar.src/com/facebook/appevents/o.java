package com.facebook.appevents;

import Wn;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class o
{
  private static final String a = "com.facebook.appevents.o";
  
  /* Error */
  public static v a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 25	Wn:b	()V
    //   6: invokestatic 31	com/facebook/FacebookSdk:d	()Landroid/content/Context;
    //   9: astore_0
    //   10: aconst_null
    //   11: astore_1
    //   12: aconst_null
    //   13: astore_2
    //   14: aload_0
    //   15: ldc 33
    //   17: invokevirtual 39	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   20: astore_3
    //   21: new 6	com/facebook/appevents/o$a
    //   24: astore 4
    //   26: new 41	java/io/BufferedInputStream
    //   29: astore 5
    //   31: aload 5
    //   33: aload_3
    //   34: invokespecial 44	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   37: aload 4
    //   39: aload 5
    //   41: invokespecial 45	com/facebook/appevents/o$a:<init>	(Ljava/io/InputStream;)V
    //   44: aload 4
    //   46: astore_2
    //   47: aload 4
    //   49: invokevirtual 51	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   52: checkcast 53	com/facebook/appevents/v
    //   55: astore 5
    //   57: aload 4
    //   59: invokestatic 58	com/facebook/internal/S:a	(Ljava/io/Closeable;)V
    //   62: aload_0
    //   63: ldc 33
    //   65: invokevirtual 62	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   68: invokevirtual 68	java/io/File:delete	()Z
    //   71: pop
    //   72: goto +16 -> 88
    //   75: astore 4
    //   77: getstatic 70	com/facebook/appevents/o:a	Ljava/lang/String;
    //   80: ldc 72
    //   82: aload 4
    //   84: invokestatic 78	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   87: pop
    //   88: aload 5
    //   90: astore 4
    //   92: goto +142 -> 234
    //   95: astore 5
    //   97: goto +13 -> 110
    //   100: astore 4
    //   102: goto +66 -> 168
    //   105: astore 5
    //   107: aconst_null
    //   108: astore 4
    //   110: aload 4
    //   112: astore_2
    //   113: getstatic 70	com/facebook/appevents/o:a	Ljava/lang/String;
    //   116: ldc 80
    //   118: aload 5
    //   120: invokestatic 78	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   123: pop
    //   124: aload 4
    //   126: invokestatic 58	com/facebook/internal/S:a	(Ljava/io/Closeable;)V
    //   129: aload_0
    //   130: ldc 33
    //   132: invokevirtual 62	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   135: invokevirtual 68	java/io/File:delete	()Z
    //   138: pop
    //   139: aload_1
    //   140: astore 4
    //   142: goto +92 -> 234
    //   145: astore 4
    //   147: getstatic 70	com/facebook/appevents/o:a	Ljava/lang/String;
    //   150: astore_2
    //   151: aload_2
    //   152: ldc 72
    //   154: aload 4
    //   156: invokestatic 78	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   159: pop
    //   160: aload_1
    //   161: astore 4
    //   163: goto +71 -> 234
    //   166: astore 4
    //   168: aload_2
    //   169: invokestatic 58	com/facebook/internal/S:a	(Ljava/io/Closeable;)V
    //   172: aload_0
    //   173: ldc 33
    //   175: invokevirtual 62	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   178: invokevirtual 68	java/io/File:delete	()Z
    //   181: pop
    //   182: goto +14 -> 196
    //   185: astore_2
    //   186: getstatic 70	com/facebook/appevents/o:a	Ljava/lang/String;
    //   189: ldc 72
    //   191: aload_2
    //   192: invokestatic 78	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   195: pop
    //   196: aload 4
    //   198: athrow
    //   199: astore 4
    //   201: aconst_null
    //   202: astore 4
    //   204: aload 4
    //   206: invokestatic 58	com/facebook/internal/S:a	(Ljava/io/Closeable;)V
    //   209: aload_0
    //   210: ldc 33
    //   212: invokevirtual 62	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   215: invokevirtual 68	java/io/File:delete	()Z
    //   218: pop
    //   219: aload_1
    //   220: astore 4
    //   222: goto +12 -> 234
    //   225: astore 4
    //   227: getstatic 70	com/facebook/appevents/o:a	Ljava/lang/String;
    //   230: astore_2
    //   231: goto -80 -> 151
    //   234: aload 4
    //   236: astore_2
    //   237: aload 4
    //   239: ifnonnull +11 -> 250
    //   242: new 53	com/facebook/appevents/v
    //   245: dup
    //   246: invokespecial 81	com/facebook/appevents/v:<init>	()V
    //   249: astore_2
    //   250: ldc 2
    //   252: monitorexit
    //   253: aload_2
    //   254: areturn
    //   255: astore 4
    //   257: ldc 2
    //   259: monitorexit
    //   260: aload 4
    //   262: athrow
    //   263: astore_2
    //   264: goto -60 -> 204
    // Local variable table:
    //   start	length	slot	name	signature
    //   9	201	0	localContext	android.content.Context
    //   11	209	1	localObject1	Object
    //   13	156	2	localObject2	Object
    //   185	7	2	localException1	Exception
    //   230	24	2	localObject3	Object
    //   263	1	2	localFileNotFoundException1	java.io.FileNotFoundException
    //   20	14	3	localFileInputStream	java.io.FileInputStream
    //   24	34	4	locala	a
    //   75	8	4	localException2	Exception
    //   90	1	4	localObject4	Object
    //   100	1	4	localObject5	Object
    //   108	33	4	localObject6	Object
    //   145	10	4	localException3	Exception
    //   161	1	4	localObject7	Object
    //   166	31	4	localObject8	Object
    //   199	1	4	localFileNotFoundException2	java.io.FileNotFoundException
    //   202	19	4	localObject9	Object
    //   225	13	4	localException4	Exception
    //   255	6	4	localObject10	Object
    //   29	60	5	localObject11	Object
    //   95	1	5	localException5	Exception
    //   105	14	5	localException6	Exception
    // Exception table:
    //   from	to	target	type
    //   62	72	75	java/lang/Exception
    //   47	57	95	java/lang/Exception
    //   14	44	100	finally
    //   14	44	105	java/lang/Exception
    //   129	139	145	java/lang/Exception
    //   47	57	166	finally
    //   113	124	166	finally
    //   172	182	185	java/lang/Exception
    //   14	44	199	java/io/FileNotFoundException
    //   209	219	225	java/lang/Exception
    //   3	10	255	finally
    //   57	62	255	finally
    //   62	72	255	finally
    //   77	88	255	finally
    //   124	129	255	finally
    //   129	139	255	finally
    //   147	151	255	finally
    //   151	160	255	finally
    //   168	172	255	finally
    //   172	182	255	finally
    //   186	196	255	finally
    //   196	199	255	finally
    //   204	209	255	finally
    //   209	219	255	finally
    //   227	231	255	finally
    //   242	250	255	finally
    //   47	57	263	java/io/FileNotFoundException
  }
  
  public static void a(b paramb, w paramw)
  {
    try
    {
      Wn.b();
      v localv = a();
      if (localv.a(paramb)) {
        localv.b(paramb).addAll(paramw.b());
      } else {
        localv.a(paramb, paramw.b());
      }
      a(localv);
      return;
    }
    finally {}
  }
  
  public static void a(g paramg)
  {
    try
    {
      Wn.b();
      v localv = a();
      Iterator localIterator = paramg.b().iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        localv.a(localb, paramg.a(localb).b());
      }
      a(localv);
      return;
    }
    finally {}
  }
  
  /* Error */
  private static void a(v paramv)
  {
    // Byte code:
    //   0: invokestatic 31	com/facebook/FacebookSdk:d	()Landroid/content/Context;
    //   3: astore_1
    //   4: aconst_null
    //   5: astore_2
    //   6: aconst_null
    //   7: astore_3
    //   8: aload_3
    //   9: astore 4
    //   11: new 134	java/io/ObjectOutputStream
    //   14: astore 5
    //   16: aload_3
    //   17: astore 4
    //   19: new 136	java/io/BufferedOutputStream
    //   22: astore 6
    //   24: aload_3
    //   25: astore 4
    //   27: aload 6
    //   29: aload_1
    //   30: ldc 33
    //   32: iconst_0
    //   33: invokevirtual 140	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   36: invokespecial 143	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   39: aload_3
    //   40: astore 4
    //   42: aload 5
    //   44: aload 6
    //   46: invokespecial 144	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   49: aload 5
    //   51: aload_0
    //   52: invokevirtual 148	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   55: aload 5
    //   57: invokestatic 58	com/facebook/internal/S:a	(Ljava/io/Closeable;)V
    //   60: goto +62 -> 122
    //   63: astore_0
    //   64: aload 5
    //   66: astore 4
    //   68: goto +55 -> 123
    //   71: astore 4
    //   73: aload 5
    //   75: astore_0
    //   76: aload 4
    //   78: astore 5
    //   80: goto +11 -> 91
    //   83: astore_0
    //   84: goto +39 -> 123
    //   87: astore 5
    //   89: aload_2
    //   90: astore_0
    //   91: aload_0
    //   92: astore 4
    //   94: getstatic 70	com/facebook/appevents/o:a	Ljava/lang/String;
    //   97: ldc -106
    //   99: aload 5
    //   101: invokestatic 78	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   104: pop
    //   105: aload_0
    //   106: astore 4
    //   108: aload_1
    //   109: ldc 33
    //   111: invokevirtual 62	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   114: invokevirtual 68	java/io/File:delete	()Z
    //   117: pop
    //   118: aload_0
    //   119: invokestatic 58	com/facebook/internal/S:a	(Ljava/io/Closeable;)V
    //   122: return
    //   123: aload 4
    //   125: invokestatic 58	com/facebook/internal/S:a	(Ljava/io/Closeable;)V
    //   128: aload_0
    //   129: athrow
    //   130: astore 4
    //   132: goto -14 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	paramv	v
    //   3	106	1	localContext	android.content.Context
    //   5	85	2	localObject1	Object
    //   7	33	3	localObject2	Object
    //   9	58	4	localObject3	Object
    //   71	6	4	localException1	Exception
    //   92	32	4	localv	v
    //   130	1	4	localException2	Exception
    //   14	65	5	localObject4	Object
    //   87	13	5	localException3	Exception
    //   22	23	6	localBufferedOutputStream	java.io.BufferedOutputStream
    // Exception table:
    //   from	to	target	type
    //   49	55	63	finally
    //   49	55	71	java/lang/Exception
    //   11	16	83	finally
    //   19	24	83	finally
    //   27	39	83	finally
    //   42	49	83	finally
    //   94	105	83	finally
    //   108	118	83	finally
    //   11	16	87	java/lang/Exception
    //   19	24	87	java/lang/Exception
    //   27	39	87	java/lang/Exception
    //   42	49	87	java/lang/Exception
    //   108	118	130	java/lang/Exception
  }
  
  private static class a
    extends ObjectInputStream
  {
    public a(InputStream paramInputStream)
      throws IOException
    {
      super();
    }
    
    protected ObjectStreamClass readClassDescriptor()
      throws IOException, ClassNotFoundException
    {
      ObjectStreamClass localObjectStreamClass1 = super.readClassDescriptor();
      ObjectStreamClass localObjectStreamClass2;
      if (localObjectStreamClass1.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1"))
      {
        localObjectStreamClass2 = ObjectStreamClass.lookup(b.a.class);
      }
      else
      {
        localObjectStreamClass2 = localObjectStreamClass1;
        if (localObjectStreamClass1.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1")) {
          localObjectStreamClass2 = ObjectStreamClass.lookup(f.a.class);
        }
      }
      return localObjectStreamClass2;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/appevents/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */