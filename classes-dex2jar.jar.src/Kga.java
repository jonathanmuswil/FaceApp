import java.io.File;

final class kga<T>
  implements SQa<T>
{
  kga(jga paramjga, File paramFile, Fka paramFka) {}
  
  /* Error */
  public final void a(RQa<uia> paramRQa)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 34
    //   3: invokestatic 39	oXa:b	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aconst_null
    //   7: astore_2
    //   8: aconst_null
    //   9: astore_3
    //   10: aload_3
    //   11: astore 4
    //   13: aload_0
    //   14: getfield 21	kga:a	Ljga;
    //   17: invokevirtual 43	jga:k	()Z
    //   20: ifeq +31 -> 51
    //   23: aload_3
    //   24: astore 4
    //   26: aload_0
    //   27: getfield 21	kga:a	Ljga;
    //   30: invokevirtual 49	bia:i	()LEda;
    //   33: invokevirtual 55	Eda:d	()LYja;
    //   36: astore 5
    //   38: aload_3
    //   39: astore 4
    //   41: aload 5
    //   43: invokevirtual 60	Yja:b	()Landroid/net/Uri;
    //   46: astore 6
    //   48: goto +21 -> 69
    //   51: aload_3
    //   52: astore 4
    //   54: aload_0
    //   55: getfield 21	kga:a	Ljga;
    //   58: invokevirtual 49	bia:i	()LEda;
    //   61: invokevirtual 62	Eda:a	()LYja;
    //   64: astore 5
    //   66: goto -28 -> 38
    //   69: aload_3
    //   70: astore 4
    //   72: getstatic 68	WOa:e	LWOa;
    //   75: astore 7
    //   77: aload_3
    //   78: astore 4
    //   80: new 70	WOa$d
    //   83: astore 5
    //   85: aload_3
    //   86: astore 4
    //   88: aload 5
    //   90: aload 6
    //   92: invokespecial 73	WOa$d:<init>	(Landroid/net/Uri;)V
    //   95: aload_3
    //   96: astore 4
    //   98: aload 7
    //   100: aload 5
    //   102: iconst_0
    //   103: iconst_0
    //   104: iconst_1
    //   105: bipush 6
    //   107: aconst_null
    //   108: invokestatic 76	WOa:a	(LWOa;LWOa$c;IIZILjava/lang/Object;)Landroid/graphics/Bitmap;
    //   111: astore 5
    //   113: aload 5
    //   115: ifnull +170 -> 285
    //   118: new 78	uia
    //   121: astore 4
    //   123: aload 4
    //   125: iconst_3
    //   126: iconst_1
    //   127: iconst_0
    //   128: aload_0
    //   129: getfield 23	kga:b	Ljava/io/File;
    //   132: invokespecial 81	uia:<init>	(IIZLjava/io/File;)V
    //   135: aload_1
    //   136: aload 4
    //   138: invokeinterface 86 2 0
    //   143: new 88	android/graphics/Canvas
    //   146: astore 4
    //   148: aload 4
    //   150: aload 5
    //   152: invokespecial 91	android/graphics/Canvas:<init>	(Landroid/graphics/Bitmap;)V
    //   155: aload_0
    //   156: getfield 21	kga:a	Ljga;
    //   159: aload 4
    //   161: aload_0
    //   162: getfield 25	kga:c	LFka;
    //   165: aload_0
    //   166: getfield 21	kga:a	Ljga;
    //   169: invokevirtual 49	bia:i	()LEda;
    //   172: invokevirtual 55	Eda:d	()LYja;
    //   175: invokevirtual 94	Yja:a	()LAPa;
    //   178: aload 5
    //   180: invokestatic 99	UPa:a	(Landroid/graphics/Bitmap;)LAPa;
    //   183: invokestatic 102	jga:a	(Ljga;Landroid/graphics/Canvas;LFka;LAPa;LAPa;)V
    //   186: new 78	uia
    //   189: astore 4
    //   191: aload 4
    //   193: iconst_3
    //   194: iconst_2
    //   195: iconst_0
    //   196: aload_0
    //   197: getfield 23	kga:b	Ljava/io/File;
    //   200: invokespecial 81	uia:<init>	(IIZLjava/io/File;)V
    //   203: aload_1
    //   204: aload 4
    //   206: invokeinterface 86 2 0
    //   211: getstatic 68	WOa:e	LWOa;
    //   214: aload 5
    //   216: aload_0
    //   217: getfield 23	kga:b	Ljava/io/File;
    //   220: iconst_0
    //   221: iconst_4
    //   222: aconst_null
    //   223: invokestatic 105	WOa:a	(LWOa;Landroid/graphics/Bitmap;Ljava/io/File;IILjava/lang/Object;)V
    //   226: new 78	uia
    //   229: astore 4
    //   231: aload 4
    //   233: iconst_3
    //   234: iconst_3
    //   235: iconst_1
    //   236: aload_0
    //   237: getfield 23	kga:b	Ljava/io/File;
    //   240: invokespecial 81	uia:<init>	(IIZLjava/io/File;)V
    //   243: aload_1
    //   244: aload 4
    //   246: invokeinterface 86 2 0
    //   251: aload_1
    //   252: invokeinterface 107 1 0
    //   257: aload 5
    //   259: invokevirtual 112	android/graphics/Bitmap:isRecycled	()Z
    //   262: ifne +85 -> 347
    //   265: aload 5
    //   267: invokevirtual 115	android/graphics/Bitmap:recycle	()V
    //   270: goto +77 -> 347
    //   273: astore_1
    //   274: aload 5
    //   276: astore 4
    //   278: goto +70 -> 348
    //   281: astore_3
    //   282: goto +35 -> 317
    //   285: aload_3
    //   286: astore 4
    //   288: new 117	java/lang/IllegalArgumentException
    //   291: astore 5
    //   293: aload_3
    //   294: astore 4
    //   296: aload 5
    //   298: ldc 119
    //   300: invokespecial 122	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   303: aload_3
    //   304: astore 4
    //   306: aload 5
    //   308: athrow
    //   309: astore_1
    //   310: goto +38 -> 348
    //   313: astore_3
    //   314: aload_2
    //   315: astore 5
    //   317: aload 5
    //   319: astore 4
    //   321: aload_1
    //   322: aload_3
    //   323: invokeinterface 127 2 0
    //   328: pop
    //   329: aload 5
    //   331: ifnull +16 -> 347
    //   334: aload 5
    //   336: invokevirtual 112	android/graphics/Bitmap:isRecycled	()Z
    //   339: ifne +8 -> 347
    //   342: aload 5
    //   344: invokevirtual 115	android/graphics/Bitmap:recycle	()V
    //   347: return
    //   348: aload 4
    //   350: ifnull +16 -> 366
    //   353: aload 4
    //   355: invokevirtual 112	android/graphics/Bitmap:isRecycled	()Z
    //   358: ifne +8 -> 366
    //   361: aload 4
    //   363: invokevirtual 115	android/graphics/Bitmap:recycle	()V
    //   366: aload_1
    //   367: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	368	0	this	kga
    //   0	368	1	paramRQa	RQa<uia>
    //   7	308	2	localObject1	Object
    //   9	87	3	localObject2	Object
    //   281	23	3	localException1	Exception
    //   313	10	3	localException2	Exception
    //   11	351	4	localObject3	Object
    //   36	307	5	localObject4	Object
    //   46	45	6	localUri	android.net.Uri
    //   75	24	7	localWOa	WOa
    // Exception table:
    //   from	to	target	type
    //   118	257	273	finally
    //   118	257	281	java/lang/Exception
    //   13	23	309	finally
    //   26	38	309	finally
    //   41	48	309	finally
    //   54	66	309	finally
    //   72	77	309	finally
    //   80	85	309	finally
    //   88	95	309	finally
    //   98	113	309	finally
    //   288	293	309	finally
    //   296	303	309	finally
    //   306	309	309	finally
    //   321	329	309	finally
    //   13	23	313	java/lang/Exception
    //   26	38	313	java/lang/Exception
    //   41	48	313	java/lang/Exception
    //   54	66	313	java/lang/Exception
    //   72	77	313	java/lang/Exception
    //   80	85	313	java/lang/Exception
    //   88	95	313	java/lang/Exception
    //   98	113	313	java/lang/Exception
    //   288	293	313	java/lang/Exception
    //   296	303	313	java/lang/Exception
    //   306	309	313	java/lang/Exception
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */