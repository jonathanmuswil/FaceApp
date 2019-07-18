import java.io.IOException;

public final class raa
  extends PT<raa, raa.a>
  implements saa
{
  private static final raa d = new raa();
  private static volatile YT<raa> e;
  private float f;
  private mZ g;
  private oZ h;
  private faa i;
  
  static
  {
    d.h();
  }
  
  public static raa l()
  {
    return d;
  }
  
  public static YT<raa> parser()
  {
    return d.e();
  }
  
  /* Error */
  protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: getstatic 53	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 59	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: istore 4
    //   10: iconst_0
    //   11: istore 5
    //   13: iconst_0
    //   14: istore 6
    //   16: iload 4
    //   18: tableswitch	default:+46->64, 1:+586->604, 2:+582->600, 3:+580->598, 4:+571->589, 5:+436->454, 6:+100->118, 7:+432->450, 8:+54->72
    //   64: new 61	java/lang/UnsupportedOperationException
    //   67: dup
    //   68: invokespecial 62	java/lang/UnsupportedOperationException:<init>	()V
    //   71: athrow
    //   72: getstatic 64	raa:e	LYT;
    //   75: ifnonnull +39 -> 114
    //   78: ldc 2
    //   80: monitorenter
    //   81: getstatic 64	raa:e	LYT;
    //   84: ifnonnull +18 -> 102
    //   87: new 66	PT$b
    //   90: astore_1
    //   91: aload_1
    //   92: getstatic 30	raa:d	Lraa;
    //   95: invokespecial 69	PT$b:<init>	(LPT;)V
    //   98: aload_1
    //   99: putstatic 64	raa:e	LYT;
    //   102: ldc 2
    //   104: monitorexit
    //   105: goto +9 -> 114
    //   108: astore_1
    //   109: ldc 2
    //   111: monitorexit
    //   112: aload_1
    //   113: athrow
    //   114: getstatic 64	raa:e	LYT;
    //   117: areturn
    //   118: aload_2
    //   119: checkcast 71	HT
    //   122: astore_2
    //   123: aload_3
    //   124: checkcast 73	LT
    //   127: astore_3
    //   128: iload 6
    //   130: ifne +320 -> 450
    //   133: aload_2
    //   134: invokevirtual 76	HT:n	()I
    //   137: istore 4
    //   139: iload 4
    //   141: ifeq +249 -> 390
    //   144: iload 4
    //   146: bipush 13
    //   148: if_icmpeq +231 -> 379
    //   151: iload 4
    //   153: bipush 18
    //   155: if_icmpeq +159 -> 314
    //   158: iload 4
    //   160: bipush 26
    //   162: if_icmpeq +87 -> 249
    //   165: iload 4
    //   167: bipush 34
    //   169: if_icmpeq +15 -> 184
    //   172: aload_2
    //   173: iload 4
    //   175: invokevirtual 79	HT:e	(I)Z
    //   178: ifne -50 -> 128
    //   181: goto +209 -> 390
    //   184: aload_0
    //   185: getfield 81	raa:i	Lfaa;
    //   188: ifnull +17 -> 205
    //   191: aload_0
    //   192: getfield 81	raa:i	Lfaa;
    //   195: invokevirtual 85	PT:c	()LPT$a;
    //   198: checkcast 87	faa$a
    //   201: astore_1
    //   202: goto +5 -> 207
    //   205: aconst_null
    //   206: astore_1
    //   207: aload_0
    //   208: aload_2
    //   209: invokestatic 91	faa:parser	()LYT;
    //   212: aload_3
    //   213: invokevirtual 94	HT:a	(LYT;LLT;)LVT;
    //   216: checkcast 89	faa
    //   219: putfield 81	raa:i	Lfaa;
    //   222: aload_1
    //   223: ifnull -95 -> 128
    //   226: aload_1
    //   227: aload_0
    //   228: getfield 81	raa:i	Lfaa;
    //   231: invokevirtual 100	PT$a:b	(LPT;)LPT$a;
    //   234: pop
    //   235: aload_0
    //   236: aload_1
    //   237: invokevirtual 103	PT$a:b	()LPT;
    //   240: checkcast 89	faa
    //   243: putfield 81	raa:i	Lfaa;
    //   246: goto -118 -> 128
    //   249: aload_0
    //   250: getfield 105	raa:h	LoZ;
    //   253: ifnull +17 -> 270
    //   256: aload_0
    //   257: getfield 105	raa:h	LoZ;
    //   260: invokevirtual 85	PT:c	()LPT$a;
    //   263: checkcast 107	oZ$a
    //   266: astore_1
    //   267: goto +5 -> 272
    //   270: aconst_null
    //   271: astore_1
    //   272: aload_0
    //   273: aload_2
    //   274: invokestatic 110	oZ:parser	()LYT;
    //   277: aload_3
    //   278: invokevirtual 94	HT:a	(LYT;LLT;)LVT;
    //   281: checkcast 109	oZ
    //   284: putfield 105	raa:h	LoZ;
    //   287: aload_1
    //   288: ifnull -160 -> 128
    //   291: aload_1
    //   292: aload_0
    //   293: getfield 105	raa:h	LoZ;
    //   296: invokevirtual 100	PT$a:b	(LPT;)LPT$a;
    //   299: pop
    //   300: aload_0
    //   301: aload_1
    //   302: invokevirtual 103	PT$a:b	()LPT;
    //   305: checkcast 109	oZ
    //   308: putfield 105	raa:h	LoZ;
    //   311: goto -183 -> 128
    //   314: aload_0
    //   315: getfield 112	raa:g	LmZ;
    //   318: ifnull +17 -> 335
    //   321: aload_0
    //   322: getfield 112	raa:g	LmZ;
    //   325: invokevirtual 85	PT:c	()LPT$a;
    //   328: checkcast 114	mZ$a
    //   331: astore_1
    //   332: goto +5 -> 337
    //   335: aconst_null
    //   336: astore_1
    //   337: aload_0
    //   338: aload_2
    //   339: invokestatic 117	mZ:parser	()LYT;
    //   342: aload_3
    //   343: invokevirtual 94	HT:a	(LYT;LLT;)LVT;
    //   346: checkcast 116	mZ
    //   349: putfield 112	raa:g	LmZ;
    //   352: aload_1
    //   353: ifnull -225 -> 128
    //   356: aload_1
    //   357: aload_0
    //   358: getfield 112	raa:g	LmZ;
    //   361: invokevirtual 100	PT$a:b	(LPT;)LPT$a;
    //   364: pop
    //   365: aload_0
    //   366: aload_1
    //   367: invokevirtual 103	PT$a:b	()LPT;
    //   370: checkcast 116	mZ
    //   373: putfield 112	raa:g	LmZ;
    //   376: goto -248 -> 128
    //   379: aload_0
    //   380: aload_2
    //   381: invokevirtual 120	HT:e	()F
    //   384: putfield 122	raa:f	F
    //   387: goto -259 -> 128
    //   390: iconst_1
    //   391: istore 6
    //   393: goto -265 -> 128
    //   396: astore_1
    //   397: goto +51 -> 448
    //   400: astore_3
    //   401: new 124	java/lang/RuntimeException
    //   404: astore_1
    //   405: new 46	RT
    //   408: astore_2
    //   409: aload_2
    //   410: aload_3
    //   411: invokevirtual 128	java/io/IOException:getMessage	()Ljava/lang/String;
    //   414: invokespecial 131	RT:<init>	(Ljava/lang/String;)V
    //   417: aload_2
    //   418: aload_0
    //   419: invokevirtual 134	RT:a	(LVT;)LRT;
    //   422: pop
    //   423: aload_1
    //   424: aload_2
    //   425: invokespecial 137	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   428: aload_1
    //   429: athrow
    //   430: astore_2
    //   431: new 124	java/lang/RuntimeException
    //   434: astore_1
    //   435: aload_2
    //   436: aload_0
    //   437: invokevirtual 134	RT:a	(LVT;)LRT;
    //   440: pop
    //   441: aload_1
    //   442: aload_2
    //   443: invokespecial 137	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   446: aload_1
    //   447: athrow
    //   448: aload_1
    //   449: athrow
    //   450: getstatic 30	raa:d	Lraa;
    //   453: areturn
    //   454: aload_2
    //   455: checkcast 139	PT$j
    //   458: astore_1
    //   459: aload_3
    //   460: checkcast 2	raa
    //   463: astore_2
    //   464: aload_0
    //   465: getfield 122	raa:f	F
    //   468: fconst_0
    //   469: fcmpl
    //   470: ifeq +9 -> 479
    //   473: iconst_1
    //   474: istore 7
    //   476: goto +6 -> 482
    //   479: iconst_0
    //   480: istore 7
    //   482: aload_0
    //   483: getfield 122	raa:f	F
    //   486: fstore 8
    //   488: aload_2
    //   489: getfield 122	raa:f	F
    //   492: fconst_0
    //   493: fcmpl
    //   494: ifeq +6 -> 500
    //   497: iconst_1
    //   498: istore 5
    //   500: aload_0
    //   501: aload_1
    //   502: iload 7
    //   504: fload 8
    //   506: iload 5
    //   508: aload_2
    //   509: getfield 122	raa:f	F
    //   512: invokeinterface 142 5 0
    //   517: putfield 122	raa:f	F
    //   520: aload_0
    //   521: aload_1
    //   522: aload_0
    //   523: getfield 112	raa:g	LmZ;
    //   526: aload_2
    //   527: getfield 112	raa:g	LmZ;
    //   530: invokeinterface 145 3 0
    //   535: checkcast 116	mZ
    //   538: putfield 112	raa:g	LmZ;
    //   541: aload_0
    //   542: aload_1
    //   543: aload_0
    //   544: getfield 105	raa:h	LoZ;
    //   547: aload_2
    //   548: getfield 105	raa:h	LoZ;
    //   551: invokeinterface 145 3 0
    //   556: checkcast 109	oZ
    //   559: putfield 105	raa:h	LoZ;
    //   562: aload_0
    //   563: aload_1
    //   564: aload_0
    //   565: getfield 81	raa:i	Lfaa;
    //   568: aload_2
    //   569: getfield 81	raa:i	Lfaa;
    //   572: invokeinterface 145 3 0
    //   577: checkcast 89	faa
    //   580: putfield 81	raa:i	Lfaa;
    //   583: getstatic 150	PT$h:a	LPT$h;
    //   586: astore_1
    //   587: aload_0
    //   588: areturn
    //   589: new 9	raa$a
    //   592: dup
    //   593: aconst_null
    //   594: invokespecial 153	raa$a:<init>	(LQY;)V
    //   597: areturn
    //   598: aconst_null
    //   599: areturn
    //   600: getstatic 30	raa:d	Lraa;
    //   603: areturn
    //   604: new 2	raa
    //   607: dup
    //   608: invokespecial 28	raa:<init>	()V
    //   611: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	612	0	this	raa
    //   0	612	1	parami	PT.i
    //   0	612	2	paramObject1	Object
    //   0	612	3	paramObject2	Object
    //   8	166	4	j	int
    //   11	496	5	bool1	boolean
    //   14	378	6	k	int
    //   474	29	7	bool2	boolean
    //   486	19	8	f1	float
    // Exception table:
    //   from	to	target	type
    //   81	102	108	finally
    //   102	105	108	finally
    //   109	112	108	finally
    //   133	139	396	finally
    //   172	181	396	finally
    //   184	202	396	finally
    //   207	222	396	finally
    //   226	246	396	finally
    //   249	267	396	finally
    //   272	287	396	finally
    //   291	311	396	finally
    //   314	332	396	finally
    //   337	352	396	finally
    //   356	376	396	finally
    //   379	387	396	finally
    //   401	430	396	finally
    //   431	448	396	finally
    //   133	139	400	java/io/IOException
    //   172	181	400	java/io/IOException
    //   184	202	400	java/io/IOException
    //   207	222	400	java/io/IOException
    //   226	246	400	java/io/IOException
    //   249	267	400	java/io/IOException
    //   272	287	400	java/io/IOException
    //   291	311	400	java/io/IOException
    //   314	332	400	java/io/IOException
    //   337	352	400	java/io/IOException
    //   356	376	400	java/io/IOException
    //   379	387	400	java/io/IOException
    //   133	139	430	RT
    //   172	181	430	RT
    //   184	202	430	RT
    //   207	222	430	RT
    //   226	246	430	RT
    //   249	267	430	RT
    //   272	287	430	RT
    //   291	311	430	RT
    //   314	332	430	RT
    //   337	352	430	RT
    //   356	376	430	RT
    //   379	387	430	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    float f1 = this.f;
    if (f1 != 0.0F) {
      paramJT.b(1, f1);
    }
    if (this.g != null) {
      paramJT.b(2, o());
    }
    if (this.h != null) {
      paramJT.b(3, n());
    }
    if (this.i != null) {
      paramJT.b(4, m());
    }
  }
  
  public int d()
  {
    int j = this.c;
    if (j != -1) {
      return j;
    }
    j = 0;
    float f1 = this.f;
    if (f1 != 0.0F) {
      j = 0 + JT.a(1, f1);
    }
    int k = j;
    if (this.g != null) {
      k = j + JT.a(2, o());
    }
    j = k;
    if (this.h != null) {
      j = k + JT.a(3, n());
    }
    k = j;
    if (this.i != null) {
      k = j + JT.a(4, m());
    }
    this.c = k;
    return k;
  }
  
  public float k()
  {
    return this.f;
  }
  
  public faa m()
  {
    faa localfaa1 = this.i;
    faa localfaa2 = localfaa1;
    if (localfaa1 == null) {
      localfaa2 = faa.l();
    }
    return localfaa2;
  }
  
  public oZ n()
  {
    oZ localoZ1 = this.h;
    oZ localoZ2 = localoZ1;
    if (localoZ1 == null) {
      localoZ2 = oZ.l();
    }
    return localoZ2;
  }
  
  public mZ o()
  {
    mZ localmZ1 = this.g;
    mZ localmZ2 = localmZ1;
    if (localmZ1 == null) {
      localmZ2 = mZ.k();
    }
    return localmZ2;
  }
  
  public static final class a
    extends PT.a<raa, a>
    implements saa
  {
    private a()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/raa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */