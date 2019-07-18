import java.io.IOException;

public final class Faa$d$d
  extends PT<d, Faa.d.d.a>
  implements Faa.d.e
{
  private static final d d = new d();
  private static volatile YT<d> e;
  private oZ f;
  
  static
  {
    d.h();
  }
  
  private void a(oZ paramoZ)
  {
    if (paramoZ != null)
    {
      this.f = paramoZ;
      return;
    }
    throw new NullPointerException();
  }
  
  public static Faa.d.d.a l()
  {
    return (Faa.d.d.a)d.c();
  }
  
  public static YT<d> parser()
  {
    return d.e();
  }
  
  /* Error */
  protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: getstatic 66	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 72	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: tableswitch	default:+48->56, 1:+331->339, 2:+327->335, 3:+325->333, 4:+316->324, 5:+279->287, 6:+102->110, 7:+275->283, 8:+56->64
    //   56: new 74	java/lang/UnsupportedOperationException
    //   59: dup
    //   60: invokespecial 75	java/lang/UnsupportedOperationException:<init>	()V
    //   63: athrow
    //   64: getstatic 77	Faa$d$d:e	LYT;
    //   67: ifnonnull +39 -> 106
    //   70: ldc 2
    //   72: monitorenter
    //   73: getstatic 77	Faa$d$d:e	LYT;
    //   76: ifnonnull +18 -> 94
    //   79: new 79	PT$b
    //   82: astore_1
    //   83: aload_1
    //   84: getstatic 28	Faa$d$d:d	LFaa$d$d;
    //   87: invokespecial 82	PT$b:<init>	(LPT;)V
    //   90: aload_1
    //   91: putstatic 77	Faa$d$d:e	LYT;
    //   94: ldc 2
    //   96: monitorexit
    //   97: goto +9 -> 106
    //   100: astore_1
    //   101: ldc 2
    //   103: monitorexit
    //   104: aload_1
    //   105: athrow
    //   106: getstatic 77	Faa$d$d:e	LYT;
    //   109: areturn
    //   110: aload_2
    //   111: checkcast 84	HT
    //   114: astore_2
    //   115: aload_3
    //   116: checkcast 86	LT
    //   119: astore_3
    //   120: iconst_0
    //   121: istore 4
    //   123: iload 4
    //   125: ifne +158 -> 283
    //   128: aload_2
    //   129: invokevirtual 89	HT:n	()I
    //   132: istore 5
    //   134: iload 5
    //   136: ifeq +87 -> 223
    //   139: iload 5
    //   141: bipush 10
    //   143: if_icmpeq +15 -> 158
    //   146: aload_2
    //   147: iload 5
    //   149: invokevirtual 92	HT:e	(I)Z
    //   152: ifne -29 -> 123
    //   155: goto +68 -> 223
    //   158: aload_0
    //   159: getfield 39	Faa$d$d:f	LoZ;
    //   162: ifnull +17 -> 179
    //   165: aload_0
    //   166: getfield 39	Faa$d$d:f	LoZ;
    //   169: invokevirtual 50	PT:c	()LPT$a;
    //   172: checkcast 94	oZ$a
    //   175: astore_1
    //   176: goto +5 -> 181
    //   179: aconst_null
    //   180: astore_1
    //   181: aload_0
    //   182: aload_2
    //   183: invokestatic 98	oZ:parser	()LYT;
    //   186: aload_3
    //   187: invokevirtual 101	HT:a	(LYT;LLT;)LVT;
    //   190: checkcast 96	oZ
    //   193: putfield 39	Faa$d$d:f	LoZ;
    //   196: aload_1
    //   197: ifnull -74 -> 123
    //   200: aload_1
    //   201: aload_0
    //   202: getfield 39	Faa$d$d:f	LoZ;
    //   205: invokevirtual 107	PT$a:b	(LPT;)LPT$a;
    //   208: pop
    //   209: aload_0
    //   210: aload_1
    //   211: invokevirtual 110	PT$a:b	()LPT;
    //   214: checkcast 96	oZ
    //   217: putfield 39	Faa$d$d:f	LoZ;
    //   220: goto -97 -> 123
    //   223: iconst_1
    //   224: istore 4
    //   226: goto -103 -> 123
    //   229: astore_1
    //   230: goto +51 -> 281
    //   233: astore_3
    //   234: new 112	java/lang/RuntimeException
    //   237: astore_2
    //   238: new 59	RT
    //   241: astore_1
    //   242: aload_1
    //   243: aload_3
    //   244: invokevirtual 116	java/io/IOException:getMessage	()Ljava/lang/String;
    //   247: invokespecial 119	RT:<init>	(Ljava/lang/String;)V
    //   250: aload_1
    //   251: aload_0
    //   252: invokevirtual 122	RT:a	(LVT;)LRT;
    //   255: pop
    //   256: aload_2
    //   257: aload_1
    //   258: invokespecial 125	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   261: aload_2
    //   262: athrow
    //   263: astore_1
    //   264: new 112	java/lang/RuntimeException
    //   267: astore_2
    //   268: aload_1
    //   269: aload_0
    //   270: invokevirtual 122	RT:a	(LVT;)LRT;
    //   273: pop
    //   274: aload_2
    //   275: aload_1
    //   276: invokespecial 125	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   279: aload_2
    //   280: athrow
    //   281: aload_1
    //   282: athrow
    //   283: getstatic 28	Faa$d$d:d	LFaa$d$d;
    //   286: areturn
    //   287: aload_2
    //   288: checkcast 127	PT$j
    //   291: astore_1
    //   292: aload_3
    //   293: checkcast 2	Faa$d$d
    //   296: astore_2
    //   297: aload_0
    //   298: aload_1
    //   299: aload_0
    //   300: getfield 39	Faa$d$d:f	LoZ;
    //   303: aload_2
    //   304: getfield 39	Faa$d$d:f	LoZ;
    //   307: invokeinterface 130 3 0
    //   312: checkcast 96	oZ
    //   315: putfield 39	Faa$d$d:f	LoZ;
    //   318: getstatic 135	PT$h:a	LPT$h;
    //   321: astore_1
    //   322: aload_0
    //   323: areturn
    //   324: new 14	Faa$d$d$a
    //   327: dup
    //   328: aconst_null
    //   329: invokespecial 138	Faa$d$d$a:<init>	(LQY;)V
    //   332: areturn
    //   333: aconst_null
    //   334: areturn
    //   335: getstatic 28	Faa$d$d:d	LFaa$d$d;
    //   338: areturn
    //   339: new 2	Faa$d$d
    //   342: dup
    //   343: invokespecial 26	Faa$d$d:<init>	()V
    //   346: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	347	0	this	d
    //   0	347	1	parami	PT.i
    //   0	347	2	paramObject1	Object
    //   0	347	3	paramObject2	Object
    //   121	104	4	i	int
    //   132	16	5	j	int
    // Exception table:
    //   from	to	target	type
    //   73	94	100	finally
    //   94	97	100	finally
    //   101	104	100	finally
    //   128	134	229	finally
    //   146	155	229	finally
    //   158	176	229	finally
    //   181	196	229	finally
    //   200	220	229	finally
    //   234	263	229	finally
    //   264	281	229	finally
    //   128	134	233	java/io/IOException
    //   146	155	233	java/io/IOException
    //   158	176	233	java/io/IOException
    //   181	196	233	java/io/IOException
    //   200	220	233	java/io/IOException
    //   128	134	263	RT
    //   146	155	263	RT
    //   158	176	263	RT
    //   181	196	263	RT
    //   200	220	263	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    if (this.f != null) {
      paramJT.b(1, k());
    }
  }
  
  public int d()
  {
    int i = this.c;
    if (i != -1) {
      return i;
    }
    i = 0;
    if (this.f != null) {
      i = 0 + JT.a(1, k());
    }
    this.c = i;
    return i;
  }
  
  public oZ k()
  {
    oZ localoZ1 = this.f;
    oZ localoZ2 = localoZ1;
    if (localoZ1 == null) {
      localoZ2 = oZ.l();
    }
    return localoZ2;
  }
  
  public static final class a
    extends PT.a<Faa.d.d, a>
    implements Faa.d.e
  {
    private a()
    {
      super();
    }
    
    public a a(oZ paramoZ)
    {
      c();
      Faa.d.d.a((Faa.d.d)this.b, paramoZ);
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Faa$d$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */