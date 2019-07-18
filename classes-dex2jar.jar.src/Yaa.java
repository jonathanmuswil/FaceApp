import java.io.IOException;
import java.util.List;

public final class yaa
  extends PT<yaa, yaa.a>
  implements zaa
{
  private static final yaa d = new yaa();
  private static volatile YT<yaa> e;
  private int f;
  private _Z g;
  private String h = "";
  private QT.c<jaa> i = PT.g();
  private QT.c<qZ> j = PT.g();
  private QT.c<XY> k = PT.g();
  
  static
  {
    d.h();
  }
  
  public static YT<yaa> parser()
  {
    return d.e();
  }
  
  /* Error */
  protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: getstatic 69	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 75	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: tableswitch	default:+48->56, 1:+635->643, 2:+631->639, 3:+602->610, 4:+593->601, 5:+450->458, 6:+102->110, 7:+446->454, 8:+56->64
    //   56: new 77	java/lang/UnsupportedOperationException
    //   59: dup
    //   60: invokespecial 78	java/lang/UnsupportedOperationException:<init>	()V
    //   63: athrow
    //   64: getstatic 80	yaa:e	LYT;
    //   67: ifnonnull +39 -> 106
    //   70: ldc 2
    //   72: monitorenter
    //   73: getstatic 80	yaa:e	LYT;
    //   76: ifnonnull +18 -> 94
    //   79: new 82	PT$b
    //   82: astore_1
    //   83: aload_1
    //   84: getstatic 35	yaa:d	Lyaa;
    //   87: invokespecial 85	PT$b:<init>	(LPT;)V
    //   90: aload_1
    //   91: putstatic 80	yaa:e	LYT;
    //   94: ldc 2
    //   96: monitorexit
    //   97: goto +9 -> 106
    //   100: astore_1
    //   101: ldc 2
    //   103: monitorexit
    //   104: aload_1
    //   105: athrow
    //   106: getstatic 80	yaa:e	LYT;
    //   109: areturn
    //   110: aload_2
    //   111: checkcast 87	HT
    //   114: astore_2
    //   115: aload_3
    //   116: checkcast 89	LT
    //   119: astore_3
    //   120: iconst_0
    //   121: istore 4
    //   123: iload 4
    //   125: ifne +329 -> 454
    //   128: aload_2
    //   129: invokevirtual 92	HT:n	()I
    //   132: istore 5
    //   134: iload 5
    //   136: ifeq +258 -> 394
    //   139: iload 5
    //   141: bipush 18
    //   143: if_icmpeq +207 -> 350
    //   146: iload 5
    //   148: bipush 26
    //   150: if_icmpeq +135 -> 285
    //   153: iload 5
    //   155: bipush 34
    //   157: if_icmpeq +117 -> 274
    //   160: iload 5
    //   162: bipush 42
    //   164: if_icmpeq +66 -> 230
    //   167: iload 5
    //   169: bipush 50
    //   171: if_icmpeq +15 -> 186
    //   174: aload_2
    //   175: iload 5
    //   177: invokevirtual 95	HT:e	(I)Z
    //   180: ifne -57 -> 123
    //   183: goto +211 -> 394
    //   186: aload_0
    //   187: getfield 50	yaa:j	LQT$c;
    //   190: invokeinterface 100 1 0
    //   195: ifne +14 -> 209
    //   198: aload_0
    //   199: aload_0
    //   200: getfield 50	yaa:j	LQT$c;
    //   203: invokestatic 103	PT:a	(LQT$c;)LQT$c;
    //   206: putfield 50	yaa:j	LQT$c;
    //   209: aload_0
    //   210: getfield 50	yaa:j	LQT$c;
    //   213: aload_2
    //   214: invokestatic 107	qZ:parser	()LYT;
    //   217: aload_3
    //   218: invokevirtual 110	HT:a	(LYT;LLT;)LVT;
    //   221: invokeinterface 116 2 0
    //   226: pop
    //   227: goto -104 -> 123
    //   230: aload_0
    //   231: getfield 48	yaa:i	LQT$c;
    //   234: invokeinterface 100 1 0
    //   239: ifne +14 -> 253
    //   242: aload_0
    //   243: aload_0
    //   244: getfield 48	yaa:i	LQT$c;
    //   247: invokestatic 103	PT:a	(LQT$c;)LQT$c;
    //   250: putfield 48	yaa:i	LQT$c;
    //   253: aload_0
    //   254: getfield 48	yaa:i	LQT$c;
    //   257: aload_2
    //   258: invokestatic 119	jaa:parser	()LYT;
    //   261: aload_3
    //   262: invokevirtual 110	HT:a	(LYT;LLT;)LVT;
    //   265: invokeinterface 116 2 0
    //   270: pop
    //   271: goto -148 -> 123
    //   274: aload_0
    //   275: aload_2
    //   276: invokevirtual 123	HT:m	()Ljava/lang/String;
    //   279: putfield 43	yaa:h	Ljava/lang/String;
    //   282: goto -159 -> 123
    //   285: aload_0
    //   286: getfield 125	yaa:g	L_Z;
    //   289: ifnull +17 -> 306
    //   292: aload_0
    //   293: getfield 125	yaa:g	L_Z;
    //   296: invokevirtual 129	PT:c	()LPT$a;
    //   299: checkcast 131	_Z$a
    //   302: astore_1
    //   303: goto +5 -> 308
    //   306: aconst_null
    //   307: astore_1
    //   308: aload_0
    //   309: aload_2
    //   310: invokestatic 134	_Z:parser	()LYT;
    //   313: aload_3
    //   314: invokevirtual 110	HT:a	(LYT;LLT;)LVT;
    //   317: checkcast 133	_Z
    //   320: putfield 125	yaa:g	L_Z;
    //   323: aload_1
    //   324: ifnull -201 -> 123
    //   327: aload_1
    //   328: aload_0
    //   329: getfield 125	yaa:g	L_Z;
    //   332: invokevirtual 140	PT$a:b	(LPT;)LPT$a;
    //   335: pop
    //   336: aload_0
    //   337: aload_1
    //   338: invokevirtual 143	PT$a:b	()LPT;
    //   341: checkcast 133	_Z
    //   344: putfield 125	yaa:g	L_Z;
    //   347: goto -224 -> 123
    //   350: aload_0
    //   351: getfield 52	yaa:k	LQT$c;
    //   354: invokeinterface 100 1 0
    //   359: ifne +14 -> 373
    //   362: aload_0
    //   363: aload_0
    //   364: getfield 52	yaa:k	LQT$c;
    //   367: invokestatic 103	PT:a	(LQT$c;)LQT$c;
    //   370: putfield 52	yaa:k	LQT$c;
    //   373: aload_0
    //   374: getfield 52	yaa:k	LQT$c;
    //   377: aload_2
    //   378: invokestatic 146	XY:parser	()LYT;
    //   381: aload_3
    //   382: invokevirtual 110	HT:a	(LYT;LLT;)LVT;
    //   385: invokeinterface 116 2 0
    //   390: pop
    //   391: goto -268 -> 123
    //   394: iconst_1
    //   395: istore 4
    //   397: goto -274 -> 123
    //   400: astore_1
    //   401: goto +51 -> 452
    //   404: astore_3
    //   405: new 148	java/lang/RuntimeException
    //   408: astore_2
    //   409: new 62	RT
    //   412: astore_1
    //   413: aload_1
    //   414: aload_3
    //   415: invokevirtual 151	java/io/IOException:getMessage	()Ljava/lang/String;
    //   418: invokespecial 154	RT:<init>	(Ljava/lang/String;)V
    //   421: aload_1
    //   422: aload_0
    //   423: invokevirtual 157	RT:a	(LVT;)LRT;
    //   426: pop
    //   427: aload_2
    //   428: aload_1
    //   429: invokespecial 160	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   432: aload_2
    //   433: athrow
    //   434: astore_2
    //   435: new 148	java/lang/RuntimeException
    //   438: astore_1
    //   439: aload_2
    //   440: aload_0
    //   441: invokevirtual 157	RT:a	(LVT;)LRT;
    //   444: pop
    //   445: aload_1
    //   446: aload_2
    //   447: invokespecial 160	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   450: aload_1
    //   451: athrow
    //   452: aload_1
    //   453: athrow
    //   454: getstatic 35	yaa:d	Lyaa;
    //   457: areturn
    //   458: aload_2
    //   459: checkcast 162	PT$j
    //   462: astore_1
    //   463: aload_3
    //   464: checkcast 2	yaa
    //   467: astore_2
    //   468: aload_0
    //   469: aload_1
    //   470: aload_0
    //   471: getfield 125	yaa:g	L_Z;
    //   474: aload_2
    //   475: getfield 125	yaa:g	L_Z;
    //   478: invokeinterface 165 3 0
    //   483: checkcast 133	_Z
    //   486: putfield 125	yaa:g	L_Z;
    //   489: aload_0
    //   490: aload_1
    //   491: aload_0
    //   492: getfield 43	yaa:h	Ljava/lang/String;
    //   495: invokevirtual 170	java/lang/String:isEmpty	()Z
    //   498: iconst_1
    //   499: ixor
    //   500: aload_0
    //   501: getfield 43	yaa:h	Ljava/lang/String;
    //   504: iconst_1
    //   505: aload_2
    //   506: getfield 43	yaa:h	Ljava/lang/String;
    //   509: invokevirtual 170	java/lang/String:isEmpty	()Z
    //   512: ixor
    //   513: aload_2
    //   514: getfield 43	yaa:h	Ljava/lang/String;
    //   517: invokeinterface 173 5 0
    //   522: putfield 43	yaa:h	Ljava/lang/String;
    //   525: aload_0
    //   526: aload_1
    //   527: aload_0
    //   528: getfield 48	yaa:i	LQT$c;
    //   531: aload_2
    //   532: getfield 48	yaa:i	LQT$c;
    //   535: invokeinterface 176 3 0
    //   540: putfield 48	yaa:i	LQT$c;
    //   543: aload_0
    //   544: aload_1
    //   545: aload_0
    //   546: getfield 50	yaa:j	LQT$c;
    //   549: aload_2
    //   550: getfield 50	yaa:j	LQT$c;
    //   553: invokeinterface 176 3 0
    //   558: putfield 50	yaa:j	LQT$c;
    //   561: aload_0
    //   562: aload_1
    //   563: aload_0
    //   564: getfield 52	yaa:k	LQT$c;
    //   567: aload_2
    //   568: getfield 52	yaa:k	LQT$c;
    //   571: invokeinterface 176 3 0
    //   576: putfield 52	yaa:k	LQT$c;
    //   579: aload_1
    //   580: getstatic 181	PT$h:a	LPT$h;
    //   583: if_acmpne +16 -> 599
    //   586: aload_0
    //   587: aload_0
    //   588: getfield 183	yaa:f	I
    //   591: aload_2
    //   592: getfield 183	yaa:f	I
    //   595: ior
    //   596: putfield 183	yaa:f	I
    //   599: aload_0
    //   600: areturn
    //   601: new 9	yaa$a
    //   604: dup
    //   605: aconst_null
    //   606: invokespecial 186	yaa$a:<init>	(LQY;)V
    //   609: areturn
    //   610: aload_0
    //   611: getfield 48	yaa:i	LQT$c;
    //   614: invokeinterface 188 1 0
    //   619: aload_0
    //   620: getfield 50	yaa:j	LQT$c;
    //   623: invokeinterface 188 1 0
    //   628: aload_0
    //   629: getfield 52	yaa:k	LQT$c;
    //   632: invokeinterface 188 1 0
    //   637: aconst_null
    //   638: areturn
    //   639: getstatic 35	yaa:d	Lyaa;
    //   642: areturn
    //   643: new 2	yaa
    //   646: dup
    //   647: invokespecial 33	yaa:<init>	()V
    //   650: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	651	0	this	yaa
    //   0	651	1	parami	PT.i
    //   0	651	2	paramObject1	Object
    //   0	651	3	paramObject2	Object
    //   121	275	4	m	int
    //   132	44	5	n	int
    // Exception table:
    //   from	to	target	type
    //   73	94	100	finally
    //   94	97	100	finally
    //   101	104	100	finally
    //   128	134	400	finally
    //   174	183	400	finally
    //   186	209	400	finally
    //   209	227	400	finally
    //   230	253	400	finally
    //   253	271	400	finally
    //   274	282	400	finally
    //   285	303	400	finally
    //   308	323	400	finally
    //   327	347	400	finally
    //   350	373	400	finally
    //   373	391	400	finally
    //   405	434	400	finally
    //   435	452	400	finally
    //   128	134	404	java/io/IOException
    //   174	183	404	java/io/IOException
    //   186	209	404	java/io/IOException
    //   209	227	404	java/io/IOException
    //   230	253	404	java/io/IOException
    //   253	271	404	java/io/IOException
    //   274	282	404	java/io/IOException
    //   285	303	404	java/io/IOException
    //   308	323	404	java/io/IOException
    //   327	347	404	java/io/IOException
    //   350	373	404	java/io/IOException
    //   373	391	404	java/io/IOException
    //   128	134	434	RT
    //   174	183	434	RT
    //   186	209	434	RT
    //   209	227	434	RT
    //   230	253	434	RT
    //   253	271	434	RT
    //   274	282	434	RT
    //   285	303	434	RT
    //   308	323	434	RT
    //   327	347	434	RT
    //   350	373	434	RT
    //   373	391	434	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    int m = 0;
    for (int n = 0; n < this.k.size(); n++) {
      paramJT.b(2, (VT)this.k.get(n));
    }
    if (this.g != null) {
      paramJT.b(3, n());
    }
    if (!this.h.isEmpty()) {
      paramJT.b(4, k());
    }
    int i1;
    for (n = 0;; n++)
    {
      i1 = m;
      if (n >= this.i.size()) {
        break;
      }
      paramJT.b(5, (VT)this.i.get(n));
    }
    while (i1 < this.j.size())
    {
      paramJT.b(6, (VT)this.j.get(i1));
      i1++;
    }
  }
  
  public int d()
  {
    int m = this.c;
    if (m != -1) {
      return m;
    }
    int n = 0;
    int i1 = 0;
    m = 0;
    while (i1 < this.k.size())
    {
      m += JT.a(2, (VT)this.k.get(i1));
      i1++;
    }
    i1 = m;
    if (this.g != null) {
      i1 = m + JT.a(3, n());
    }
    m = i1;
    if (!this.h.isEmpty()) {
      m = i1 + JT.a(4, k());
    }
    int i3;
    for (int i2 = 0;; i2++)
    {
      i1 = n;
      i3 = m;
      if (i2 >= this.i.size()) {
        break;
      }
      m += JT.a(5, (VT)this.i.get(i2));
    }
    while (i1 < this.j.size())
    {
      i3 += JT.a(6, (VT)this.j.get(i1));
      i1++;
    }
    this.c = i3;
    return i3;
  }
  
  public String k()
  {
    return this.h;
  }
  
  public List<XY> l()
  {
    return this.k;
  }
  
  public List<qZ> m()
  {
    return this.j;
  }
  
  public _Z n()
  {
    _Z local_Z1 = this.g;
    _Z local_Z2 = local_Z1;
    if (local_Z1 == null) {
      local_Z2 = _Z.k();
    }
    return local_Z2;
  }
  
  public List<jaa> o()
  {
    return this.i;
  }
  
  public static final class a
    extends PT.a<yaa, a>
    implements zaa
  {
    private a()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */