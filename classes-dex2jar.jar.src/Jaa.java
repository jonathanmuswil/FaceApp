import java.io.IOException;

public final class jaa
  extends PT<jaa, jaa.a>
  implements kaa
{
  private static final jaa d = new jaa();
  private static volatile YT<jaa> e;
  private String f = "";
  private String g = "";
  private haa h;
  private YZ i;
  
  static
  {
    d.h();
  }
  
  public static jaa l()
  {
    return d;
  }
  
  public static YT<jaa> parser()
  {
    return d.e();
  }
  
  /* Error */
  protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: getstatic 58	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 64	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: tableswitch	default:+48->56, 1:+532->540, 2:+528->536, 3:+526->534, 4:+517->525, 5:+387->395, 6:+102->110, 7:+383->391, 8:+56->64
    //   56: new 66	java/lang/UnsupportedOperationException
    //   59: dup
    //   60: invokespecial 67	java/lang/UnsupportedOperationException:<init>	()V
    //   63: athrow
    //   64: getstatic 69	jaa:e	LYT;
    //   67: ifnonnull +39 -> 106
    //   70: ldc 2
    //   72: monitorenter
    //   73: getstatic 69	jaa:e	LYT;
    //   76: ifnonnull +18 -> 94
    //   79: new 71	PT$b
    //   82: astore_1
    //   83: aload_1
    //   84: getstatic 29	jaa:d	Ljaa;
    //   87: invokespecial 74	PT$b:<init>	(LPT;)V
    //   90: aload_1
    //   91: putstatic 69	jaa:e	LYT;
    //   94: ldc 2
    //   96: monitorexit
    //   97: goto +9 -> 106
    //   100: astore_1
    //   101: ldc 2
    //   103: monitorexit
    //   104: aload_1
    //   105: athrow
    //   106: getstatic 69	jaa:e	LYT;
    //   109: areturn
    //   110: aload_2
    //   111: checkcast 76	HT
    //   114: astore_2
    //   115: aload_3
    //   116: checkcast 78	LT
    //   119: astore_3
    //   120: iconst_0
    //   121: istore 4
    //   123: iload 4
    //   125: ifne +266 -> 391
    //   128: aload_2
    //   129: invokevirtual 81	HT:n	()I
    //   132: istore 5
    //   134: iload 5
    //   136: ifeq +195 -> 331
    //   139: iload 5
    //   141: bipush 10
    //   143: if_icmpeq +177 -> 320
    //   146: iload 5
    //   148: bipush 18
    //   150: if_icmpeq +159 -> 309
    //   153: iload 5
    //   155: bipush 26
    //   157: if_icmpeq +87 -> 244
    //   160: iload 5
    //   162: bipush 34
    //   164: if_icmpeq +15 -> 179
    //   167: aload_2
    //   168: iload 5
    //   170: invokevirtual 84	HT:e	(I)Z
    //   173: ifne -50 -> 123
    //   176: goto +155 -> 331
    //   179: aload_0
    //   180: getfield 86	jaa:i	LYZ;
    //   183: ifnull +17 -> 200
    //   186: aload_0
    //   187: getfield 86	jaa:i	LYZ;
    //   190: invokevirtual 90	PT:c	()LPT$a;
    //   193: checkcast 92	YZ$a
    //   196: astore_1
    //   197: goto +5 -> 202
    //   200: aconst_null
    //   201: astore_1
    //   202: aload_0
    //   203: aload_2
    //   204: invokestatic 96	YZ:parser	()LYT;
    //   207: aload_3
    //   208: invokevirtual 99	HT:a	(LYT;LLT;)LVT;
    //   211: checkcast 94	YZ
    //   214: putfield 86	jaa:i	LYZ;
    //   217: aload_1
    //   218: ifnull -95 -> 123
    //   221: aload_1
    //   222: aload_0
    //   223: getfield 86	jaa:i	LYZ;
    //   226: invokevirtual 105	PT$a:b	(LPT;)LPT$a;
    //   229: pop
    //   230: aload_0
    //   231: aload_1
    //   232: invokevirtual 108	PT$a:b	()LPT;
    //   235: checkcast 94	YZ
    //   238: putfield 86	jaa:i	LYZ;
    //   241: goto -118 -> 123
    //   244: aload_0
    //   245: getfield 110	jaa:h	Lhaa;
    //   248: ifnull +17 -> 265
    //   251: aload_0
    //   252: getfield 110	jaa:h	Lhaa;
    //   255: invokevirtual 90	PT:c	()LPT$a;
    //   258: checkcast 112	haa$a
    //   261: astore_1
    //   262: goto +5 -> 267
    //   265: aconst_null
    //   266: astore_1
    //   267: aload_0
    //   268: aload_2
    //   269: invokestatic 115	haa:parser	()LYT;
    //   272: aload_3
    //   273: invokevirtual 99	HT:a	(LYT;LLT;)LVT;
    //   276: checkcast 114	haa
    //   279: putfield 110	jaa:h	Lhaa;
    //   282: aload_1
    //   283: ifnull -160 -> 123
    //   286: aload_1
    //   287: aload_0
    //   288: getfield 110	jaa:h	Lhaa;
    //   291: invokevirtual 105	PT$a:b	(LPT;)LPT$a;
    //   294: pop
    //   295: aload_0
    //   296: aload_1
    //   297: invokevirtual 108	PT$a:b	()LPT;
    //   300: checkcast 114	haa
    //   303: putfield 110	jaa:h	Lhaa;
    //   306: goto -183 -> 123
    //   309: aload_0
    //   310: aload_2
    //   311: invokevirtual 119	HT:m	()Ljava/lang/String;
    //   314: putfield 39	jaa:g	Ljava/lang/String;
    //   317: goto -194 -> 123
    //   320: aload_0
    //   321: aload_2
    //   322: invokevirtual 119	HT:m	()Ljava/lang/String;
    //   325: putfield 37	jaa:f	Ljava/lang/String;
    //   328: goto -205 -> 123
    //   331: iconst_1
    //   332: istore 4
    //   334: goto -211 -> 123
    //   337: astore_1
    //   338: goto +51 -> 389
    //   341: astore_1
    //   342: new 121	java/lang/RuntimeException
    //   345: astore_3
    //   346: new 51	RT
    //   349: astore_2
    //   350: aload_2
    //   351: aload_1
    //   352: invokevirtual 124	java/io/IOException:getMessage	()Ljava/lang/String;
    //   355: invokespecial 127	RT:<init>	(Ljava/lang/String;)V
    //   358: aload_2
    //   359: aload_0
    //   360: invokevirtual 130	RT:a	(LVT;)LRT;
    //   363: pop
    //   364: aload_3
    //   365: aload_2
    //   366: invokespecial 133	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   369: aload_3
    //   370: athrow
    //   371: astore_1
    //   372: new 121	java/lang/RuntimeException
    //   375: astore_2
    //   376: aload_1
    //   377: aload_0
    //   378: invokevirtual 130	RT:a	(LVT;)LRT;
    //   381: pop
    //   382: aload_2
    //   383: aload_1
    //   384: invokespecial 133	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   387: aload_2
    //   388: athrow
    //   389: aload_1
    //   390: athrow
    //   391: getstatic 29	jaa:d	Ljaa;
    //   394: areturn
    //   395: aload_2
    //   396: checkcast 135	PT$j
    //   399: astore_1
    //   400: aload_3
    //   401: checkcast 2	jaa
    //   404: astore_2
    //   405: aload_0
    //   406: aload_1
    //   407: aload_0
    //   408: getfield 37	jaa:f	Ljava/lang/String;
    //   411: invokevirtual 141	java/lang/String:isEmpty	()Z
    //   414: iconst_1
    //   415: ixor
    //   416: aload_0
    //   417: getfield 37	jaa:f	Ljava/lang/String;
    //   420: aload_2
    //   421: getfield 37	jaa:f	Ljava/lang/String;
    //   424: invokevirtual 141	java/lang/String:isEmpty	()Z
    //   427: iconst_1
    //   428: ixor
    //   429: aload_2
    //   430: getfield 37	jaa:f	Ljava/lang/String;
    //   433: invokeinterface 144 5 0
    //   438: putfield 37	jaa:f	Ljava/lang/String;
    //   441: aload_0
    //   442: aload_1
    //   443: aload_0
    //   444: getfield 39	jaa:g	Ljava/lang/String;
    //   447: invokevirtual 141	java/lang/String:isEmpty	()Z
    //   450: iconst_1
    //   451: ixor
    //   452: aload_0
    //   453: getfield 39	jaa:g	Ljava/lang/String;
    //   456: iconst_1
    //   457: aload_2
    //   458: getfield 39	jaa:g	Ljava/lang/String;
    //   461: invokevirtual 141	java/lang/String:isEmpty	()Z
    //   464: ixor
    //   465: aload_2
    //   466: getfield 39	jaa:g	Ljava/lang/String;
    //   469: invokeinterface 144 5 0
    //   474: putfield 39	jaa:g	Ljava/lang/String;
    //   477: aload_0
    //   478: aload_1
    //   479: aload_0
    //   480: getfield 110	jaa:h	Lhaa;
    //   483: aload_2
    //   484: getfield 110	jaa:h	Lhaa;
    //   487: invokeinterface 147 3 0
    //   492: checkcast 114	haa
    //   495: putfield 110	jaa:h	Lhaa;
    //   498: aload_0
    //   499: aload_1
    //   500: aload_0
    //   501: getfield 86	jaa:i	LYZ;
    //   504: aload_2
    //   505: getfield 86	jaa:i	LYZ;
    //   508: invokeinterface 147 3 0
    //   513: checkcast 94	YZ
    //   516: putfield 86	jaa:i	LYZ;
    //   519: getstatic 152	PT$h:a	LPT$h;
    //   522: astore_1
    //   523: aload_0
    //   524: areturn
    //   525: new 9	jaa$a
    //   528: dup
    //   529: aconst_null
    //   530: invokespecial 155	jaa$a:<init>	(LQY;)V
    //   533: areturn
    //   534: aconst_null
    //   535: areturn
    //   536: getstatic 29	jaa:d	Ljaa;
    //   539: areturn
    //   540: new 2	jaa
    //   543: dup
    //   544: invokespecial 27	jaa:<init>	()V
    //   547: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	548	0	this	jaa
    //   0	548	1	parami	PT.i
    //   0	548	2	paramObject1	Object
    //   0	548	3	paramObject2	Object
    //   121	212	4	j	int
    //   132	37	5	k	int
    // Exception table:
    //   from	to	target	type
    //   73	94	100	finally
    //   94	97	100	finally
    //   101	104	100	finally
    //   128	134	337	finally
    //   167	176	337	finally
    //   179	197	337	finally
    //   202	217	337	finally
    //   221	241	337	finally
    //   244	262	337	finally
    //   267	282	337	finally
    //   286	306	337	finally
    //   309	317	337	finally
    //   320	328	337	finally
    //   342	371	337	finally
    //   372	389	337	finally
    //   128	134	341	java/io/IOException
    //   167	176	341	java/io/IOException
    //   179	197	341	java/io/IOException
    //   202	217	341	java/io/IOException
    //   221	241	341	java/io/IOException
    //   244	262	341	java/io/IOException
    //   267	282	341	java/io/IOException
    //   286	306	341	java/io/IOException
    //   309	317	341	java/io/IOException
    //   320	328	341	java/io/IOException
    //   128	134	371	RT
    //   167	176	371	RT
    //   179	197	371	RT
    //   202	217	371	RT
    //   221	241	371	RT
    //   244	262	371	RT
    //   267	282	371	RT
    //   286	306	371	RT
    //   309	317	371	RT
    //   320	328	371	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    if (!this.f.isEmpty()) {
      paramJT.b(1, m());
    }
    if (!this.g.isEmpty()) {
      paramJT.b(2, k());
    }
    if (this.h != null) {
      paramJT.b(3, o());
    }
    if (this.i != null) {
      paramJT.b(4, n());
    }
  }
  
  public int d()
  {
    int j = this.c;
    if (j != -1) {
      return j;
    }
    j = 0;
    if (!this.f.isEmpty()) {
      j = 0 + JT.a(1, m());
    }
    int k = j;
    if (!this.g.isEmpty()) {
      k = j + JT.a(2, k());
    }
    j = k;
    if (this.h != null) {
      j = k + JT.a(3, o());
    }
    k = j;
    if (this.i != null) {
      k = j + JT.a(4, n());
    }
    this.c = k;
    return k;
  }
  
  public String k()
  {
    return this.g;
  }
  
  public String m()
  {
    return this.f;
  }
  
  public YZ n()
  {
    YZ localYZ1 = this.i;
    YZ localYZ2 = localYZ1;
    if (localYZ1 == null) {
      localYZ2 = YZ.k();
    }
    return localYZ2;
  }
  
  public haa o()
  {
    haa localhaa1 = this.h;
    haa localhaa2 = localhaa1;
    if (localhaa1 == null) {
      localhaa2 = haa.l();
    }
    return localhaa2;
  }
  
  public static final class a
    extends PT.a<jaa, a>
    implements kaa
  {
    private a()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */