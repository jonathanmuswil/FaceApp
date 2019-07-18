import java.io.IOException;

public final class taa
  extends PT<taa, taa.a>
  implements uaa
{
  private static final taa d = new taa();
  private static volatile YT<taa> e;
  private int f;
  private int g;
  private int h;
  
  static
  {
    d.h();
  }
  
  public static YT<taa> parser()
  {
    return d.e();
  }
  
  /* Error */
  protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: getstatic 48	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 54	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: istore 4
    //   10: iconst_0
    //   11: istore 5
    //   13: iconst_0
    //   14: istore 6
    //   16: iload 4
    //   18: tableswitch	default:+46->64, 1:+459->477, 2:+455->473, 3:+453->471, 4:+444->462, 5:+256->274, 6:+100->118, 7:+252->270, 8:+54->72
    //   64: new 56	java/lang/UnsupportedOperationException
    //   67: dup
    //   68: invokespecial 57	java/lang/UnsupportedOperationException:<init>	()V
    //   71: athrow
    //   72: getstatic 59	taa:e	LYT;
    //   75: ifnonnull +39 -> 114
    //   78: ldc 2
    //   80: monitorenter
    //   81: getstatic 59	taa:e	LYT;
    //   84: ifnonnull +18 -> 102
    //   87: new 61	PT$b
    //   90: astore_1
    //   91: aload_1
    //   92: getstatic 26	taa:d	Ltaa;
    //   95: invokespecial 64	PT$b:<init>	(LPT;)V
    //   98: aload_1
    //   99: putstatic 59	taa:e	LYT;
    //   102: ldc 2
    //   104: monitorexit
    //   105: goto +9 -> 114
    //   108: astore_1
    //   109: ldc 2
    //   111: monitorexit
    //   112: aload_1
    //   113: athrow
    //   114: getstatic 59	taa:e	LYT;
    //   117: areturn
    //   118: aload_2
    //   119: checkcast 66	HT
    //   122: astore_1
    //   123: aload_3
    //   124: checkcast 68	LT
    //   127: astore_2
    //   128: iload 6
    //   130: ifne +140 -> 270
    //   133: aload_1
    //   134: invokevirtual 71	HT:n	()I
    //   137: istore 4
    //   139: iload 4
    //   141: ifeq +69 -> 210
    //   144: iload 4
    //   146: bipush 8
    //   148: if_icmpeq +51 -> 199
    //   151: iload 4
    //   153: bipush 16
    //   155: if_icmpeq +33 -> 188
    //   158: iload 4
    //   160: bipush 24
    //   162: if_icmpeq +15 -> 177
    //   165: aload_1
    //   166: iload 4
    //   168: invokevirtual 74	HT:e	(I)Z
    //   171: ifne -43 -> 128
    //   174: goto +36 -> 210
    //   177: aload_0
    //   178: aload_1
    //   179: invokevirtual 77	HT:o	()I
    //   182: putfield 79	taa:h	I
    //   185: goto -57 -> 128
    //   188: aload_0
    //   189: aload_1
    //   190: invokevirtual 77	HT:o	()I
    //   193: putfield 81	taa:g	I
    //   196: goto -68 -> 128
    //   199: aload_0
    //   200: aload_1
    //   201: invokevirtual 77	HT:o	()I
    //   204: putfield 83	taa:f	I
    //   207: goto -79 -> 128
    //   210: iconst_1
    //   211: istore 6
    //   213: goto -85 -> 128
    //   216: astore_1
    //   217: goto +51 -> 268
    //   220: astore_2
    //   221: new 85	java/lang/RuntimeException
    //   224: astore_1
    //   225: new 41	RT
    //   228: astore_3
    //   229: aload_3
    //   230: aload_2
    //   231: invokevirtual 89	java/io/IOException:getMessage	()Ljava/lang/String;
    //   234: invokespecial 92	RT:<init>	(Ljava/lang/String;)V
    //   237: aload_3
    //   238: aload_0
    //   239: invokevirtual 95	RT:a	(LVT;)LRT;
    //   242: pop
    //   243: aload_1
    //   244: aload_3
    //   245: invokespecial 98	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   248: aload_1
    //   249: athrow
    //   250: astore_1
    //   251: new 85	java/lang/RuntimeException
    //   254: astore_2
    //   255: aload_1
    //   256: aload_0
    //   257: invokevirtual 95	RT:a	(LVT;)LRT;
    //   260: pop
    //   261: aload_2
    //   262: aload_1
    //   263: invokespecial 98	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   266: aload_2
    //   267: athrow
    //   268: aload_1
    //   269: athrow
    //   270: getstatic 26	taa:d	Ltaa;
    //   273: areturn
    //   274: aload_2
    //   275: checkcast 100	PT$j
    //   278: astore_1
    //   279: aload_3
    //   280: checkcast 2	taa
    //   283: astore_2
    //   284: aload_0
    //   285: getfield 83	taa:f	I
    //   288: ifeq +9 -> 297
    //   291: iconst_1
    //   292: istore 7
    //   294: goto +6 -> 300
    //   297: iconst_0
    //   298: istore 7
    //   300: aload_0
    //   301: getfield 83	taa:f	I
    //   304: istore 6
    //   306: aload_2
    //   307: getfield 83	taa:f	I
    //   310: ifeq +9 -> 319
    //   313: iconst_1
    //   314: istore 8
    //   316: goto +6 -> 322
    //   319: iconst_0
    //   320: istore 8
    //   322: aload_0
    //   323: aload_1
    //   324: iload 7
    //   326: iload 6
    //   328: iload 8
    //   330: aload_2
    //   331: getfield 83	taa:f	I
    //   334: invokeinterface 103 5 0
    //   339: putfield 83	taa:f	I
    //   342: aload_0
    //   343: getfield 81	taa:g	I
    //   346: ifeq +9 -> 355
    //   349: iconst_1
    //   350: istore 7
    //   352: goto +6 -> 358
    //   355: iconst_0
    //   356: istore 7
    //   358: aload_0
    //   359: getfield 81	taa:g	I
    //   362: istore 6
    //   364: aload_2
    //   365: getfield 81	taa:g	I
    //   368: ifeq +9 -> 377
    //   371: iconst_1
    //   372: istore 8
    //   374: goto +6 -> 380
    //   377: iconst_0
    //   378: istore 8
    //   380: aload_0
    //   381: aload_1
    //   382: iload 7
    //   384: iload 6
    //   386: iload 8
    //   388: aload_2
    //   389: getfield 81	taa:g	I
    //   392: invokeinterface 103 5 0
    //   397: putfield 81	taa:g	I
    //   400: aload_0
    //   401: getfield 79	taa:h	I
    //   404: ifeq +9 -> 413
    //   407: iconst_1
    //   408: istore 7
    //   410: goto +6 -> 416
    //   413: iconst_0
    //   414: istore 7
    //   416: aload_0
    //   417: getfield 79	taa:h	I
    //   420: istore 6
    //   422: iload 5
    //   424: istore 8
    //   426: aload_2
    //   427: getfield 79	taa:h	I
    //   430: ifeq +6 -> 436
    //   433: iconst_1
    //   434: istore 8
    //   436: aload_0
    //   437: aload_1
    //   438: iload 7
    //   440: iload 6
    //   442: iload 8
    //   444: aload_2
    //   445: getfield 79	taa:h	I
    //   448: invokeinterface 103 5 0
    //   453: putfield 79	taa:h	I
    //   456: getstatic 108	PT$h:a	LPT$h;
    //   459: astore_1
    //   460: aload_0
    //   461: areturn
    //   462: new 9	taa$a
    //   465: dup
    //   466: aconst_null
    //   467: invokespecial 111	taa$a:<init>	(LQY;)V
    //   470: areturn
    //   471: aconst_null
    //   472: areturn
    //   473: getstatic 26	taa:d	Ltaa;
    //   476: areturn
    //   477: new 2	taa
    //   480: dup
    //   481: invokespecial 24	taa:<init>	()V
    //   484: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	485	0	this	taa
    //   0	485	1	parami	PT.i
    //   0	485	2	paramObject1	Object
    //   0	485	3	paramObject2	Object
    //   8	159	4	i	int
    //   11	412	5	bool1	boolean
    //   14	427	6	j	int
    //   292	147	7	bool2	boolean
    //   314	129	8	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   81	102	108	finally
    //   102	105	108	finally
    //   109	112	108	finally
    //   133	139	216	finally
    //   165	174	216	finally
    //   177	185	216	finally
    //   188	196	216	finally
    //   199	207	216	finally
    //   221	250	216	finally
    //   251	268	216	finally
    //   133	139	220	java/io/IOException
    //   165	174	220	java/io/IOException
    //   177	185	220	java/io/IOException
    //   188	196	220	java/io/IOException
    //   199	207	220	java/io/IOException
    //   133	139	250	RT
    //   165	174	250	RT
    //   177	185	250	RT
    //   188	196	250	RT
    //   199	207	250	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    int i = this.f;
    if (i != 0) {
      paramJT.i(1, i);
    }
    i = this.g;
    if (i != 0) {
      paramJT.i(2, i);
    }
    i = this.h;
    if (i != 0) {
      paramJT.i(3, i);
    }
  }
  
  public int d()
  {
    int i = this.c;
    if (i != -1) {
      return i;
    }
    int j = 0;
    i = this.f;
    if (i != 0) {
      j = 0 + JT.d(1, i);
    }
    int k = this.g;
    i = j;
    if (k != 0) {
      i = j + JT.d(2, k);
    }
    k = this.h;
    j = i;
    if (k != 0) {
      j = i + JT.d(3, k);
    }
    this.c = j;
    return j;
  }
  
  public int k()
  {
    return this.f;
  }
  
  public int l()
  {
    return this.g;
  }
  
  public int m()
  {
    return this.h;
  }
  
  public static final class a
    extends PT.a<taa, a>
    implements uaa
  {
    private a()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/taa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */