import java.io.IOException;

public final class maa
  extends PT<maa, maa.a>
  implements naa
{
  private static final maa d = new maa();
  private static volatile YT<maa> e;
  private int f = 0;
  private Object g;
  
  static
  {
    d.h();
  }
  
  public static YT<maa> parser()
  {
    return d.e();
  }
  
  /* Error */
  protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: getstatic 54	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 60	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: istore 4
    //   10: iconst_0
    //   11: istore 5
    //   13: iconst_0
    //   14: istore 6
    //   16: iconst_0
    //   17: istore 7
    //   19: iconst_0
    //   20: istore 8
    //   22: iconst_0
    //   23: istore 9
    //   25: iconst_0
    //   26: istore 10
    //   28: iconst_0
    //   29: istore 11
    //   31: iload 4
    //   33: tableswitch	default:+47->80, 1:+903->936, 2:+899->932, 3:+897->930, 4:+888->921, 5:+593->626, 6:+101->134, 7:+589->622, 8:+55->88
    //   80: new 62	java/lang/UnsupportedOperationException
    //   83: dup
    //   84: invokespecial 63	java/lang/UnsupportedOperationException:<init>	()V
    //   87: athrow
    //   88: getstatic 65	maa:e	LYT;
    //   91: ifnonnull +39 -> 130
    //   94: ldc 2
    //   96: monitorenter
    //   97: getstatic 65	maa:e	LYT;
    //   100: ifnonnull +18 -> 118
    //   103: new 67	PT$b
    //   106: astore_1
    //   107: aload_1
    //   108: getstatic 29	maa:d	Lmaa;
    //   111: invokespecial 70	PT$b:<init>	(LPT;)V
    //   114: aload_1
    //   115: putstatic 65	maa:e	LYT;
    //   118: ldc 2
    //   120: monitorexit
    //   121: goto +9 -> 130
    //   124: astore_1
    //   125: ldc 2
    //   127: monitorexit
    //   128: aload_1
    //   129: athrow
    //   130: getstatic 65	maa:e	LYT;
    //   133: areturn
    //   134: aload_2
    //   135: checkcast 72	HT
    //   138: astore_2
    //   139: aload_3
    //   140: checkcast 74	LT
    //   143: astore_3
    //   144: iload 11
    //   146: ifne +476 -> 622
    //   149: aload_2
    //   150: invokevirtual 77	HT:n	()I
    //   153: istore 4
    //   155: iload 4
    //   157: ifeq +405 -> 562
    //   160: iload 4
    //   162: bipush 10
    //   164: if_icmpeq +327 -> 491
    //   167: iload 4
    //   169: bipush 18
    //   171: if_icmpeq +249 -> 420
    //   174: iload 4
    //   176: bipush 26
    //   178: if_icmpeq +171 -> 349
    //   181: iload 4
    //   183: bipush 34
    //   185: if_icmpeq +93 -> 278
    //   188: iload 4
    //   190: bipush 42
    //   192: if_icmpeq +15 -> 207
    //   195: aload_2
    //   196: iload 4
    //   198: invokevirtual 80	HT:e	(I)Z
    //   201: ifne -57 -> 144
    //   204: goto +358 -> 562
    //   207: aload_0
    //   208: getfield 36	maa:f	I
    //   211: iconst_5
    //   212: if_icmpne +20 -> 232
    //   215: aload_0
    //   216: getfield 82	maa:g	Ljava/lang/Object;
    //   219: checkcast 84	baa
    //   222: invokevirtual 88	PT:c	()LPT$a;
    //   225: checkcast 90	baa$a
    //   228: astore_1
    //   229: goto +5 -> 234
    //   232: aconst_null
    //   233: astore_1
    //   234: aload_0
    //   235: aload_2
    //   236: invokestatic 92	baa:parser	()LYT;
    //   239: aload_3
    //   240: invokevirtual 95	HT:a	(LYT;LLT;)LVT;
    //   243: putfield 82	maa:g	Ljava/lang/Object;
    //   246: aload_1
    //   247: ifnull +23 -> 270
    //   250: aload_1
    //   251: aload_0
    //   252: getfield 82	maa:g	Ljava/lang/Object;
    //   255: checkcast 84	baa
    //   258: invokevirtual 100	PT$a:b	(LPT;)LPT$a;
    //   261: pop
    //   262: aload_0
    //   263: aload_1
    //   264: invokevirtual 103	PT$a:b	()LPT;
    //   267: putfield 82	maa:g	Ljava/lang/Object;
    //   270: aload_0
    //   271: iconst_5
    //   272: putfield 36	maa:f	I
    //   275: goto -131 -> 144
    //   278: aload_0
    //   279: getfield 36	maa:f	I
    //   282: iconst_4
    //   283: if_icmpne +20 -> 303
    //   286: aload_0
    //   287: getfield 82	maa:g	Ljava/lang/Object;
    //   290: checkcast 105	RY
    //   293: invokevirtual 88	PT:c	()LPT$a;
    //   296: checkcast 107	RY$a
    //   299: astore_1
    //   300: goto +5 -> 305
    //   303: aconst_null
    //   304: astore_1
    //   305: aload_0
    //   306: aload_2
    //   307: invokestatic 108	RY:parser	()LYT;
    //   310: aload_3
    //   311: invokevirtual 95	HT:a	(LYT;LLT;)LVT;
    //   314: putfield 82	maa:g	Ljava/lang/Object;
    //   317: aload_1
    //   318: ifnull +23 -> 341
    //   321: aload_1
    //   322: aload_0
    //   323: getfield 82	maa:g	Ljava/lang/Object;
    //   326: checkcast 105	RY
    //   329: invokevirtual 100	PT$a:b	(LPT;)LPT$a;
    //   332: pop
    //   333: aload_0
    //   334: aload_1
    //   335: invokevirtual 103	PT$a:b	()LPT;
    //   338: putfield 82	maa:g	Ljava/lang/Object;
    //   341: aload_0
    //   342: iconst_4
    //   343: putfield 36	maa:f	I
    //   346: goto -202 -> 144
    //   349: aload_0
    //   350: getfield 36	maa:f	I
    //   353: iconst_3
    //   354: if_icmpne +20 -> 374
    //   357: aload_0
    //   358: getfield 82	maa:g	Ljava/lang/Object;
    //   361: checkcast 110	uZ
    //   364: invokevirtual 88	PT:c	()LPT$a;
    //   367: checkcast 112	uZ$a
    //   370: astore_1
    //   371: goto +5 -> 376
    //   374: aconst_null
    //   375: astore_1
    //   376: aload_0
    //   377: aload_2
    //   378: invokestatic 113	uZ:parser	()LYT;
    //   381: aload_3
    //   382: invokevirtual 95	HT:a	(LYT;LLT;)LVT;
    //   385: putfield 82	maa:g	Ljava/lang/Object;
    //   388: aload_1
    //   389: ifnull +23 -> 412
    //   392: aload_1
    //   393: aload_0
    //   394: getfield 82	maa:g	Ljava/lang/Object;
    //   397: checkcast 110	uZ
    //   400: invokevirtual 100	PT$a:b	(LPT;)LPT$a;
    //   403: pop
    //   404: aload_0
    //   405: aload_1
    //   406: invokevirtual 103	PT$a:b	()LPT;
    //   409: putfield 82	maa:g	Ljava/lang/Object;
    //   412: aload_0
    //   413: iconst_3
    //   414: putfield 36	maa:f	I
    //   417: goto -273 -> 144
    //   420: aload_0
    //   421: getfield 36	maa:f	I
    //   424: iconst_2
    //   425: if_icmpne +20 -> 445
    //   428: aload_0
    //   429: getfield 82	maa:g	Ljava/lang/Object;
    //   432: checkcast 115	VY
    //   435: invokevirtual 88	PT:c	()LPT$a;
    //   438: checkcast 117	VY$a
    //   441: astore_1
    //   442: goto +5 -> 447
    //   445: aconst_null
    //   446: astore_1
    //   447: aload_0
    //   448: aload_2
    //   449: invokestatic 118	VY:parser	()LYT;
    //   452: aload_3
    //   453: invokevirtual 95	HT:a	(LYT;LLT;)LVT;
    //   456: putfield 82	maa:g	Ljava/lang/Object;
    //   459: aload_1
    //   460: ifnull +23 -> 483
    //   463: aload_1
    //   464: aload_0
    //   465: getfield 82	maa:g	Ljava/lang/Object;
    //   468: checkcast 115	VY
    //   471: invokevirtual 100	PT$a:b	(LPT;)LPT$a;
    //   474: pop
    //   475: aload_0
    //   476: aload_1
    //   477: invokevirtual 103	PT$a:b	()LPT;
    //   480: putfield 82	maa:g	Ljava/lang/Object;
    //   483: aload_0
    //   484: iconst_2
    //   485: putfield 36	maa:f	I
    //   488: goto -344 -> 144
    //   491: aload_0
    //   492: getfield 36	maa:f	I
    //   495: iconst_1
    //   496: if_icmpne +20 -> 516
    //   499: aload_0
    //   500: getfield 82	maa:g	Ljava/lang/Object;
    //   503: checkcast 120	oaa
    //   506: invokevirtual 88	PT:c	()LPT$a;
    //   509: checkcast 122	oaa$a
    //   512: astore_1
    //   513: goto +5 -> 518
    //   516: aconst_null
    //   517: astore_1
    //   518: aload_0
    //   519: aload_2
    //   520: invokestatic 123	oaa:parser	()LYT;
    //   523: aload_3
    //   524: invokevirtual 95	HT:a	(LYT;LLT;)LVT;
    //   527: putfield 82	maa:g	Ljava/lang/Object;
    //   530: aload_1
    //   531: ifnull +23 -> 554
    //   534: aload_1
    //   535: aload_0
    //   536: getfield 82	maa:g	Ljava/lang/Object;
    //   539: checkcast 120	oaa
    //   542: invokevirtual 100	PT$a:b	(LPT;)LPT$a;
    //   545: pop
    //   546: aload_0
    //   547: aload_1
    //   548: invokevirtual 103	PT$a:b	()LPT;
    //   551: putfield 82	maa:g	Ljava/lang/Object;
    //   554: aload_0
    //   555: iconst_1
    //   556: putfield 36	maa:f	I
    //   559: goto -415 -> 144
    //   562: iconst_1
    //   563: istore 11
    //   565: goto -421 -> 144
    //   568: astore_1
    //   569: goto +51 -> 620
    //   572: astore_2
    //   573: new 125	java/lang/RuntimeException
    //   576: astore_3
    //   577: new 47	RT
    //   580: astore_1
    //   581: aload_1
    //   582: aload_2
    //   583: invokevirtual 129	java/io/IOException:getMessage	()Ljava/lang/String;
    //   586: invokespecial 132	RT:<init>	(Ljava/lang/String;)V
    //   589: aload_1
    //   590: aload_0
    //   591: invokevirtual 135	RT:a	(LVT;)LRT;
    //   594: pop
    //   595: aload_3
    //   596: aload_1
    //   597: invokespecial 138	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   600: aload_3
    //   601: athrow
    //   602: astore_2
    //   603: new 125	java/lang/RuntimeException
    //   606: astore_1
    //   607: aload_2
    //   608: aload_0
    //   609: invokevirtual 135	RT:a	(LVT;)LRT;
    //   612: pop
    //   613: aload_1
    //   614: aload_2
    //   615: invokespecial 138	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   618: aload_1
    //   619: athrow
    //   620: aload_1
    //   621: athrow
    //   622: getstatic 29	maa:d	Lmaa;
    //   625: areturn
    //   626: aload_2
    //   627: checkcast 140	PT$j
    //   630: astore_1
    //   631: aload_3
    //   632: checkcast 2	maa
    //   635: astore_2
    //   636: getstatic 142	QY:d	[I
    //   639: aload_2
    //   640: invokevirtual 146	maa:o	()Lmaa$b;
    //   643: invokevirtual 60	java/lang/Enum:ordinal	()I
    //   646: iaload
    //   647: tableswitch	default:+37->684, 1:+213->860, 2:+175->822, 3:+137->784, 4:+99->746, 5:+61->708, 6:+40->687
    //   684: goto +211 -> 895
    //   687: aload_0
    //   688: getfield 36	maa:f	I
    //   691: ifeq +6 -> 697
    //   694: iconst_1
    //   695: istore 5
    //   697: aload_1
    //   698: iload 5
    //   700: invokeinterface 149 2 0
    //   705: goto +190 -> 895
    //   708: iload 6
    //   710: istore 5
    //   712: aload_0
    //   713: getfield 36	maa:f	I
    //   716: iconst_5
    //   717: if_icmpne +6 -> 723
    //   720: iconst_1
    //   721: istore 5
    //   723: aload_0
    //   724: aload_1
    //   725: iload 5
    //   727: aload_0
    //   728: getfield 82	maa:g	Ljava/lang/Object;
    //   731: aload_2
    //   732: getfield 82	maa:g	Ljava/lang/Object;
    //   735: invokeinterface 152 4 0
    //   740: putfield 82	maa:g	Ljava/lang/Object;
    //   743: goto +152 -> 895
    //   746: iload 7
    //   748: istore 5
    //   750: aload_0
    //   751: getfield 36	maa:f	I
    //   754: iconst_4
    //   755: if_icmpne +6 -> 761
    //   758: iconst_1
    //   759: istore 5
    //   761: aload_0
    //   762: aload_1
    //   763: iload 5
    //   765: aload_0
    //   766: getfield 82	maa:g	Ljava/lang/Object;
    //   769: aload_2
    //   770: getfield 82	maa:g	Ljava/lang/Object;
    //   773: invokeinterface 152 4 0
    //   778: putfield 82	maa:g	Ljava/lang/Object;
    //   781: goto +114 -> 895
    //   784: iload 8
    //   786: istore 5
    //   788: aload_0
    //   789: getfield 36	maa:f	I
    //   792: iconst_3
    //   793: if_icmpne +6 -> 799
    //   796: iconst_1
    //   797: istore 5
    //   799: aload_0
    //   800: aload_1
    //   801: iload 5
    //   803: aload_0
    //   804: getfield 82	maa:g	Ljava/lang/Object;
    //   807: aload_2
    //   808: getfield 82	maa:g	Ljava/lang/Object;
    //   811: invokeinterface 152 4 0
    //   816: putfield 82	maa:g	Ljava/lang/Object;
    //   819: goto +76 -> 895
    //   822: iload 9
    //   824: istore 5
    //   826: aload_0
    //   827: getfield 36	maa:f	I
    //   830: iconst_2
    //   831: if_icmpne +6 -> 837
    //   834: iconst_1
    //   835: istore 5
    //   837: aload_0
    //   838: aload_1
    //   839: iload 5
    //   841: aload_0
    //   842: getfield 82	maa:g	Ljava/lang/Object;
    //   845: aload_2
    //   846: getfield 82	maa:g	Ljava/lang/Object;
    //   849: invokeinterface 152 4 0
    //   854: putfield 82	maa:g	Ljava/lang/Object;
    //   857: goto +38 -> 895
    //   860: iload 10
    //   862: istore 5
    //   864: aload_0
    //   865: getfield 36	maa:f	I
    //   868: iconst_1
    //   869: if_icmpne +6 -> 875
    //   872: iconst_1
    //   873: istore 5
    //   875: aload_0
    //   876: aload_1
    //   877: iload 5
    //   879: aload_0
    //   880: getfield 82	maa:g	Ljava/lang/Object;
    //   883: aload_2
    //   884: getfield 82	maa:g	Ljava/lang/Object;
    //   887: invokeinterface 152 4 0
    //   892: putfield 82	maa:g	Ljava/lang/Object;
    //   895: aload_1
    //   896: getstatic 157	PT$h:a	LPT$h;
    //   899: if_acmpne +20 -> 919
    //   902: aload_2
    //   903: getfield 36	maa:f	I
    //   906: istore 11
    //   908: iload 11
    //   910: ifeq +9 -> 919
    //   913: aload_0
    //   914: iload 11
    //   916: putfield 36	maa:f	I
    //   919: aload_0
    //   920: areturn
    //   921: new 9	maa$a
    //   924: dup
    //   925: aconst_null
    //   926: invokespecial 160	maa$a:<init>	(LQY;)V
    //   929: areturn
    //   930: aconst_null
    //   931: areturn
    //   932: getstatic 29	maa:d	Lmaa;
    //   935: areturn
    //   936: new 2	maa
    //   939: dup
    //   940: invokespecial 27	maa:<init>	()V
    //   943: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	944	0	this	maa
    //   0	944	1	parami	PT.i
    //   0	944	2	paramObject1	Object
    //   0	944	3	paramObject2	Object
    //   8	189	4	i	int
    //   11	867	5	bool1	boolean
    //   14	695	6	bool2	boolean
    //   17	730	7	bool3	boolean
    //   20	765	8	bool4	boolean
    //   23	800	9	bool5	boolean
    //   26	835	10	bool6	boolean
    //   29	886	11	j	int
    // Exception table:
    //   from	to	target	type
    //   97	118	124	finally
    //   118	121	124	finally
    //   125	128	124	finally
    //   149	155	568	finally
    //   195	204	568	finally
    //   207	229	568	finally
    //   234	246	568	finally
    //   250	270	568	finally
    //   270	275	568	finally
    //   278	300	568	finally
    //   305	317	568	finally
    //   321	341	568	finally
    //   341	346	568	finally
    //   349	371	568	finally
    //   376	388	568	finally
    //   392	412	568	finally
    //   412	417	568	finally
    //   420	442	568	finally
    //   447	459	568	finally
    //   463	483	568	finally
    //   483	488	568	finally
    //   491	513	568	finally
    //   518	530	568	finally
    //   534	554	568	finally
    //   554	559	568	finally
    //   573	602	568	finally
    //   603	620	568	finally
    //   149	155	572	java/io/IOException
    //   195	204	572	java/io/IOException
    //   207	229	572	java/io/IOException
    //   234	246	572	java/io/IOException
    //   250	270	572	java/io/IOException
    //   270	275	572	java/io/IOException
    //   278	300	572	java/io/IOException
    //   305	317	572	java/io/IOException
    //   321	341	572	java/io/IOException
    //   341	346	572	java/io/IOException
    //   349	371	572	java/io/IOException
    //   376	388	572	java/io/IOException
    //   392	412	572	java/io/IOException
    //   412	417	572	java/io/IOException
    //   420	442	572	java/io/IOException
    //   447	459	572	java/io/IOException
    //   463	483	572	java/io/IOException
    //   483	488	572	java/io/IOException
    //   491	513	572	java/io/IOException
    //   518	530	572	java/io/IOException
    //   534	554	572	java/io/IOException
    //   554	559	572	java/io/IOException
    //   149	155	602	RT
    //   195	204	602	RT
    //   207	229	602	RT
    //   234	246	602	RT
    //   250	270	602	RT
    //   270	275	602	RT
    //   278	300	602	RT
    //   305	317	602	RT
    //   321	341	602	RT
    //   341	346	602	RT
    //   349	371	602	RT
    //   376	388	602	RT
    //   392	412	602	RT
    //   412	417	602	RT
    //   420	442	602	RT
    //   447	459	602	RT
    //   463	483	602	RT
    //   483	488	602	RT
    //   491	513	602	RT
    //   518	530	602	RT
    //   534	554	602	RT
    //   554	559	602	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    if (this.f == 1) {
      paramJT.b(1, (oaa)this.g);
    }
    if (this.f == 2) {
      paramJT.b(2, (VY)this.g);
    }
    if (this.f == 3) {
      paramJT.b(3, (uZ)this.g);
    }
    if (this.f == 4) {
      paramJT.b(4, (RY)this.g);
    }
    if (this.f == 5) {
      paramJT.b(5, (baa)this.g);
    }
  }
  
  public int d()
  {
    int i = this.c;
    if (i != -1) {
      return i;
    }
    i = 0;
    if (this.f == 1) {
      i = 0 + JT.a(1, (oaa)this.g);
    }
    int j = i;
    if (this.f == 2) {
      j = i + JT.a(2, (VY)this.g);
    }
    i = j;
    if (this.f == 3) {
      i = j + JT.a(3, (uZ)this.g);
    }
    j = i;
    if (this.f == 4) {
      j = i + JT.a(4, (RY)this.g);
    }
    i = j;
    if (this.f == 5) {
      i = j + JT.a(5, (baa)this.g);
    }
    this.c = i;
    return i;
  }
  
  public RY k()
  {
    if (this.f == 4) {
      return (RY)this.g;
    }
    return RY.k();
  }
  
  public VY l()
  {
    if (this.f == 2) {
      return (VY)this.g;
    }
    return VY.k();
  }
  
  public oaa m()
  {
    if (this.f == 1) {
      return (oaa)this.g;
    }
    return oaa.k();
  }
  
  public uZ n()
  {
    if (this.f == 3) {
      return (uZ)this.g;
    }
    return uZ.k();
  }
  
  public maa.b o()
  {
    return maa.b.a(this.f);
  }
  
  public baa p()
  {
    if (this.f == 5) {
      return (baa)this.g;
    }
    return baa.k();
  }
  
  public static final class a
    extends PT.a<maa, a>
    implements naa
  {
    private a()
    {
      super();
    }
  }
  
  public static enum b
    implements QT.a
  {
    private final int h;
    
    private b(int paramInt)
    {
      this.h = paramInt;
    }
    
    public static b a(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              if (paramInt != 4)
              {
                if (paramInt != 5) {
                  return null;
                }
                return e;
              }
              return d;
            }
            return c;
          }
          return b;
        }
        return a;
      }
      return f;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/maa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */