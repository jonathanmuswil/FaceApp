import java.io.IOException;

public final class qZ$b
  extends PT<b, qZ.b.a>
  implements qZ.c
{
  private static final b d = new b();
  private static volatile YT<b> e;
  private mZ f;
  private mZ g;
  
  static
  {
    d.h();
  }
  
  public static b k()
  {
    return d;
  }
  
  public static YT<b> parser()
  {
    return d.e();
  }
  
  /* Error */
  protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: getstatic 52	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 58	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: tableswitch	default:+48->56, 1:+424->432, 2:+420->428, 3:+418->426, 4:+409->417, 5:+351->359, 6:+102->110, 7:+347->355, 8:+56->64
    //   56: new 60	java/lang/UnsupportedOperationException
    //   59: dup
    //   60: invokespecial 61	java/lang/UnsupportedOperationException:<init>	()V
    //   63: athrow
    //   64: getstatic 63	qZ$b:e	LYT;
    //   67: ifnonnull +39 -> 106
    //   70: ldc 2
    //   72: monitorenter
    //   73: getstatic 63	qZ$b:e	LYT;
    //   76: ifnonnull +18 -> 94
    //   79: new 65	PT$b
    //   82: astore_1
    //   83: aload_1
    //   84: getstatic 28	qZ$b:d	LqZ$b;
    //   87: invokespecial 68	PT$b:<init>	(LPT;)V
    //   90: aload_1
    //   91: putstatic 63	qZ$b:e	LYT;
    //   94: ldc 2
    //   96: monitorexit
    //   97: goto +9 -> 106
    //   100: astore_1
    //   101: ldc 2
    //   103: monitorexit
    //   104: aload_1
    //   105: athrow
    //   106: getstatic 63	qZ$b:e	LYT;
    //   109: areturn
    //   110: aload_2
    //   111: checkcast 70	HT
    //   114: astore_2
    //   115: aload_3
    //   116: checkcast 72	LT
    //   119: astore_3
    //   120: iconst_0
    //   121: istore 4
    //   123: iload 4
    //   125: ifne +230 -> 355
    //   128: aload_2
    //   129: invokevirtual 75	HT:n	()I
    //   132: istore 5
    //   134: iload 5
    //   136: ifeq +159 -> 295
    //   139: iload 5
    //   141: bipush 18
    //   143: if_icmpeq +87 -> 230
    //   146: iload 5
    //   148: bipush 26
    //   150: if_icmpeq +15 -> 165
    //   153: aload_2
    //   154: iload 5
    //   156: invokevirtual 78	HT:e	(I)Z
    //   159: ifne -36 -> 123
    //   162: goto +133 -> 295
    //   165: aload_0
    //   166: getfield 80	qZ$b:f	LmZ;
    //   169: ifnull +17 -> 186
    //   172: aload_0
    //   173: getfield 80	qZ$b:f	LmZ;
    //   176: invokevirtual 84	PT:c	()LPT$a;
    //   179: checkcast 86	mZ$a
    //   182: astore_1
    //   183: goto +5 -> 188
    //   186: aconst_null
    //   187: astore_1
    //   188: aload_0
    //   189: aload_2
    //   190: invokestatic 90	mZ:parser	()LYT;
    //   193: aload_3
    //   194: invokevirtual 93	HT:a	(LYT;LLT;)LVT;
    //   197: checkcast 88	mZ
    //   200: putfield 80	qZ$b:f	LmZ;
    //   203: aload_1
    //   204: ifnull -81 -> 123
    //   207: aload_1
    //   208: aload_0
    //   209: getfield 80	qZ$b:f	LmZ;
    //   212: invokevirtual 98	PT$a:b	(LPT;)LPT$a;
    //   215: pop
    //   216: aload_0
    //   217: aload_1
    //   218: invokevirtual 101	PT$a:b	()LPT;
    //   221: checkcast 88	mZ
    //   224: putfield 80	qZ$b:f	LmZ;
    //   227: goto -104 -> 123
    //   230: aload_0
    //   231: getfield 103	qZ$b:g	LmZ;
    //   234: ifnull +17 -> 251
    //   237: aload_0
    //   238: getfield 103	qZ$b:g	LmZ;
    //   241: invokevirtual 84	PT:c	()LPT$a;
    //   244: checkcast 86	mZ$a
    //   247: astore_1
    //   248: goto +5 -> 253
    //   251: aconst_null
    //   252: astore_1
    //   253: aload_0
    //   254: aload_2
    //   255: invokestatic 90	mZ:parser	()LYT;
    //   258: aload_3
    //   259: invokevirtual 93	HT:a	(LYT;LLT;)LVT;
    //   262: checkcast 88	mZ
    //   265: putfield 103	qZ$b:g	LmZ;
    //   268: aload_1
    //   269: ifnull -146 -> 123
    //   272: aload_1
    //   273: aload_0
    //   274: getfield 103	qZ$b:g	LmZ;
    //   277: invokevirtual 98	PT$a:b	(LPT;)LPT$a;
    //   280: pop
    //   281: aload_0
    //   282: aload_1
    //   283: invokevirtual 101	PT$a:b	()LPT;
    //   286: checkcast 88	mZ
    //   289: putfield 103	qZ$b:g	LmZ;
    //   292: goto -169 -> 123
    //   295: iconst_1
    //   296: istore 4
    //   298: goto -175 -> 123
    //   301: astore_1
    //   302: goto +51 -> 353
    //   305: astore_3
    //   306: new 105	java/lang/RuntimeException
    //   309: astore_2
    //   310: new 45	RT
    //   313: astore_1
    //   314: aload_1
    //   315: aload_3
    //   316: invokevirtual 109	java/io/IOException:getMessage	()Ljava/lang/String;
    //   319: invokespecial 112	RT:<init>	(Ljava/lang/String;)V
    //   322: aload_1
    //   323: aload_0
    //   324: invokevirtual 115	RT:a	(LVT;)LRT;
    //   327: pop
    //   328: aload_2
    //   329: aload_1
    //   330: invokespecial 118	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   333: aload_2
    //   334: athrow
    //   335: astore_2
    //   336: new 105	java/lang/RuntimeException
    //   339: astore_1
    //   340: aload_2
    //   341: aload_0
    //   342: invokevirtual 115	RT:a	(LVT;)LRT;
    //   345: pop
    //   346: aload_1
    //   347: aload_2
    //   348: invokespecial 118	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   351: aload_1
    //   352: athrow
    //   353: aload_1
    //   354: athrow
    //   355: getstatic 28	qZ$b:d	LqZ$b;
    //   358: areturn
    //   359: aload_2
    //   360: checkcast 120	PT$j
    //   363: astore_1
    //   364: aload_3
    //   365: checkcast 2	qZ$b
    //   368: astore_2
    //   369: aload_0
    //   370: aload_1
    //   371: aload_0
    //   372: getfield 80	qZ$b:f	LmZ;
    //   375: aload_2
    //   376: getfield 80	qZ$b:f	LmZ;
    //   379: invokeinterface 123 3 0
    //   384: checkcast 88	mZ
    //   387: putfield 80	qZ$b:f	LmZ;
    //   390: aload_0
    //   391: aload_1
    //   392: aload_0
    //   393: getfield 103	qZ$b:g	LmZ;
    //   396: aload_2
    //   397: getfield 103	qZ$b:g	LmZ;
    //   400: invokeinterface 123 3 0
    //   405: checkcast 88	mZ
    //   408: putfield 103	qZ$b:g	LmZ;
    //   411: getstatic 128	PT$h:a	LPT$h;
    //   414: astore_1
    //   415: aload_0
    //   416: areturn
    //   417: new 12	qZ$b$a
    //   420: dup
    //   421: aconst_null
    //   422: invokespecial 131	qZ$b$a:<init>	(LQY;)V
    //   425: areturn
    //   426: aconst_null
    //   427: areturn
    //   428: getstatic 28	qZ$b:d	LqZ$b;
    //   431: areturn
    //   432: new 2	qZ$b
    //   435: dup
    //   436: invokespecial 26	qZ$b:<init>	()V
    //   439: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	440	0	this	b
    //   0	440	1	parami	PT.i
    //   0	440	2	paramObject1	Object
    //   0	440	3	paramObject2	Object
    //   121	176	4	i	int
    //   132	23	5	j	int
    // Exception table:
    //   from	to	target	type
    //   73	94	100	finally
    //   94	97	100	finally
    //   101	104	100	finally
    //   128	134	301	finally
    //   153	162	301	finally
    //   165	183	301	finally
    //   188	203	301	finally
    //   207	227	301	finally
    //   230	248	301	finally
    //   253	268	301	finally
    //   272	292	301	finally
    //   306	335	301	finally
    //   336	353	301	finally
    //   128	134	305	java/io/IOException
    //   153	162	305	java/io/IOException
    //   165	183	305	java/io/IOException
    //   188	203	305	java/io/IOException
    //   207	227	305	java/io/IOException
    //   230	248	305	java/io/IOException
    //   253	268	305	java/io/IOException
    //   272	292	305	java/io/IOException
    //   128	134	335	RT
    //   153	162	335	RT
    //   165	183	335	RT
    //   188	203	335	RT
    //   207	227	335	RT
    //   230	248	335	RT
    //   253	268	335	RT
    //   272	292	335	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    if (this.g != null) {
      paramJT.b(2, m());
    }
    if (this.f != null) {
      paramJT.b(3, l());
    }
  }
  
  public int d()
  {
    int i = this.c;
    if (i != -1) {
      return i;
    }
    i = 0;
    if (this.g != null) {
      i = 0 + JT.a(2, m());
    }
    int j = i;
    if (this.f != null) {
      j = i + JT.a(3, l());
    }
    this.c = j;
    return j;
  }
  
  public mZ l()
  {
    mZ localmZ1 = this.f;
    mZ localmZ2 = localmZ1;
    if (localmZ1 == null) {
      localmZ2 = mZ.k();
    }
    return localmZ2;
  }
  
  public mZ m()
  {
    mZ localmZ1 = this.g;
    mZ localmZ2 = localmZ1;
    if (localmZ1 == null) {
      localmZ2 = mZ.k();
    }
    return localmZ2;
  }
  
  public static final class a
    extends PT.a<qZ.b, a>
    implements qZ.c
  {
    private a()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qZ$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */