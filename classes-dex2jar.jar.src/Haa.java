import java.io.IOException;

public final class haa
  extends PT<haa, haa.a>
  implements iaa
{
  private static final haa d = new haa();
  private static volatile YT<haa> e;
  private int f;
  private int g;
  private int h;
  private int i;
  
  static
  {
    d.h();
  }
  
  public static haa l()
  {
    return d;
  }
  
  public static YT<haa> parser()
  {
    return d.e();
  }
  
  /* Error */
  protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: getstatic 50	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 56	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: istore 4
    //   10: iconst_0
    //   11: istore 5
    //   13: iconst_0
    //   14: istore 6
    //   16: iload 4
    //   18: tableswitch	default:+46->64, 1:+535->553, 2:+531->549, 3:+529->547, 4:+520->538, 5:+274->292, 6:+100->118, 7:+270->288, 8:+54->72
    //   64: new 58	java/lang/UnsupportedOperationException
    //   67: dup
    //   68: invokespecial 59	java/lang/UnsupportedOperationException:<init>	()V
    //   71: athrow
    //   72: getstatic 61	haa:e	LYT;
    //   75: ifnonnull +39 -> 114
    //   78: ldc 2
    //   80: monitorenter
    //   81: getstatic 61	haa:e	LYT;
    //   84: ifnonnull +18 -> 102
    //   87: new 63	PT$b
    //   90: astore_1
    //   91: aload_1
    //   92: getstatic 27	haa:d	Lhaa;
    //   95: invokespecial 66	PT$b:<init>	(LPT;)V
    //   98: aload_1
    //   99: putstatic 61	haa:e	LYT;
    //   102: ldc 2
    //   104: monitorexit
    //   105: goto +9 -> 114
    //   108: astore_1
    //   109: ldc 2
    //   111: monitorexit
    //   112: aload_1
    //   113: athrow
    //   114: getstatic 61	haa:e	LYT;
    //   117: areturn
    //   118: aload_2
    //   119: checkcast 68	HT
    //   122: astore_1
    //   123: aload_3
    //   124: checkcast 70	LT
    //   127: astore_2
    //   128: iload 6
    //   130: ifne +158 -> 288
    //   133: aload_1
    //   134: invokevirtual 73	HT:n	()I
    //   137: istore 4
    //   139: iload 4
    //   141: ifeq +87 -> 228
    //   144: iload 4
    //   146: bipush 8
    //   148: if_icmpeq +69 -> 217
    //   151: iload 4
    //   153: bipush 16
    //   155: if_icmpeq +51 -> 206
    //   158: iload 4
    //   160: bipush 24
    //   162: if_icmpeq +33 -> 195
    //   165: iload 4
    //   167: bipush 32
    //   169: if_icmpeq +15 -> 184
    //   172: aload_1
    //   173: iload 4
    //   175: invokevirtual 76	HT:e	(I)Z
    //   178: ifne -50 -> 128
    //   181: goto +47 -> 228
    //   184: aload_0
    //   185: aload_1
    //   186: invokevirtual 78	HT:f	()I
    //   189: putfield 80	haa:i	I
    //   192: goto -64 -> 128
    //   195: aload_0
    //   196: aload_1
    //   197: invokevirtual 78	HT:f	()I
    //   200: putfield 82	haa:h	I
    //   203: goto -75 -> 128
    //   206: aload_0
    //   207: aload_1
    //   208: invokevirtual 78	HT:f	()I
    //   211: putfield 84	haa:g	I
    //   214: goto -86 -> 128
    //   217: aload_0
    //   218: aload_1
    //   219: invokevirtual 78	HT:f	()I
    //   222: putfield 86	haa:f	I
    //   225: goto -97 -> 128
    //   228: iconst_1
    //   229: istore 6
    //   231: goto -103 -> 128
    //   234: astore_1
    //   235: goto +51 -> 286
    //   238: astore_1
    //   239: new 88	java/lang/RuntimeException
    //   242: astore_2
    //   243: new 43	RT
    //   246: astore_3
    //   247: aload_3
    //   248: aload_1
    //   249: invokevirtual 92	java/io/IOException:getMessage	()Ljava/lang/String;
    //   252: invokespecial 95	RT:<init>	(Ljava/lang/String;)V
    //   255: aload_3
    //   256: aload_0
    //   257: invokevirtual 98	RT:a	(LVT;)LRT;
    //   260: pop
    //   261: aload_2
    //   262: aload_3
    //   263: invokespecial 101	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   266: aload_2
    //   267: athrow
    //   268: astore_1
    //   269: new 88	java/lang/RuntimeException
    //   272: astore_2
    //   273: aload_1
    //   274: aload_0
    //   275: invokevirtual 98	RT:a	(LVT;)LRT;
    //   278: pop
    //   279: aload_2
    //   280: aload_1
    //   281: invokespecial 101	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   284: aload_2
    //   285: athrow
    //   286: aload_1
    //   287: athrow
    //   288: getstatic 27	haa:d	Lhaa;
    //   291: areturn
    //   292: aload_2
    //   293: checkcast 103	PT$j
    //   296: astore_1
    //   297: aload_3
    //   298: checkcast 2	haa
    //   301: astore_2
    //   302: aload_0
    //   303: getfield 86	haa:f	I
    //   306: ifeq +9 -> 315
    //   309: iconst_1
    //   310: istore 7
    //   312: goto +6 -> 318
    //   315: iconst_0
    //   316: istore 7
    //   318: aload_0
    //   319: getfield 86	haa:f	I
    //   322: istore 6
    //   324: aload_2
    //   325: getfield 86	haa:f	I
    //   328: ifeq +9 -> 337
    //   331: iconst_1
    //   332: istore 8
    //   334: goto +6 -> 340
    //   337: iconst_0
    //   338: istore 8
    //   340: aload_0
    //   341: aload_1
    //   342: iload 7
    //   344: iload 6
    //   346: iload 8
    //   348: aload_2
    //   349: getfield 86	haa:f	I
    //   352: invokeinterface 106 5 0
    //   357: putfield 86	haa:f	I
    //   360: aload_0
    //   361: getfield 84	haa:g	I
    //   364: ifeq +9 -> 373
    //   367: iconst_1
    //   368: istore 7
    //   370: goto +6 -> 376
    //   373: iconst_0
    //   374: istore 7
    //   376: aload_0
    //   377: getfield 84	haa:g	I
    //   380: istore 6
    //   382: aload_2
    //   383: getfield 84	haa:g	I
    //   386: ifeq +9 -> 395
    //   389: iconst_1
    //   390: istore 8
    //   392: goto +6 -> 398
    //   395: iconst_0
    //   396: istore 8
    //   398: aload_0
    //   399: aload_1
    //   400: iload 7
    //   402: iload 6
    //   404: iload 8
    //   406: aload_2
    //   407: getfield 84	haa:g	I
    //   410: invokeinterface 106 5 0
    //   415: putfield 84	haa:g	I
    //   418: aload_0
    //   419: getfield 82	haa:h	I
    //   422: ifeq +9 -> 431
    //   425: iconst_1
    //   426: istore 7
    //   428: goto +6 -> 434
    //   431: iconst_0
    //   432: istore 7
    //   434: aload_0
    //   435: getfield 82	haa:h	I
    //   438: istore 6
    //   440: aload_2
    //   441: getfield 82	haa:h	I
    //   444: ifeq +9 -> 453
    //   447: iconst_1
    //   448: istore 8
    //   450: goto +6 -> 456
    //   453: iconst_0
    //   454: istore 8
    //   456: aload_0
    //   457: aload_1
    //   458: iload 7
    //   460: iload 6
    //   462: iload 8
    //   464: aload_2
    //   465: getfield 82	haa:h	I
    //   468: invokeinterface 106 5 0
    //   473: putfield 82	haa:h	I
    //   476: aload_0
    //   477: getfield 80	haa:i	I
    //   480: ifeq +9 -> 489
    //   483: iconst_1
    //   484: istore 7
    //   486: goto +6 -> 492
    //   489: iconst_0
    //   490: istore 7
    //   492: aload_0
    //   493: getfield 80	haa:i	I
    //   496: istore 6
    //   498: iload 5
    //   500: istore 8
    //   502: aload_2
    //   503: getfield 80	haa:i	I
    //   506: ifeq +6 -> 512
    //   509: iconst_1
    //   510: istore 8
    //   512: aload_0
    //   513: aload_1
    //   514: iload 7
    //   516: iload 6
    //   518: iload 8
    //   520: aload_2
    //   521: getfield 80	haa:i	I
    //   524: invokeinterface 106 5 0
    //   529: putfield 80	haa:i	I
    //   532: getstatic 111	PT$h:a	LPT$h;
    //   535: astore_1
    //   536: aload_0
    //   537: areturn
    //   538: new 9	haa$a
    //   541: dup
    //   542: aconst_null
    //   543: invokespecial 114	haa$a:<init>	(LQY;)V
    //   546: areturn
    //   547: aconst_null
    //   548: areturn
    //   549: getstatic 27	haa:d	Lhaa;
    //   552: areturn
    //   553: new 2	haa
    //   556: dup
    //   557: invokespecial 25	haa:<init>	()V
    //   560: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	561	0	this	haa
    //   0	561	1	parami	PT.i
    //   0	561	2	paramObject1	Object
    //   0	561	3	paramObject2	Object
    //   8	166	4	j	int
    //   11	488	5	bool1	boolean
    //   14	503	6	k	int
    //   310	205	7	bool2	boolean
    //   332	187	8	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   81	102	108	finally
    //   102	105	108	finally
    //   109	112	108	finally
    //   133	139	234	finally
    //   172	181	234	finally
    //   184	192	234	finally
    //   195	203	234	finally
    //   206	214	234	finally
    //   217	225	234	finally
    //   239	268	234	finally
    //   269	286	234	finally
    //   133	139	238	java/io/IOException
    //   172	181	238	java/io/IOException
    //   184	192	238	java/io/IOException
    //   195	203	238	java/io/IOException
    //   206	214	238	java/io/IOException
    //   217	225	238	java/io/IOException
    //   133	139	268	RT
    //   172	181	268	RT
    //   184	192	268	RT
    //   195	203	268	RT
    //   206	214	268	RT
    //   217	225	268	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    int j = this.f;
    if (j != 0) {
      paramJT.g(1, j);
    }
    j = this.g;
    if (j != 0) {
      paramJT.g(2, j);
    }
    j = this.h;
    if (j != 0) {
      paramJT.g(3, j);
    }
    j = this.i;
    if (j != 0) {
      paramJT.g(4, j);
    }
  }
  
  public int d()
  {
    int j = this.c;
    if (j != -1) {
      return j;
    }
    j = 0;
    int k = this.f;
    if (k != 0) {
      j = 0 + JT.b(1, k);
    }
    int m = this.g;
    k = j;
    if (m != 0) {
      k = j + JT.b(2, m);
    }
    m = this.h;
    j = k;
    if (m != 0) {
      j = k + JT.b(3, m);
    }
    m = this.i;
    k = j;
    if (m != 0) {
      k = j + JT.b(4, m);
    }
    this.c = k;
    return k;
  }
  
  public int k()
  {
    return this.i;
  }
  
  public int m()
  {
    return this.f;
  }
  
  public int n()
  {
    return this.h;
  }
  
  public int o()
  {
    return this.g;
  }
  
  public static final class a
    extends PT.a<haa, a>
    implements iaa
  {
    private a()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/haa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */