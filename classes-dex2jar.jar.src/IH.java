import com.bumptech.glide.load.d;
import java.io.InputStream;

public class ih
  implements d<InputStream>
{
  private final bg a;
  
  public ih(bg parambg)
  {
    this.a = parambg;
  }
  
  /* Error */
  public boolean a(InputStream paramInputStream, java.io.File paramFile, com.bumptech.glide.load.j paramj)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 16	ih:a	Lbg;
    //   4: ldc 21
    //   6: ldc 23
    //   8: invokeinterface 29 3 0
    //   13: checkcast 23	[B
    //   16: astore 4
    //   18: iconst_0
    //   19: istore 5
    //   21: iconst_0
    //   22: istore 6
    //   24: aconst_null
    //   25: astore 7
    //   27: aconst_null
    //   28: astore 8
    //   30: aload 8
    //   32: astore_3
    //   33: new 31	java/io/FileOutputStream
    //   36: astore 9
    //   38: aload 8
    //   40: astore_3
    //   41: aload 9
    //   43: aload_2
    //   44: invokespecial 34	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   47: aload_1
    //   48: aload 4
    //   50: invokevirtual 40	java/io/InputStream:read	([B)I
    //   53: istore 10
    //   55: iload 10
    //   57: iconst_m1
    //   58: if_icmpeq +16 -> 74
    //   61: aload 9
    //   63: aload 4
    //   65: iconst_0
    //   66: iload 10
    //   68: invokevirtual 44	java/io/FileOutputStream:write	([BII)V
    //   71: goto -24 -> 47
    //   74: aload 9
    //   76: invokevirtual 47	java/io/FileOutputStream:close	()V
    //   79: iconst_1
    //   80: istore 11
    //   82: iconst_1
    //   83: istore 6
    //   85: aload 9
    //   87: invokevirtual 47	java/io/FileOutputStream:close	()V
    //   90: iload 6
    //   92: istore 11
    //   94: goto +67 -> 161
    //   97: astore_1
    //   98: aload 9
    //   100: astore_3
    //   101: goto +74 -> 175
    //   104: astore_2
    //   105: aload 9
    //   107: astore_1
    //   108: goto +11 -> 119
    //   111: astore_1
    //   112: goto +63 -> 175
    //   115: astore_2
    //   116: aload 7
    //   118: astore_1
    //   119: aload_1
    //   120: astore_3
    //   121: ldc 49
    //   123: iconst_3
    //   124: invokestatic 55	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   127: ifeq +14 -> 141
    //   130: aload_1
    //   131: astore_3
    //   132: ldc 49
    //   134: ldc 57
    //   136: aload_2
    //   137: invokestatic 61	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   140: pop
    //   141: iload 6
    //   143: istore 11
    //   145: aload_1
    //   146: ifnull +15 -> 161
    //   149: iload 5
    //   151: istore 11
    //   153: aload_1
    //   154: invokevirtual 47	java/io/FileOutputStream:close	()V
    //   157: iload 6
    //   159: istore 11
    //   161: aload_0
    //   162: getfield 16	ih:a	Lbg;
    //   165: aload 4
    //   167: invokeinterface 65 2 0
    //   172: iload 11
    //   174: ireturn
    //   175: aload_3
    //   176: ifnull +7 -> 183
    //   179: aload_3
    //   180: invokevirtual 47	java/io/FileOutputStream:close	()V
    //   183: aload_0
    //   184: getfield 16	ih:a	Lbg;
    //   187: aload 4
    //   189: invokeinterface 65 2 0
    //   194: aload_1
    //   195: athrow
    //   196: astore_1
    //   197: goto -36 -> 161
    //   200: astore_2
    //   201: goto -18 -> 183
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	204	0	this	ih
    //   0	204	1	paramInputStream	InputStream
    //   0	204	2	paramFile	java.io.File
    //   0	204	3	paramj	com.bumptech.glide.load.j
    //   16	172	4	arrayOfByte	byte[]
    //   19	131	5	bool1	boolean
    //   22	136	6	bool2	boolean
    //   25	92	7	localObject1	Object
    //   28	11	8	localObject2	Object
    //   36	70	9	localFileOutputStream	java.io.FileOutputStream
    //   53	14	10	i	int
    //   80	93	11	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   47	55	97	finally
    //   61	71	97	finally
    //   74	79	97	finally
    //   47	55	104	java/io/IOException
    //   61	71	104	java/io/IOException
    //   74	79	104	java/io/IOException
    //   33	38	111	finally
    //   41	47	111	finally
    //   121	130	111	finally
    //   132	141	111	finally
    //   33	38	115	java/io/IOException
    //   41	47	115	java/io/IOException
    //   85	90	196	java/io/IOException
    //   153	157	196	java/io/IOException
    //   179	183	200	java/io/IOException
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */