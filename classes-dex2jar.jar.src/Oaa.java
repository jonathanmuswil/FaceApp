import java.io.IOException;

public final class oaa
  extends PT<oaa, oaa.a>
  implements paa
{
  private static final oaa d = new oaa();
  private static volatile YT<oaa> e;
  private String f = "";
  private String g = "";
  private boolean h;
  private daa i;
  
  static
  {
    d.h();
  }
  
  public static oaa k()
  {
    return d;
  }
  
  public static YT<oaa> parser()
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
    //   8: tableswitch	default:+48->56, 1:+487->495, 2:+483->491, 3:+481->489, 4:+472->480, 5:+333->341, 6:+102->110, 7:+329->337, 8:+56->64
    //   56: new 66	java/lang/UnsupportedOperationException
    //   59: dup
    //   60: invokespecial 67	java/lang/UnsupportedOperationException:<init>	()V
    //   63: athrow
    //   64: getstatic 69	oaa:e	LYT;
    //   67: ifnonnull +39 -> 106
    //   70: ldc 2
    //   72: monitorenter
    //   73: getstatic 69	oaa:e	LYT;
    //   76: ifnonnull +18 -> 94
    //   79: new 71	PT$b
    //   82: astore_1
    //   83: aload_1
    //   84: getstatic 29	oaa:d	Loaa;
    //   87: invokespecial 74	PT$b:<init>	(LPT;)V
    //   90: aload_1
    //   91: putstatic 69	oaa:e	LYT;
    //   94: ldc 2
    //   96: monitorexit
    //   97: goto +9 -> 106
    //   100: astore_1
    //   101: ldc 2
    //   103: monitorexit
    //   104: aload_1
    //   105: athrow
    //   106: getstatic 69	oaa:e	LYT;
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
    //   125: ifne +212 -> 337
    //   128: aload_2
    //   129: invokevirtual 81	HT:n	()I
    //   132: istore 5
    //   134: iload 5
    //   136: ifeq +141 -> 277
    //   139: iload 5
    //   141: bipush 10
    //   143: if_icmpeq +123 -> 266
    //   146: iload 5
    //   148: bipush 18
    //   150: if_icmpeq +105 -> 255
    //   153: iload 5
    //   155: bipush 32
    //   157: if_icmpeq +87 -> 244
    //   160: iload 5
    //   162: bipush 50
    //   164: if_icmpeq +15 -> 179
    //   167: aload_2
    //   168: iload 5
    //   170: invokevirtual 84	HT:e	(I)Z
    //   173: ifne -50 -> 123
    //   176: goto +101 -> 277
    //   179: aload_0
    //   180: getfield 86	oaa:i	Ldaa;
    //   183: ifnull +17 -> 200
    //   186: aload_0
    //   187: getfield 86	oaa:i	Ldaa;
    //   190: invokevirtual 90	PT:c	()LPT$a;
    //   193: checkcast 92	daa$a
    //   196: astore_1
    //   197: goto +5 -> 202
    //   200: aconst_null
    //   201: astore_1
    //   202: aload_0
    //   203: aload_2
    //   204: invokestatic 96	daa:parser	()LYT;
    //   207: aload_3
    //   208: invokevirtual 99	HT:a	(LYT;LLT;)LVT;
    //   211: checkcast 94	daa
    //   214: putfield 86	oaa:i	Ldaa;
    //   217: aload_1
    //   218: ifnull -95 -> 123
    //   221: aload_1
    //   222: aload_0
    //   223: getfield 86	oaa:i	Ldaa;
    //   226: invokevirtual 105	PT$a:b	(LPT;)LPT$a;
    //   229: pop
    //   230: aload_0
    //   231: aload_1
    //   232: invokevirtual 108	PT$a:b	()LPT;
    //   235: checkcast 94	daa
    //   238: putfield 86	oaa:i	Ldaa;
    //   241: goto -118 -> 123
    //   244: aload_0
    //   245: aload_2
    //   246: invokevirtual 111	HT:b	()Z
    //   249: putfield 113	oaa:h	Z
    //   252: goto -129 -> 123
    //   255: aload_0
    //   256: aload_2
    //   257: invokevirtual 117	HT:m	()Ljava/lang/String;
    //   260: putfield 39	oaa:g	Ljava/lang/String;
    //   263: goto -140 -> 123
    //   266: aload_0
    //   267: aload_2
    //   268: invokevirtual 117	HT:m	()Ljava/lang/String;
    //   271: putfield 37	oaa:f	Ljava/lang/String;
    //   274: goto -151 -> 123
    //   277: iconst_1
    //   278: istore 4
    //   280: goto -157 -> 123
    //   283: astore_1
    //   284: goto +51 -> 335
    //   287: astore_2
    //   288: new 119	java/lang/RuntimeException
    //   291: astore_3
    //   292: new 51	RT
    //   295: astore_1
    //   296: aload_1
    //   297: aload_2
    //   298: invokevirtual 122	java/io/IOException:getMessage	()Ljava/lang/String;
    //   301: invokespecial 125	RT:<init>	(Ljava/lang/String;)V
    //   304: aload_1
    //   305: aload_0
    //   306: invokevirtual 128	RT:a	(LVT;)LRT;
    //   309: pop
    //   310: aload_3
    //   311: aload_1
    //   312: invokespecial 131	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   315: aload_3
    //   316: athrow
    //   317: astore_2
    //   318: new 119	java/lang/RuntimeException
    //   321: astore_1
    //   322: aload_2
    //   323: aload_0
    //   324: invokevirtual 128	RT:a	(LVT;)LRT;
    //   327: pop
    //   328: aload_1
    //   329: aload_2
    //   330: invokespecial 131	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   333: aload_1
    //   334: athrow
    //   335: aload_1
    //   336: athrow
    //   337: getstatic 29	oaa:d	Loaa;
    //   340: areturn
    //   341: aload_2
    //   342: checkcast 133	PT$j
    //   345: astore_1
    //   346: aload_3
    //   347: checkcast 2	oaa
    //   350: astore_2
    //   351: aload_0
    //   352: aload_1
    //   353: aload_0
    //   354: getfield 37	oaa:f	Ljava/lang/String;
    //   357: invokevirtual 138	java/lang/String:isEmpty	()Z
    //   360: iconst_1
    //   361: ixor
    //   362: aload_0
    //   363: getfield 37	oaa:f	Ljava/lang/String;
    //   366: aload_2
    //   367: getfield 37	oaa:f	Ljava/lang/String;
    //   370: invokevirtual 138	java/lang/String:isEmpty	()Z
    //   373: iconst_1
    //   374: ixor
    //   375: aload_2
    //   376: getfield 37	oaa:f	Ljava/lang/String;
    //   379: invokeinterface 141 5 0
    //   384: putfield 37	oaa:f	Ljava/lang/String;
    //   387: aload_0
    //   388: aload_1
    //   389: aload_0
    //   390: getfield 39	oaa:g	Ljava/lang/String;
    //   393: invokevirtual 138	java/lang/String:isEmpty	()Z
    //   396: iconst_1
    //   397: ixor
    //   398: aload_0
    //   399: getfield 39	oaa:g	Ljava/lang/String;
    //   402: iconst_1
    //   403: aload_2
    //   404: getfield 39	oaa:g	Ljava/lang/String;
    //   407: invokevirtual 138	java/lang/String:isEmpty	()Z
    //   410: ixor
    //   411: aload_2
    //   412: getfield 39	oaa:g	Ljava/lang/String;
    //   415: invokeinterface 141 5 0
    //   420: putfield 39	oaa:g	Ljava/lang/String;
    //   423: aload_0
    //   424: getfield 113	oaa:h	Z
    //   427: istore 6
    //   429: aload_2
    //   430: getfield 113	oaa:h	Z
    //   433: istore 7
    //   435: aload_0
    //   436: aload_1
    //   437: iload 6
    //   439: iload 6
    //   441: iload 7
    //   443: iload 7
    //   445: invokeinterface 144 5 0
    //   450: putfield 113	oaa:h	Z
    //   453: aload_0
    //   454: aload_1
    //   455: aload_0
    //   456: getfield 86	oaa:i	Ldaa;
    //   459: aload_2
    //   460: getfield 86	oaa:i	Ldaa;
    //   463: invokeinterface 147 3 0
    //   468: checkcast 94	daa
    //   471: putfield 86	oaa:i	Ldaa;
    //   474: getstatic 152	PT$h:a	LPT$h;
    //   477: astore_1
    //   478: aload_0
    //   479: areturn
    //   480: new 9	oaa$a
    //   483: dup
    //   484: aconst_null
    //   485: invokespecial 155	oaa$a:<init>	(LQY;)V
    //   488: areturn
    //   489: aconst_null
    //   490: areturn
    //   491: getstatic 29	oaa:d	Loaa;
    //   494: areturn
    //   495: new 2	oaa
    //   498: dup
    //   499: invokespecial 27	oaa:<init>	()V
    //   502: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	503	0	this	oaa
    //   0	503	1	parami	PT.i
    //   0	503	2	paramObject1	Object
    //   0	503	3	paramObject2	Object
    //   121	158	4	j	int
    //   132	37	5	k	int
    //   427	13	6	bool1	boolean
    //   433	11	7	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   73	94	100	finally
    //   94	97	100	finally
    //   101	104	100	finally
    //   128	134	283	finally
    //   167	176	283	finally
    //   179	197	283	finally
    //   202	217	283	finally
    //   221	241	283	finally
    //   244	252	283	finally
    //   255	263	283	finally
    //   266	274	283	finally
    //   288	317	283	finally
    //   318	335	283	finally
    //   128	134	287	java/io/IOException
    //   167	176	287	java/io/IOException
    //   179	197	287	java/io/IOException
    //   202	217	287	java/io/IOException
    //   221	241	287	java/io/IOException
    //   244	252	287	java/io/IOException
    //   255	263	287	java/io/IOException
    //   266	274	287	java/io/IOException
    //   128	134	317	RT
    //   167	176	317	RT
    //   179	197	317	RT
    //   202	217	317	RT
    //   221	241	317	RT
    //   244	252	317	RT
    //   255	263	317	RT
    //   266	274	317	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    if (!this.f.isEmpty()) {
      paramJT.b(1, l());
    }
    if (!this.g.isEmpty()) {
      paramJT.b(2, o());
    }
    boolean bool = this.h;
    if (bool) {
      paramJT.b(4, bool);
    }
    if (this.i != null) {
      paramJT.b(6, n());
    }
  }
  
  public int d()
  {
    int j = this.c;
    if (j != -1) {
      return j;
    }
    int k = 0;
    if (!this.f.isEmpty()) {
      k = 0 + JT.a(1, l());
    }
    j = k;
    if (!this.g.isEmpty()) {
      j = k + JT.a(2, o());
    }
    boolean bool = this.h;
    k = j;
    if (bool) {
      k = j + JT.a(4, bool);
    }
    j = k;
    if (this.i != null) {
      j = k + JT.a(6, n());
    }
    this.c = j;
    return j;
  }
  
  public String l()
  {
    return this.f;
  }
  
  public boolean m()
  {
    return this.h;
  }
  
  public daa n()
  {
    daa localdaa1 = this.i;
    daa localdaa2 = localdaa1;
    if (localdaa1 == null) {
      localdaa2 = daa.k();
    }
    return localdaa2;
  }
  
  public String o()
  {
    return this.g;
  }
  
  public boolean p()
  {
    boolean bool;
    if (this.i != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final class a
    extends PT.a<oaa, a>
    implements paa
  {
    private a()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */