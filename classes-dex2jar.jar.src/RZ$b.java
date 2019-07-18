import java.io.IOException;

public final class rZ$b
  extends PT<b, rZ.b.a>
  implements rZ.c
{
  private static final b d = new b();
  private static volatile YT<b> e;
  private int f;
  private mZ g;
  private int h;
  
  static
  {
    d.h();
  }
  
  public static YT<b> parser()
  {
    return d.e();
  }
  
  /* Error */
  protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: getstatic 56	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 62	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: istore 4
    //   10: iconst_0
    //   11: istore 5
    //   13: iconst_0
    //   14: istore 6
    //   16: iload 4
    //   18: tableswitch	default:+46->64, 1:+476->494, 2:+472->490, 3:+470->488, 4:+461->479, 5:+310->328, 6:+100->118, 7:+306->324, 8:+54->72
    //   64: new 64	java/lang/UnsupportedOperationException
    //   67: dup
    //   68: invokespecial 65	java/lang/UnsupportedOperationException:<init>	()V
    //   71: athrow
    //   72: getstatic 67	rZ$b:e	LYT;
    //   75: ifnonnull +39 -> 114
    //   78: ldc 2
    //   80: monitorenter
    //   81: getstatic 67	rZ$b:e	LYT;
    //   84: ifnonnull +18 -> 102
    //   87: new 69	PT$b
    //   90: astore_1
    //   91: aload_1
    //   92: getstatic 34	rZ$b:d	LrZ$b;
    //   95: invokespecial 72	PT$b:<init>	(LPT;)V
    //   98: aload_1
    //   99: putstatic 67	rZ$b:e	LYT;
    //   102: ldc 2
    //   104: monitorexit
    //   105: goto +9 -> 114
    //   108: astore_1
    //   109: ldc 2
    //   111: monitorexit
    //   112: aload_1
    //   113: athrow
    //   114: getstatic 67	rZ$b:e	LYT;
    //   117: areturn
    //   118: aload_2
    //   119: checkcast 74	HT
    //   122: astore_2
    //   123: aload_3
    //   124: checkcast 76	LT
    //   127: astore_3
    //   128: iload 6
    //   130: ifne +194 -> 324
    //   133: aload_2
    //   134: invokevirtual 79	HT:n	()I
    //   137: istore 4
    //   139: iload 4
    //   141: ifeq +123 -> 264
    //   144: iload 4
    //   146: bipush 8
    //   148: if_icmpeq +105 -> 253
    //   151: iload 4
    //   153: bipush 18
    //   155: if_icmpeq +33 -> 188
    //   158: iload 4
    //   160: bipush 24
    //   162: if_icmpeq +15 -> 177
    //   165: aload_2
    //   166: iload 4
    //   168: invokevirtual 82	HT:e	(I)Z
    //   171: ifne -43 -> 128
    //   174: goto +90 -> 264
    //   177: aload_0
    //   178: aload_2
    //   179: invokevirtual 84	HT:d	()I
    //   182: putfield 86	rZ$b:h	I
    //   185: goto -57 -> 128
    //   188: aload_0
    //   189: getfield 88	rZ$b:g	LmZ;
    //   192: ifnull +17 -> 209
    //   195: aload_0
    //   196: getfield 88	rZ$b:g	LmZ;
    //   199: invokevirtual 92	PT:c	()LPT$a;
    //   202: checkcast 94	mZ$a
    //   205: astore_1
    //   206: goto +5 -> 211
    //   209: aconst_null
    //   210: astore_1
    //   211: aload_0
    //   212: aload_2
    //   213: invokestatic 98	mZ:parser	()LYT;
    //   216: aload_3
    //   217: invokevirtual 101	HT:a	(LYT;LLT;)LVT;
    //   220: checkcast 96	mZ
    //   223: putfield 88	rZ$b:g	LmZ;
    //   226: aload_1
    //   227: ifnull -99 -> 128
    //   230: aload_1
    //   231: aload_0
    //   232: getfield 88	rZ$b:g	LmZ;
    //   235: invokevirtual 106	PT$a:b	(LPT;)LPT$a;
    //   238: pop
    //   239: aload_0
    //   240: aload_1
    //   241: invokevirtual 109	PT$a:b	()LPT;
    //   244: checkcast 96	mZ
    //   247: putfield 88	rZ$b:g	LmZ;
    //   250: goto -122 -> 128
    //   253: aload_0
    //   254: aload_2
    //   255: invokevirtual 112	HT:o	()I
    //   258: putfield 114	rZ$b:f	I
    //   261: goto -133 -> 128
    //   264: iconst_1
    //   265: istore 6
    //   267: goto -139 -> 128
    //   270: astore_1
    //   271: goto +51 -> 322
    //   274: astore_2
    //   275: new 116	java/lang/RuntimeException
    //   278: astore_3
    //   279: new 49	RT
    //   282: astore_1
    //   283: aload_1
    //   284: aload_2
    //   285: invokevirtual 120	java/io/IOException:getMessage	()Ljava/lang/String;
    //   288: invokespecial 123	RT:<init>	(Ljava/lang/String;)V
    //   291: aload_1
    //   292: aload_0
    //   293: invokevirtual 126	RT:a	(LVT;)LRT;
    //   296: pop
    //   297: aload_3
    //   298: aload_1
    //   299: invokespecial 129	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   302: aload_3
    //   303: athrow
    //   304: astore_2
    //   305: new 116	java/lang/RuntimeException
    //   308: astore_1
    //   309: aload_2
    //   310: aload_0
    //   311: invokevirtual 126	RT:a	(LVT;)LRT;
    //   314: pop
    //   315: aload_1
    //   316: aload_2
    //   317: invokespecial 129	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   320: aload_1
    //   321: athrow
    //   322: aload_1
    //   323: athrow
    //   324: getstatic 34	rZ$b:d	LrZ$b;
    //   327: areturn
    //   328: aload_2
    //   329: checkcast 131	PT$j
    //   332: astore_1
    //   333: aload_3
    //   334: checkcast 2	rZ$b
    //   337: astore_2
    //   338: aload_0
    //   339: getfield 114	rZ$b:f	I
    //   342: ifeq +9 -> 351
    //   345: iconst_1
    //   346: istore 7
    //   348: goto +6 -> 354
    //   351: iconst_0
    //   352: istore 7
    //   354: aload_0
    //   355: getfield 114	rZ$b:f	I
    //   358: istore 6
    //   360: aload_2
    //   361: getfield 114	rZ$b:f	I
    //   364: ifeq +9 -> 373
    //   367: iconst_1
    //   368: istore 8
    //   370: goto +6 -> 376
    //   373: iconst_0
    //   374: istore 8
    //   376: aload_0
    //   377: aload_1
    //   378: iload 7
    //   380: iload 6
    //   382: iload 8
    //   384: aload_2
    //   385: getfield 114	rZ$b:f	I
    //   388: invokeinterface 134 5 0
    //   393: putfield 114	rZ$b:f	I
    //   396: aload_0
    //   397: aload_1
    //   398: aload_0
    //   399: getfield 88	rZ$b:g	LmZ;
    //   402: aload_2
    //   403: getfield 88	rZ$b:g	LmZ;
    //   406: invokeinterface 137 3 0
    //   411: checkcast 96	mZ
    //   414: putfield 88	rZ$b:g	LmZ;
    //   417: aload_0
    //   418: getfield 86	rZ$b:h	I
    //   421: ifeq +9 -> 430
    //   424: iconst_1
    //   425: istore 7
    //   427: goto +6 -> 433
    //   430: iconst_0
    //   431: istore 7
    //   433: aload_0
    //   434: getfield 86	rZ$b:h	I
    //   437: istore 6
    //   439: iload 5
    //   441: istore 8
    //   443: aload_2
    //   444: getfield 86	rZ$b:h	I
    //   447: ifeq +6 -> 453
    //   450: iconst_1
    //   451: istore 8
    //   453: aload_0
    //   454: aload_1
    //   455: iload 7
    //   457: iload 6
    //   459: iload 8
    //   461: aload_2
    //   462: getfield 86	rZ$b:h	I
    //   465: invokeinterface 134 5 0
    //   470: putfield 86	rZ$b:h	I
    //   473: getstatic 142	PT$h:a	LPT$h;
    //   476: astore_1
    //   477: aload_0
    //   478: areturn
    //   479: new 12	rZ$b$a
    //   482: dup
    //   483: aconst_null
    //   484: invokespecial 145	rZ$b$a:<init>	(LQY;)V
    //   487: areturn
    //   488: aconst_null
    //   489: areturn
    //   490: getstatic 34	rZ$b:d	LrZ$b;
    //   493: areturn
    //   494: new 2	rZ$b
    //   497: dup
    //   498: invokespecial 32	rZ$b:<init>	()V
    //   501: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	502	0	this	b
    //   0	502	1	parami	PT.i
    //   0	502	2	paramObject1	Object
    //   0	502	3	paramObject2	Object
    //   8	159	4	i	int
    //   11	429	5	bool1	boolean
    //   14	444	6	j	int
    //   346	110	7	bool2	boolean
    //   368	92	8	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   81	102	108	finally
    //   102	105	108	finally
    //   109	112	108	finally
    //   133	139	270	finally
    //   165	174	270	finally
    //   177	185	270	finally
    //   188	206	270	finally
    //   211	226	270	finally
    //   230	250	270	finally
    //   253	261	270	finally
    //   275	304	270	finally
    //   305	322	270	finally
    //   133	139	274	java/io/IOException
    //   165	174	274	java/io/IOException
    //   177	185	274	java/io/IOException
    //   188	206	274	java/io/IOException
    //   211	226	274	java/io/IOException
    //   230	250	274	java/io/IOException
    //   253	261	274	java/io/IOException
    //   133	139	304	RT
    //   165	174	304	RT
    //   177	185	304	RT
    //   188	206	304	RT
    //   211	226	304	RT
    //   230	250	304	RT
    //   253	261	304	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    int i = this.f;
    if (i != 0) {
      paramJT.i(1, i);
    }
    if (this.g != null) {
      paramJT.b(2, k());
    }
    if (this.h != rZ.b.b.a.a()) {
      paramJT.e(3, this.h);
    }
  }
  
  public int d()
  {
    int i = this.c;
    if (i != -1) {
      return i;
    }
    i = 0;
    int j = this.f;
    if (j != 0) {
      i = 0 + JT.d(1, j);
    }
    j = i;
    if (this.g != null) {
      j = i + JT.a(2, k());
    }
    i = j;
    if (this.h != rZ.b.b.a.a()) {
      i = j + JT.a(3, this.h);
    }
    this.c = i;
    return i;
  }
  
  public mZ k()
  {
    mZ localmZ1 = this.g;
    mZ localmZ2 = localmZ1;
    if (localmZ1 == null) {
      localmZ2 = mZ.k();
    }
    return localmZ2;
  }
  
  public rZ.b.b l()
  {
    rZ.b.b localb1 = rZ.b.b.a(this.h);
    rZ.b.b localb2 = localb1;
    if (localb1 == null) {
      localb2 = rZ.b.b.d;
    }
    return localb2;
  }
  
  public int m()
  {
    return this.f;
  }
  
  public static final class a
    extends PT.a<rZ.b, a>
    implements rZ.c
  {
    private a()
    {
      super();
    }
  }
  
  public static enum b
    implements QT.a
  {
    private static final QT.b<b> e = new sZ();
    private final int g;
    
    private b(int paramInt)
    {
      this.g = paramInt;
    }
    
    public static b a(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2) {
            return null;
          }
          return c;
        }
        return b;
      }
      return a;
    }
    
    public final int a()
    {
      return this.g;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rZ$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */